import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.*;

public class Excel2Database {

   static  FileInputStream fis = null;
   static  XSSFWorkbook workbook = null;
   static XSSFSheet sheet = null;

    int lastRowNum = 0;

   LinkedList<String> columnTitles = new LinkedList<>();

   LinkedHashMap<String, String> columnDataTypes = new LinkedHashMap();

   int titleRowIndex;

    public int getTitleRowIndex() {
        return titleRowIndex;
    }

    public LinkedList<String> getColumnTitles() {
        return columnTitles;
    } //returns column titles linkedList

    public LinkedHashMap<String, String> getColumnDataTypes() {
        return columnDataTypes;
    }

    public int getLastRowNum() {
        return lastRowNum;
    }

    public static void connectFile(){


        {
            try {
                fis = new FileInputStream("/Users/carlbattiste/Desktop/DB update 10.18.21/2958_Copy_Funnel_Automation_DCM_BackEnd_20211018_182903_3467240805.xlsx");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        {
            try {
                workbook = new XSSFWorkbook(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        sheet = workbook.getSheetAt(0);
    }

    public void findColumnTitles() {
        connectFile();

        Iterator<Row> rowIterator = sheet.iterator();
        boolean allStrings = false, notAllStrings = false;

        Row nextRow;

//loop that checks first for a row of only string values, then if that condition is met, a row of at least one numeric value
        do {
            while (rowIterator.hasNext() && !allStrings) {
                nextRow = rowIterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();
                    switch (nextCell.getCellTypeEnum()) {
                        case STRING: {
                            if(nextCell.getStringCellValue().equals("") || nextCell.getStringCellValue().equals(" ")){
                                allStrings = false;
                                break;
                            } else {
                                allStrings = true;
                            }

                        }
                        break;
                        default: {
                            allStrings = false;
                            break;
                        }
                    }
                    if (!allStrings) {
                        break;
                    }

                }

            }

            nextRow = rowIterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();

            while (cellIterator.hasNext()) {
                Cell nextCell = cellIterator.next();
                switch (nextCell.getCellTypeEnum()) {
                    case STRING: {
                    }
                    break;
                    default: {
                        notAllStrings = true;
                        break;
                    }
                }
                if (notAllStrings) {
                    break;
                }

            }
        } while (!allStrings && !notAllStrings);

//sets column title row index to the last found row -1 to find the row above it which should be a row of only strings
        titleRowIndex = nextRow.getRowNum() - 1;

//iterates through the cells in the row identified above and adds each string value to a linked list
        nextRow = sheet.getRow(titleRowIndex);
        Iterator<Cell> cellIterator = nextRow.cellIterator();

        while (cellIterator.hasNext()) {
            Cell nextCell = cellIterator.next();
            String string = nextCell.getStringCellValue();
            string = string.replaceAll(" ", "_");
            string = string.replaceAll("[()]", "");
            string = string.replaceAll("[!@#$%^&*<>?/.}{`~:,-]", " ");
            columnTitles.add(string);
        }

    }

    public void columnDataTypes(){

        Row row = sheet.getRow(titleRowIndex + 1);
        Iterator<Cell> cellIterator = row.cellIterator();
        ListIterator<String> titleIterator = columnTitles.listIterator();

        while (cellIterator.hasNext() && titleIterator.hasNext()) {
            Cell nextCell = cellIterator.next();
            String nextTitle = titleIterator.next();
            switch (nextCell.getCellTypeEnum()) {
                case NUMERIC: {
                    columnDataTypes.put(nextTitle, "numeric");
                }
                break;
                case STRING: {
                    Boolean isDate = false;

                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd", Locale.US).withResolverStyle(ResolverStyle.STRICT);
                    DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("uuuu/MM/dd", Locale.US).withResolverStyle(ResolverStyle.STRICT);
                    DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("uu-MM-dd", Locale.US).withResolverStyle(ResolverStyle.STRICT);
                    DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("uu/MM/dd", Locale.US).withResolverStyle(ResolverStyle.STRICT);
                    DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("MM-dd-uuuu", Locale.US).withResolverStyle(ResolverStyle.STRICT);
                    DateTimeFormatter dateFormatter5 = DateTimeFormatter.ofPattern("MM/dd/uuuu", Locale.US).withResolverStyle(ResolverStyle.STRICT);
                    DateTimeFormatter dateFormatter6 = DateTimeFormatter.ofPattern("MM-dd-uu", Locale.US).withResolverStyle(ResolverStyle.STRICT);
                    DateTimeFormatter dateFormatter7 = DateTimeFormatter.ofPattern("MM/dd/uu", Locale.US).withResolverStyle(ResolverStyle.STRICT);
                    DateTimeFormatter dateFormatter8 = DateTimeFormatter.ofPattern("MM-dd", Locale.US).withResolverStyle(ResolverStyle.LENIENT);
                    DateTimeFormatter dateFormatter9 = DateTimeFormatter.ofPattern("MM/dd", Locale.US).withResolverStyle(ResolverStyle.LENIENT);
                    DateTimeFormatter dateFormatter10 = DateTimeFormatter.ofPattern("dd-MM", Locale.US).withResolverStyle(ResolverStyle.LENIENT);
                    DateTimeFormatter dateFormatter11 = DateTimeFormatter.ofPattern("dd/MM", Locale.US).withResolverStyle(ResolverStyle.LENIENT);
                    DateTimeFormatter dateFormatter12 = DateTimeFormatter.ISO_LOCAL_DATE.withResolverStyle(ResolverStyle.STRICT);

                    ArrayList<DateTimeFormatter> dateFormatters = new ArrayList();

                    dateFormatters.add(dateFormatter);
                    dateFormatters.add(dateFormatter1);
                    dateFormatters.add(dateFormatter2);
                    dateFormatters.add(dateFormatter3);
                    dateFormatters.add(dateFormatter4);
                    dateFormatters.add(dateFormatter5);
                    dateFormatters.add(dateFormatter6);
                    dateFormatters.add(dateFormatter7);
                    dateFormatters.add(dateFormatter8);
                    dateFormatters.add(dateFormatter9);
                    dateFormatters.add(dateFormatter10);
                    dateFormatters.add(dateFormatter11);
                    dateFormatters.add(dateFormatter12);


                    for (DateTimeFormatter formatter : dateFormatters){
                        DateValidator validator = new DateFormatCheck(formatter);


                        if (validator.isValid(nextCell.getStringCellValue())){
                            columnDataTypes.put(nextTitle, "date");
                            isDate = true;
                            break;
                        }
                    }
                    if (!isDate){
                        columnDataTypes.put(nextTitle, "String");
                    }
                }
                break;
                case BLANK: {
                }
                break;
                default: {
                    break;
                }
            }

            }
    }




}
