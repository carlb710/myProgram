import GUI.App;
import SaveData.UserPreferences;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.sql.*;

public class Main {

    public static void main(String[] args){

        //Database.createDatabase("testDB.db");

        Excel2Database converter = new Excel2Database();

        App window = null;
        try{
            window = new App();
        } catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("here's the error");
        }


        UserPreferences userPrefs = new UserPreferences();
        userPrefs.setWindow(window);

        window.setPreferences(userPrefs);


        JFrame frame = new JFrame("Java QA Checker");
        frame.setContentPane(window.landing);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Font font = new Font("Helvetica", Font.PLAIN, 16);
        //window.textArea1.setFont(font);

//sets look and feel based on OS
        try{
            UIManager.setLookAndFeel(new UIManager().getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(frame); // To refresh your GUI
        }catch(Exception e){
            try {
                UIManager.setLookAndFeel(new MetalLookAndFeel());
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
            SwingUtilities.updateComponentTreeUI(frame); // To refresh your GUI
        }

 //update settings pane based on saved preferences
        userPrefs.getPreferences();
        window.setNumOfFiles(userPrefs.getNumberOfFilesValue());

        switch(window.getNumOfFiles()){
            case 0:{
             window.file1OriginLabel.setVisible(true);
              window.file2OriginLabel.setVisible(true);
              window.file3OriginLabel.setVisible(true);
              window.file4OriginLabel.setVisible(true);
              window.file5OriginLabel.setVisible(true);
              window.file6OriginLabel.setVisible(true);
              window.file7OriginLabel.setVisible(true);
              window.file8OriginLabel.setVisible(true);
              window.file9OriginLabel.setVisible(true);
                window.file10OriginLabel.setVisible(true);
                window.file11OriginLabel.setVisible(true);
                window.file12OriginLabel.setVisible(true);

              window.  file1OriginInputted.setVisible(true);
              window.  file2OriginInputted.setVisible(true);
              window.  file3OriginInputted.setVisible(true);
              window.  file4OriginInputted.setVisible(true);
              window.  file5OriginInputted.setVisible(true);
              window.  file6OriginInputted.setVisible(true);
              window.  file7OriginInputted.setVisible(true);
              window.  file8OriginInputted.setVisible(true);
              window.  file9OriginInputted.setVisible(true);
                window.file10OriginInputted.setVisible(true);
                window.file11OriginInputted.setVisible(true);
                window.file12OriginInputted.setVisible(true);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(true);
                window.addFileButton7.setVisible(true);
                window.addFileButton8.setVisible(true);
                window.addFileButton9.setVisible(true);
                window.addFileButton10.setVisible(true);
                window.addFileButton11.setVisible(true);
                window.addFileButton12.setVisible(true);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(true);
                window.filePathLabel7.setVisible(true);
                window.filePathLabel8.setVisible(true);
                window.filePathLabel9.setVisible(true);
                window.filePathLabel10.setVisible(true);
                window.filePathLabel11.setVisible(true);
                window.filePathLabel12.setVisible(true);
            } break;
            case 1:{
              window.file1OriginLabel.setVisible(true);
              window.file2OriginLabel.setVisible(false);
              window.file3OriginLabel.setVisible(false);
              window.file4OriginLabel.setVisible(false);
              window.file5OriginLabel.setVisible(false);
              window.file6OriginLabel.setVisible(false);
              window.file7OriginLabel.setVisible(false);
              window.file8OriginLabel.setVisible(false);
              window.file9OriginLabel.setVisible(false);
                window.file10OriginLabel.setVisible(false);
                window.file11OriginLabel.setVisible(false);
                window.file12OriginLabel.setVisible(false);

              window.  file1OriginInputted.setVisible(true);
              window.  file2OriginInputted.setVisible(false);
              window.  file3OriginInputted.setVisible(false);
              window.  file4OriginInputted.setVisible(false);
              window.  file5OriginInputted.setVisible(false);
              window.  file6OriginInputted.setVisible(false);
              window.  file7OriginInputted.setVisible(false);
              window.  file8OriginInputted.setVisible(false);
              window.  file9OriginInputted.setVisible(false);
                window.file10OriginInputted.setVisible(false);
                window.file11OriginInputted.setVisible(false);
                window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(false);
                window.addFileButton3.setVisible(false);
                window.addFileButton4.setVisible(false);
                window.addFileButton5.setVisible(false);
                window.addFileButton6.setVisible(false);
                window.addFileButton7.setVisible(false);
                window.addFileButton8.setVisible(false);
                window.addFileButton9.setVisible(false);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(false);
                window.filePathLabel3.setVisible(false);
                window.filePathLabel4.setVisible(false);
                window.filePathLabel5.setVisible(false);
                window.filePathLabel6.setVisible(false);
                window.filePathLabel7.setVisible(false);
                window.filePathLabel8.setVisible(false);
                window.filePathLabel9.setVisible(false);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            }break;
            case 2:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(false);
              window.  file4OriginLabel.setVisible(false);
              window.  file5OriginLabel.setVisible(false);
              window.  file6OriginLabel.setVisible(false);
              window.  file7OriginLabel.setVisible(false);
              window.  file8OriginLabel.setVisible(false);
              window.  file9OriginLabel.setVisible(false);
               window. file10OriginLabel.setVisible(false);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(false);
              window. file4OriginInputted.setVisible(false);
              window. file5OriginInputted.setVisible(false);
              window. file6OriginInputted.setVisible(false);
              window. file7OriginInputted.setVisible(false);
              window. file8OriginInputted.setVisible(false);
              window. file9OriginInputted.setVisible(false);
               window.file10OriginInputted.setVisible(false);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(false);
                window.addFileButton4.setVisible(false);
                window.addFileButton5.setVisible(false);
                window.addFileButton6.setVisible(false);
                window.addFileButton7.setVisible(false);
                window.addFileButton8.setVisible(false);
                window.addFileButton9.setVisible(false);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(false);
                window.filePathLabel4.setVisible(false);
                window.filePathLabel5.setVisible(false);
                window.filePathLabel6.setVisible(false);
                window.filePathLabel7.setVisible(false);
                window.filePathLabel8.setVisible(false);
                window.filePathLabel9.setVisible(false);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);


            } break;
            case 3:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(false);
              window.  file5OriginLabel.setVisible(false);
              window.  file6OriginLabel.setVisible(false);
              window.  file7OriginLabel.setVisible(false);
              window.  file8OriginLabel.setVisible(false);
              window.  file9OriginLabel.setVisible(false);
               window. file10OriginLabel.setVisible(false);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(false);
              window. file5OriginInputted.setVisible(false);
              window. file6OriginInputted.setVisible(false);
              window. file7OriginInputted.setVisible(false);
              window. file8OriginInputted.setVisible(false);
              window. file9OriginInputted.setVisible(false);
               window.file10OriginInputted.setVisible(false);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(false);
                window.addFileButton5.setVisible(false);
                window.addFileButton6.setVisible(false);
                window.addFileButton7.setVisible(false);
                window.addFileButton8.setVisible(false);
                window.addFileButton9.setVisible(false);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(false);
                window.filePathLabel5.setVisible(false);
                window.filePathLabel6.setVisible(false);
                window.filePathLabel7.setVisible(false);
                window.filePathLabel8.setVisible(false);
                window.filePathLabel9.setVisible(false);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            }break;
            case 4:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(false);
              window.  file6OriginLabel.setVisible(false);
              window.  file7OriginLabel.setVisible(false);
              window.  file8OriginLabel.setVisible(false);
              window.  file9OriginLabel.setVisible(false);
               window. file10OriginLabel.setVisible(false);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(false);
              window. file6OriginInputted.setVisible(false);
              window. file7OriginInputted.setVisible(false);
              window. file8OriginInputted.setVisible(false);
              window. file9OriginInputted.setVisible(false);
               window.file10OriginInputted.setVisible(false);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(false);
                window.addFileButton6.setVisible(false);
                window.addFileButton7.setVisible(false);
                window.addFileButton8.setVisible(false);
                window.addFileButton9.setVisible(false);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(false);
                window.filePathLabel6.setVisible(false);
                window.filePathLabel7.setVisible(false);
                window.filePathLabel8.setVisible(false);
                window.filePathLabel9.setVisible(false);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            } break;
            case 5:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(true);
              window.  file6OriginLabel.setVisible(false);
              window.  file7OriginLabel.setVisible(false);
              window.  file8OriginLabel.setVisible(false);
              window.  file9OriginLabel.setVisible(false);
               window. file10OriginLabel.setVisible(false);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(true);
              window. file6OriginInputted.setVisible(false);
              window. file7OriginInputted.setVisible(false);
              window. file8OriginInputted.setVisible(false);
              window. file9OriginInputted.setVisible(false);
               window.file10OriginInputted.setVisible(false);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(false);
                window.addFileButton7.setVisible(false);
                window.addFileButton8.setVisible(false);
                window.addFileButton9.setVisible(false);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(false);
                window.filePathLabel7.setVisible(false);
                window.filePathLabel8.setVisible(false);
                window.filePathLabel9.setVisible(false);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            }break;
            case 6:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(true);
              window.  file6OriginLabel.setVisible(true);
              window.  file7OriginLabel.setVisible(false);
              window.  file8OriginLabel.setVisible(false);
              window.  file9OriginLabel.setVisible(false);
               window. file10OriginLabel.setVisible(false);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(true);
              window. file6OriginInputted.setVisible(true);
              window. file7OriginInputted.setVisible(false);
              window. file8OriginInputted.setVisible(false);
              window. file9OriginInputted.setVisible(false);
               window.file10OriginInputted.setVisible(false);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(true);
                window.addFileButton7.setVisible(false);
                window.addFileButton8.setVisible(false);
                window.addFileButton9.setVisible(false);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(true);
                window.filePathLabel7.setVisible(false);
                window.filePathLabel8.setVisible(false);
                window.filePathLabel9.setVisible(false);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            } break;
            case 7:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(true);
              window.  file6OriginLabel.setVisible(true);
              window.  file7OriginLabel.setVisible(true);
              window.  file8OriginLabel.setVisible(false);
              window.  file9OriginLabel.setVisible(false);
               window. file10OriginLabel.setVisible(false);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(true);
              window. file6OriginInputted.setVisible(true);
              window. file7OriginInputted.setVisible(true);
              window. file8OriginInputted.setVisible(false);
              window. file9OriginInputted.setVisible(false);
               window.file10OriginInputted.setVisible(false);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(true);
                window.addFileButton7.setVisible(true);
                window.addFileButton8.setVisible(false);
                window.addFileButton9.setVisible(false);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(true);
                window.filePathLabel7.setVisible(true);
                window.filePathLabel8.setVisible(false);
                window.filePathLabel9.setVisible(false);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            }break;
            case 8:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(true);
              window.  file6OriginLabel.setVisible(true);
              window.  file7OriginLabel.setVisible(true);
              window.  file8OriginLabel.setVisible(true);
              window.  file9OriginLabel.setVisible(false);
               window. file10OriginLabel.setVisible(false);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(true);
              window. file6OriginInputted.setVisible(true);
              window. file7OriginInputted.setVisible(true);
              window. file8OriginInputted.setVisible(true);
              window. file9OriginInputted.setVisible(false);
               window.file10OriginInputted.setVisible(false);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(true);
                window.addFileButton7.setVisible(true);
                window.addFileButton8.setVisible(true);
                window.addFileButton9.setVisible(false);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(true);
                window.filePathLabel7.setVisible(true);
                window.filePathLabel8.setVisible(true);
                window.filePathLabel9.setVisible(false);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            } break;
            case 9:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(true);
              window.  file6OriginLabel.setVisible(true);
              window.  file7OriginLabel.setVisible(true);
              window.  file8OriginLabel.setVisible(true);
              window.  file9OriginLabel.setVisible(true);
               window. file10OriginLabel.setVisible(false);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(true);
              window. file6OriginInputted.setVisible(true);
              window. file7OriginInputted.setVisible(true);
              window. file8OriginInputted.setVisible(true);
              window. file9OriginInputted.setVisible(true);
               window.file10OriginInputted.setVisible(false);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(true);
                window.addFileButton7.setVisible(true);
                window.addFileButton8.setVisible(true);
                window.addFileButton9.setVisible(true);
                window.addFileButton10.setVisible(false);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(true);
                window.filePathLabel7.setVisible(true);
                window.filePathLabel8.setVisible(true);
                window.filePathLabel9.setVisible(true);
                window.filePathLabel10.setVisible(false);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            }break;
            case 10:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(true);
              window.  file6OriginLabel.setVisible(true);
              window.  file7OriginLabel.setVisible(true);
              window.  file8OriginLabel.setVisible(true);
              window.  file9OriginLabel.setVisible(true);
               window. file10OriginLabel.setVisible(true);
               window. file11OriginLabel.setVisible(false);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(true);
              window. file6OriginInputted.setVisible(true);
              window. file7OriginInputted.setVisible(true);
              window. file8OriginInputted.setVisible(true);
              window. file9OriginInputted.setVisible(true);
               window.file10OriginInputted.setVisible(true);
               window.file11OriginInputted.setVisible(false);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(true);
                window.addFileButton7.setVisible(true);
                window.addFileButton8.setVisible(true);
                window.addFileButton9.setVisible(true);
                window.addFileButton10.setVisible(true);
                window.addFileButton11.setVisible(false);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(true);
                window.filePathLabel7.setVisible(true);
                window.filePathLabel8.setVisible(true);
                window.filePathLabel9.setVisible(true);
                window.filePathLabel10.setVisible(true);
                window.filePathLabel11.setVisible(false);
                window.filePathLabel12.setVisible(false);
            } break;
            case 11:{
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(true);
              window.  file6OriginLabel.setVisible(true);
              window.  file7OriginLabel.setVisible(true);
              window.  file8OriginLabel.setVisible(true);
              window.  file9OriginLabel.setVisible(true);
               window. file10OriginLabel.setVisible(true);
               window. file11OriginLabel.setVisible(true);
               window. file12OriginLabel.setVisible(false);

              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(true);
              window. file6OriginInputted.setVisible(true);
              window. file7OriginInputted.setVisible(true);
              window. file8OriginInputted.setVisible(true);
              window. file9OriginInputted.setVisible(true);
               window.file10OriginInputted.setVisible(true);
               window.file11OriginInputted.setVisible(true);
               window.file12OriginInputted.setVisible(false);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(true);
                window.addFileButton7.setVisible(true);
                window.addFileButton8.setVisible(true);
                window.addFileButton9.setVisible(true);
                window.addFileButton10.setVisible(true);
                window.addFileButton11.setVisible(true);
                window.addFileButton12.setVisible(false);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(true);
                window.filePathLabel7.setVisible(true);
                window.filePathLabel8.setVisible(true);
                window.filePathLabel9.setVisible(true);
                window.filePathLabel10.setVisible(true);
                window.filePathLabel11.setVisible(true);
                window.filePathLabel12.setVisible(false);
            }break;
            case 12: {
              window.  file1OriginLabel.setVisible(true);
              window.  file2OriginLabel.setVisible(true);
              window.  file3OriginLabel.setVisible(true);
              window.  file4OriginLabel.setVisible(true);
              window.  file5OriginLabel.setVisible(true);
              window.  file6OriginLabel.setVisible(true);
              window.  file7OriginLabel.setVisible(true);
              window.  file8OriginLabel.setVisible(true);
              window.  file9OriginLabel.setVisible(true);
               window. file10OriginLabel.setVisible(true);
               window. file11OriginLabel.setVisible(true);
               window. file12OriginLabel.setVisible(true);


              window. file1OriginInputted.setVisible(true);
              window. file2OriginInputted.setVisible(true);
              window. file3OriginInputted.setVisible(true);
              window. file4OriginInputted.setVisible(true);
              window. file5OriginInputted.setVisible(true);
              window. file6OriginInputted.setVisible(true);
              window. file7OriginInputted.setVisible(true);
              window. file8OriginInputted.setVisible(true);
              window. file9OriginInputted.setVisible(true);
               window.file10OriginInputted.setVisible(true);
               window.file11OriginInputted.setVisible(true);
               window.file12OriginInputted.setVisible(true);

                window.addFileButton1.setVisible(true);
                window.addFileButton2.setVisible(true);
                window.addFileButton3.setVisible(true);
                window.addFileButton4.setVisible(true);
                window.addFileButton5.setVisible(true);
                window.addFileButton6.setVisible(true);
                window.addFileButton7.setVisible(true);
                window.addFileButton8.setVisible(true);
                window.addFileButton9.setVisible(true);
                window.addFileButton10.setVisible(true);
                window.addFileButton11.setVisible(true);
                window.addFileButton12.setVisible(true);

                window.filePathLabel1.setVisible(true);
                window.filePathLabel2.setVisible(true);
                window.filePathLabel3.setVisible(true);
                window.filePathLabel4.setVisible(true);
                window.filePathLabel5.setVisible(true);
                window.filePathLabel6.setVisible(true);
                window.filePathLabel7.setVisible(true);
                window.filePathLabel8.setVisible(true);
                window.filePathLabel9.setVisible(true);
                window.filePathLabel10.setVisible(true);
                window.filePathLabel11.setVisible(true);
                window.filePathLabel12.setVisible(true);
            } break;
            default: break;
        }
        window.spinner1.setValue(userPrefs.getNumberOfFilesValue());

        window.file1OriginInputted.setText(userPrefs.getDataOriginFile1Value());
        window.file2OriginInputted.setText(userPrefs.getDataOriginFile2Value());
        window.file3OriginInputted.setText(userPrefs.getDataOriginFile3Value());
        window.file4OriginInputted.setText(userPrefs.getDataOriginFile4Value());
        window.file5OriginInputted.setText(userPrefs.getDataOriginFile5Value());
        window.file6OriginInputted.setText(userPrefs.getDataOriginFile6Value());
        window.file7OriginInputted.setText(userPrefs.getDataOriginFile7Value());
        window.file8OriginInputted.setText(userPrefs.getDataOriginFile8Value());
        window.file9OriginInputted.setText(userPrefs.getDataOriginFile9Value());
        window.file10OriginInputted.setText(userPrefs.getDataOriginFile10Value());
        window.file11OriginInputted.setText(userPrefs.getDataOriginFile11Value());
        window.file12OriginInputted.setText(userPrefs.getDataOriginFile12Value());

        if (userPrefs.isSmartQueryValue()){
            window.enableSmartQueryCheckBox.setEnabled(true);
        }

        if (userPrefs.isCustomQueriesValue()){
            window.enableCustomQueriesCheckBox.setEnabled(true);
        }



        SwingUtilities.updateComponentTreeUI(frame); //refresh hGUI



//        converter.findColumnTitles();
//
//        int titleRowIndex = converter.getTitleRowIndex();
//
//
//
//      converter.columnDataTypes();
//
//
//        Database.createNewTable("test", converter.getColumnDataTypes(), converter.getColumnTitles());
//
//        Database.insert("test", converter.getColumnTitles(), converter.getColumnDataTypes(), converter.getTitleRowIndex());


        }

    }
