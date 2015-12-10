/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagerv1;
//the reason it kept crashing: DON'T PUT UNNECESSARY BUTTON DECLARATIONS

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import java.awt.TextField;
import com.gtranslate.Audio;
import com.gtranslate.Language;
import com.gtranslate.Audio;
import com.gtranslate.Language;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;                          //This import statement is...THE HOLY GRAIL!!!!
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Quiggy
 */
public class FXMLLoginController implements Initializable 
{

    /**
     * Initializes the controller class.
     */

    HomeController grab;
    String installationPath = System.getProperty("user.home") + "/patientsdata";
    @FXML
    String currentPatientFirstName = "testing";
    String currentPatientLastName = "testing";
    String currentPatientDOB = "";
    
    @FXML 
    public TextField textfield1;
    public TextField textfield2;
    public Label notification;
    public ChoiceBox day;
    public ChoiceBox month;
    public ChoiceBox year;
    
    
    
    
    private Stage stage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
       month.setItems(FXCollections.observableArrayList("1- January", "2- February", "3- March", "4- April", "5- May", "6- June", "7- July", "8- August", "9- September", "10- October", "11- November", "12- December"));
       day.setItems(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"));
       
       ArrayList yearsList = new ArrayList();
       
       int firstYear = 1900;
       int lastYear = 2016;
       
       while(firstYear != lastYear)
       {
           lastYear = lastYear - 1;
           yearsList.add(lastYear);
       }
       
       year.setItems(FXCollections.observableArrayList(yearsList));
       
       
       
       //select the first item by default
       month.getSelectionModel().selectFirst();
       day.getSelectionModel().selectFirst();
       year.getSelectionModel().selectFirst();
       
    }
    
