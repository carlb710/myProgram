package GUI;

import SaveData.UserPreferences;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    public JPanel landing;
    public JTabbedPane tabbedPane1;
    public JLabel instructions;
    public JSpinner spinner1;
    public JLabel file1OriginLabel;
    public JLabel file2OriginLabel;
    public JLabel file3OriginLabel;
    public JLabel file4OriginLabel;
    public JLabel file5OriginLabel;
    public JLabel file6OriginLabel;
    public JLabel file7OriginLabel;
    public JLabel file8OriginLabel;
    public JLabel file9OriginLabel;
    public JLabel file10OriginLabel;
    public JLabel file11OriginLabel;
    public JLabel file12OriginLabel;
    public JTextField file1OriginInputted;
    public JTextField file2OriginInputted;
    public JTextField file3OriginInputted;
    public JTextField file4OriginInputted;
    public JTextField file5OriginInputted;
    public JTextField file6OriginInputted;
    public JTextField file7OriginInputted;
    public JTextField file8OriginInputted;
    public JTextField file9OriginInputted;
    public JTextField file10OriginInputted;
    public JTextField file11OriginInputted;
    public JTextField file12OriginInputted;
    public JButton addFileButton1;
    public JButton addFileButton2;
    public JButton addFileButton3;
    public JButton addFileButton4;
    public JButton addFileButton5;
    public JButton addFileButton6;
    public JButton addFileButton7;
    public JButton addFileButton8;
    public JButton addFileButton9;
    public JButton addFileButton10;
    public JButton addFileButton11;
    public JButton addFileButton12;
    public JLabel filePathLabel1;
    public JLabel filePathLabel2;
    public JLabel filePathLabel3;
    public JLabel filePathLabel4;
    public JLabel filePathLabel5;
    public JLabel filePathLabel6;
    public JLabel filePathLabel7;
    public JLabel filePathLabel8;
    public JLabel filePathLabel9;
    public JLabel filePathLabel10;
    public JLabel filePathLabel11;
    public JLabel filePathLabel12;
    public JCheckBox enableSmartQueryCheckBox;
    public JCheckBox enableCustomQueriesCheckBox;
    public JLabel queryBuilderLabel;
    public JButton saveQueryButton;
    public JButton saveSettingsButton;
    public JTextArea queryBuilderTextField;
    public JTextField queryTitleTextField;
    public JLabel queryTitleFieldLabel;



    String filePath1;
    String filePath2;
    String filePath3;
    String filePath4;
    String filePath5;
    String filePath6;
    String filePath7;
    String filePath8;
    String filePath9;
    String filePath10;
    String filePath11;
    String filePath12;

    public int numOfFiles;

    public void setNumOfFiles(int numOfFiles) {
        this.numOfFiles = numOfFiles;
    }

