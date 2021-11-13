import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import javax.swing.plaf.nimbus.State;
import java.math.BigDecimal;
import java.sql.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Database {

static String url = "jdbc:sqlite:/Users/carlbattiste/Desktop/databaseTest/testDB.db";

    public static void createDatabase(String fileName){
        String url = "jdbc:sqlite:/Users/carlbattiste/Desktop/databaseTest/" + fileName;

        try{
            Connection conn = DriverManager.getConnection(url);
            if (conn !=null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
                conn.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }



    }

    public static void createNewTable(String tableName, LinkedHashMap<String, String> columnTitlesAndTypes, LinkedList<String> titles) {
        String dataType = null;

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + "(\n";

        StringBuilder sqlCommand = new StringBuilder(sql);


        for (String title : columnTitlesAndTypes.keySet()){

            switch (columnTitlesAndTypes.get(title)){
                case "numeric" -> dataType = "DECIMAL(19,4)";
                case "String" -> dataType = "VARCHAR(80)";
                case "date" -> dataType = "DATE"; //you need to learn more about how sqlite handles date info
                default -> {}
            }
           if(title.equals(titles.getLast())){
                String add = " " + title + " " + dataType + "\n);";
                sqlCommand.append(add);
            } else {
                String add = " " + title + " " + dataType + ",\n";
                sqlCommand.append(add);

            }

        }

        System.out.println(String.valueOf(sqlCommand));
//connection to db code
        try {
            Connection conn = DriverManager.getConnection(url);
            PreparedStatement stmt = conn.prepareStatement(String.valueOf(sqlCommand));
            // create a new table
            stmt.execute();
            System.out.println("New Table created ");

           Statement stmt2 = conn.createStatement();

            ResultSet rs = stmt2.executeQuery("select * from " + tableName);
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("No. of columns : " + rsmd.getColumnCount());
            System.out.println("Column name of 1st column : " + rsmd.getColumnName(1));
            System.out.println("Column type of 1st column : " + rsmd.getColumnTypeName(1));
            System.out.println("Column name of 2nd column : " + rsmd.getColumnName(2));
            System.out.println("Column type of 2nd column : " + rsmd.getColumnTypeName(2));
            System.out.println("Column name of 3rd column : " + rsmd.getColumnName(3));
            System.out.println("Column type of 3rd column : " + rsmd.getColumnTypeName(3));
            System.out.println("Column name of 4th column : " + rsmd.getColumnName(4));
            System.out.println("Column type of 4th column : " + rsmd.getColumnTypeName(4));
            System.out.println("Column name of 5th column : " + rsmd.getColumnName(5));
            System.out.println("Column type of 5th column : " + rsmd.getColumnTypeName(5));
            System.out.println("Column name of 6th column : " + rsmd.getColumnName(6));
            System.out.println("Column type of 6th column : " + rsmd.getColumnTypeName(6));
            System.out.println("Column name of 7th column : " + rsmd.getColumnName(7));
            System.out.println("Column type of 7th column : " + rsmd.getColumnTypeName(7));
            System.out.println("Column name of 8th column : " + rsmd.getColumnName(8));
            System.out.println("Column type of 8th column : " + rsmd.getColumnTypeName(8));
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void insert(String tableName, LinkedList<String> titles, LinkedHashMap<String, String> types, int titleRowIndex) {

       Connection conn = null;
       Statement stmt = null;

        int count = 0;

        int batchSize = 20;

        Excel2Database convert = new Excel2Database();

        String sql = null;


Excel2Database.connectFile();

//loop to skip title row, should work on any document
        Iterator<Row> rowIterator = Excel2Database.sheet.iterator();
        Row nextRow = null;


        while(rowIterator.next().getRowNum() < titleRowIndex){
            rowIterator.next();
        }


        try{
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.getMessage();
        }

        // loop to get excel values
        while(rowIterator.hasNext()){

            sql = "INSERT INTO " + tableName + "(";

            StringBuilder sqlCommand = new StringBuilder(sql);
//loops through column titles to customize INSERT statement
            for (String title : types.keySet()) {
                if (title.equals(titles.getLast())) {
                    String add = title + ") VALUES ( ";
                    sqlCommand.append(add);
                } else {
                    String add = title + ", ";
                    sqlCommand.append(add);
                }
            }

//extracts excel values for the VALUES part of the insert statement
            nextRow = rowIterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            ListIterator<String> titleIterator = titles.listIterator();
            while(cellIterator.hasNext() && titleIterator.hasNext()){
                String titleIterated = titleIterator.next();
                Cell nextCell = cellIterator.next();
                String cellValueString = null;
                BigDecimal cellValueBD = null;
                switch (nextCell.getCellTypeEnum()){
                    case STRING: {
                        if (nextCell.getStringCellValue().equals("") || nextCell.getStringCellValue().equals(" ")){
                            cellValueBD = BigDecimal.valueOf(0);
                        } else {
                            cellValueString = "'" + nextCell.getStringCellValue() + "'";
                        }

                    }
                    break;
                    case NUMERIC: {
                        cellValueBD = new BigDecimal(nextCell.getNumericCellValue());
                    }
                    break;
                    case BLANK: {
                        cellValueBD = new BigDecimal(0);
                    }
                    break;
                }
//appends each value to the VALUES part of the sql statement
                if (titleIterated.equals(titles.getLast())) {
                    if(cellValueString != null){
                        String add = cellValueString + ")";
                        sqlCommand.append(add);
                    } else if(cellValueBD != null) {
                        String add = cellValueBD + ")";
                        sqlCommand.append(add);
                    }

                } else {
                    if(cellValueString != null){
                        String add = cellValueString + " , ";
                        sqlCommand.append(add);
                    } else if(cellValueBD != null) {
                        String add = cellValueBD + " , ";
                        sqlCommand.append(add);
                    }
                }

            }
            //end of row
            System.out.println(String.valueOf(sqlCommand));


            try {

                stmt.addBatch(String.valueOf(sqlCommand));

                if (count % batchSize == 0){
                    stmt.executeBatch();
                    count = 0;
                } else {
                    count ++;
                }


            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            sql = null;

        }

        try {

            stmt.executeBatch();
            System.out.println("batch insert successful");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void sumColumn(String table, String metric){
        try {
            String sql = "SELECT SUM(" + metric + ") \nFROM " + table;

            Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();


           while(rs.next()){
               System.out.println("sum " + rs.getDouble(1));

           }
            System.out.println();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }

    public static void query(String selection, String table){
        try {
            String sql = "SELECT " + selection + " FROM " + table;



            Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString(1) + " || " + rs.getDouble(2) );

            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }

    public static void dropDB(){

        try{
            Connection conn = DriverManager.getConnection(url);
                String sql = "DROP DATABASE testDB";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("Database dropped successfully...");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}
