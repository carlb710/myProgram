package SaveData;

import GUI.App;
import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.prefs.Preferences;

public class UserPreferences {

    private int numberOfFilesValue;

    private String dataOriginFile1Value;
    private String dataOriginFile2Value;
    private String dataOriginFile3Value;
    private String dataOriginFile4Value;
    private String dataOriginFile5Value;
    private String dataOriginFile6Value;
    private String dataOriginFile7Value;
    private String dataOriginFile8Value;
    private String dataOriginFile9Value;
    private String dataOriginFile10Value;
    private String dataOriginFile11Value;
    private String dataOriginFile12Value;

    private boolean smartQueryValue;
    private boolean customQueriesValue;

    private App window;

    private Preferences prefs = Preferences.userRoot().node(getClass().getName());


//setter method for importing App window instance
    public void setWindow(App window) {
        this.window = window;
    }

//getters


    public int getNumberOfFilesValue() {
        return numberOfFilesValue;
    }

    public String getDataOriginFile1Value() {
        return dataOriginFile1Value;
    }

    public String getDataOriginFile2Value() {
        return dataOriginFile2Value;
    }

    public String getDataOriginFile3Value() {
        return dataOriginFile3Value;
    }

    public String getDataOriginFile4Value() {
        return dataOriginFile4Value;
    }

    public String getDataOriginFile5Value() {
        return dataOriginFile5Value;
    }

    public String getDataOriginFile6Value() {
        return dataOriginFile6Value;
    }

    public String getDataOriginFile7Value() {
        return dataOriginFile7Value;
    }

    public String getDataOriginFile8Value() {
        return dataOriginFile8Value;
    }

    public String getDataOriginFile9Value() {
        return dataOriginFile9Value;
    }

    public String getDataOriginFile10Value() {
        return dataOriginFile10Value;
    }

    public String getDataOriginFile11Value() {
        return dataOriginFile11Value;
    }

    public String getDataOriginFile12Value() {
        return dataOriginFile12Value;
    }

    public boolean isSmartQueryValue() {
        return smartQueryValue;
    }

    public boolean isCustomQueriesValue() {
        return customQueriesValue;
    }