//gives App class access to userPrefs instance created in Main class
    public UserPreferences userPrefs;
    public void setPreferences(UserPreferences userPrefs) {
        this.userPrefs = userPrefs;
    }


    public String getFile1OriginInputted() {
        return file1OriginInputted.getText();
    }
    public String getFile2OriginInputted() {
        return file3OriginInputted.getText();
    }
    public String getFile3OriginInputted() {
        return file3OriginInputted.getText();
    }
    public String getFile4OriginInputted() {
        return file4OriginInputted.getText();
    }
    public String getFile5OriginInputted() {
        return file5OriginInputted.getText();
    }
    public String getFile6OriginInputted() {
        return file6OriginInputted.getText();
    }
    public String getFile7OriginInputted() {
        return file7OriginInputted.getText();
    }
    public String getFile8OriginInputted() {
        return file8OriginInputted.getText();
    }
    public String getFile9OriginInputted() {
        return file9OriginInputted.getText();
    }
    public String getFile10OriginInputted() {
        return file10OriginInputted.getText();
    }
    public String getFile11OriginInputted() {
        return file11OriginInputted.getText();
    }
    public String getFile12OriginInputted() {
        return file12OriginInputted.getText();
    }


    public boolean getEnableSmartQueryCheckBox() {
        return enableSmartQueryCheckBox.isSelected();
    }
    public boolean getEnableCustomQueriesCheckBox() {
        return enableCustomQueriesCheckBox.isSelected();
    }


    public String getQueryBuilderTextField() {
        return queryBuilderTextField.getText();
    }
    public String getQueryTitleTextField() {
        return queryTitleTextField.getText();
    }
    public String getFilePath1() {
        return filePath1;
    }


    public String getFilePath2() {
        return filePath2;
    }
    public String getFilePath3() {
        return filePath3;
    }
    public String getFilePath4() {
        return filePath4;
    }
    public String getFilePath5() {
        return filePath5;
    }
    public String getFilePath6() {
        return filePath6;
    }
    public String getFilePath7() {
        return filePath7;
    }
    public String getFilePath8() {
        return filePath8;
    }
    public String getFilePath9() {
        return filePath9;
    }
    public String getFilePath10() {
        return filePath10;
    }
    public String getFilePath11() {
        return filePath11;
    }
    public String getFilePath12() {
        return filePath12;
    }

    public int getNumOfFiles() {
        return numOfFiles;
    }

    public int getSpinnerValue(){
        return (int) spinner1.getValue();
    }


    public App() {
//listener for spinner, changes number of elements on screen
        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                numOfFiles = (Integer) spinner1.getValue();

//switch statement sets number of elements for file settings visible or not based on spinner value up to 12
                try {
                    switch(numOfFiles){
                        case 0:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(true);
                            file7OriginLabel.setVisible(true);
                            file8OriginLabel.setVisible(true);
                            file9OriginLabel.setVisible(true);
                            file10OriginLabel.setVisible(true);
                            file11OriginLabel.setVisible(true);
                            file12OriginLabel.setVisible(true);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(true);
                            file7OriginInputted.setVisible(true);
                            file8OriginInputted.setVisible(true);
                            file9OriginInputted.setVisible(true);
                            file10OriginInputted.setVisible(true);
                            file11OriginInputted.setVisible(true);
                            file12OriginInputted.setVisible(true);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(true);
                            addFileButton7.setVisible(true);
                            addFileButton8.setVisible(true);
                            addFileButton9.setVisible(true);
                            addFileButton10.setVisible(true);
                            addFileButton11.setVisible(true);
                            addFileButton12.setVisible(true);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(true);
                            filePathLabel7.setVisible(true);
                            filePathLabel8.setVisible(true);
                            filePathLabel9.setVisible(true);
                            filePathLabel10.setVisible(true);
                            filePathLabel11.setVisible(true);
                            filePathLabel12.setVisible(true);
                        } break;
                        case 1:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(false);
                            file3OriginLabel.setVisible(false);
                            file4OriginLabel.setVisible(false);
                            file5OriginLabel.setVisible(false);
                            file6OriginLabel.setVisible(false);
                            file7OriginLabel.setVisible(false);
                            file8OriginLabel.setVisible(false);
                            file9OriginLabel.setVisible(false);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(false);
                            file3OriginInputted.setVisible(false);
                            file4OriginInputted.setVisible(false);
                            file5OriginInputted.setVisible(false);
                            file6OriginInputted.setVisible(false);
                            file7OriginInputted.setVisible(false);
                            file8OriginInputted.setVisible(false);
                            file9OriginInputted.setVisible(false);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(false);
                            addFileButton3.setVisible(false);
                            addFileButton4.setVisible(false);
                            addFileButton5.setVisible(false);
                            addFileButton6.setVisible(false);
                            addFileButton7.setVisible(false);
                            addFileButton8.setVisible(false);
                            addFileButton9.setVisible(false);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(false);
                            filePathLabel3.setVisible(false);
                            filePathLabel4.setVisible(false);
                            filePathLabel5.setVisible(false);
                            filePathLabel6.setVisible(false);
                            filePathLabel7.setVisible(false);
                            filePathLabel8.setVisible(false);
                            filePathLabel9.setVisible(false);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        }break;
                        case 2:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(false);
                            file4OriginLabel.setVisible(false);
                            file5OriginLabel.setVisible(false);
                            file6OriginLabel.setVisible(false);
                            file7OriginLabel.setVisible(false);
                            file8OriginLabel.setVisible(false);
                            file9OriginLabel.setVisible(false);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(false);
                            file4OriginInputted.setVisible(false);
                            file5OriginInputted.setVisible(false);
                            file6OriginInputted.setVisible(false);
                            file7OriginInputted.setVisible(false);
                            file8OriginInputted.setVisible(false);
                            file9OriginInputted.setVisible(false);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(false);
                            addFileButton4.setVisible(false);
                            addFileButton5.setVisible(false);
                            addFileButton6.setVisible(false);
                            addFileButton7.setVisible(false);
                            addFileButton8.setVisible(false);
                            addFileButton9.setVisible(false);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(false);
                            filePathLabel4.setVisible(false);
                            filePathLabel5.setVisible(false);
                            filePathLabel6.setVisible(false);
                            filePathLabel7.setVisible(false);
                            filePathLabel8.setVisible(false);
                            filePathLabel9.setVisible(false);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);


                        } break;
                        case 3:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(false);
                            file5OriginLabel.setVisible(false);
                            file6OriginLabel.setVisible(false);
                            file7OriginLabel.setVisible(false);
                            file8OriginLabel.setVisible(false);
                            file9OriginLabel.setVisible(false);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(false);
                            file5OriginInputted.setVisible(false);
                            file6OriginInputted.setVisible(false);
                            file7OriginInputted.setVisible(false);
                            file8OriginInputted.setVisible(false);
                            file9OriginInputted.setVisible(false);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(false);
                            addFileButton5.setVisible(false);
                            addFileButton6.setVisible(false);
                            addFileButton7.setVisible(false);
                            addFileButton8.setVisible(false);
                            addFileButton9.setVisible(false);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(false);
                            filePathLabel5.setVisible(false);
                            filePathLabel6.setVisible(false);
                            filePathLabel7.setVisible(false);
                            filePathLabel8.setVisible(false);
                            filePathLabel9.setVisible(false);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        }break;
                        case 4:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(false);
                            file6OriginLabel.setVisible(false);
                            file7OriginLabel.setVisible(false);
                            file8OriginLabel.setVisible(false);
                            file9OriginLabel.setVisible(false);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(false);
                            file6OriginInputted.setVisible(false);
                            file7OriginInputted.setVisible(false);
                            file8OriginInputted.setVisible(false);
                            file9OriginInputted.setVisible(false);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(false);
                            addFileButton6.setVisible(false);
                            addFileButton7.setVisible(false);
                            addFileButton8.setVisible(false);
                            addFileButton9.setVisible(false);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(false);
                            filePathLabel6.setVisible(false);
                            filePathLabel7.setVisible(false);
                            filePathLabel8.setVisible(false);
                            filePathLabel9.setVisible(false);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        } break;
                        case 5:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(false);
                            file7OriginLabel.setVisible(false);
                            file8OriginLabel.setVisible(false);
                            file9OriginLabel.setVisible(false);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(false);
                            file7OriginInputted.setVisible(false);
                            file8OriginInputted.setVisible(false);
                            file9OriginInputted.setVisible(false);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(false);
                            addFileButton7.setVisible(false);
                            addFileButton8.setVisible(false);
                            addFileButton9.setVisible(false);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(false);
                            filePathLabel7.setVisible(false);
                            filePathLabel8.setVisible(false);
                            filePathLabel9.setVisible(false);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        }break;
                        case 6:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(true);
                            file7OriginLabel.setVisible(false);
                            file8OriginLabel.setVisible(false);
                            file9OriginLabel.setVisible(false);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(true);
                            file7OriginInputted.setVisible(false);
                            file8OriginInputted.setVisible(false);
                            file9OriginInputted.setVisible(false);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(true);
                            addFileButton7.setVisible(false);
                            addFileButton8.setVisible(false);
                            addFileButton9.setVisible(false);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(true);
                            filePathLabel7.setVisible(false);
                            filePathLabel8.setVisible(false);
                            filePathLabel9.setVisible(false);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        } break;
                        case 7:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(true);
                            file7OriginLabel.setVisible(true);
                            file8OriginLabel.setVisible(false);
                            file9OriginLabel.setVisible(false);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(true);
                            file7OriginInputted.setVisible(true);
                            file8OriginInputted.setVisible(false);
                            file9OriginInputted.setVisible(false);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(true);
                            addFileButton7.setVisible(true);
                            addFileButton8.setVisible(false);
                            addFileButton9.setVisible(false);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(true);
                            filePathLabel7.setVisible(true);
                            filePathLabel8.setVisible(false);
                            filePathLabel9.setVisible(false);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        }break;
                        case 8:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(true);
                            file7OriginLabel.setVisible(true);
                            file8OriginLabel.setVisible(true);
                            file9OriginLabel.setVisible(false);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(true);
                            file7OriginInputted.setVisible(true);
                            file8OriginInputted.setVisible(true);
                            file9OriginInputted.setVisible(false);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(true);
                            addFileButton7.setVisible(true);
                            addFileButton8.setVisible(true);
                            addFileButton9.setVisible(false);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(true);
                            filePathLabel7.setVisible(true);
                            filePathLabel8.setVisible(true);
                            filePathLabel9.setVisible(false);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        } break;
                        case 9:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(true);
                            file7OriginLabel.setVisible(true);
                            file8OriginLabel.setVisible(true);
                            file9OriginLabel.setVisible(true);
                            file10OriginLabel.setVisible(false);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(true);
                            file7OriginInputted.setVisible(true);
                            file8OriginInputted.setVisible(true);
                            file9OriginInputted.setVisible(true);
                            file10OriginInputted.setVisible(false);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(true);
                            addFileButton7.setVisible(true);
                            addFileButton8.setVisible(true);
                            addFileButton9.setVisible(true);
                            addFileButton10.setVisible(false);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(true);
                            filePathLabel7.setVisible(true);
                            filePathLabel8.setVisible(true);
                            filePathLabel9.setVisible(true);
                            filePathLabel10.setVisible(false);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        }break;
                        case 10:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(true);
                            file7OriginLabel.setVisible(true);
                            file8OriginLabel.setVisible(true);
                            file9OriginLabel.setVisible(true);
                            file10OriginLabel.setVisible(true);
                            file11OriginLabel.setVisible(false);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(true);
                            file7OriginInputted.setVisible(true);
                            file8OriginInputted.setVisible(true);
                            file9OriginInputted.setVisible(true);
                            file10OriginInputted.setVisible(true);
                            file11OriginInputted.setVisible(false);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(true);
                            addFileButton7.setVisible(true);
                            addFileButton8.setVisible(true);
                            addFileButton9.setVisible(true);
                            addFileButton10.setVisible(true);
                            addFileButton11.setVisible(false);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(true);
                            filePathLabel7.setVisible(true);
                            filePathLabel8.setVisible(true);
                            filePathLabel9.setVisible(true);
                            filePathLabel10.setVisible(true);
                            filePathLabel11.setVisible(false);
                            filePathLabel12.setVisible(false);
                        } break;
                        case 11:{
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(true);
                            file7OriginLabel.setVisible(true);
                            file8OriginLabel.setVisible(true);
                            file9OriginLabel.setVisible(true);
                            file10OriginLabel.setVisible(true);
                            file11OriginLabel.setVisible(true);
                            file12OriginLabel.setVisible(false);

                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(true);
                            file7OriginInputted.setVisible(true);
                            file8OriginInputted.setVisible(true);
                            file9OriginInputted.setVisible(true);
                            file10OriginInputted.setVisible(true);
                            file11OriginInputted.setVisible(true);
                            file12OriginInputted.setVisible(false);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(true);
                            addFileButton7.setVisible(true);
                            addFileButton8.setVisible(true);
                            addFileButton9.setVisible(true);
                            addFileButton10.setVisible(true);
                            addFileButton11.setVisible(true);
                            addFileButton12.setVisible(false);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(true);
                            filePathLabel7.setVisible(true);
                            filePathLabel8.setVisible(true);
                            filePathLabel9.setVisible(true);
                            filePathLabel10.setVisible(true);
                            filePathLabel11.setVisible(true);
                            filePathLabel12.setVisible(false);
                        }break;
                        case 12: {
                            file1OriginLabel.setVisible(true);
                            file2OriginLabel.setVisible(true);
                            file3OriginLabel.setVisible(true);
                            file4OriginLabel.setVisible(true);
                            file5OriginLabel.setVisible(true);
                            file6OriginLabel.setVisible(true);
                            file7OriginLabel.setVisible(true);
                            file8OriginLabel.setVisible(true);
                            file9OriginLabel.setVisible(true);
                            file10OriginLabel.setVisible(true);
                            file11OriginLabel.setVisible(true);
                            file12OriginLabel.setVisible(true);


                            file1OriginInputted.setVisible(true);
                            file2OriginInputted.setVisible(true);
                            file3OriginInputted.setVisible(true);
                            file4OriginInputted.setVisible(true);
                            file5OriginInputted.setVisible(true);
                            file6OriginInputted.setVisible(true);
                            file7OriginInputted.setVisible(true);
                            file8OriginInputted.setVisible(true);
                            file9OriginInputted.setVisible(true);
                            file10OriginInputted.setVisible(true);
                            file11OriginInputted.setVisible(true);
                            file12OriginInputted.setVisible(true);

                            addFileButton1.setVisible(true);
                            addFileButton2.setVisible(true);
                            addFileButton3.setVisible(true);
                            addFileButton4.setVisible(true);
                            addFileButton5.setVisible(true);
                            addFileButton6.setVisible(true);
                            addFileButton7.setVisible(true);
                            addFileButton8.setVisible(true);
                            addFileButton9.setVisible(true);
                            addFileButton10.setVisible(true);
                            addFileButton11.setVisible(true);
                            addFileButton12.setVisible(true);

                            filePathLabel1.setVisible(true);
                            filePathLabel2.setVisible(true);
                            filePathLabel3.setVisible(true);
                            filePathLabel4.setVisible(true);
                            filePathLabel5.setVisible(true);
                            filePathLabel6.setVisible(true);
                            filePathLabel7.setVisible(true);
                            filePathLabel8.setVisible(true);
                            filePathLabel9.setVisible(true);
                            filePathLabel10.setVisible(true);
                            filePathLabel11.setVisible(true);
                            filePathLabel12.setVisible(true);
                        } break;
                        default: break;
                    }
                } catch(NullPointerException e1){
                    e1.printStackTrace();
                    SwingUtilities.updateComponentTreeUI(landing);
                }


                SwingUtilities.updateComponentTreeUI(landing);


            }
        });