    @FXML
    private void createAction(javafx.event.ActionEvent event) throws IOException 
    {
        
       if(textfield1.getText().compareTo("") == 0 || textfield1.getText().trim().compareTo(" ") == 0 || textfield2.getText().compareTo("") == 0 || textfield2.getText().trim().compareTo(" ") == 0)
       {
            notification.setText("Please enter the patient's first name, last name, and date of birth");
       }
       else
       {
            boolean exists = false;
        
            //check whether the patient already exists
            exists = exists();

            if(exists == true)
            {
    //            System.out.println("hi");
                notification.setText("This Patient Already Exists. Please Try Again.");
                //please enter a unique patient name/this patient already exists. please try again.
                //please enter a first and last name/the patient's first and last names if((field1) OR (field2) are blank)
            }
            else
            {
                //set the current patient
                currentPatientFirstName = textfield1.getText().toLowerCase();
                currentPatientLastName = textfield2.getText().toLowerCase();
                currentPatientDOB = getSelectedDOB();

                //write it to the "current patient" file
                    currentPatientFirstName = textfield1.getText().toLowerCase();
                    currentPatientLastName = textfield2.getText().toLowerCase();
                    File currentPatient = new File(installationPath + "/currentpatient.txt");
                    FileWriter writ = new FileWriter(currentPatient, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(currentPatientFirstName + "," + currentPatientLastName + "," + currentPatientDOB);
                    bw.close();
                    writ.close();

                //create the patient's folder and all their files
                createPatient();

                //some idiocy goes here
                try
                {
                    //Audio audio = Audio.getInstance();
                    //InputStream sound = audio.getAudio("Hello!", Language.ENGLISH);
                    //audio.play(sound);
                }
                catch(Exception excep)
                {
                    //System.out.println(excep);
                }

                
                //load the evaluation form
                Parent blah = FXMLLoader.load(getClass().getResource("Home.fxml"));
                Scene scene = new Scene(blah);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();

            }
       }
        
       
       
    }

    @FXML
    private void loadAction(javafx.event.ActionEvent event) throws IOException 
    {
            boolean exists = true;
            
            //determine whether the patient is on the list of patients
            exists = exists();
        
            if(exists == true)
            {
                /*//set the current patient
                
                //load the evaluation form
                Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
                Scene scene = new Scene(root2);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
                
                //initialize the evaluation form with all of the patient's data from their files*/
                
                //set the current patient
                currentPatientFirstName = textfield1.getText().toLowerCase();
                currentPatientLastName = textfield2.getText().toLowerCase();
                currentPatientDOB = getSelectedDOB();
            
                //write it to the "current patient" file
                currentPatientFirstName = textfield1.getText().toLowerCase();
                currentPatientLastName = textfield2.getText().toLowerCase();
                currentPatientDOB = getSelectedDOB();
                File currentPatient = new File(installationPath + "/currentpatient.txt");
                FileWriter writ = new FileWriter(currentPatient, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(currentPatientFirstName + "," + currentPatientLastName + "," + currentPatientDOB);
                bw.close();
                writ.close();
             
                //some idiocy goes here
                try
                {
                    //Audio audio = Audio.getInstance();
                    //InputStream sound = audio.getAudio("Welcome Back!", Language.ENGLISH);
                    //audio.play(sound);
                }
                catch(Exception excep)
                {
                    //System.out.println(excep);
                }

                //load the evaluation form
                Parent blah = FXMLLoader.load(getClass().getResource("Home.fxml"));
                Scene scene = new Scene(blah);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
                
            }
            else
            {
                notification.setText("This Patient Does Not Exist. \n Please make sure that the patient's first and last names are spelled correctly and try again. \n Names are not case-sensitive.");
                //Sorry, this patient does not exist. please try again/make sure the patient's first and last names are spelled correctly. Note: names are not case sensitive/the patient's name is not case sensitive.
                //The fields are blank. Please enter a first and last name/the patient's first and last name
            }
        
            
    }
    

    public boolean exists()
    {
        boolean e = false;

        try
        {
            String entireFileText = new Scanner(new File(installationPath + "/Patients.txt")).useDelimiter("//A").next();
            String[] arrayOfNames = entireFileText.split(";");

            
            //System.out.println("Patient Name: " + arrayOfNames[arrayOfNames.length - 1]);
            
            int n = 0;
            String f,l,dob = "";
            
            
            while(n < arrayOfNames.length)
            {                        
                String nameWithComma = arrayOfNames[n];
                String[] nameArray = nameWithComma.split(",");

                f = nameArray[0].toLowerCase();
                l = nameArray[1].toLowerCase();
                //System.out.println(f);
                //System.out.println(l);
                dob = nameArray[2];
                
                //System.out.println(getSelectedDOB());  
                //System.out.println(dob);
            
//                System.out.println(f + "," + l);
                
                n++;
                
                if((f.trim().equalsIgnoreCase(textfield1.getText().trim())) && (l.trim().equalsIgnoreCase(textfield2.getText().trim())) && getSelectedDOB().equals(dob))
                {
                  
                    e = true;
//                    System.out.println("reaches here");
                }
                
          
                
            }
            
        }
        catch(Exception exception)
        {}
        
        return e;
    
    }
 
    public void addPatientToList() throws IOException
    {
        Writer output = new BufferedWriter(new FileWriter(installationPath + "/Patients.txt", true));
        
        String m,d,y;
        
        m = month.getValue().toString();
        
        if(month.getValue().toString().equals("1- January"))
        {
            m = "01";
        }
        if(month.getValue().toString().equals("2- February"))
        {
            m = "02";
        }
        if(month.getValue().toString().equals("3- March"))
        {
            m = "03";
        }
        if(month.getValue().toString().equals("4- April"))
        {
            m = "04";
        }
        if(month.getValue().toString().equals("5- May"))
        {
            m = "05";
        }
        if(month.getValue().toString().equals("6- June"))
        {
            m = "06";
        }
        if(month.getValue().toString().equals("7- July"))
        {
            m = "07";
        }
        if(month.getValue().toString().equals("8- August"))
        {
            m = "08";
        }
        if(month.getValue().toString().equals("9- September"))
        {
            m = "09";
        }
        if(month.getValue().toString().equals("10- October"))
        {
            m = "10";
        }
        if(month.getValue().toString().equals("11- November"))
        {
            m = "11";
        }
        if(month.getValue().toString().equals("12- December"))
        {
            m = "12";
        }
        
        
        d = day.getValue().toString();
        
        if(d.equalsIgnoreCase("1"))
        {
            d = "01";
        }
        if(d.equalsIgnoreCase("2"))
        {
            d = "02";
        }
        if(d.equalsIgnoreCase("3"))
        {
            d = "03";
        }
        if(d.equalsIgnoreCase("4"))
        {
            d = "04";
        }
        if(d.equalsIgnoreCase("5"))
        {
            d = "05";
        }
        if(d.equalsIgnoreCase("6"))
        {
            d = "06";
        }
        if(d.equalsIgnoreCase("7"))
        {
            d = "07";
        }
        if(d.equalsIgnoreCase("8"))
        {
            d = "08";
        }
        if(d.equalsIgnoreCase("9"))
        {
            d = "09";
        }
        
        y = year.getValue().toString();
        
        currentPatientDOB = m + d + y;
        
        output.append(currentPatientFirstName + "," + currentPatientLastName + "," + m + d + y + ";");
        output.close();
    }
    
    public String getSelectedDOB()
    {
        String m,d,y;
        
        m = month.getValue().toString();
        
        if(month.getValue().toString().equals("1- January"))
        {
            m = "01";
        }
        if(month.getValue().toString().equals("2- February"))
        {
            m = "02";
        }
        if(month.getValue().toString().equals("3- March"))
        {
            m = "03";
        }
        if(month.getValue().toString().equals("4- April"))
        {
            m = "04";
        }
        if(month.getValue().toString().equals("5- May"))
        {
            m = "05";
        }
        if(month.getValue().toString().equals("6- June"))
        {
            m = "06";
        }
        if(month.getValue().toString().equals("7- July"))
        {
            m = "07";
        }
        if(month.getValue().toString().equals("8- August"))
        {
            m = "08";
        }
        if(month.getValue().toString().equals("9- September"))
        {
            m = "09";
        }
        if(month.getValue().toString().equals("10- October"))
        {
            m = "10";
        }
        if(month.getValue().toString().equals("11- November"))
        {
            m = "11";
        }
        if(month.getValue().toString().equals("12- December"))
        {
            m = "12";
        }
        
        
        d = day.getValue().toString();
        
        if(d.equalsIgnoreCase("1"))
        {
            d = "01";
        }
        if(d.equalsIgnoreCase("2"))
        {
            d = "02";
        }
        if(d.equalsIgnoreCase("3"))
        {
            d = "03";
        }
        if(d.equalsIgnoreCase("4"))
        {
            d = "04";
        }
        if(d.equalsIgnoreCase("5"))
        {
            d = "05";
        }
        if(d.equalsIgnoreCase("6"))
        {
            d = "06";
        }
        if(d.equalsIgnoreCase("7"))
        {
            d = "07";
        }
        if(d.equalsIgnoreCase("8"))
        {
            d = "08";
        }
        if(d.equalsIgnoreCase("9"))
        {
            d = "09";
        }
        
        y = year.getValue().toString();
        
        String selectedDOB = m + d + y;
        
        return selectedDOB;
    }
    
    public void removePatientFromList() throws IOException
    {
    
    }
    
    public void createPatient() throws IOException
    {
        //writes all user login info to the "Patients" file
                //note that the "Patients" file should have been automatically generated (ie. pre-created) upon installation
                //alternatively (ie. if the aforestated is not easy to figure out in a timely manner), then include the Patients file as part of the package (just like in EDA)
        addPatientToList();
        
        //creates the patient's empty folders and files
        File userFolder = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB);        
        File patientEvaluation = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm");
        File patientProgressReports = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/ProgressNotes");        
         
                try
             	{
                	userFolder.mkdir();
                        patientEvaluation.mkdir();
                        patientProgressReports.mkdir();
                	//result = true;
             	} 
            	catch(SecurityException se)
             	{
                	//handle it
             	}        
             	
                File listOfProgressReports = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/ProgressReports.txt");
        FileWriter writer = new FileWriter(listOfProgressReports, true);	        
        BufferedWriter bufferedreader = new BufferedWriter(writer);
        writer.append("");
        bufferedreader.close();
        writer.close();
                
                
                /*if(result) 
             	{    
               		System.out.println("DIR created");  
             	}*/
          
        //creates the patient's empty evaluation form files
        File signedStatus = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/signed.txt");
        FileWriter w = new FileWriter(signedStatus, true);	        
        BufferedWriter b = new BufferedWriter(w);
        w.append("false");
        b.close();
        w.close();
                
        File firstName = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/first.txt");
        FileWriter writ = new FileWriter(firstName, true);	        
        BufferedWriter bw = new BufferedWriter(writ);
        writ.append(currentPatientFirstName);
        bw.close();
        writ.close();
        
        File lastName = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/last.txt");
        FileWriter writ1 = new FileWriter(lastName, true);	        
        BufferedWriter bw1 = new BufferedWriter(writ1);
        writ1.append(currentPatientLastName);
        bw1.close();
        writ1.close();
        
        File age = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/age.txt");
        FileWriter writ2 = new FileWriter(age, true);	        
        BufferedWriter bw2 = new BufferedWriter(writ2);
        writ2.append("");
        bw2.close();
        writ2.close();
        
        File dob = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/dateofbirth.txt");
        FileWriter writ3 = new FileWriter(dob, true);	        
        BufferedWriter bw3 = new BufferedWriter(writ3);
        writ3.append("");
        bw3.close();
        writ3.close();
        
        File maritalstatus = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/maritalstatus.txt");
        FileWriter writ4 = new FileWriter(maritalstatus, true);	        
        BufferedWriter bw4 = new BufferedWriter(writ4);
        writ4.append("");
        bw4.close();
        writ4.close();
        
        File ethnicity = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/ethnicity.txt");
        FileWriter writ5 = new FileWriter(ethnicity, true);	        
        BufferedWriter bw5 = new BufferedWriter(writ5);
        writ5.append("");
        bw5.close();
        writ5.close();

        File ethnicityother = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/ethnicity-other.txt");
        FileWriter writt = new FileWriter(ethnicityother, true);	        
        BufferedWriter bww = new BufferedWriter(writt);
        writt.append("");
        bww.close();
        writt.close();
        
        File sex = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/sex.txt");
        FileWriter writ6 = new FileWriter(sex, true);	        
        BufferedWriter bw6 = new BufferedWriter(writ6);
        writ6.append("");
        bw6.close();
        writ6.close();
        
        File referredBy = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/referredby.txt");
        FileWriter writ7 = new FileWriter(referredBy, true);	        
        BufferedWriter bw7 = new BufferedWriter(writ7);
        writ7.append("");
        bw7.close();
        writ7.close();
        
        File referredByTherapist = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/referredby-therapist.txt");
        FileWriter writ8 = new FileWriter(referredByTherapist, true);	        
        BufferedWriter bw8 = new BufferedWriter(writ8);
        writ8.append("");
        bw8.close();
        writ8.close();
        
        File referredByOther = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/referredby-other.txt");
        FileWriter writ9 = new FileWriter(referredByOther, true);	        
        BufferedWriter bw9 = new BufferedWriter(writ9);
        writ9.append("");
        bw9.close();
        writ9.close();
        
        //dr. prince
        File reasonForReferral = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/reasonforreferral.txt");
        FileWriter writ10 = new FileWriter(reasonForReferral, true);	        
        BufferedWriter bw10 = new BufferedWriter(writ10);
        writ10.append("");
        bw10.close();
        writ10.close();
        
        File sourceOfInformation = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/sourceofinformation.txt");
        FileWriter writ11 = new FileWriter(sourceOfInformation, true);	        
        BufferedWriter bw11 = new BufferedWriter(writ11);
        writ11.append("");
        bw11.close();
        writ11.close();
        
        File sourceOfInformationOther = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/sourceofinformation-other.txt");
        FileWriter writ12 = new FileWriter(sourceOfInformationOther, true);	        
        BufferedWriter bw12 = new BufferedWriter(writ12);
        writ12.append("");
        bw12.close();
        writ12.close();
        
        File reliabilityOfInformation = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/reliabilityofinformation.txt");
        FileWriter writ13 = new FileWriter(reliabilityOfInformation, true);	        
        BufferedWriter bw13 = new BufferedWriter(writ13);
        writ13.append("");
        bw13.close();
        writ13.close();
        
        File reliabilityOfInformationOther = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/reliabilityofinformation-other.txt");
        FileWriter writ14 = new FileWriter(reliabilityOfInformationOther, true);	        
        BufferedWriter bw14 = new BufferedWriter(writ14);
        writ14.append("");
        bw14.close();
        writ14.close();
        
        File historyOfPresentIllness = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/historyofpresentillness.txt");
        FileWriter writ15 = new FileWriter(historyOfPresentIllness, true);	        
        BufferedWriter bw15 = new BufferedWriter(writ15);
        writ15.append("");
        bw15.close();
        writ15.close();
        
        File signsSymptoms = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/signsandsymptoms.txt");
        FileWriter writ16 = new FileWriter(signsSymptoms, true);	        
        BufferedWriter bw16 = new BufferedWriter(writ16);
        writ16.append("");
        bw16.close();
        writ16.close();
        
        File currentMedications = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/currentmedications.txt");
        FileWriter writ17 = new FileWriter(currentMedications, true);	        
        BufferedWriter bw17 = new BufferedWriter(writ17);
        writ17.append("");
        bw17.close();
        writ17.close();
        
        File pastHistoryOf = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/pasthistoryof.txt");
        FileWriter writ18 = new FileWriter(pastHistoryOf, true);	        
        BufferedWriter bw18 = new BufferedWriter(writ18);
        writ18.append("");
        bw18.close();
        writ18.close();
        
        File pastHistoryOfText = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/pasthistoryoftext.txt");
        FileWriter writ19 = new FileWriter(pastHistoryOfText, true);	        
        BufferedWriter bw19 = new BufferedWriter(writ19);
        writ19.append("");
        bw19.close();
        writ19.close();
        
        File medicationTrialsTable = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/medicationtrialstable.txt");
        FileWriter writ20 = new FileWriter(medicationTrialsTable, true);	        
        BufferedWriter bw20 = new BufferedWriter(writ20);
        writ20.append("");
        bw20.close();
        writ20.close();
        
        File medicationTrialsComments = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/medicationtrialscomments.txt");
        FileWriter writ21 = new FileWriter(medicationTrialsComments, true);	        
        BufferedWriter bw21 = new BufferedWriter(writ21);
        writ21.append("");
        bw21.close();
        writ21.close();
        
        File substanceUseHistory = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/substanceusehistory.txt");
        FileWriter writ22 = new FileWriter(substanceUseHistory, true);	        
        BufferedWriter bw22 = new BufferedWriter(writ22);
        writ22.append("");
        bw22.close();
        writ22.close();
        
        File deniesHistoryOf = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/denieshistoryof.txt");
        FileWriter writ23 = new FileWriter(deniesHistoryOf, true);	        
        BufferedWriter bw23 = new BufferedWriter(writ23);
        writ23.append("");
        bw23.close();
        writ23.close();
        
        File deniesHistoryOfText = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/denieshistoryoftext.txt");
        FileWriter writ24 = new FileWriter(deniesHistoryOfText, true);	        
        BufferedWriter bw24 = new BufferedWriter(writ24);
        writ24.append("");
        bw24.close();
        writ24.close();
        
        File socialHistoryText = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/socialhistorytext.txt");
        FileWriter writ25 = new FileWriter(socialHistoryText, true);	        
        BufferedWriter bw25 = new BufferedWriter(writ25);
        writ25.append("");
        bw25.close();
        writ25.close();
        
        File socialHistoryParents = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/socialhistoryparents.txt");
        FileWriter writ26 = new FileWriter(socialHistoryParents, true);	        
        BufferedWriter bw26 = new BufferedWriter(writ26);
        writ26.append("");
        bw26.close();
        writ26.close();
        
        File socialHistorySiblings = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/socialhistorysiblings.txt");
        FileWriter writ27 = new FileWriter(socialHistorySiblings, true);	        
        BufferedWriter bw27 = new BufferedWriter(writ27);
        writ27.append("");
        bw27.close();
        writ27.close();
        
        File socialHistoryChildren = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/socialhistorychildren.txt");
        FileWriter writ28 = new FileWriter(socialHistoryChildren, true);	        
        BufferedWriter bw28 = new BufferedWriter(writ28);
        writ28.append("");
        bw28.close();
        writ28.close();
        
        File familyHistoryOfMentalIllness = new File(installationPath + "/userdata/" + currentPatientFirstName + currentPatientLastName + currentPatientDOB + "/EvaluationForm/familyhistoryofmentalillness.txt");
        FileWriter writ29 = new FileWriter(familyHistoryOfMentalIllness, true);	        
        BufferedWriter bw29 = new BufferedWriter(writ29);
        writ29.append("");
        bw29.close();
        writ29.close();
        
    }
        
    
    /*public void createNewOnClick()
    {
       
        
       //getSomeStuff.loadEvalPage();
       //get.screenToEvaluationForm();
       System.out.println("Hello World");
        
       //lemmeAccessThis.initializeNewPatient();
        
    }
    
    public void loadExistingOnClick()
    {
        //getSomeStuff.loadEvalPage();
        //lemmeAccessThis.initializeExistingPatient();
    }*/
    
    public void quit()
    {
        System.exit(0);
    }     
    
     
}