    // if values do not already exist in save data, values are stored.
    public void getPreferences() {

        if (window != null) {
            String numberOfFiles = "numberOfFiles";
            String dataOriginFile1 = "dataOriginFile1";
            String dataOriginFile2 = "dataOriginFile2";
            String dataOriginFile3 = "dataOriginFile3";
            String dataOriginFile4 = "dataOriginFile4";
            String dataOriginFile5 = "dataOriginFile5";
            String dataOriginFile6 = "dataOriginFile6";
            String dataOriginFile7 = "dataOriginFile7";
            String dataOriginFile8 = "dataOriginFile8";
            String dataOriginFile9 = "dataOriginFile9";
            String dataOriginFile10 = "dataOriginFile10";
            String dataOriginFile11 = "dataOriginFile11";
            String dataOriginFile12 = "dataOriginFile12";

            String smartQuery = "smartQuery";
            String customQueries = "customQueries";


            numberOfFilesValue = prefs.getInt(numberOfFiles, -1);

            dataOriginFile1Value = prefs.get(dataOriginFile1, "");
            dataOriginFile2Value = prefs.get(dataOriginFile2, "");
            dataOriginFile3Value = prefs.get(dataOriginFile3, "");
            dataOriginFile4Value = prefs.get(dataOriginFile4, "");
            dataOriginFile5Value = prefs.get(dataOriginFile5, "");
            dataOriginFile6Value = prefs.get(dataOriginFile6, "");
            dataOriginFile7Value = prefs.get(dataOriginFile7, "");
            dataOriginFile8Value = prefs.get(dataOriginFile8, "");
            dataOriginFile9Value = prefs.get(dataOriginFile9, "");
            dataOriginFile10Value = prefs.get(dataOriginFile10, "");
            dataOriginFile11Value = prefs.get(dataOriginFile11, "");
            dataOriginFile12Value = prefs.get(dataOriginFile12, "");


            smartQueryValue = prefs.getBoolean(smartQuery, false); //might change to true default later
            customQueriesValue = prefs.getBoolean(customQueries, false);

//map to make a loop for string values, less code to write this way

            LinkedHashMap<String, String> prefsMapStrings = new LinkedHashMap();


            prefsMapStrings.put(dataOriginFile1, dataOriginFile1Value);
            prefsMapStrings.put(dataOriginFile2, dataOriginFile2Value);
            prefsMapStrings.put(dataOriginFile3, dataOriginFile3Value);
            prefsMapStrings.put(dataOriginFile4, dataOriginFile4Value);
            prefsMapStrings.put(dataOriginFile5, dataOriginFile5Value);
            prefsMapStrings.put(dataOriginFile6, dataOriginFile6Value);
            prefsMapStrings.put(dataOriginFile7, dataOriginFile7Value);
            prefsMapStrings.put(dataOriginFile8, dataOriginFile8Value);
            prefsMapStrings.put(dataOriginFile9, dataOriginFile9Value);
            prefsMapStrings.put(dataOriginFile10, dataOriginFile10Value);
            prefsMapStrings.put(dataOriginFile11, dataOriginFile11Value);
            prefsMapStrings.put(dataOriginFile12, dataOriginFile12Value);

// Set the values for all the preference keys above.
            for( String keys: prefsMapStrings.keySet()){
                if (prefsMapStrings.get(keys).equals("")) {
                    String calledValue;
                    switch(keys){
                        case "dataOriginFile1" -> calledValue = window.getFile1OriginInputted();
                        case "dataOriginFile2" -> calledValue = window.getFile2OriginInputted();
                        case "dataOriginFile3" -> calledValue = window.getFile3OriginInputted();
                        case "dataOriginFile4" -> calledValue = window.getFile4OriginInputted();
                        case "dataOriginFile5" -> calledValue = window.getFile5OriginInputted();
                        case "dataOriginFile6" -> calledValue = window.getFile6OriginInputted();
                        case "dataOriginFile7" -> calledValue = window.getFile7OriginInputted();
                        case "dataOriginFile8" -> calledValue = window.getFile8OriginInputted();
                        case "dataOriginFile9" -> calledValue = window.getFile9OriginInputted();
                        case "dataOriginFile10" -> calledValue = window.getFile10OriginInputted();
                        case "dataOriginFile11" -> calledValue = window.getFile11OriginInputted();
                        case "dataOriginFile12" -> calledValue = window.getFile12OriginInputted();
                        default -> calledValue = null;
                    }
                    prefs.put(keys, calledValue);
                }
            }


            if (numberOfFilesValue == -1 || numberOfFilesValue == 0) {
                prefs.putInt(numberOfFiles, window.getSpinnerValue());
            }
            if (smartQueryValue) {
                prefs.putBoolean(smartQuery, window.getEnableSmartQueryCheckBox());
            }
            if (customQueriesValue) {
                prefs.putBoolean(customQueries, window.getEnableCustomQueriesCheckBox());
            }
        } else {
            JOptionPane.showMessageDialog(null, "window is null");
        }

    }

//values are stored in save data
    public void setPreferences() {

        if (window != null) {
            String numberOfFiles = "numberOfFiles";
            String dataOriginFile1 = "dataOriginFile1";
            String dataOriginFile2 = "dataOriginFile2";
            String dataOriginFile3 = "dataOriginFile3";
            String dataOriginFile4 = "dataOriginFile4";
            String dataOriginFile5 = "dataOriginFile5";
            String dataOriginFile6 = "dataOriginFile6";
            String dataOriginFile7 = "dataOriginFile7";
            String dataOriginFile8 = "dataOriginFile8";
            String dataOriginFile9 = "dataOriginFile9";
            String dataOriginFile10 = "dataOriginFile10";
            String dataOriginFile11 = "dataOriginFile11";
            String dataOriginFile12 = "dataOriginFile12";



            String smartQuery = "smartQuery";
            String customQueries = "customQueries";


            numberOfFilesValue = prefs.getInt(numberOfFiles, -1);

            dataOriginFile1Value = prefs.get(dataOriginFile1, "");
            dataOriginFile2Value = prefs.get(dataOriginFile2, "");
            dataOriginFile3Value = prefs.get(dataOriginFile3, "");
            dataOriginFile4Value = prefs.get(dataOriginFile4, "");
            dataOriginFile5Value = prefs.get(dataOriginFile5, "");
            dataOriginFile6Value = prefs.get(dataOriginFile6, "");
            dataOriginFile7Value = prefs.get(dataOriginFile7, "");
            dataOriginFile8Value = prefs.get(dataOriginFile8, "");
            dataOriginFile9Value = prefs.get(dataOriginFile9, "");
            dataOriginFile10Value = prefs.get(dataOriginFile10, "");
            dataOriginFile11Value = prefs.get(dataOriginFile11, "");
            dataOriginFile12Value = prefs.get(dataOriginFile12, "");


            smartQueryValue = prefs.getBoolean(smartQuery, false); //might change to true default later
            customQueriesValue = prefs.getBoolean(customQueries, false);

            // Set the values for all the preference key above.

            LinkedHashMap<String, String> prefsMapStrings = new LinkedHashMap();


            prefsMapStrings.put(dataOriginFile1, dataOriginFile1Value);
            prefsMapStrings.put(dataOriginFile2, dataOriginFile2Value);
            prefsMapStrings.put(dataOriginFile3, dataOriginFile3Value);
            prefsMapStrings.put(dataOriginFile4, dataOriginFile4Value);
            prefsMapStrings.put(dataOriginFile5, dataOriginFile5Value);
            prefsMapStrings.put(dataOriginFile6, dataOriginFile6Value);
            prefsMapStrings.put(dataOriginFile7, dataOriginFile7Value);
            prefsMapStrings.put(dataOriginFile8, dataOriginFile8Value);
            prefsMapStrings.put(dataOriginFile9, dataOriginFile9Value);
            prefsMapStrings.put(dataOriginFile10, dataOriginFile10Value);
            prefsMapStrings.put(dataOriginFile11, dataOriginFile11Value);
            prefsMapStrings.put(dataOriginFile12, dataOriginFile12Value);


            for( String keys: prefsMapStrings.keySet()){
                if (prefsMapStrings.get(keys).equals("")) {
                    String calledValue;
                    switch(keys){
                        case "dataOriginFile1" -> calledValue = window.getFile1OriginInputted();
                        case "dataOriginFile2" -> calledValue = window.getFile2OriginInputted();
                        case "dataOriginFile3" -> calledValue = window.getFile3OriginInputted();
                        case "dataOriginFile4" -> calledValue = window.getFile4OriginInputted();
                        case "dataOriginFile5" -> calledValue = window.getFile5OriginInputted();
                        case "dataOriginFile6" -> calledValue = window.getFile6OriginInputted();
                        case "dataOriginFile7" -> calledValue = window.getFile7OriginInputted();
                        case "dataOriginFile8" -> calledValue = window.getFile8OriginInputted();
                        case "dataOriginFile9" -> calledValue = window.getFile9OriginInputted();
                        case "dataOriginFile10" -> calledValue = window.getFile10OriginInputted();
                        case "dataOriginFile11" -> calledValue = window.getFile11OriginInputted();
                        case "dataOriginFile12" -> calledValue = window.getFile12OriginInputted();
                        default -> calledValue = null;
                    }
                    prefs.put(keys, calledValue);
                }
            }

                prefs.putInt(numberOfFiles, window.getSpinnerValue());

                prefs.putBoolean(smartQuery, window.getEnableSmartQueryCheckBox());

                prefs.putBoolean(customQueries, window.getEnableCustomQueriesCheckBox());



        }


    }
}