//does nothing for now just removes null mouse pointer error
        tabbedPane1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });


//start of file sleection button listeners
        addFileButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath1 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel1.setText(filePath1);
                    filePathLabel1.setForeground(Color.blue);
                }
            }
        });
        addFileButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath2 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel2.setText(filePath2);
                    filePathLabel2.setForeground(Color.blue);
                }
            }
        });
        addFileButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath3 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel3.setText(filePath3);
                    filePathLabel3.setForeground(Color.blue);
                }
            }
        });
        addFileButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath4 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel4.setText(filePath4);
                    filePathLabel4.setForeground(Color.blue);
                }
            }
        });
        addFileButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath5 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel5.setText(filePath5);
                    filePathLabel5.setForeground(Color.blue);
                }
            }
        });
        addFileButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath6 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel6.setText(filePath6);
                    filePathLabel6.setForeground(Color.blue);
                }
            }
        });
        addFileButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath7 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel7.setText(filePath7);
                    filePathLabel7.setForeground(Color.blue);
                }
            }
        });
        addFileButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath8 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel8.setText(filePath8);
                    filePathLabel8.setForeground(Color.blue);
                }
            }
        });
        addFileButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath9 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel9.setText(filePath9);
                    filePathLabel9.setForeground(Color.blue);
                }
            }
        });
        addFileButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath10 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel10.setText(filePath10);
                    filePathLabel10.setForeground(Color.blue);
                }
            }
        });
        addFileButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath11 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel11.setText(filePath11);
                    filePathLabel11.setForeground(Color.blue);
                }
            }
        });
        addFileButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Spreadsheets (.xlsx)", "xlsx");
                chooser.setFileFilter(filter);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);/*bug exists here with the file chooser not recognizing icloud indexes such as icloud documents folder*/
                int returnVal = chooser.showOpenDialog(addFileButton1);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath12 = chooser.getSelectedFile().getAbsolutePath();
                    filePathLabel12.setText(filePath12);
                    filePathLabel12.setForeground(Color.blue);
                }
            }
        });
