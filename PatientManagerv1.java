//THIS IS THE VERSION WITHOUT THE PRINT STATEMENTS





//you're sick. chill.
//r-->R, delete this patient, disable name, age, and dob, 1-2 remaining or no?, null boxes         +     change version no, ask dcc if izab is to have print-with-settings and export privileges

//order, phone details, gym pr, walk dog

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagerv1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Quiggy
 */
public class PatientManagerv1 extends Application {
 
    //String installationPath = "C:/Users/Quiggy/Desktop/PatientsTester";                 //System.getproperty(user.home) + "/patientdata" OR System.getenv("ProgramFiles") + "/patientdata";
    
    //String installationPath = System.getenv("ProgramFiles") + "/patientsdata";
    String installationPath = System.getProperty("user.home") + "/patientsdata";
    Stage stageII;
    //TextField textfield1;
    //TextField textfield2;                     
    
    @Override
    public void start(Stage stage) throws Exception {
        //check whether patientdata exists within program files. If it does not, create the directory
        
    System.out.println(installationPath);    
        
    File userFolder = new File(installationPath);

          // if the directory does not exist, create it
          if (!userFolder.exists()) 
          {
               //System.out.println("creating directory: " + directoryName);
	       //boolean result = false;

            	try
             	{
                	userFolder.mkdir();
                        System.out.println("directory created");
                	
             	} 
            	catch(Exception e)
             	{
                	//handle it
                    System.out.println("an exception");
             	}        
             	
          }
          
                 
          try
          {
          File listOfProgressReports = new File(installationPath + "/patients.txt");
        FileWriter writer = new FileWriter(listOfProgressReports, true);	        
        BufferedWriter bufferedreader = new BufferedWriter(writer);
        writer.append("");
        bufferedreader.close();
        writer.close();
          }
          catch(Exception e)
          {}
    
        File userData = new File(installationPath + "/userdata");

          // if the directory does not exist, create it
          if (!userData.exists()) 
          {    
              try
              {
                  userData.mkdir();
              }
              catch(Exception e)
              {}
          }
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLFirstLogin.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Patient Manager 5");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   
    
}