//end file button listeners


//save query button listener. Grabs user inputted text and adds it to a linkedHashMap with the user inputted title, then saves it somehow
    saveQueryButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String queryBuilderInput = queryBuilderTextField.getText();
            String queryBuilderTitle = queryTitleTextField.getText();


            JOptionPane.showMessageDialog(null, "Query Saved!"); //add check for successful save before displaying
        }
    });
        enableCustomQueriesCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (enableCustomQueriesCheckBox.isSelected()) {
                    queryBuilderTextField.setVisible(true);
                    queryBuilderLabel.setVisible(true);
                    saveQueryButton.setVisible(true);
                    queryTitleTextField.setVisible(true);
                    queryTitleFieldLabel.setVisible(true);
                } else if (!enableCustomQueriesCheckBox.isSelected()){
                    queryBuilderTextField.setVisible(false);
                    queryBuilderLabel.setVisible(false);
                    saveQueryButton.setVisible(false);
                    queryTitleTextField.setVisible(false);
                    queryTitleFieldLabel.setVisible(false);
                }
            }
        });
        saveSettingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                userPrefs.setPreferences();
                String message = "<html><body><div align='center'>Your file count, titles, and query settings have been saved. " +
                        "<br>NOTE: This does NOT include custom queries. To save those, please click the 'Save Query' button.</div></body></html>";
                JLabel label = new JLabel(message);
                JOptionPane.showMessageDialog(null, label);
            }
        });
    }







    public void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
