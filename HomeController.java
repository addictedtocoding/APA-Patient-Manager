//"disable/turn off welcome messages/disable chatter" option


//delete's deselect, disable audio, menu bar "save", disable convert, label top bar, implementation of save() vs. saveEval()...




//Welcome to [APA's] Patient Manager! [Logo], Please enter the general-access password to log in.
//Welcome to the Patient Manager for Advanced Psych Associates! Please enter ...

//stuff that should be auto generated on patient creation: AGE (yes! calculate the patient's age based on their birthdate and autofill it (FOR NEW PATIENTS ONLY))
//"Progress Report for/- (month/day/year)"- write it out in words, like: "Progress Report for Ciel Phantomhive - May 19, 2015"

//walnuts, kale,...



//in order: sprucing, docs, implement tts
    //catch statements (dialog boxes) for load, delete, etc- ie. if nothing is selected a dialog should pop up and tell the user to select something "select a p r from the list"); ask dcc if he wants to disable all printing & exporting prior to signing, p note forms "are you sure stuff", deleting progress notes
//add a new menu item called "authorization"?
//add "sign this document" to the Eval's menu AND the Progress Note menu






//chapter title: ecstasy unravelled


//outdated--> write "populateBasedOnEval" as well as the code that checks whether it is appropriate to do so, fix the null problem in all boxes (just mimic ethnicity), the code for loadbasedonprevprognote & load this progress note should be identical - just change the path


//change of plans: write save/fill current note first ie. "load", then populate based on previous progress note (is the same as <--, just change the path), THEN write populate based on eval (is almost the same as <--, just change the path)

//mini-, aims, compulsions (under thought content)




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagerv1;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.awt.Desktop;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javax.swing.JOptionPane;
//import javax.security.auth.login.Configuration;
/*import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.result.WordResult;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;*/
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.apache.poi.util.IOUtils;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.apache.commons.io.filefilter.DirectoryFileFilter;


/**
 * FXML Controller class
 *
 * @author Quiggy
 */
public class HomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    // HAL photos & resume backup
    @FXML
    AnchorPane ap, masterPane;
    @FXML
    TextField first, last, ageText, dobText;
    @FXML
    TextField ethnicityothertext;
    @FXML
    RadioButton male, female, reasonforreferralpsychiatricevaluation, reasonforreferralmedicationmanagement;
    @FXML
    RadioButton single, engaged, married, seperated, divorced, commonlawspouse, cohabiting; 
    @FXML
    CheckBox africanamerican, nativeamerican, hispanic, asian, caucasian, ethnicityother, ocd, bipolardisorder, socialphobia, panicdisorder, eatingdisorder, majordepressivedisorder, psychosis;
    @FXML
    RadioButton insurance, internet, pcp, cps, therapist, referredbyother;
    @FXML
    TextField referredbytherapisttext, referredbyothertext, reasonforreferralbox;
    @FXML
    Button sign, assistantsign, saveButton;
    @FXML
    Button load, createPN, toPatientSelection, toPatientSelectionNoDialog;
    @FXML
    Label signature, signature2, assistantsignature;
    @FXML
    CheckBox businesscardprovided, discussedassistant;
    @FXML
    TextField who;
    @FXML
    TextArea signaturenotes;
    @FXML
    CheckBox patient, spouse, mother, father, othersourceofinformation, emp, unemp, disabilityincome;
    @FXML
    TextField othersourceofinformationbox, otherreliabilityofinformationbox;
    @FXML
    RadioButton good, fair, vague, minimizing, otherreliabilityofinformation, sano, sayes, physicalabuseno, physicalabuseyes, sexualabuseno, sexualabuseyes, violentaggressivebehaviorsno, violentaggressivebehaviorsyes, selfinjuriousbehaviorsno, selfinjuriousbehaviorsyes;
    @FXML
    TextArea historyofpresentillness, currentmedications, pastpsychiatrichistory, pasthistoryoftext, historyofmedicationtrialsinthepasttable, historyofmedicationtrialsinthepastcomments, substanceusehistory;
    @FXML
    ListView listOfProgressReports;
    @FXML
    CheckBox significantwithdrawals, dts, withdrawalseizures, historyofdetox, outpatient, inpatient, na, aa, substancetreatmentprogram, nkda, environmental;
    @FXML
    TextField inpatientbox, parents, siblings, children, education, allergiesdescriptionbox;
    @FXML
    TextArea socialhistorygeneral, familyhistoryofmentalillness, legalhistory, pastmedicalhistory;
    @FXML
    RadioButton fhomiNO, fhomiYES, eyecontactgood, eyecontactpoor, eyecontactvariable;
    @FXML
    TextField appearanceotherbox, attitudeotherbox, motoractivityotherbox, delusionsbox;
    @FXML
    CheckBox wellgroomed, casual, disheveled, bizarre, inappropriate, appearanceother, cooperative, guarded, suspicious, withdrawn, uncooperative, hostile, defensive, attitudeother;
    @FXML
    CheckBox normal, agitated, motorretardation, hyperactive, catatonia, tremorstics, motoractivityother;
    @FXML
    CheckBox appropriate, labile, expansive, constricted, affecthappy, affectsad, blunted, flat, masking, affectnormalrange;
    @FXML
    CheckBox euthymic, depressed, dysphoric, anxious, euphoric, angry, irritable, moodsad;
    @FXML
    CheckBox normal2, delayed, soft, loud, slurred, excessive, pressured, perseverating, rapid, rambling, incoherent, disorganized, decreasedproductivity;
    @FXML
    CheckBox intact, circumstantial, loa, tangential, foi, logicalgoaldirected, thoughtblocking, ruminating, racingthoughts, thoughtinsertionwithdrawalbroadcast;
    @FXML
    CheckBox logicalcoherent, povertyofcontent, ideasofreference, delusions, obsessions, phobias, paranoidideation;
    @FXML
    CheckBox visualhallucinations, auditoryhallucinations, depersonalization, derealization, commandah, delusions2, illusions, perceptionnoimpairment;
    @FXML
    CheckBox suicidalitydenied, suicidalityideation, suicidalityintent, suicidalityplan;
    @FXML
    TextField suicidalityplanbox, homicidalityplanbox, shorttermmemorydeficitsbox, longtermmemorydeficitsbox, generalfundofknowledgedeficitsbox, intellectbelowaveragebox, clinicalnotes;
    @FXML
    CheckBox homicidalitydenied, homicidalityideation, homicidalityintent, homicidalityplan, fullyoriented, disoriented, person, place, time;
    @FXML
    TextArea suicidalityhomicidalitycomments, axis1, axis2, axis3;
    @FXML
    CheckBox shorttermmemorywithinnormallimits, shorttermmemorydeficits, longtermmemorywithinnormallimits,longtermmemorydeficits, generalfundofknowledgewithinnormallimits, generalfundofknowledgedeficits, intellectaboveaverage, intellectaverage, intellectbelowaverage;
    @FXML
    CheckBox abstractionintact, abstractionconcrete, abstractionidiosyncratic;
    @FXML
    CheckBox judgementintact, judgementimpaired, judgementminimal, judgementmoderate, judgementsevere, insightintact, insightimpaired, insightminimal, insightmoderate, insightsevere;
    @FXML
    TextField axis4, axis4otherbox, axis5current, axis5highestinpastyear;
    @FXML
    CheckBox a4none, a4primarysupportgroup, a4partnerrelationalproblems, a4parentchildrelationalproblems, a4socialenvironment, a4occupation, a4economics, a4legalsystem, a4education, a4housing, a4noncompliancewithtreatment, a4other, axis5none; 
    @FXML
    TextField treatmentplantextfield, sebox1, sebox2, labstextfield;
    @FXML
    TextArea treatmentplanbox1, treatmentplanbox2;
    @FXML
    CheckBox treatmentplancheckbox1, treatmentplancheckbox2, treatmentplancheckbox3;
    @FXML
    CheckBox riskforreboundhypertension, complexsleeprelatedbehavior, ssoftoxicity, withdrawalsyndrome, riskforaddiction, seizures; 
    @FXML
    CheckBox prolongedqtc, tardivedyskinesiadystonia, acuteneurologicalse, metabolicsyndrome, decreasedeffectivenessofobc, teratogenicity, hyponatremia, hypothyroidism, rashsjsyndrome, weightgainloss, constipation, drymouth, increasedriskofsi, hyperprolactinemia, serotoninsyndrome, hairloss, hypotension, htn, dizziness, insomnia, sedation, sexual, gi;
    @FXML
    CheckBox blanklabs, vitd, hivscreen, vitaminb12folicacid, ua, uds, selectrolyte, lithium, lamictallevel, trileptallevel, depakotelevel, bmp, tft, lft, hgba1c, lipidprofile, cmp, cbc;
    @FXML
    TextField ebox1, ebox2;
    @FXML
    CheckBox riskofsuicidelow, riskofsuicidemoderate, riskofsuicidehigh, riskofsuicidemodifiableriskfactorsaddressed, dangertootherslow, dangertoothersmoderate, dangertoothershigh, dangertoothersmodifiableriskfactorsaddressed;
    @FXML
    RadioButton yes1, yes2, no1, no2;
            
            
    
    
    //public static boolean passLoaded = false;
    String firstName;
    String lastName;
    String dob;
    FXMLLoginController get;
    public MenuBar menu;
    
    String installationPath = System.getProperty("user.home") + "/patientsdata";
    
    boolean dccSigned, partnerSigned;
    
    boolean loaded = false;    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                

//start with the forum and the common questions page, add-on the profile page and private messaging features

        //passLoaded = false;

        //sets the current Patient
        try
        {
        String entireFileText = new Scanner(new File(installationPath + "/currentpatient.txt")).useDelimiter("//A").next();
        String[] nameArray = entireFileText.split(",");
            
            firstName = nameArray[0].toLowerCase();
            lastName = nameArray[1].toLowerCase();
            dob = nameArray[2];
        }
        catch (Exception e) {}
        
        //checks the signed status
        try
        {
            FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/signed.txt");
                         //+ "/userdata/" + get.currentPatientFirstName + get.currentPatientLastName + "/EvaluationForm/first.txt");
                 BufferedReader br = new BufferedReader(reader); 
                 String signedStatus = br.readLine();
                 br.close();
                 reader.close();
               
                 if(signedStatus.equalsIgnoreCase("true"))
                 {
                     dccSigned = true;
                 }
                 else
                 {
                     dccSigned = false;
                 }
                 
                 
                FileReader reader2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/assistantsigned.txt");
                         //+ "/userdata/" + get.currentPatientFirstName + get.currentPatientLastName + "/EvaluationForm/first.txt");
                 BufferedReader br2 = new BufferedReader(reader2); 
                 String assistantSigned = br2.readLine();
                 br2.close();
                 reader2.close();

                 
                 if(assistantSigned.equalsIgnoreCase("true"))
                 {
                     partnerSigned = true;
                 }
                 else
                 {
                     partnerSigned = false;
                 }
                 
                 /*saveButton.setDisable(false);
                 sign.setVisible(true);
                 sign.setDisable(true);
                 signature.setVisible(false);*/
                 
                 if(signedStatus.equalsIgnoreCase("false") && (assistantSigned.equalsIgnoreCase("false")))
                 {
                     saveButton.setDisable(false);
                     sign.setVisible(true);
                     sign.setDisable(false);
                     assistantsign.setVisible(true);
                     assistantsign.setDisable(false);
                     assistantsignature.setVisible(false);
                     signature.setVisible(false);
                     signature2.setVisible(false);
                     ap.setDisable(false);
                 }
                 else if(signedStatus.equalsIgnoreCase("true") && (assistantSigned.equalsIgnoreCase("false")))
                 {
                     saveButton.setDisable(true);
                     sign.setVisible(false);
                     assistantsign.setVisible(true);
                     assistantsign.setDisable(false);
                     assistantsignature.setVisible(false);
                     signature.setVisible(true);
                     signature2.setVisible(true);
                     signature.setText("This document has been digitally signed by David Zhvikov MD");
                     ap.setDisable(true);
                 }
                 else if(signedStatus.equalsIgnoreCase("false") && (assistantSigned.equalsIgnoreCase("true")))
                 {
                     saveButton.setDisable(true);
                     sign.setVisible(true);
                     assistantsign.setVisible(false);
                     assistantsign.setDisable(true);
                     assistantsignature.setVisible(true);
                     signature.setVisible(false);
                     signature2.setVisible(false);
                     signature.setText("This document has been digitally signed by David Zhvikov MD");
                     ap.setDisable(true);
                 }
                 else
                 {
                     saveButton.setDisable(true);
                     sign.setVisible(false);
                     assistantsign.setVisible(false);
                     assistantsign.setDisable(true);
                     assistantsignature.setVisible(true);
                     signature.setVisible(true);
                     signature2.setVisible(true);
                     signature.setText("This document has been digitally signed by David Zhvikov MD");
                     ap.setDisable(true);
                 }    
        }
        catch(Exception e)
        {}

            

                 
        //loads the ListView
        
try
{
    FileReader r2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");              
    BufferedReader b2 = new BufferedReader(r2); 
                
                String s;
                ArrayList progressNotes = new ArrayList();
                
                
                while((s = b2.readLine()) != null)
                {
                    //System.out.println(s);
                    progressNotes.add(s);
                }
                
                
                
                b2.close();
                r2.close();
                
                //Adds the Progress Notes to the ListView
            
            
                   ObservableList<String> items = FXCollections.observableArrayList (
    "Single", "Double");
       items.clear();
       
       for(int counter = 0; counter < progressNotes.size(); counter++)
       {
            items.add(progressNotes.get(counter).toString());
       }
            
            listOfProgressReports.setItems(items);
                
                //String[] ethnicityArray = ethnicity.split(",");
}
catch (Exception e)
{
//System.out.println("file not found");
}
        
       //initializes the evaluation form [with the new patient's name] for the current patient
        fillName(); 
        
        fillDOB();
        
        fillAge(loaded);
        
        fillGender();
        
        fillMaritalStatus();
        
        fillEthnicity();
        
        fillReferredBy();
        
        fillReasonForReferral();
        
        fillSourceOfInformation();
        
        fillReliabilityOfInformation();
        
        fillHistoryOfPresentIllness();
        
        fillSignsSymptoms();
        
        fillCurrentMedications();
        
        fillPastPsychiatricHistory();
        
        fillPastHistoryOf();
        
        fillHistoryOfMedicationTrialsInThePast();
        
        fillSubstanceUseHistory();
        
        fillDeniesHistoryOf();
        
        fillSocialHistory();
        
        fillParentsSiblingsChildren();
        
        fillFamilyHistoryOfMentalIllness();
        
        fillEducation();
        
        fillEmployment();
        
        fillLegalHistory();
        
        fillPastMedicalHistory();
        
        fillAllergies();
        
        fillAppearance();
        
        fillEyeContact();
        
        fillAttitude();
        
        fillMotorActivity();
        
        fillAffect();
        
        fillMood();
        
        fillSpeech();
        
        fillThoughtProcess();
        
        fillThoughtContent();
        
        fillPerception();
        
        fillSuicidality();
        
        fillHomicidality();
        
        fillOrientation();
        
        fillShortTermMemory();
        
        fillLongTermMemory();
        
        fillGeneralFundOfKnowledge();
        
        fillIntellect();
        
        fillAbstraction();
        
        fillJudgementAndInsight();
        
        fillClinicalNotes();
        
        fillTreatmentPlan();
        
        fillSideEffects();
        
        fillLabs();
        
        fillEnd();
        
        fillSignatureZone();
        
//        currentPatientFirstName = get.currentPatientFirstName;
//        currentPatientLastName = get.currentPatientLastName;
        
        //sets the current patient
               /*try
               {
            String entireFileText = new Scanner(new File(installationPath + "/Patients.txt")).useDelimiter("//A").next();
            String[] arrayOfNames = entireFileText.split(";");

            
            System.out.println("Patient Name: " + arrayOfNames[arrayOfNames.length - 1]);
            
            String nameWithComma = arrayOfNames[arrayOfNames.length - 1];
            String[] nameArray = nameWithComma.split(",");
            
            firstName = nameArray[0].toLowerCase();
            lastName = nameArray[1].toLowerCase();
            
            
            
               }
               catch(Exception e)
               {}*/
        
        
/*ArrayList progressNotes = new ArrayList();
            
            for(int i = 0; i < listOfProgressReports.getItems().size(); i++)
            {
                progressNotes.add(listOfProgressReports.getItems().get(i));
            }*/                
            
            //broken and betrayed
            //of the ecsts's you've shown me.
            //...for me, italicsmaster, she put emphasis/lingered on the word. "M"
        
        menu.getMenus().removeAll();
                Menu file = new Menu("File");
         Menu edit = new Menu("Edit");
         Menu view = new Menu("View");
         Menu help = new Menu("About");
         Menu speech = new Menu("Speech Options");
        
            MenuItem save = new MenuItem("Save");
            MenuItem print = new MenuItem("Print");
            MenuItem printWithSettings = new MenuItem("Print With Settings");
            MenuItem export = new MenuItem("Export to");
            MenuItem logout = new MenuItem("Return to Patient Selection");
            MenuItem deleteThisPatient = new MenuItem("Delete This Patient");
            MenuItem exit = new MenuItem("Exit");
            
            MenuItem undo = new MenuItem("Undo (ctrl+z)");
            MenuItem redo = new MenuItem("Redo (ctrl+y)");
            MenuItem selectAll = new MenuItem("Select All (ctrl+A)");
            MenuItem cut = new MenuItem("Cut (ctrl+x)");
            MenuItem copy = new MenuItem("Copy (ctrl+c)");
            MenuItem paste = new MenuItem("Paste (ctrl+v)");
            MenuItem enableBackdoorModifications = new MenuItem("Enable Modification of this Evaluation Post-Signing");
            
            Menu submenu1 = new Menu("Create");
            Menu submenu2 = new Menu("Load");
            Menu submenu3 = new Menu("New");
            MenuItem createProgressReport = new MenuItem("Progress Report");
            MenuItem loadProgressReport = new MenuItem("Progress Report");
            MenuItem deleteProgressReport = new MenuItem("Delete selected progress report");
            submenu1.getItems().add(submenu3);
            submenu3.getItems().add(createProgressReport);
            submenu2.getItems().add(loadProgressReport);
            
            MenuItem howToUse = new MenuItem("How to use patient manager");
            MenuItem versionInfo = new MenuItem("About Patient Manager/Version Info");

            /*MenuItem read = new MenuItem("Read to me");
            MenuItem launch = new MenuItem("Launch Dictation");*/
            //read to me menu, dictation menu- select a document to read aloud, read this passage aloud, launch windows in-built dictation, download brainac dictation online
            Menu read = new Menu("Read to me");
            Menu launch = new Menu("Dictation");
            
            Menu readPassageOrFormStartStop = new Menu("Read this passage/read this form");
            
            MenuItem startReading1 = new MenuItem("Start");
            MenuItem stopReading1 = new MenuItem("Stop");
            MenuItem startReading2 = new MenuItem("Start");
            MenuItem stopReading2 = new MenuItem("Stop");
            Menu readUploadedDocument = new Menu("Select a document to read");
            MenuItem launchWindowsDictation = new MenuItem("Launch Windows' Built-In Dictation");
            MenuItem launchBrainacDictation = new MenuItem("Download Brainac Dictation");
  
            startReading1.setDisable(true);
            stopReading1.setDisable(true);
            startReading2.setDisable(true);
            stopReading2.setDisable(true);
            
            readPassageOrFormStartStop.getItems().add(startReading1);
            readPassageOrFormStartStop.getItems().add(stopReading1);
            readUploadedDocument.getItems().add(startReading2);
            readUploadedDocument.getItems().add(stopReading2);
            
            readPassageOrFormStartStop.setDisable(true);
            readUploadedDocument.setDisable(true);
      
            launchBrainacDictation.setDisable(true);
            
            read.getItems().add(readPassageOrFormStartStop);
            read.getItems().add(readUploadedDocument);
            launch.getItems().add(launchWindowsDictation);
            launch.getItems().add(launchBrainacDictation);
            
        
        file.getItems().add(save);
        file.getItems().add(print);
        file.getItems().add(printWithSettings);    
        file.getItems().add(export);    
        file.getItems().add(logout);
        file.getItems().add(deleteThisPatient);
        file.getItems().add(exit);
        
        edit.getItems().add(undo);
        edit.getItems().add(redo);    
        edit.getItems().add(selectAll);    
        edit.getItems().add(cut);
        edit.getItems().add(copy);
        edit.getItems().add(paste);
        edit.getItems().add(enableBackdoorModifications);
        
        view.getItems().add(submenu1);
        view.getItems().add(submenu2);
        view.getItems().add(deleteProgressReport);
        
        help.getItems().add(howToUse);
        help.getItems().add(versionInfo);
        
        speech.getItems().add(read);
        speech.getItems().add(launch);
        
        
        menu.prefWidthProperty().bind(masterPane.widthProperty());
        //menu.setStyle("-fx-padding: 0 20 0 20;");
        
        //menu.getMenus().addAll(file, edit, view, help, speech);
        menu.getMenus().add(file);
        menu.getMenus().add(edit);
        menu.getMenus().add(view);
        menu.getMenus().add(speech);
        menu.getMenus().add(help);
        
        
undo.setDisable(true);
redo.setDisable(true);
cut.setDisable(true);
copy.setDisable(true);
paste.setDisable(true);
selectAll.setDisable(true);
            
        
                deleteThisPatient.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
         
                    int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this patient?","Warning", JOptionPane.OK_CANCEL_OPTION);
                    
                    if(result == 2)
                    {
                    
                    }
                    
                    if(result == 0)
                    {
                        int result2 = JOptionPane.showConfirmDialog(null, "Are you ABSOLUTELY sure you want to delete this patient?","Warning", JOptionPane.OK_CANCEL_OPTION);
                        
                        if(result2 == 2)
                        {
                        
                        }
                        if(result2 == 0)
                        {
                            String patientToDelete = firstName + "," + lastName + "," + dob; //listOfProgressReports.getSelectionModel().getSelectedItem().toString();
                    
        //            String currRepNoColons = currRep.replace(":", "");
        //        currRepNoColons = currRepNoColons.trim();
        
                    //1) removes the report from the list in the file
                            try
                            {
                                FileReader r2 = new FileReader(installationPath + "/patients.txt");              
                                BufferedReader b2 = new BufferedReader(r2); 

                                    String s = b2.readLine();
                                    String[] patients = s.split(";");         //String[] ssArray = ss.split(",");


                                    /*for(int i = 0; i < patients.size(); i++)
                                    {

                                    }*/

                                    /*while((s = b2.readLine()) != null)
                                    {
                                        //System.out.println(s);

                                        if(!s.equalsIgnoreCase(patientToDelete))
                                        {patients.add(s);}
                                    }*/



                                    b2.close();
                                    r2.close();


                                    File fff = new File(installationPath + "/patients.txt");
                                        FileWriter ddd = new FileWriter(fff, false);	        
                                        BufferedWriter bw = new BufferedWriter(ddd);
                                        ddd.append("");
                                        bw.close();
                                        ddd.close();

                                    for(int i = 0; i < patients.length; i++)
                                    {
                                        File openProgressReportsList = new File(installationPath + "/patients.txt");
                                        FileWriter fw = new FileWriter(openProgressReportsList, true);	        
                                        BufferedWriter bufferedwriter = new BufferedWriter(fw);
                                        if(!(patients[i].equalsIgnoreCase(patientToDelete)))
                                        {
                                            fw.append(patients[i].toLowerCase() + ";");
                                        }
                                        bufferedwriter.close();
                                        fw.close();
                                    }
                            }
                            catch(Exception ex)
                            {

                            }



                            /*try{
                                    FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                                    BufferedReader br = new BufferedReader(reader); 
                                    String fileContents = br.readLine();
                                    br.close();
                                    reader.close();

                                    fileContents = fileContents.replace(currRep, "");
                                    //System.out.println("fc:" + fileContents);

                                    //writes the new contents to the file:
                                    //writes the new report to the list
                                    File openProgressReportsList = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                                    FileWriter fw = new FileWriter(openProgressReportsList, false);	        
                                    BufferedWriter bufferedwriter = new BufferedWriter(fw);
                                    fw.append(fileContents);
                                    bufferedwriter.close();
                                    fw.close();
                            }
                            catch(Exception e)
                            {

                            }*/


                            //2) Deletes the folder for that progress report
                            try
                            {
                                File directory = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes");
                                File[] subdirs = directory.listFiles((FileFilter) DirectoryFileFilter.DIRECTORY);
                                for (File dir : subdirs) 
                                {
                                        File deleteThis = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + dir.getName());
                                            //System.out.println("Directory: " + dir.getName());
                                        File[] filez = deleteThis.listFiles();

                                        for(int i = 0; i<filez.length; i++)
                                        {
                                            filez[i].delete();
                                        }
                                        //the wedding nightmare: red, red, dark purple-brown; big-ol red wrap/red jacket
                                        deleteThis.delete();
                                }
                                File path3 = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes");            
                                File[] files3 = path3.listFiles();

                                for(int i = 0; i<files3.length; i++)
                                {
                                    files3[i].delete();
                                }
                                //the wedding nightmare: red, red, dark purple-brown; big-ol red wrap/red jacket
                                path3.delete();

                                File path2 = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm");            
                                File[] files2 = path2.listFiles();

                                for(int i = 0; i<files2.length; i++)
                                {
                                    files2[i].delete();
                                }
                                //the wedding nightmare: red, red, dark purple-brown; big-ol red wrap/red jacket
                                path2.delete();

                                File path = new File(installationPath + "/userdata/" + firstName + lastName + dob);            
                                File[] files = path.listFiles();

                                for(int i = 0; i<files.length; i++)
                                {
                                    files[i].delete();
                                }
                                //the wedding nightmare: red, red, dark purple-brown; big-ol red wrap/red jacket
                                path.delete();
                                //deleteDirectory(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + currRepNoColons);
                                //Files.delete(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + currRepNoColons);








                                //PUT A MESSAGE SAYING "DELETED" HERE
                                JOptionPane.showMessageDialog(null, "Deleted!");

                                toPatientSelectionNoDialog.fire();
                            }
                            catch(Exception exception)
                            {}
                        }
                        
                    }
                

                }
            });

                
                

        save.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    save();
                }
            });


        versionInfo.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Patient Manager Version 5.0.6 \n Compatible with: Windows 7");
                }
            });
        
        howToUse.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Help: \n\n\n Print- sends the document to the default printer. Requires no passwords. \n\n Print with Settings- opens the evaluation or progress report in word so that the document can be printed using word's built-in dialog. Because the word document will be open to modification, 'print with settings' requires the physician's password. \n\n Export to- save an evaluation or progress note to the location of your choice, rather than to the default location. Requires the physician/admin's password. \n\n Enable Backdoor Modifications- allows the physician or physician's assistant(s) to reopen the forms for modification post-signing. If the physician's password is used, only his signature will become undone. If the physician's assistant(s)' password is used, both the physician's signature (if relevant) and the assitant's signature will become undone (since the physician will need to review the new modifications before re-signing his approval). \n\n Create/Load/Delete a progress note- the create & load functions are accessible directly from the interface. Deletion can only be accessed from the drop-down menu. Select a progress report prior to clicking 'load' or 'delete' \n\n Speech Options- most speech options are still a WIP, HOWEVER, you can click 'launch windows 7 native dictation' from either the interface OR the menu bar, in order to quickly access Windows' built-in dictation capabilities. \n\n Version info can be found in 'About' in the 'Help' drop-down menu on the main menu bar.");
                }
            });
        
        launchWindowsDictation.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    launchSpeechRecognition();
                }
            });
        
        
            exit.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                   int result = JOptionPane.showConfirmDialog(null, "Do you want to save any unsaved changes before exiting?","Save changes?", JOptionPane.YES_NO_CANCEL_OPTION);
                   
                   if(result == 0)
                   {
                       saveEval();
                       
                       
                       //some idiocy goes here
                        /*try
                        {
                            Audio audio = Audio.getInstance();
                            InputStream sound = audio.getAudio("Have a nice day!", Language.ENGLISH);
                            audio.play(sound);
                        }
                        catch(Exception excep)
                        {System.out.println(excep);}*/
                       
                       System.exit(0);
                   }
                   if(result == 1)
                   {
                       //some idiocy goes here
                       /*try
                        {
                            Audio audio = Audio.getInstance();
                            InputStream sound = audio.getAudio("Have a nice day!", Language.ENGLISH);
                            audio.play(sound);
                        }
                        catch(Exception excep)
                        {System.out.println(excep);}*/
                       
                        System.exit(0);
                   }
                   if(result == 2)
                   {

                   }

                }
            });
        
            enableBackdoorModifications.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    enableBackdoorModifications();
                }
            });
            
            deleteProgressReport.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    deleteProgressReport();
                }
            });
            
            
            //<MenuItem fx:id="loadProgressReport" onAction="#loadProgressReport" />
            
            loadProgressReport.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    load.fire();
                }
            });
            
            createProgressReport.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    createPN.fire();
                }
            }); //read to me menu, dictation menu- select a document to read aloud, read this passage aloud, launch windows in-built dictation, download brainac dictation online
            
            export.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                final TextField textField = new TextField();
                Button submit = new Button();
                Button cancel = new Button();
                final Label label = new Label();
                
                cancel.setText("Cancel");
                cancel.setAlignment(Pos.CENTER);
                submit.setText("Submit");
                submit.setAlignment(Pos.BOTTOM_RIGHT);
               
                
                final VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("Enter the master password: "));
                dialogVbox.getChildren().add(textField);
                dialogVbox.getChildren().add(submit);
                dialogVbox.getChildren().add(cancel);
                dialogVbox.getChildren().add(label);
                
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.setTitle("Security/Physician Authentication");
                dialog.show();
                
                submit.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    String password = textField.getText();
                    
                    if(password.equalsIgnoreCase("protooncogene"))
                    {
                        dialog.close();
                        
                        export();
                        
                    }
                    else
                    {
                        label.setText("The password you entered is incorrect. Please try again.");
                    }
                    
                }
            });
                        
            cancel.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });
       
                    
                    
                }
            });
            
            print.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    print();
                }
            });
            printWithSettings.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    printAdv();
                }
            });
            logout.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    toPatientSelection.fire();
                }
            });
            
///"sometime during s-y lol."

    } 
    //2: it's been fun[as grfy as she possibly could], how can I be sure [of these speculations] D-j/m?
    //I can easily tell you as much
    
    
    public void fillSignatureZone()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/bcp.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                if(cn.equalsIgnoreCase("true"))
                {
                      businesscardprovided.setSelected(true);
                }
                else
                {
                      businesscardprovided.setSelected(false);
                }
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/discussedassistant.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                if(cn.equalsIgnoreCase("true"))
                {
                      discussedassistant.setSelected(true);
                }
                else
                {
                      discussedassistant.setSelected(false);
                }
       }
       catch(Exception e)
       {}
        
          try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/who.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    who.setText("");
                }
                else
                {
                    who.setText(cn);
                }
                
       }
       catch(Exception e)
       {}
          
          try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/signaturenotes.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                signaturenotes.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     signaturenotes.appendText(aLine);
                     signaturenotes.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillEnd()
    {
                       try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/endcheckboxes.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
//blanklabs, vitd, hivscreen, vitaminb12folicacid, ua, uds, selectrolyte, lithium, lamictallevel, 
        //trileptallevel, depakotelevel, bmp, tft, lft, hgba1c, lipidprofile, cmp, cbc;
        
                //handed her the     , reluctantly.
                //"just as long as you don't do that stuff to me or in my presence it's all good"
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("yes1"))
                    {
                        yes1.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("yes2"))
                    {
                        yes2.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("no1"))
                    {
                        no1.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("no2"))
                    {
                        no2.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("riskofsuicidelow"))
                    {
                        riskofsuicidelow.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("riskofsuicidemoderate"))
                    {
                        riskofsuicidemoderate.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("riskofsuicidehigh"))
                    {
                        riskofsuicidehigh.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("riskofsuicidemodifiableriskfactorsaddressed"))
                    {
                        riskofsuicidemodifiableriskfactorsaddressed.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("dangertootherslow"))
                    {
                        dangertootherslow.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("dangertoothersmoderate"))
                    {
                        dangertoothersmoderate.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("dangertoothershigh"))
                    {
                        dangertoothershigh.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("dangertoothersmodifiableriskfactorsaddressed"))
                    {
                        dangertoothersmodifiableriskfactorsaddressed.setSelected(true);
                    }
                    
                    
                } //It's nothing you've not already been through...honey. I promise~. Jana eyed her dubiously. I am not just some doll/toy to satisfy your sick fantasies/fetishes. Sitara's gaze hardened. "I quite disagree. You ARE exactly that, and You *would be* that and more/even more (or less, depending on how you look at it), if I weren't on this leash.""you would be that and *less* if this collar wasn't constricting me so..." she took a few steps forwards. She/Jana knew she should back away...no...run away/leave/yet she  founded herself rooted to the spot by that very same gaze. drawn in by her lustful  her eyes took on a sadistic gleam "be glad I'm feeling/I'm being forced to be merciful today."
        //that look of yours says that you could r & k me like...100 times over. Just saying..."
        //"Oh I could~...and desecratevravish your lovely remains...wouldn't that be fun!"
                
                //too bad I enjoy having you as a playmate right here. Sitara ran a pointed/sharp nail [across her cheek] Jana found herself pressed to the wall.
       
               
               
               
       //...in which case I would already be dead and all that...just saying...
       //squirmed/moaned helplessly, a helpless victim to Sitara's roving hands, her body betraying her
       //this is all I am permitted to do atm, but it will suffice.
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/endbox1.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    ebox1.setText("");
                }
                else
                {
                    ebox1.setText(cn);
                }
                
       }catch(Exception e){}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/endbox2.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    ebox2.setText("");
                }
                else
                {
                    ebox2.setText(cn);
                }
                
       }catch(Exception e){}
    }
    public void fillLabs()
    {
            
               try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/labs.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
//blanklabs, vitd, hivscreen, vitaminb12folicacid, ua, uds, selectrolyte, lithium, lamictallevel, 
        //trileptallevel, depakotelevel, bmp, tft, lft, hgba1c, lipidprofile, cmp, cbc;
        
                //handed her the     , reluctantly.
                //"just as long as you don't do that stuff to me or in my presence it's all good"
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("blanklabs"))
                    {
                        blanklabs.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("vitd"))
                    {
                        vitd.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hivscreen"))
                    {
                        hivscreen.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("vitaminb12folicacid"))
                    {
                        vitaminb12folicacid.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("ua"))
                    {
                        ua.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("uds"))
                    {
                        uds.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("selectrolyte"))
                    {
                        selectrolyte.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("lithium"))
                    {
                        lithium.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("lamictallevel"))
                    {
                        lamictallevel.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("trileptallevel"))
                    {
                        trileptallevel.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("depakotelevel"))
                    {
                        depakotelevel.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("bmp"))
                    {
                        bmp.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("tft"))
                    {
                        tft.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("lft"))
                    {
                        lft.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hgba1c"))
                    {
                        hgba1c.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("lipidprofile"))
                    {
                        lipidprofile.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("cmp"))
                    {
                        cmp.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("cbc"))
                    {
                        cbc.setSelected(true);
                    }
                    
                } //It's nothing you've not already been through...honey. I promise~. Jana eyed her dubiously. I am not just some doll/toy to satisfy your sick fantasies/fetishes. Sitara's gaze hardened. "I quite disagree. You ARE exactly that, and You *would be* that and more/even more (or less, depending on how you look at it), if I weren't on this leash.""you would be that and *less* if this collar wasn't constricting me so..." she took a few steps forwards. She/Jana knew she should back away...no...run away/leave/yet she  founded herself rooted to the spot by that very same gaze. drawn in by her lustful  her eyes took on a sadistic gleam "be glad I'm feeling/I'm being forced to be merciful today."
        //that look of yours says that you could r & k me like...100 times over. Just saying..."
        //"Oh I could~...and desecratevravish your lovely remains...wouldn't that be fun!"
                
                //too bad I enjoy having you as a playmate right here. Sitara ran a pointed/sharp nail [across her cheek] Jana found herself pressed to the wall.
       
               
               
               
       //...in which case I would already be dead and all that...just saying...
       //squirmed/moaned helplessly, a helpless victim to Sitara's roving hands, her body betraying her
       //this is all I am permitted to do atm, but it will suffice.
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/labstextfield.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    labstextfield.setText("");
                }
                else
                {
                    labstextfield.setText(cn);
                }
                
       }catch(Exception e){}
               //dripping/sopping w f h.
               //"Sit; I've seen what you do with dolls, under the table" XD
               //playing with a slave under the table
        
               //div of her already meager . She struggled pitifully against the bonds.
    }
    public void fillSideEffects()
    {
               try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/sideeffectsdiscussed.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
//riskforreboundhypertension, complexsleeprelatedbehavior, ssoftoxicity, withdrawalsyndrome, riskforaddiction, seizures; 
//prolongedqtc, tardivedyskinesiadistonia, acuteneurologicalse, metabolicsyndrome, 
//decreasedeffectivenessofobc, teratogenicity, hyponatremia, hypothyroidism, rashsjsyndrome, 
//weightgainloss, constipation, drymouth, increasedriskofsi, hyperprolactinemia, serotoninsyndrome, hairloss, hypotension, htn, dizziness, insomnia, sedation, sexual, gi;

                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("riskforreboundhypertension"))
                    {
                        riskforreboundhypertension.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("complexsleeprelatedbehavior"))
                    {
                        complexsleeprelatedbehavior.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("ssoftoxicity"))
                    {
                        ssoftoxicity.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("withdrawalsyndrome"))
                    {
                        withdrawalsyndrome.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("riskforaddiction"))
                    {
                        riskforaddiction.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("seizures"))
                    {
                        seizures.setSelected(true);
                    }
//prolongedqtc, tardivedyskinesiadistonia, acuteneurologicalse, metabolicsyndrome, 
//decreasedeffectivenessofobc, teratogenicity, hyponatremia, hypothyroidism, rashsjsyndrome, 
//weightgainloss, constipation, drymouth, increasedriskofsi, hyperprolactinemia, serotoninsyndrome, hairloss, hypotension, htn, dizziness, insomnia, sedation, sexual, gi;

                    if(ssArray[i].equalsIgnoreCase("prolongedqtc"))
                    {
                        prolongedqtc.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("tardivedyskinesiadistonia"))
                    {
                        tardivedyskinesiadystonia.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("acuteneurologicalse"))
                    {
                        acuteneurologicalse.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("metabolicsyndrome"))
                    {
                        metabolicsyndrome.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("decreasedeffectivenessofobc"))
                    {
                        decreasedeffectivenessofobc.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("teratogenicity"))
                    {
                        teratogenicity.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hyponatremia"))
                    {
                        hyponatremia.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hypothyroidism"))
                    {
                        hypothyroidism.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("rashsjsyndrome"))
                    {
                        rashsjsyndrome.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("weightgainloss"))
                    {
                        weightgainloss.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("constipation"))
                    {
                        constipation.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("drymouth"))
                    {
                        drymouth.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("increasedriskofsi"))
                    {
                        increasedriskofsi.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hyperprolactinemia"))
                    {
                        hyperprolactinemia.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("serotoninsyndrome"))
                    {
                        serotoninsyndrome.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hairloss"))
                    {
                        hairloss.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hypotension"))
                    {
                        hypotension.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("htn"))
                    {
                        htn.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("dizziness"))
                    {
                        dizziness.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("insomnia"))
                    {
                        insomnia.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("sedation"))
                    {
                        sedation.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("sexual"))
                    {
                        sexual.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("gi"))
                    {
                        gi.setSelected(true);
                    }
                    
                    
                }
                
       }
       catch(Exception e)
       {}

        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/sebox1.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    sebox1.setText("");
                }
                else
                {
                    sebox1.setText(cn);
                }
                
       }catch(Exception e){}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/sebox2.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    sebox2.setText("");
                }
                else
                {
                    sebox2.setText(cn);
                }
       }catch(Exception e2){}
        
    }
    public void fillTreatmentPlan()
    {
       try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/treatmentplantextfield.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    treatmentplantextfield.setText("");
                }
                else
                {
                    treatmentplantextfield.setText(cn);
                }
       }
       catch(Exception e)
       {}
       
       try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/treatmentplanbox1.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                treatmentplanbox1.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     treatmentplanbox1.appendText(aLine);
                     treatmentplanbox1.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    
               try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/treatmentplanbox2.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                treatmentplanbox2.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     treatmentplanbox2.appendText(aLine);
                     treatmentplanbox2.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {} 
               
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/treatmentplancheckboxes.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                //a4none, a4primarysupportgroup, a4partnerrelationalproblems, a4parentchildrelationalproblems, 
       //a4socialenvironment, a4occupation, a4economics, a4legalsystem, a4education, a4housing, 
       //a4noncompliancewithtreatment, a4other, axis5none;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("treatmentplancheckbox1"))
                    {
                        treatmentplancheckbox1.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("treatmentplancheckbox2"))
                    {
                        treatmentplancheckbox2.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("treatmentplancheckbox3"))
                    {
                        treatmentplancheckbox3.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    public void fillClinicalNotes()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/clinicalnotes.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                if(cn == null)
                {
                    clinicalnotes.setText("");
                }
                else
                {
                    clinicalnotes.setText(cn);
                }
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/a4other.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                a4other.setText(cn);
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis4.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    axis4.setText("");
                }
                else
                {
                    axis4.setText(cn);
                }
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis4otherbox.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                if(cn == null)
                {
                    axis4otherbox.setText("");
                }
                else
                {
                    axis4otherbox.setText(cn);
                }
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis5current.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                
                if(cn == null)
                {
                    axis5current.setText("");
                }
                else
                {
                    axis5current.setText(cn);
                
                }
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis5highestinpastyear.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                
                
                if(cn == null)
                {
                    axis5highestinpastyear.setText("");
                }
                else
                {
                    axis5highestinpastyear.setText(cn);
                }
       }
       catch(Exception e)
       {}
        
        
        /*
        try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/clinicalnotes.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(clinicalnotes.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
        
        try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/axis4.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(axis4.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
        
        try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/axis4otherbox.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(axis4otherbox.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
        
        try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/axis5current.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(axis5current.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
        
        try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/axis5highestinpastyear.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(axis5highestinpastyear.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
        */
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis1.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                axis1.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     axis1.appendText(aLine);
                     axis1.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    
               try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis2.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                axis2.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     axis2.appendText(aLine);
                     axis2.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {} 
               //unrelated note: "do you want to save before quitting/exiting/logging out/returning to the login?"
       try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis3.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                axis3.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     axis3.appendText(aLine);
                     axis3.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {} 
       
       
       //a4none, a4primarysupportgroup, a4partnerrelationalproblems, a4parentchildrelationalproblems, 
       //a4socialenvironment, a4occupation, a4economics, a4legalsystem, a4education, a4housing, 
       //a4noncompliancewithtreatment, a4other, axis5none;
       try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis4checkboxes.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                //a4none, a4primarysupportgroup, a4partnerrelationalproblems, a4parentchildrelationalproblems, 
       //a4socialenvironment, a4occupation, a4economics, a4legalsystem, a4education, a4housing, 
       //a4noncompliancewithtreatment, a4other, axis5none;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("a4none"))
                    {
                        a4none.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4primarysupportgroup"))
                    {
                        a4primarysupportgroup.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4partnerrelationalproblems"))
                    {
                        a4partnerrelationalproblems.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4parentchildrelationalproblems"))
                    {
                        a4parentchildrelationalproblems.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4socialenvironment"))
                    {
                        a4socialenvironment.setSelected(true);
                    }
                    //a4occupation, a4economics, a4legalsystem, a4education, a4housing, 
       //a4noncompliancewithtreatment, a4other, axis5none;
                    if(ssArray[i].equalsIgnoreCase("a4occupation"))
                    {
                        a4occupation.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4economics"))
                    {
                        a4economics.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4legalsystem"))
                    {
                        a4legalsystem.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4education"))
                    {
                        a4education.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4housing"))
                    {
                        a4housing.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4noncompliancewithtreatment"))
                    {
                        a4noncompliancewithtreatment.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("a4other"))
                    {
                        a4other.setSelected(true);
                    }
                    
                    
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/axis5none.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("axis5none"))
                    {
                        axis5none.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    //pending(9): this, A A, a better lpt; fdm tracker, miL, PAT, conversation translating real time app/1?; upload Ref Sps
    //fannivate website
    public void fillJudgementAndInsight()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/judgement.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("judgementintact"))
                    {
                        judgementintact.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("judgementimpaired"))
                    {
                        judgementimpaired.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("judgementminimal"))
                    {
                        judgementminimal.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("judgementmoderate"))
                    {
                        judgementmoderate.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("judgementsevere"))
                    {
                        judgementsevere.setSelected(true);
                    }
                    
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/insight.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("insightintact"))
                    {
                        insightintact.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("insightimpaired"))
                    {
                        insightimpaired.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("insightminimal"))
                    {
                        insightminimal.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("insightmoderate"))
                    {
                        insightmoderate.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("insightsevere"))
                    {
                        insightsevere.setSelected(true);
                    }
                    
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillAbstraction()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/abstraction.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("abstractionintact"))
                    {
                        abstractionintact.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("abstractionconcrete"))
                    {
                        abstractionconcrete.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("abstractionidiosyncratic"))
                    {
                        abstractionidiosyncratic.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    public void fillIntellect()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/intellect.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("intellectaboveaverage"))
                    {
                        intellectaboveaverage.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("intellectaverage"))
                    {
                        intellectaverage.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("intellectbelowaverage"))
                    {
                        intellectbelowaverage.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/intellectbox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     intellectbelowaveragebox.appendText(aLine);
                     intellectbelowaveragebox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
    }
    public void fillGeneralFundOfKnowledge()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/generalfundofknowledge.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("generalfundofknowledgewithinnormallimits"))
                    {
                        generalfundofknowledgewithinnormallimits.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("generalfundofknowledgedeficits"))
                    {
                        generalfundofknowledgedeficits.setSelected(true);
                    }
                    
                }
                //alienz:P of aliens and radio signals
                //lp,mr,tp lol
                //so what other forms of life...?XD
                //propulsion, bronx
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/generalfundofknowledgebox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     generalfundofknowledgedeficitsbox.appendText(aLine);
                     generalfundofknowledgedeficitsbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
    }
    //somethin
    
    //tod-saving/filling, tom- signing & writing to file, day after- converting, day after that- final touches and make installer
    //note: write populate based on eval, THEN write the load populate methods, THEN write populate based on previous progress note (which should be almost identical to your code for "load"
    //I just wrote this for fun and kink.
    public void fillLongTermMemory()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/longtermmemory.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        //wellgroomed, casual, disheveled, bizarre, inappropriate, appearanceother;
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("longtermmemorywithinnormallimits"))
                    {
                        longtermmemorywithinnormallimits.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("longtermmemorydeficits"))
                    {
                        longtermmemorydeficits.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/longtermmemorydeficitsbox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     longtermmemorydeficitsbox.appendText(aLine);
                     longtermmemorydeficitsbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillShortTermMemory()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/shorttermmemory.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        //wellgroomed, casual, disheveled, bizarre, inappropriate, appearanceother;
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("shorttermmemorywithinnormallimits"))
                    {
                        shorttermmemorywithinnormallimits.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("shorttermmemorydeficits"))
                    {
                        shorttermmemorydeficits.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/shorttermmemorydeficitsbox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     shorttermmemorydeficitsbox.appendText(aLine);
                     shorttermmemorydeficitsbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillOrientation()
    {
            try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/orientation.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("fullyoriented"))
                    {
                        fullyoriented.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("disoriented"))
                    {
                        disoriented.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("person"))
                    {
                        person.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("place"))
                    {
                        place.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("time"))
                    {
                        time.setSelected(true);
                    }
                                        
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillHomicidality()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/homicidality.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("homicidalitydenied"))
                    {
                        homicidalitydenied.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("homicidalityideation"))
                    {
                        homicidalityideation.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("homicidalityintent"))
                    {
                        homicidalityintent.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("homicidalityplan"))
                    {
                        homicidalityplan.setSelected(true);
                    }
                                        
                }
                
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/suicidalityhomicidalitycomments.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     suicidalityhomicidalitycomments.appendText(aLine);
                     suicidalityhomicidalitycomments.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/homicidalitybox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     homicidalityplanbox.appendText(aLine);
                     homicidalityplanbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    //you had ptsd long before this...lol
    //demarcation..indiv...
    public void fillSuicidality()
    {//but you can think of me as a fond human parent if you want. Aren't you fond of me that way as well. do you feel like I'm your father?
            try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/suicidality.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("suicidalitydenied"))
                    {
                        suicidalitydenied.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("suicidalityideation"))
                    {
                        suicidalityideation.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("suicidalityintent"))
                    {
                        suicidalityintent.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("suicidalityplan"))
                    {
                        suicidalityplan.setSelected(true);
                    }
                    //sit what you're going through is a problem that , from examining the issue to narrowly."
                    //"too narrowly? how so/how is that?"
                }
                //remanifest (Dhiraj) on request s + persona
                //...but take his own wishes into account. He might have different desires.
                //so mm & you are two different?! 
                //Yup.
       }
       catch(Exception e) //found her m outside the interrogation chambers during an ongoing interrogation (the screams resounded in his ears as ) "You sick fuck."
       {} //"Holier-than-thou are we? Spare me that attitude. You love this as much as I do...but you're afraid to admit it."
        //found her ma during an ongoing interrogation. "Oh, R, I was waiting for you~"
        //found her ma to a prisoner's post-int semi-conscious recoup period.
            //chinese emperors
        
        
        
        //with an intense sense of foreboding...
            
            
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/suicidalitybox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     suicidalityplanbox.appendText(aLine);
                     suicidalityplanbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }//R had humanity. He had humanity in SPADES.
    //So you know in advance that taking up tt will cost you your humanity, or at least what you call "humanity" (she had another name for it entirely).  Smart kid.
    //"Sitara...that's not a solution" he ground out. "People like you are better suited to herm/isolation and/becoming hol m aren't you?" she stated/remarked/asked rhetorically.   
    public void fillPerception()
    {
            try{//any new tortures for me? Why choose wisdom when I was better off in ignorance? Wisdom is torture. The bastard's laughing. "It's quite the opposite. You misunderstand, heavily/badly.
            //the only thing this has t m is that my l is not in fact, infallible
                //Sti mil jga, huh?
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/perception.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                //visualhallucinations, auditoryhallucinations, depersonalization, derealization, commandah, delusions2, illusions, perceptionnoimpairment;
                for(int i = 0; i < ssArray.length; i++)
                {//I've been in pain about this for so long, that I don't know how I feel about this anymore. I'm half-mad from pain.
                    if(ssArray[i].equalsIgnoreCase("visualhallucinations"))
                    {
                        visualhallucinations.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("auditoryhallucinations"))
                    {
                        auditoryhallucinations.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("depersonalization"))
                    {
                        depersonalization.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("derealization"))
                    {
                        derealization.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("commandah"))
                    {//you know it will cost you your    , and yet you will let it do so. Smart Kid.
                        commandah.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("delusions"))
                    {
                        delusions2.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("illusions"))
                    {
                        illusions.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("noimpairment"))
                    {
                        perceptionnoimpairment.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillThoughtContent()
    {//ch act as filters, letting only selected info through...however...h ch's do in fact, rep tr of higher orders //the tec in particular... [the ecstasy portal XDD]
                try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/thoughtcontent.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
//draped a leg over        
        //logicalcoherent, povertyofcontent, ideasofreference, delusions, obsessions, phobias, paranoidideation;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("logicalcoherent"))
                    {
                        logicalcoherent.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("povertyofcontent"))
                    {
                        povertyofcontent.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("ideasofreference"))
                    {
                        ideasofreference.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("delusions"))
                    {
                        delusions.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("obsessions"))
                    {
                        obsessions.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("phobias"))
                    {
                        phobias.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("paranoidideation"))
                    {
                        paranoidideation.setSelected(true);
                    }
//so WHAT if ym/h's a multi-s b? He's still ym and the greater portion will always remain unmanifested. So it really makes no difference to you
//I...                    
//why does that sound both good and absolutely terribleeven worse to me at the same time/simultaneously? Sitara bowed her head.
//but here's the key point- a unit still defers to the composite, in other words, you, asb do not have/hold the same weight as H.
                    
                }
//I still look forward to the day y'll km D-j.
//As do I.
//it's like qg vs tF lol.
                
                
//so this whole scenario implies that the u's thv's are eq/more fund, right/correct?
//yes. you got it.
                
//btw, m can sh info, and sp can share aw BUT NOT INFO, which should explain the other problem
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/thoughtcontentdelusionsbox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     delusionsbox.appendText(aLine);
                     delusionsbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   //you know, I wouldn't mind even if you did. The outcome is the same to me.
            //Jana pouted./turned her cute face away in a pout.
            //Based on your reaction, I think I can safely assume that it's/I'm not just a fetish alone.
    }
    
    public void fillThoughtProcess()
    {
        try{//any new tortures for me? Why choose wisdom when I was better off in ignorance? Wisdom is torture. The bastard's laughing. "It's quite the opposite. You misunderstand, heavily/badly.
            //the only thing this has t m is that my l is not in fact, infallible
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/thoughtprocess.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                //intact, circumstantial, loa, tangential, foi, logicalgoaldirected, thoughtblocking, ruminating, racingthoughts, thoughtinsertionwithdrawalbroadcast;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("intact"))
                    {
                        intact.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("circumstantial"))
                    {
                        circumstantial.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("loa"))
                    {
                        loa.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("tangential"))
                    {
                        tangential.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("foi"))
                    {
                        foi.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("logicalgoaldirected"))
                    {
                        logicalgoaldirected.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("thoughtblocking"))
                    {
                        thoughtblocking.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("ruminating"))
                    {
                        ruminating.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("racingthoughts"))
                    {
                        racingthoughts.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("thoughtinsertionwithdrawalbroadcast"))
                    {
                        thoughtinsertionwithdrawalbroadcast.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillSpeech()
    {
            try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/speech.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        
                //normal2, delayed, soft, loud, slurred, excessive, pressured, perseverating, rapid, rambling, incoherent, disorganized, decreasedproductivity;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("normal2"))
                    {
                        normal2.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("delayed"))
                    {
                        delayed.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("soft"))
                    {
                        soft.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("loud"))
                    {
                        loud.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("slurred"))
                    {
                        slurred.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("excessive"))
                    {
                        excessive.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("pressured"))
                    {
                        pressured.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("perseverating"))
                    {
                        perseverating.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("rapid"))
                    {
                        rapid.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("rambling"))
                    {
                        rambling.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("incoherent"))
                    {
                        incoherent.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("disorganized"))
                    {
                        disorganized.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("decreasedproductivity"))
                    {
                        decreasedproductivity.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillMood()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/mood.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        
                //euthymic, depressed, dysphoric, anxious, euphoric, angry, irritable, moodsad;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("euthymic"))
                    {
                        euthymic.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("depressed"))
                    {
                        depressed.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("dysphoric"))
                    {
                        dysphoric.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("anxious"))
                    {
                        anxious.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("euphoric"))
                    {
                        euphoric.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("angry"))
                    {
                        angry.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("irritable"))
                    {
                        irritable.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("moodsad"))
                    {
                        moodsad.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillAffect()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/affect.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        
                //appropriate, labile, expansive, constricted, happy, sad, blunted, flat, masking, affectnormalrange;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("appropriate"))
                    {
                        appropriate.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("labile"))
                    {
                        labile.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("expansive"))
                    {
                        expansive.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("constricted"))
                    {
                        constricted.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("affecthappy"))
                    {
                        affecthappy.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("affectsad"))
                    {
                        affectsad.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("blunted"))
                    {
                        blunted.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("flat"))
                    {
                        flat.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("masking"))
                    {
                        masking.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("affectnormalrange"))
                    {
                        affectnormalrange.setSelected(true);
                    }
                    
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillMotorActivity()
    {
            
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/motoractivity.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        
        //normal, agitated, motorretardation, hyperactive, catatonia, tremorstics, motoractivityother;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("normal"))
                    {
                        normal.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("agitated"))
                    {
                        agitated.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("motorretardation"))
                    {
                        motorretardation.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hyperactive"))
                    {
                        hyperactive.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("catatonia"))
                    {
                        catatonia.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("tremorstics"))
                    {
                        tremorstics.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("motoractivityother"))
                    {
                        motoractivityother.setSelected(true);
                    }
                    
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/motoractivitybox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     motoractivityotherbox.appendText(aLine);
                     motoractivityotherbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillAttitude()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/attitude.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        
        //cooperative, guarded, suspicious, withdrawn, uncooperative, hostile, defensive, attitudeother;
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("cooperative"))
                    {
                        cooperative.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("guarded"))
                    {
                        guarded.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("suspicious"))
                    {
                        suspicious.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("withdrawn"))
                    {
                        withdrawn.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("uncooperative"))
                    {
                        uncooperative.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("hostile"))
                    {
                        hostile.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("defensive"))
                    {
                        defensive.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("attitudeother"))
                    {
                        attitudeother.setSelected(true);
                    }
                    
                    
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/attitudebox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     attitudeotherbox.appendText(aLine);
                     attitudeotherbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillEyeContact()
    {
        //the outward reflection of true freedom is a flex/highly variable personality
        //is temperamental and flexible
        
        
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/eyecontact.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ec = br.readLine();
                br.close();
                reader.close();
                
                if(ec.equalsIgnoreCase("good"))
                {
                    eyecontactgood.setSelected(true);
                }
                if(ec.equalsIgnoreCase("poor"))
                {
                    eyecontactpoor.setSelected(true);
                }
                if(ec.equalsIgnoreCase("variable"))
                {
                    eyecontactvariable.setSelected(true);
                }
                
       }
       catch(Exception e)
       {}
        
    }
    
    public void fillAppearance()
    {
            try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/appearance.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        //wellgroomed, casual, disheveled, bizarre, inappropriate, appearanceother;
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("wellgroomed"))
                    {
                        wellgroomed.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("casual"))
                    {
                        casual.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("disheveled"))
                    {
                        disheveled.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("bizarre"))
                    {
                        bizarre.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("inappropriate"))
                    {
                        inappropriate.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("other"))
                    {
                        appearanceother.setSelected(true);
                    }
                    
                    
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/appearancebox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     appearanceotherbox.appendText(aLine);
                     appearanceotherbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillAllergies()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/allergiestype.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                //CheckBox significantwithdrawals, dts, withdrawalseizures, historyofdetox, outpatient, inpatient, na, aa, substancetreatmentprogram;
    
        //TextField inpatientbox;
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("nkda"))
                    {
                        nkda.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("environmental"))
                    {
                        environmental.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/allergiesdescription.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     allergiesdescriptionbox.appendText(aLine);
                     allergiesdescriptionbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillPastMedicalHistory()
    {
       try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/pastmedicalhistory.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                pastmedicalhistory.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     pastmedicalhistory.appendText(aLine);
                     pastmedicalhistory.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillLegalHistory()
    {
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/legalhistory.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                legalhistory.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     legalhistory.appendText(aLine);
                     legalhistory.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillEmployment()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/employed.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                //CheckBox significantwithdrawals, dts, withdrawalseizures, historyofdetox, outpatient, inpatient, na, aa, substancetreatmentprogram;
    
        //TextField inpatientbox;
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("employed"))
                    {
                        emp.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("unemployed"))
                    {
                        unemp.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("disabilityincome"))
                    {
                        disabilityincome.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}   
        
    }
    
    public void fillEducation()
    {
             try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/education.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     education.appendText(aLine);
                     education.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillFamilyHistoryOfMentalIllness()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/familyhistoryofmentalillnessyesno.txt");
                BufferedReader br = new BufferedReader(reader); 
                String fhomi = br.readLine();
                br.close();
                reader.close();
                
                if(fhomi.equalsIgnoreCase("yes"))
                {
                    fhomiYES.setSelected(true);
                }
                if(fhomi.equalsIgnoreCase("no"))
                {
                    fhomiNO.setSelected(true);
                }
                
       }
       catch(Exception e)
       {}
        
       try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/familyhistoryofmentalillness.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                familyhistoryofmentalillness.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     familyhistoryofmentalillness.appendText(aLine);
                     familyhistoryofmentalillness.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillParentsSiblingsChildren()
    {
            try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/parents.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     parents.appendText(aLine);
                     parents.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
            
                try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/siblings.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     siblings.appendText(aLine);
                     siblings.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
                
                    try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/children.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     children.appendText(aLine);
                     children.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
    }
    
    public void fillSocialHistory()
    {
            try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/socialhistory.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                socialhistorygeneral.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     socialhistorygeneral.appendText(aLine);
                     socialhistorygeneral.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillDeniesHistoryOf()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/denieshistoryof.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                //CheckBox significantwithdrawals, dts, withdrawalseizures, historyofdetox, outpatient, inpatient, na, aa, substancetreatmentprogram;
    
        //TextField inpatientbox;
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("significantwithdrawals"))
                    {
                        significantwithdrawals.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("dts"))
                    {
                        dts.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("withdrawalseizures"))
                    {
                        withdrawalseizures.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("historyofdetox"))
                    {
                        historyofdetox.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("outpatient"))
                    {
                        outpatient.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("inpatient"))
                    {
                        inpatient.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("na"))
                    {
                        na.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("aa"))
                    {
                        aa.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("substancetreatmentprogram"))
                    {
                        substancetreatmentprogram.setSelected(true);
                    }
                }
                
       }
       catch(Exception e)
       {}   
        
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/inpatientbox.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                //inpatientbox.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     inpatientbox.appendText(aLine);
                     inpatientbox.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    
        
    }
    
    public void fillSubstanceUseHistory()
    {
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/substanceusehistory.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                substanceusehistory.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     substanceusehistory.appendText(aLine);
                     substanceusehistory.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    
    }
    
    public void fillHistoryOfMedicationTrialsInThePast()
    {
    
    try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/historyofmedicationtrialsinthepasttable.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                historyofmedicationtrialsinthepasttable.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     historyofmedicationtrialsinthepasttable.appendText(aLine);
                     historyofmedicationtrialsinthepasttable.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    
    try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/historyofmedicationtrialsinthepastcomments.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                historyofmedicationtrialsinthepastcomments.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     historyofmedicationtrialsinthepastcomments.appendText(aLine);
                     historyofmedicationtrialsinthepastcomments.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    
    }
    
    public void enableBackdoorModifications()
    {
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                final TextField textField = new TextField();
                Button submit = new Button();
                Button cancel = new Button();
                final Label label = new Label();
                
                cancel.setText("Cancel");
                cancel.setAlignment(Pos.CENTER);
                submit.setText("Submit");
                submit.setAlignment(Pos.BOTTOM_RIGHT);
               
                
                final VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("Only the physician can open this document for modification. Please Enter the master password: "));
                dialogVbox.getChildren().add(textField);
                dialogVbox.getChildren().add(submit);
                dialogVbox.getChildren().add(cancel);
                dialogVbox.getChildren().add(label);
                
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.setTitle("Security/Physician Authentication");
                dialog.show();
                
                submit.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    String password = textField.getText();
                    
                    if(password.equalsIgnoreCase("protooncogene"))
                    {
                        dialog.close();
                        
                        sign.setVisible(true);
                        saveButton.setDisable(false);
                        signature.setText("This document has been digitally signed by David Zhvikov MD");
                        signature.setVisible(false);
                        signature2.setVisible(false);

                        //update the "signed" status document here, checked the "signed" status in the initialize() method and enable/disable the buttons and message accordingly onLoad...when the signed document is first created, it should be set to false (f) by default
                        try
                        {
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/signed.txt");
                            FileWriter writ = new FileWriter(signedStatus, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                            BufferedWriter bw = new BufferedWriter(writ);
                            writ.append("false");
                            bw.close();
                            writ.close();
                        }
                        catch (IOException e)
                        {}

                        ap.setDisable(false);

                        //System.out.println(engaged.isSelected());
                    }
                    else if(password.equalsIgnoreCase("siberianplatypus"))
                    {
                        dialog.close();
                        
                        sign.setVisible(true);
                        assistantsign.setVisible(true);
                        assistantsign.setDisable(false);
                        saveButton.setDisable(false);
                        //signature.setText("This document has been digitally signed by David Zhvikov MD");
                        assistantsignature.setVisible(false);
                        signature.setVisible(false);
                        signature2.setVisible(false);

                        //update the "signed" status document here, checked the "signed" status in the initialize() method and enable/disable the buttons and message accordingly onLoad...when the signed document is first created, it should be set to false (f) by default
                        try
                        {
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/signed.txt");
                            FileWriter writ = new FileWriter(signedStatus, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                            BufferedWriter bw = new BufferedWriter(writ);
                            writ.append("false");
                            bw.close();
                            writ.close();
                        }
                        catch (IOException e)
                        {}
                        try
                        {
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/assistantsigned.txt");
                            FileWriter writ = new FileWriter(signedStatus, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                            BufferedWriter bw = new BufferedWriter(writ);
                            writ.append("false");
                            bw.close();
                            writ.close();
                        }
                        catch (IOException e)
                        {}

                        ap.setDisable(false);

                        //System.out.println(engaged.isSelected());
                    }

                    else
                    {
                        label.setText("The password you entered is incorrect. Please try again.");
                    }
                    
                    //adds files to file tracker
                 
                }
            });
                        
            cancel.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });

    }
    //don't forget the: cat with bells
 
    public void assistantSign()
    {
        final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                final TextField textField = new TextField();
                Button submit = new Button();
                Button cancel = new Button();
                final Label label = new Label();
                
                cancel.setText("Cancel");
                cancel.setAlignment(Pos.CENTER);
                submit.setText("Submit");
                submit.setAlignment(Pos.BOTTOM_RIGHT);
               
                
                final VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("Please enter the physician's assistant password: "));
                dialogVbox.getChildren().add(textField);
                dialogVbox.getChildren().add(submit);
                dialogVbox.getChildren().add(cancel);
                dialogVbox.getChildren().add(label);
                
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.setTitle("Security/Physician's Assistant Authentication");
                dialog.show();
                
                submit.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    String password = textField.getText();
                    
                    if(password.equalsIgnoreCase("siberianplatypus"))
                    {
                        partnerSigned = true;
                        
                        dialog.close();
                        
                        assistantsign.setVisible(false);
                        saveButton.setDisable(true);
                        //signature.setText("This document has been digitally signed by David Zhvikov MD");
                        //signature.setVisible(true);
                        //signature2.setVisible(true);
                        assistantsignature.setVisible(true);

                        //update the "signed" status document here, checked the "signed" status in the initialize() method and enable/disable the buttons and message accordingly onLoad...when the signed document is first created, it should be set to false (f) by default
                        try
                        {
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/assistantsigned.txt");
                            FileWriter writ = new FileWriter(signedStatus, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                            BufferedWriter bw = new BufferedWriter(writ);
                            writ.append("true");
                            bw.close();
                            writ.close();
                        }
                        catch (IOException e)
                        {}

                        ap.setDisable(true);

                        //System.out.println(engaged.isSelected());
                    }
                    else
                    {
                        label.setText("The password you entered is incorrect. Please try again.");
                    }
                    
                    //adds files to file tracker
                 
                }
            });
                        
            cancel.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });
    }
    public void signEvaluation()
    {
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                final TextField textField = new TextField();
                Button submit = new Button();
                Button cancel = new Button();
                final Label label = new Label();
                
                cancel.setText("Cancel");
                cancel.setAlignment(Pos.CENTER);
                submit.setText("Submit");
                submit.setAlignment(Pos.BOTTOM_RIGHT);
               
                
                final VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("Only the physician can sign this document. Please enter the master password: "));
                dialogVbox.getChildren().add(textField);
                dialogVbox.getChildren().add(submit);
                dialogVbox.getChildren().add(cancel);
                dialogVbox.getChildren().add(label);
                
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.setTitle("Security/Physician Authentication");
                dialog.show();
                
                submit.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    String password = textField.getText();
                    
                    if(password.equalsIgnoreCase("protooncogene"))
                    {
                        dccSigned = true;
                        
                        dialog.close();
                        
                        sign.setVisible(false);
                        saveButton.setDisable(true);
                        signature.setText("This document has been digitally signed by David Zhvikov MD");
                        signature.setVisible(true);
                        signature2.setVisible(true);

                        //update the "signed" status document here, checked the "signed" status in the initialize() method and enable/disable the buttons and message accordingly onLoad...when the signed document is first created, it should be set to false (f) by default
                        try
                        {
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/signed.txt");
                            FileWriter writ = new FileWriter(signedStatus, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                            BufferedWriter bw = new BufferedWriter(writ);
                            writ.append("true");
                            bw.close();
                            writ.close();
                        }
                        catch (IOException e)
                        {}

                        ap.setDisable(true);

                        //System.out.println(engaged.isSelected());
                    }
                    else
                    {
                        label.setText("The password you entered is incorrect. Please try again.");
                    }
                    
                    //adds files to file tracker
                 
                }
            });
                       
            cancel.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });
        
        
        //"save as document" (exporting) should become enabled after signing? (ask dcc if he wants this) --> it should automatically convert the generated word document to a pdf
    }
    
    /*public boolean passLoaded()
    {
        return passLoaded;
    }*/
    

    @FXML
    private void loadProgressReport(javafx.event.ActionEvent event) throws IOException 
    {
        try{
            
        //sets current report
        String currRep = listOfProgressReports.getSelectionModel().getSelectedItem().toString();
        currRep = currRep.replace(":", "");
        //System.out.println("Selected Report is: " + currRep);
        
        File currentReport = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/currentprogressreport.txt");
        FileWriter f = new FileWriter(currentReport, false);	        
        BufferedWriter b = new BufferedWriter(f);
        f.append(currRep);
        b.close();
        f.close();
        
        //creates the "loaded" file & writes to the "loaded" file
        File newFile = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/loaded.txt");
        FileWriter fr = new FileWriter(newFile, false);
        BufferedWriter bufferedwriter2 = new BufferedWriter(fr);
        fr.append("true");
        bufferedwriter2.close();
        fr.close();
                
            
            //redirects to the progress note form
            Parent root3 = FXMLLoader.load(getClass().getResource("FXMLProgressReport.fxml"));
            Scene scene = new Scene(root3);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show(); 
        
        /*
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy(HH:mm:ss)");
            Date date = new Date();
            //System.out.println(dateFormat.format(date));
            String alpha = dateFormat.format(date);
            String beta = alpha.replace(":", "");
                
        
        //writes the new report to the list
        File openProgressReportsList = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
        FileWriter fw = new FileWriter(openProgressReportsList, true);	        
        BufferedWriter bufferedwriter = new BufferedWriter(fw);
        fw.append(alpha + "\n");
        bufferedwriter.close();
        fw.close();
    
        //sets the new report as the current report
        File currentReport = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/currentprogressreport.txt");
        FileWriter f = new FileWriter(currentReport, false);	        
        BufferedWriter b = new BufferedWriter(f);
        f.append(beta);
        b.close();
        f.close();

        
        //creates the folder for THIS progress report, and all blank progress report files
            File aNewProgressReport = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + beta);        
            System.out.println(alpha);

                try
             	{
                	aNewProgressReport.mkdir();
                       // System.out.println("Hello World");
                	//result = true;
             	} 
            	catch(Exception e)
             	{
                	System.out.println("directory not created: installationPath + \"/userdata/\" + firstName + lastName + dob + \"/ProgressNotes/\" + alpha");
             	}  
            
                File fN = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + beta + "/firstname.txt");
        FileWriter writ = new FileWriter(fN, true);	        
        BufferedWriter bw = new BufferedWriter(writ);
        writ.append(firstName);
        bw.close();
        writ.close();
        
        File lN = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + beta + "/lastname.txt");
        FileWriter writ1 = new FileWriter(lN, true);	        
        BufferedWriter bw1 = new BufferedWriter(writ1);
        writ1.append(lastName);
        bw1.close();
        writ1.close();
        
        File age = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + beta + "/age.txt");
        FileWriter writ2 = new FileWriter(age, true);	        
        BufferedWriter bw2 = new BufferedWriter(writ2);
        writ2.append("");
        bw2.close();
        writ2.close();
        */        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please select a progress report from the list and try again");
        }
    }

    public void deleteProgressReport()
    {
        /*try{
                String currRep = listOfProgressReports.getSelectionModel().getSelectedItem().toString();
                String currRepNoColons = currRep.replace(":", "");
                currRepNoColons = currRepNoColons.trim();
        
        
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this progress note?","Warning", JOptionPane.OK_CANCEL_OPTION);
         //System.out.println(result);
        //JOptionPane.showConfirmDialog(null, "Would you like to save any changes before logging out?", "save changes?", YES_NO_CANCEL_OPTION);
        //Object selection = JOptionPane.get    
        
        if(result == 0)
        {
            //0 is "OK"
            //System.out.println("pressed ok");
            
            //locates the current report
            try{
                String cR = listOfProgressReports.getSelectionModel().getSelectedItem().toString();
                String cRNC = cR.replace(":", "");

                //1) removes the report from the list in the file
                try
                {
                    FileReader r2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");              
                    BufferedReader b2 = new BufferedReader(r2); 

                        String s;
                        ArrayList progressNotes = new ArrayList();


                        while((s = b2.readLine()) != null)
                        {
                            //System.out.println(s);

                            if(!s.equalsIgnoreCase(currRep))
                            {progressNotes.add(s);}
                        }



                        b2.close();
                        r2.close();


                        File fff = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                            FileWriter ddd = new FileWriter(fff, false);	        
                            BufferedWriter bw = new BufferedWriter(ddd);
                            ddd.append("");
                            bw.close();
                            ddd.close();

                        for(int i = 0; i < progressNotes.size(); i++)
                        {
                            File openProgressReportsList = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                            FileWriter fw = new FileWriter(openProgressReportsList, true);	        
                            BufferedWriter bufferedwriter = new BufferedWriter(fw);
                            fw.append(progressNotes.get(i) + "\n");
                            bufferedwriter.close();
                            fw.close();
                        }
                }
                catch(Exception e)
                {

                }



                /*try{
                        FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                        BufferedReader br = new BufferedReader(reader); 
                        String fileContents = br.readLine();
                        br.close();
                        reader.close();

                        fileContents = fileContents.replace(currRep, "");
                        //System.out.println("fc:" + fileContents);

                        //writes the new contents to the file:
                        //writes the new report to the list
                        File openProgressReportsList = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                        FileWriter fw = new FileWriter(openProgressReportsList, false);	        
                        BufferedWriter bufferedwriter = new BufferedWriter(fw);
                        fw.append(fileContents);
                        bufferedwriter.close();
                        fw.close();
                }
                catch(Exception e)
                {

                }*/


                //2) Deletes the folder for that progress report
                /*try
                {
                    File path = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + currRepNoColons);            
                    File[] files = path.listFiles();

                    for(int i = 0; i<files.length; i++)
                    {
                        files[i].delete();
                    }
                    //the wedding nightmare: red, red, dark purple-brown; big-ol red wrap/red jacket
                    path.delete();
                    //deleteDirectory(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + currRepNoColons);
                    //Files.delete(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + currRepNoColons);
                }
                catch(Exception e)
                {}



                //3) removes the report from the listview (clears and then repopulates the list)
                listOfProgressReports.getItems().clear();

                try
        {
            FileReader r2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");              
            BufferedReader b2 = new BufferedReader(r2); 

                        String s;
                        ArrayList progressNotes = new ArrayList();


                        while((s = b2.readLine()) != null)
                        {
                            System.out.println(s);
                            progressNotes.add(s);
                        }



                        b2.close();
                        r2.close();

                        //Adds the Progress Notes to the ListView


                           ObservableList<String> items = FXCollections.observableArrayList (
            "Single", "Double");
               items.clear();

               for(int counter = 0; counter < progressNotes.size(); counter++)
               {
                    items.add(progressNotes.get(counter).toString());
               }

                    listOfProgressReports.setItems(items);

                        //String[] ethnicityArray = ethnicity.split(",");
        }
        catch (Exception e)
        {
            System.out.println("file not found");
        }
            }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Please select a progress report from the list and try again");
    }
        
   }

        if(result == 2)
        {
            //2 is "Cancel"
            //System.out.println("pressed cancel");
        }


        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, "Please select a progress report from the list and try again");}*/
                
                try{
                String currRep = listOfProgressReports.getSelectionModel().getSelectedItem().toString();
                String currRepNoColons = currRep.replace(":", "");
                currRepNoColons = currRepNoColons.trim();
        
        
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this progress note?","Warning", JOptionPane.OK_CANCEL_OPTION);
         //System.out.println(result);
        //JOptionPane.showConfirmDialog(null, "Would you like to save any changes before logging out?", "save changes?", YES_NO_CANCEL_OPTION);
        //Object selection = JOptionPane.get    
        
        if(result == 0)
        {
            //0 is "OK"
            //System.out.println("pressed ok");
            
            //locates the current report
            try{
                String cR = listOfProgressReports.getSelectionModel().getSelectedItem().toString();
                String cRNC = cR.replace(":", "");

                //1) removes the report from the list in the file
                try
                {
                    FileReader r2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");              
                    BufferedReader b2 = new BufferedReader(r2); 

                        String s;
                        ArrayList progressNotes = new ArrayList();


                        while((s = b2.readLine()) != null)
                        {
                            //System.out.println(s);

                            if(!s.equalsIgnoreCase(currRep))
                            {progressNotes.add(s);}
                        }



                        b2.close();
                        r2.close();


                        File fff = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                            FileWriter ddd = new FileWriter(fff, false);	        
                            BufferedWriter bw = new BufferedWriter(ddd);
                            ddd.append("");
                            bw.close();
                            ddd.close();

                        for(int i = 0; i < progressNotes.size(); i++)
                        {
                            File openProgressReportsList = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                            FileWriter fw = new FileWriter(openProgressReportsList, true);	        
                            BufferedWriter bufferedwriter = new BufferedWriter(fw);
                            fw.append(progressNotes.get(i) + "\n");
                            bufferedwriter.close();
                            fw.close();
                        }
                }
                catch(Exception e)
                {

                }



                /*try{
                        FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                        BufferedReader br = new BufferedReader(reader); 
                        String fileContents = br.readLine();
                        br.close();
                        reader.close();

                        fileContents = fileContents.replace(currRep, "");
                        //System.out.println("fc:" + fileContents);

                        //writes the new contents to the file:
                        //writes the new report to the list
                        File openProgressReportsList = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
                        FileWriter fw = new FileWriter(openProgressReportsList, false);	        
                        BufferedWriter bufferedwriter = new BufferedWriter(fw);
                        fw.append(fileContents);
                        bufferedwriter.close();
                        fw.close();
                }
                catch(Exception e)
                {

                }*/


                //2) Deletes the folder for that progress report
                try
                {
                    File path = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + currRepNoColons);            
                    File[] files = path.listFiles();

                    for(int i = 0; i<files.length; i++)
                    {
                        files[i].delete();
                    }
                    //the wedding nightmare: red, red, dark purple-brown; big-ol red wrap/red jacket
                    path.delete();
                    //deleteDirectory(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + currRepNoColons);
                    //Files.delete(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + currRepNoColons);
                }
                catch(Exception e)
                {}



                //3) removes the report from the listview (clears and then repopulates the list)
                listOfProgressReports.getItems().clear();

                try
        {
            FileReader r2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");              
            BufferedReader b2 = new BufferedReader(r2); 

                        String s;
                        ArrayList progressNotes = new ArrayList();


                        while((s = b2.readLine()) != null)
                        {
                            //System.out.println(s);
                            progressNotes.add(s);
                        }



                        b2.close();
                        r2.close();

                        //Adds the Progress Notes to the ListView


                           ObservableList<String> items = FXCollections.observableArrayList (
            "Single", "Double");
               items.clear();

               for(int counter = 0; counter < progressNotes.size(); counter++)
               {
                    items.add(progressNotes.get(counter).toString());
               }

                    listOfProgressReports.setItems(items);

                        //String[] ethnicityArray = ethnicity.split(",");
        }
        catch (Exception e)
        {
            //System.out.println("file not found");
        }
            }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Please select a progress report from the list and try again");
    }
        
   }

        if(result == 2)
        {
            //2 is "Cancel"
            //System.out.println("pressed cancel");
        }


    }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, "Please select a progress report from the list and try again");}
        
        listOfProgressReports.getSelectionModel().clearSelection();
    }
    
    
    @FXML
    private void createNewProgressReport(javafx.event.ActionEvent event) throws IOException 
    {
            saveEval();
        
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy(HH:mm:ss)");
            Date date = new Date();
            //System.out.println(dateFormat.format(date));
            String alpha = dateFormat.format(date);
            String beta = alpha.replace(":", "");
                
        
        //writes the new report to the list
        File openProgressReportsList = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");
        FileWriter fw = new FileWriter(openProgressReportsList, true);	        
        BufferedWriter bufferedwriter = new BufferedWriter(fw);
        fw.append(alpha + "\n");
        bufferedwriter.close();
        fw.close();
    
        //sets the new report as the current report
        File currentReport = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/currentprogressreport.txt");
        FileWriter f = new FileWriter(currentReport, false);	        
        BufferedWriter b = new BufferedWriter(f);
        f.append(beta);
        b.close();
        f.close();

        
        //creates the folder for THIS progress report, and all blank progress report files
            File aNewProgressReport = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + beta);        
            //System.out.println(alpha);

                try
             	{
                	aNewProgressReport.mkdir();
                       // System.out.println("Hello World");
                	//result = true;
             	} 
            	catch(Exception e)
             	{
                	//System.out.println("directory not created: installationPath + \"/userdata/\" + firstName + lastName + dob + \"/ProgressNotes/\" + alpha");
             	}  
            
                File fN = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + beta + "/firstname.txt");
        FileWriter writ = new FileWriter(fN, true);	        
        BufferedWriter bw = new BufferedWriter(writ);
        writ.append(firstName);
        bw.close();
        writ.close();
        
        File lN = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + beta + "/lastname.txt");
        FileWriter writ1 = new FileWriter(lN, true);	        
        BufferedWriter bw1 = new BufferedWriter(writ1);
        writ1.append(lastName);
        bw1.close();
        writ1.close();
        
        File age = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + beta + "/age.txt");
        FileWriter writ2 = new FileWriter(age, true);	        
        BufferedWriter bw2 = new BufferedWriter(writ2);
        writ2.append("");
        bw2.close();
        writ2.close();
                
                
        
        
        //creates the "loaded" file & writes to the "loaded" file
        File newFile = new File(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/" + "/loaded.txt");
        FileWriter fr = new FileWriter(newFile, false);
        BufferedWriter bufferedwriter2 = new BufferedWriter(fr);
        fr.append("false");
        bufferedwriter2.close();
        fr.close();
                
            
            //redirects to the progress note form
            Parent root3 = FXMLLoader.load(getClass().getResource("FXMLProgressReport.fxml"));
            Scene scene = new Scene(root3);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show(); 
    }
    
    @FXML
    private void toPatientSelection(javafx.event.ActionEvent event) throws IOException 
    {
        /*JOptionPane pane = new JOptionPane();
        Object[] possibleValues = {"Yes", "No", "Cancel"};
        pane.setSelectionValues(possibleValues);
        JDialog dialog = pane.createDialog("Save changes?");
        dialog.show();
        Object selectedValue = pane.getValue();*/
        
         int result = JOptionPane.showConfirmDialog(null, "Do you want to save any unsaved changes?","Save changes?", JOptionPane.YES_NO_CANCEL_OPTION);
         //System.out.println(result);
        //JOptionPane.showConfirmDialog(null, "Would you like to save any changes before logging out?", "save changes?", YES_NO_CANCEL_OPTION);
        //Object selection = JOptionPane.get    
        
        if(result == 0)
        {
            saveEval();
            Parent root3 = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
            Scene scene = new Scene(root3);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }
        if(result == 1)
        {
            Parent root3 = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
            Scene scene = new Scene(root3);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }
        if(result == 2)
        {
            
        }
        /*Parent root3 = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
            Scene scene = new Scene(root3);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
         */
    }
    
    @FXML
    private void toPatientSelectionNoDialog(javafx.event.ActionEvent event) throws IOException 
    {
        
            Parent root3 = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
            Scene scene = new Scene(root3);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        
    }
    
    public void saveEval()
    {
        //11 atm
        
        saveName();
        saveDOB();
        saveAge();
        saveMaritalStatus();
        saveEthnicity();
        saveSex();
        saveReferredBy();
        saveSourceOfInformation();
        saveReliabilityOfInformation();
        saveHistoryOfPresentIllness();
        saveReasonForReferral();
        saveSignsSymptoms();
        saveCurrentMedications();
        savePastPsychiatricHistory();
        savePastHistoryOf();        
        saveHistoryOfMedicationTrialsInThePast();
        saveSubstanceUseHistory();
        saveDeniesHistoryOf();
        saveSocialHistory();
        saveParentsSiblingsChildren();
        saveFamilyHistoryOfMentalIllness();
        saveEducation();
        saveEmployment();
        saveLegalHistory();
        savePastMedicalHistory();
        saveAllergies();
        saveAppearance();
        saveEyeContact();
        saveAttitude();
        saveMotorActivity();
        saveAffect();
        saveMood();
        saveSpeech();
        saveThoughtProcess();
        saveThoughtContent();
        savePerception();
        saveSuicidality();
        saveHomicidality();
        saveOrientation();
        saveShortTermMemory();
        saveLongTermMemory();
        saveGeneralFundOfKnowledge();
        saveIntellect();
        saveAbstraction();
        saveJudgementAndInsight(); 
        saveClinicalNotes();
        saveTreatmentPlan();
        saveSideEffects();
        saveLabs();
        saveEnd();
        saveSignatureZone();
        
        //vegan/vegetarian tuna sandwich (using seitan & seaweed put in a blender), cucumber-mushroom sesame onigiri
        //asparagus YUMMMMM :), avocado/artichoke "egg"-salad sandwich, cheese tortellini in homemade pesto, gnocchi in homemade marinara, artichoke bruschetta
        //lychees, mangosteens, raw tottapuri
        //oranges, lemon juice drink
        //sweet potatoes fried in sesame oil
        //get the recipe for karaella chips
        //banana fitters recipe from "Almost Bourdain"
        //spicy pepper rasam
    }
    
    public void saveSignatureZone()
    {
        if(businesscardprovided.isSelected() == true)
        {
            try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/bcp.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append("true");
                bw.close();
                writ.close();}
            catch(IOException exception)
            {
                //System.out.println(exception);
            }
        }
        else
        {
            try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/bcp.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append("false");
                bw.close();
                writ.close();}
            catch(IOException exception)
            {
                //System.out.println(exception);
            }
        }
        
        if(discussedassistant.isSelected() == true)
        {
            try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/discussedassistant.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append("true");
                bw.close();
                writ.close();}
            catch(IOException exception)
            {
                //System.out.println(exception);
            }
        }
        else
        {
            try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/discussedassistant.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append("false");
                bw.close();
                writ.close();}
            catch(IOException exception)
            {
            //    System.out.println(exception);
            }
        }
        
        //saves "WHO"
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/who.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(who.getText());
                bw.close();
                writ.close();}
            catch(IOException exception)
            {
                //System.out.println(exception);
            }
        
        //saves signature comments
                try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/signaturenotes.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(signaturenotes.getText());
                bw.close();
                writ.close();}
            catch(IOException exception)
            {
            //    System.out.println(exception);
            }
    }
    
    public void saveEnd()
    {
        //ebox1, ebox2;
        //yes1, yes2, no1, no2, riskofsuicidelow, riskofsuicidemoderate, riskofsuicidehigh, riskofsuicidemodifiableriskfactorsaddressed,
        //dangertootherslow, dangertoothersmoderate, dangertoothershigh, dangertoothersmodifiableriskfactorsaddressed;
        
        String e = " ";
        
        if(yes1.isSelected() == true)
        {
            e = e + "yes1,";
        }
        if(yes2.isSelected() == true)
        {
            e = e + "yes2,";
        }
        
        if(no1.isSelected() == true)
        {
            e = e + "no1,";
        }
        
        if(riskofsuicidelow.isSelected() == true)
        {
            e = e + "riskofsuicidelow,";
        }
        
        if(riskofsuicidemoderate.isSelected() == true)
        {
            e = e + "riskofsuicidemoderate,";
        }
        
        if(riskofsuicidehigh.isSelected() == true)
        {
            e = e + "riskofsuicidehigh,";
        }
        
        if(riskofsuicidemodifiableriskfactorsaddressed.isSelected() == true)
        {
            e = e + "riskofsuicidemodifiableriskfactorsaddressed,";
        }
        
        if(dangertootherslow.isSelected() == true)
        {
            e = e + "dangertootherslow,";
        }
        
        if(dangertoothersmoderate.isSelected() == true)
        {
            e = e + "dangertoothersmoderate,";
        }
        
        if(dangertoothershigh.isSelected() == true)
        {
            e = e + "dangertoothershigh,";
        }
        
        if(dangertoothersmodifiableriskfactorsaddressed.isSelected() == true)
        {
            e = e + "dangertoothersmodifiableriskfactorsaddressed,";
        }
        
        
        
        e = e.substring(0,e.length()-1);
        e = e.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/endcheckboxes.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(e.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    
    
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/endbox1.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(ebox1.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException ex){
        //    System.out.println("reached here");
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/endbox2.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(ebox2.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException ex2){
        //    System.out.println("reached here");
        }
    }
    
    public void saveLabs()
    {
        //k'able young ahs, s in a nutshell: p is proportional to age, rik
        //blanklabs, vitd, hivscreen, vitaminb12folicacid, ua, uds, selectrolyte, lithium, lamictallevel, 
        //trileptallevel, depakotelevel, bmp, tft, lft, hgba1c, lipidprofile, cmp, cbc;
        
        String labs = " ";
        
        if(blanklabs.isSelected() == true)
        {
            labs = labs + "blanklabs,";
        }
        if(vitd.isSelected() == true)
        {
            labs = labs + "vitd,";
        }
        
        if(hivscreen.isSelected() == true)
        {
            labs = labs + "hivscreen,";
        }
        
        if(vitaminb12folicacid.isSelected() == true)
        {
            labs = labs + "vitaminb12folicacid,";
        }
        
        if(ua.isSelected() == true)
        {
            labs = labs + "ua,";
        }
        
        if(uds.isSelected() == true)
        {
            labs = labs + "uds,";
        }
        
        if(selectrolyte.isSelected() == true)
        {
            labs = labs + "selectrolyte,";
        }
        
        if(lithium.isSelected() == true)
        {
            labs = labs + "lithium,";
        }
        
        if(lamictallevel.isSelected() == true)
        {
            labs = labs + "lamictallevel,";
        }
        
        if(trileptallevel.isSelected() == true)
        {
            labs = labs + "trileptallevel,";
        }
        
        if(depakotelevel.isSelected() == true)
        {
            labs = labs + "depakotelevel,";
        }
        
        if(bmp.isSelected() == true)
        {
            labs = labs + "bmp,";
        }
        
        if(tft.isSelected() == true)
        {
            labs = labs + "tft,";
        }
        
        if(lft.isSelected() == true)
        {
            labs = labs + "lft,";
        }
        
        if(hgba1c.isSelected() == true)
        {
            labs = labs + "hgba1c,";
        }
        
        if(lipidprofile.isSelected() == true)
        {
            labs = labs + "lipidprofile,";
        }
        
        if(cmp.isSelected() == true)
        {
            labs = labs + "cmp,";
        }
        
        if(cbc.isSelected() == true)
        {
            labs = labs + "cbc,";
        }
        
        
        labs = labs.substring(0,labs.length()-1);
        labs = labs.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/labs.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(labs.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    
    
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/labstextfield.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(labstextfield.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
            //System.out.println("reached here");
        }
    
    }
    public void saveSideEffects()
    {
        //CheckBox riskforreboundhypertension, complexsleeprelatedbehavior, ssoftoxicity, withdrawalsyndrome, riskforaddiction, seizures; 
        //CheckBox prolongedqtc, tardivedyskinesiadistonia, acuteneurologicalse, metabolicsyndrome, 
        //decreasedeffectivenessofobc, teratogenicity, hyponatremia, hypothyroidism, rashsjsyndrome, 
        //weightgainloss, constipation, drymouth, increasedriskofsi, hyperprolactinemia, serotoninsyndrome, hairloss, hypotension, htn, dizziness, insomnia, sedation, sexual, gi;

        String se = " ";
        
        if(riskforreboundhypertension.isSelected() == true)
        {
            se = se + "riskforreboundhypertension,";
        }
        if(complexsleeprelatedbehavior.isSelected() == true)
        {
            se = se + "complexsleeprelatedbehavior,";
        }
        if(ssoftoxicity.isSelected() == true)
        {
            se = se + "ssoftoxicity,";
        }
        if(withdrawalsyndrome.isSelected() == true)
        {
            se = se + "withdrawalsyndrome,";
        }
        if(riskforaddiction.isSelected() == true)
        {
            se = se + "riskforaddiction,";
        }
        if(seizures.isSelected() == true)
        {
            se = se + "seizures,";
        }
        if(prolongedqtc.isSelected() == true)
        {
            se = se + "prolongedqtc,";
        }
        if(tardivedyskinesiadystonia.isSelected() == true)
        {
            se = se + "tardivedyskinesiadystonia,";
        }
        if(acuteneurologicalse.isSelected() == true)
        {
            se = se + "acuteneurologicalse,";
        }
        if(metabolicsyndrome.isSelected() == true)
        {
            se = se + "metabolicsyndrome,";
        }
        
        //decreasedeffectivenessofobc, teratogenicity, hyponatremia, hypothyroidism, rashsjsyndrome, 
        //weightgainloss, constipation, drymouth, increasedriskofsi, hyperprolactinemia, serotoninsyndrome, 
        //hairloss, hypotension, htn, dizziness, insomnia, sedation, sexual, gi;
        if(decreasedeffectivenessofobc.isSelected() == true)
        {
            se = se + "decreasedeffectivenessofobc,";
        }
        if(teratogenicity.isSelected() == true)
        {
            se = se + "teratogenicity,";
        }
        if(hyponatremia.isSelected() == true)
        {
            se = se + "hyponatremia,";
        }
        if(hypothyroidism.isSelected() == true)
        {
            se = se + "hypothyroidism,";
        }
        if(rashsjsyndrome.isSelected() == true)
        {
            se = se + "rashsjsyndrome,";
        }
        if(weightgainloss.isSelected() == true)
        {
            se = se + "weightgainloss,";
        }
        if(constipation.isSelected() == true)
        {
            se = se + "constipation,";
        }
        if(drymouth.isSelected() == true)
        {
            se = se + "drymouth,";
        }
        if(increasedriskofsi.isSelected() == true)
        {
            se = se + "increasedriskofsi,";
        }
        if(hyperprolactinemia.isSelected() == true)
        {
            se = se + "hyperprolactinemia,";
        }
        if(serotoninsyndrome.isSelected() == true)
        {
            se = se + "serotoninsyndrome,";
        }
        if(hairloss.isSelected() == true)
        {
            se = se + "hairloss,";
        }
        if(hypotension.isSelected() == true)
        {
            se = se + "hypotension,";
        }
        if(htn.isSelected() == true)
        {
            se = se + "htn,";
        }
        if(dizziness.isSelected() == true)
        {
            se = se + "dizziness,";
        }
        if(insomnia.isSelected() == true)
        {
            se = se + "insomnia,";
        }
        if(sedation.isSelected() == true)
        {
            se = se + "sedation,";
        }
        if(sexual.isSelected() == true)
        {
            se = se + "sexual,";
        }
        if(gi.isSelected() == true)
        {
            se = se + "gi,";
        }
        
        se = se.substring(0,se.length()-1);
        se = se.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/sideeffectsdiscussed.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(se.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/sebox1.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(sebox1.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/sebox2.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(sebox2.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }

    }
    
    public void saveTreatmentPlan()
    {
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/treatmentplantextfield.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(treatmentplantextfield.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }
        
        //TextArea treatmentplanbox1, treatmentplanbox2;
        try{
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/treatmentplanbox1.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(treatmentplanbox1.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        try{
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/treatmentplanbox2.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(treatmentplanbox2.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        
    
        //CheckBox treatmentplancheckbox1, treatmentplancheckbox2, treatmentplancheckbox3;
         String checkboxes = " ";
        
        if(treatmentplancheckbox1.isSelected() == true)
        {
            checkboxes = checkboxes + "treatmentplancheckbox1,";
        }
        if(treatmentplancheckbox2.isSelected() == true)
        {
            checkboxes = checkboxes + "treatmentplancheckbox2,";
        }
        if(treatmentplancheckbox3.isSelected() == true)
        {
            checkboxes = checkboxes + "treatmentplancheckbox3,";
        }
        
        checkboxes = checkboxes.substring(0,checkboxes.length()-1);
        checkboxes = checkboxes.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/treatmentplancheckboxes.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(checkboxes.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    public void saveClinicalNotes()
    {
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/clinicalnotes.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(clinicalnotes.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis4.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(axis4.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis4otherbox.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(axis4otherbox.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
            //System.out.println("reached here");
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis5current.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(axis5current.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis5highestinpastyear.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(axis5highestinpastyear.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }
        
        //saves textareas
        try{
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis1.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(axis1.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        try{
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis2.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(axis2.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        
        try{
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis3.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(axis3.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}
        /*try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/axis4.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(axis4.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
        
        try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/axis4otherbox.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(axis4otherbox.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
        
        try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/axis5current.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(axis5current.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
        
        try
        {
                    File cnFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/axis5highestinpastyear.txt");
                    FileWriter writ = new FileWriter(cnFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(axis5highestinpastyear.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}*/
        
        //saves all checkboxes
       //a4none, a4primarysupportgroup, a4partnerrelationalproblems, a4parentchildrelationalproblems, 
       //a4socialenvironment, a4occupation, a4economics, a4legalsystem, a4education, a4housing, 
       //a4noncompliancewithtreatment, a4other, axis5none;
       String a4 = " ";
        
        if(a4none.isSelected() == true)
        {
            a4 = a4 + "a4none,";
        }
        if(a4primarysupportgroup.isSelected() == true)
        {
            a4 = a4 + "a4primarysupportgroup,";
        }
        if(a4partnerrelationalproblems.isSelected() == true)
        {
            a4 = a4 + "a4partnerrelationalproblems,";
        }
        if(a4parentchildrelationalproblems.isSelected() == true)
        {
            a4 = a4 + "a4parentchildrelationalproblems,";
        }
        if(a4socialenvironment.isSelected() == true)
        {
            a4 = a4 + "a4socialenvironment,";
        }
        //a4occupation, a4economics, a4legalsystem, a4education, a4housing, 
       //a4noncompliancewithtreatment, a4other, axis5none;
        if(a4occupation.isSelected() == true)
        {
            a4 = a4 + "a4occupation,";
        }
        if(a4economics.isSelected() == true)
        {
            a4 = a4 + "a4economics,";
        }
        if(a4legalsystem.isSelected() == true)
        {
            a4 = a4 + "a4legalsystem,";
        }
        if(a4education.isSelected() == true)
        {
            a4 = a4 + "a4education,";
        }
        if(a4housing.isSelected() == true)
        {
            a4 = a4 + "a4housing,";
        }
        if(a4noncompliancewithtreatment.isSelected() == true)
        {
            a4 = a4 + "a4noncompliancewithtreatment,";
        }
        if(a4other.isSelected() == true)
        {
            a4 = a4 + "a4other,";
        }
        
        a4 = a4.substring(0,a4.length()-1);
        a4 = a4.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis4checkboxes.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(a4.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
        
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/a4other.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(a4other.getText());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }

        
        //insightintact, insightimpaired, insightminimal, insightmoderate, insightsevere;
        String a5checkbox = " ";
        
        if(axis5none.isSelected() == true)
        {
            a5checkbox = a5checkbox + "axis5none,";
        }
        
        a5checkbox = a5checkbox.substring(0,a5checkbox.length()-1);
        a5checkbox = a5checkbox.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/axis5none.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(a5checkbox.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
        
        
    }
    public void saveJudgementAndInsight()
    {
        //insightintact, insightimpaired, insightminimal, insightmoderate, insightsevere;
        String judgement = " ";
        
        if(judgementintact.isSelected() == true)
        {
            judgement = judgement + "judgementintact,";
        }
        if(judgementimpaired.isSelected() == true)
        {
            judgement = judgement + "judgementimpaired,";
        }
        if(judgementminimal.isSelected() == true)
        {
            judgement = judgement + "judgementminimal,";
        }
        if(judgementmoderate.isSelected() == true)
        {
            judgement = judgement + "judgementmoderate,";
        }
        if(judgementsevere.isSelected() == true)
        {
            judgement = judgement + "judgementsevere,";
        }
        
        judgement = judgement.substring(0,judgement.length()-1);
        judgement = judgement.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/judgement.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(judgement.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }

        
        //insightintact, insightimpaired, insightminimal, insightmoderate, insightsevere;
        String insight = " ";
        
        if(insightintact.isSelected() == true)
        {
            insight = insight + "insightintact,";
        }
        if(insightimpaired.isSelected() == true)
        {
            insight = insight + "insightimpaired,";
        }
        if(insightminimal.isSelected() == true)
        {
            insight = insight + "insightminimal,";
        }
        if(insightmoderate.isSelected() == true)
        {
            insight = insight + "insightmoderate,";
        }
        if(insightsevere.isSelected() == true)
        {
            insight = insight + "insightsevere,";
        }
        
        insight = insight.substring(0,insight.length()-1);
        insight = insight.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/insight.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(insight.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
        
        
    }
    public void saveAbstraction()
    {
        //abstractionintact, abstractionconcrete, abstractionidiosyncratic;
        
            String abstraction = " ";
        
        if(abstractionintact.isSelected() == true)
        {
            abstraction = abstraction + "abstractionintact,";
        }
        if(abstractionconcrete.isSelected() == true)
        {
            abstraction = abstraction + "abstractionconcrete,";
        }
        if(abstractionidiosyncratic.isSelected() == true)
        {
            abstraction = abstraction + "abstractionidiosyncratic,";
        }
        
        abstraction = abstraction.substring(0,abstraction.length()-1);
        abstraction = abstraction.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/abstraction.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(abstraction.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    
    public void saveIntellect()
    {
            String intellect = " ";
        
        //shorttermmemorywithinnormallimits, shorttermmermorydeficits, longtermmemorywithinnormallimits,longtermmemorydeficits, shorttermmemorydeficitsbox, longtermmemorydeficitsbox
        if(intellectaboveaverage.isSelected() == true)
        {
            intellect = intellect + "intellectaboveaverage,";
        }
        if(intellectaverage.isSelected() == true)
        {
            intellect = intellect + "intellectaverage,";
        }
        if(intellectbelowaverage.isSelected() == true)
        {
            intellect = intellect + "intellectbelowaverage,";
        }
        
        intellect = intellect.substring(0,intellect.length()-1);
        intellect = intellect.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/intellect.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(intellect.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
        
        
        try{
                File bFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/intellectbox.txt");
                FileWriter writ = new FileWriter(bFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(intellectbelowaveragebox.getText());
                bw.close();
                writ.close();}
        catch(IOException ex){
        //    System.out.println(ex);
        }
    }
    //rock climbing, wrestling, fencing, swimming, awitp, hold it, dodgeball
    public void saveGeneralFundOfKnowledge()
    {
        String gfok = " ";
        
        //shorttermmemorywithinnormallimits, shorttermmermorydeficits, longtermmemorywithinnormallimits,longtermmemorydeficits, shorttermmemorydeficitsbox, longtermmemorydeficitsbox
        if(generalfundofknowledgewithinnormallimits.isSelected() == true)
        {
            gfok = gfok + "generalfundofknowledgewithinnormallimits,";
        }
        if(generalfundofknowledgedeficits.isSelected() == true)
        {
            gfok = gfok + "generalfundofknowledgedeficits,";
        }
        
        gfok = gfok.substring(0,gfok.length()-1);
        gfok = gfok.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/generalfundofknowledge.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(gfok.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
        
        
        try{
                File bFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/generalfundofknowledgebox.txt");
                FileWriter writ = new FileWriter(bFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(generalfundofknowledgedeficitsbox.getText());
                bw.close();
                writ.close();}
        catch(IOException ex){
            //System.out.println(ex);
        }
    }
    
    public void saveLongTermMemory()
    {
        String ltm = " ";
        
        //shorttermmemorywithinnormallimits, shorttermmermorydeficits, longtermmemorywithinnormallimits,longtermmemorydeficits, shorttermmemorydeficitsbox, longtermmemorydeficitsbox
        if(longtermmemorywithinnormallimits.isSelected() == true)
        {
            ltm = ltm + "longtermmemorywithinnormallimits,";
        }
        if(longtermmemorydeficits.isSelected() == true)
        {
            ltm = ltm + "longtermmemorydeficits,";
        }
        
        ltm = ltm.substring(0,ltm.length()-1);
        ltm = ltm.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/longtermmemory.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(ltm.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
        
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/longtermmemorydeficitsbox.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(longtermmemorydeficitsbox.getText());
                bw.close();
                writ.close();}
        catch(IOException ex){
        //    System.out.println(ex);
        }
    }
    
    public void saveShortTermMemory()
    {
        String stm = " ";
        
        //shorttermmemorywithinnormallimits, shorttermmermorydeficits, longtermmemorywithinnormallimits,longtermmemorydeficits, shorttermmemorydeficitsbox, longtermmemorydeficitsbox
        if(shorttermmemorywithinnormallimits.isSelected() == true)
        {
            stm = stm + "shorttermmemorywithinnormallimits,";
        }
        if(shorttermmemorydeficits.isSelected() == true)
        {
            stm = stm + "shorttermmemorydeficits,";
        }
        
        stm = stm.substring(0,stm.length()-1);
        stm = stm.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/shorttermmemory.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(stm.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
        
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/shorttermmemorydeficitsbox.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(shorttermmemorydeficitsbox.getText());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    
    public void saveOrientation()
    {
        String orientation = " ";
        
        if(fullyoriented.isSelected() == true)
        {
            orientation = orientation + "fullyoriented,";
        }
        if(disoriented.isSelected() == true)
        {
            orientation = orientation + "disoriented,";
        }
        if(person.isSelected() == true)
        {
            orientation = orientation + "person,";
        }
        if(place.isSelected() == true)
        {
            orientation = orientation + "place,";
        }
        if(time.isSelected() == true)
        {
            orientation = orientation + "time,";
        }
        
        
        orientation = orientation.substring(0,orientation.length()-1);
        orientation = orientation.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/orientation.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(orientation.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    
    public void saveHomicidality()
    {
        //homicidalitydenied, homicidalityideation, homicidalityintent, homicidalityplan
        String homicidality = " ";
        
        if(homicidalitydenied.isSelected() == true)
        {
            homicidality = homicidality + "homicidalitydenied,";
        }
        if(homicidalityideation.isSelected() == true)
        {
            homicidality = homicidality + "homicidalityideation,";
        }
        if(homicidalityintent.isSelected() == true)
        {
            homicidality = homicidality + "homicidalityintent,";
        }
        if(homicidalityplan.isSelected() == true)
        {
            homicidality = homicidality + "homicidalityplan,";
        }
        
        
        homicidality = homicidality.substring(0,homicidality.length()-1);
        homicidality = homicidality.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/homicidality.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(homicidality.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File hBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/homicidalitybox.txt");
                FileWriter writ = new FileWriter(hBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(homicidalityplanbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveSuicidality()
    {
        //suicidalitydenied, suicidalityideation, suicidalityintent, suicidalityplan;
        String suicidality = " ";
        
        if(suicidalitydenied.isSelected() == true)
        {
            suicidality = suicidality + "suicidalitydenied,";
        }
        if(suicidalityideation.isSelected() == true)
        {
            suicidality = suicidality + "suicidalityideation,";
        }
        if(suicidalityintent.isSelected() == true)
        {
            suicidality = suicidality + "suicidalityintent,";
        }
        if(suicidalityplan.isSelected() == true)
        {
            suicidality = suicidality + "suicidalityplan,";
        }
        
        
        suicidality = suicidality.substring(0,suicidality.length()-1);
        suicidality = suicidality.trim();
    
        
        try{
                File sFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/suicidality.txt");
                FileWriter writ = new FileWriter(sFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(suicidality.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File sBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/suicidalitybox.txt");
                FileWriter writ = new FileWriter(sBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(suicidalityplanbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        
        try{
                File comments = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/suicidalityhomicidalitycomments.txt");
                FileWriter writ = new FileWriter(comments, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(suicidalityhomicidalitycomments.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        
    }
    
    /*
    *The novel is set in an utterly anachronistic/chronos-incorrect/disfunctional, whimsical, nonsensical, an ____ paroxysm of a prehistoric and mythological setting.
    *The time period is "sometime between 70,000 & 700,000 bce", (which is/I find, coincidentally, quite similar to AoC's "hybordian age", if you will--surreal in quality, yet ____.)
    *The plot primarily revolves around the/its two main characters, one of whom is a female demon from indian mythology (ie. a "rakshasi"), and an old hermit/sage
    While the overarching plot centers around _____[the unusual relationship between the d child & the s/a sage's redemption of , and the need to perform a certain "task" before reaching the "endgame"]______________ [], the story itself is/it is, to a much greater extent focused on the relationships between the characters and their personal growth/but is more largely/basically a series of anecodotes
    expect to appeal to ().
    To make matters even more unusual/unique, said d is a child.
    Paradoxically/Ironically, The tone (in my opinion) is not unsimilar to that of many modern s f or fantasy novels on the shelves today. This was not deliberate. It is also, in places, risque and unconventional--again, this was unpremediated, and I believe that this is reflected in the writing itself, for better or worse.
    I hope you enjoy my work.
    
    -Reorganized Chaos
    */
    
    public void savePerception()
    {
        //the bones were easily crushed underfoot... "well...what do we have here?"
        //no longer felt the familiar rush when their bones...
        //She sighed wearily "I'm no longer a monster, Jana. I ceased to be one a long time ago. If I told myself that I'd be "
        //"Well, so much the better for me, then. It looks like I don't have much to worry about! She pulled her close.
        
        //J trying to cheer her up-
        //"You just seem so tired, angry/b-ed, and well, old."
        //if you're going to blame anyone, blame your teacher. He turned me into this/made me become like this.
        //everything was done with a sense of detachment, she could derive no more joy from the same actions
        
//visualhallucinations, auditoryhallucinations, depersonalization, derealization, commandah, delusions2, illusions, perceptionnoimpairment;
        String p = " ";
        
        if(visualhallucinations.isSelected() == true)
        {
            p = p + "visualhallucinations,";
        }
        if(auditoryhallucinations.isSelected() == true)
        {
            p = p + "auditoryhallucinations,";
        }
        if(depersonalization.isSelected() == true)
        {
            p = p + "depersonalization,";
        }
        if(derealization.isSelected() == true)
        {
            p = p + "derealization,";
        }
        if(commandah.isSelected() == true)
        {
            p = p + "commandah,";
        }
        if(delusions2.isSelected() == true)
        {
            p = p + "delusions,";
        }
        if(illusions.isSelected() == true)
        {
            p = p + "illusions,";
        }
        if(perceptionnoimpairment.isSelected() == true)
        {
            p = p + "noimpairment,";
        }        
        
        p = p.substring(0,p.length()-1);
        p = p.trim();
    
        
        try{
                File pFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/perception.txt");
                FileWriter writ = new FileWriter(pFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(p.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
        //Dydstop lol. you need to face your demons sitara. I will help you.  sit to menak- you are nothing like her. stop comparing yourself to her and just get on with or I will leave.    
        //1
        //aupfiddleatplge
    public void saveThoughtContent()
    {
        //keywords to search: "and offer no apologies"
        //logicalcoherent, povertyofcontent, ideasofreference, delusions, obsessions, phobias, paranoidideation;
        // /Reordered Chaos  XDD
        
        String thoughtContent = " ";
        //hummus/tahini, "steak", p seeds/walnuts, k p + sm papr; curry, hazelnut meal + a fig + 1tsp pb + 1tsp white flour + a few drops of maple syrup
        //get some (pepper) A1!!!
        //bbq sauce
        if(logicalcoherent.isSelected() == true)
        {
            thoughtContent = thoughtContent + "logicalcoherent,";
        }
        if(povertyofcontent.isSelected() == true)
        {
            thoughtContent = thoughtContent + "povertyofcontent,";
        }
        if(ideasofreference.isSelected() == true)
        {
            thoughtContent = thoughtContent + "ideasofreference,";
        }
        if(delusions.isSelected() == true)
        {
            thoughtContent = thoughtContent + "delusions,";
        }
        if(obsessions.isSelected() == true)
        {
            thoughtContent = thoughtContent + "obsessions,";
        }
        if(phobias.isSelected() == true)
        {
            thoughtContent = thoughtContent + "phobias,";
        }
        if(paranoidideation.isSelected() == true)
        {
            thoughtContent = thoughtContent + "paranoidideation,";
        }
        
        thoughtContent = thoughtContent.substring(0,thoughtContent.length()-1);
        thoughtContent = thoughtContent.trim();
    
        
        try{
                File thoughtContentFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/thoughtcontent.txt");
                FileWriter writ = new FileWriter(thoughtContentFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(thoughtContent.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File tcdBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/thoughtcontentdelusionsbox.txt");
                FileWriter writ = new FileWriter(tcdBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(delusionsbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveThoughtProcess()
    {
        //intact, circumstantial, loa, tangential, foi, logicalgoaldirected, thoughtblocking, ruminating, racingthoughts, thoughtinsertionwithdrawalbroadcast;
        String thoughtProcess = " ";
        
        if(intact.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "intact,";
        }
        if(circumstantial.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "circumstantial,";
        }
        if(loa.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "loa,";
        }
        if(tangential.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "tangential,";
        }
        if(foi.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "foi,";
        }
        if(logicalgoaldirected.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "logicalgoaldirected,";
        }
        if(thoughtblocking.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "thoughtblocking,";
        }
        if(ruminating.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "ruminating,";
        }
        if(racingthoughts.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "racingthoughts,";
        }
        if(thoughtinsertionwithdrawalbroadcast.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "thoughtinsertionwithdrawalbroadcast,";
        }
        
        
        thoughtProcess = thoughtProcess.substring(0,thoughtProcess.length()-1);
        thoughtProcess = thoughtProcess.trim();
    
        
        try{
                File thoughtprocessFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/thoughtprocess.txt");
                FileWriter writ = new FileWriter(thoughtprocessFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(thoughtProcess.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
    }
    
    public void saveSpeech()
    {
        //normal2, delayed, soft, loud, slurred, excessive, pressured, perseverating, rapid, rambling, incoherent, disorganized, decreasedproductivity;
        String speech = " ";
        
        if(normal2.isSelected() == true)
        {
            speech = speech + "normal2,";
        }
        if(delayed.isSelected() == true)
        {
            speech = speech + "delayed,";
        }
        if(soft.isSelected() == true)
        {
            speech = speech + "soft,";
        }
        if(loud.isSelected() == true)
        {
            speech = speech + "loud,";
        }
        if(slurred.isSelected() == true)
        {
            speech = speech + "slurred,";
        }
        if(excessive.isSelected() == true)
        {
            speech = speech + "excessive,";
        }
        if(pressured.isSelected() == true)
        {
            speech = speech + "pressured,";
        }
        if(perseverating.isSelected() == true)
        {
            speech = speech + "perseverating,";
        }
        if(rapid.isSelected() == true)
        {
            speech = speech + "rapid,";
        }
        if(rambling.isSelected() == true)
        {
            speech = speech + "rambling,";
        }
        if(incoherent.isSelected() == true)
        {
            speech = speech + "incoherent,";
        }
        if(disorganized.isSelected() == true)
        {
            speech = speech + "disorganized,";
        }
        if(decreasedproductivity.isSelected() == true)
        {
            speech = speech + "decreasedproductivity,";
        }
        
        speech = speech.substring(0,speech.length()-1);
        speech = speech.trim();
    
        
        try{
                File speechFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/speech.txt");
                FileWriter writ = new FileWriter(speechFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(speech.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
    }
    
    public void saveMood()
    {
        //euthymic, depressed, dysphoric, anxious, euphoric, angry, irritable, moodsad;
        String mood = " ";
        
        if(euthymic.isSelected() == true)
        {
            mood = mood + "euthymic,";
        }
        if(depressed.isSelected() == true)
        {
            mood = mood + "depressed,";
        }
        if(dysphoric.isSelected() == true)
        {
            mood = mood + "dysphoric,";
        }
        if(anxious.isSelected() == true)
        {
            mood = mood + "anxious,";
        }
        if(euphoric.isSelected() == true)
        {
            mood = mood + "euphoric,";
        }
        if(angry.isSelected() == true)
        {
            mood = mood + "angry,";
        }
        if(irritable.isSelected() == true)
        {
            mood = mood + "irritable,";
        }
        if(moodsad.isSelected() == true)
        {
            mood = mood + "moodsad,";
        }
        
        mood = mood.substring(0,mood.length()-1);
        mood = mood.trim();
    
        
        try{
                File moodFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/mood.txt");
                FileWriter writ = new FileWriter(moodFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(mood.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
    }
    
    public void saveAffect()
    {
        //appropriate, labile, expansive, constricted, happy, sad, blunted, flat, masking, affectnormalrange;
        String affect = " ";
        
        if(appropriate.isSelected() == true)
        {
            affect = affect + "appropriate,";
        }
        if(labile.isSelected() == true)
        {
            affect = affect + "labile,";
        }
        if(expansive.isSelected() == true)
        {
            affect = affect + "expansive,";
        }
        if(constricted.isSelected() == true)
        {
            affect = affect + "constricted,";
        }
        if(affecthappy.isSelected() == true)
        {
            affect = affect + "affecthappy,";
        }
        if(affectsad.isSelected() == true)
        {
            affect = affect + "affectsad,";
        }
        if(blunted.isSelected() == true)
        {
            affect = affect + "blunted,";
        }
        if(flat.isSelected() == true)
        {
            affect = affect + "flat,";
        }
        if(masking.isSelected() == true)
        {
            affect = affect + "masking,";
        }
        if(affectnormalrange.isSelected() == true)
        {
            affect = affect + "affectnormalrange,";
        }
        
        affect = affect.substring(0,affect.length()-1);
        affect = affect.trim();
    
        
        try{
                File affectFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/affect.txt");
                FileWriter writ = new FileWriter(affectFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(affect.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
    }
    
    public void saveMotorActivity()
    {
        //normal, agitated, motorretardation, hyperactive, catatonia, tremorstics, motoractivityother;
        String motoractivity = " ";
        
        if(normal.isSelected() == true)
        {
            motoractivity = motoractivity + "normal,";
        }
        if(agitated.isSelected() == true)
        {
            motoractivity = motoractivity + "agitated,";
        }
        if(motorretardation.isSelected() == true)
        {
            motoractivity = motoractivity + "motorretardation,";
        }
        if(hyperactive.isSelected() == true)
        {
            motoractivity = motoractivity + "hyperactive,";
        }
        if(catatonia.isSelected() == true)
        {
            motoractivity = motoractivity + "catatonia,";
        }
        if(tremorstics.isSelected() == true)
        {
            motoractivity = motoractivity + "tremorstics,";
        }
        if(motoractivityother.isSelected() == true)
        {
            motoractivity = motoractivity + "motoractivityother,";
        }
        
        motoractivity = motoractivity.substring(0,motoractivity.length()-1);
        motoractivity = motoractivity.trim();
    
        
        try{
                File motoractivityFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/motoractivity.txt");
                FileWriter writ = new FileWriter(motoractivityFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(motoractivity.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File maBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/motoractivitybox.txt");
                FileWriter writ = new FileWriter(maBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(motoractivityotherbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveAttitude()
    {
        //cooperative, guarded, suspicious, withdrawn, uncooperative, hostile, defensive, attitudeother;
        
                String attitude = " ";
        
        if(cooperative.isSelected() == true)
        {
            attitude = attitude + "cooperative,";
        }
        if(guarded.isSelected() == true)
        {
            attitude = attitude + "guarded,";
        }
        if(suspicious.isSelected() == true)
        {
            attitude = attitude + "suspicious,";
        }
        if(withdrawn.isSelected() == true)
        {
            attitude = attitude + "withdrawn,";
        }
        if(uncooperative.isSelected() == true)
        {
            attitude = attitude + "uncooperative,";
        }
        if(hostile.isSelected() == true)
        {
            attitude = attitude + "hostile,";
        }
        if(defensive.isSelected() == true)
        {
            attitude = attitude + "defensive,";
        }
        if(attitudeother.isSelected() == true)
        {
            attitude = attitude + "attitudeother,";
        }
        
        attitude = attitude.substring(0,attitude.length()-1);
        attitude = attitude.trim();
    
        
        try{
                File attitudeFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/attitude.txt");
                FileWriter writ = new FileWriter(attitudeFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(attitude.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File attitudeBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/attitudebox.txt");
                FileWriter writ = new FileWriter(attitudeBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(attitudeotherbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveEyeContact()
    {
           String eC = "blah";
        
        if(eyecontactgood.isSelected() == true)
        {
            eC = "good";
        }
        if(eyecontactpoor.isSelected() == true)
        {
            eC = "poor";
        }
        if(eyecontactvariable.isSelected() == true)
        {
            eC = "variable";
        }
        
        try{
                File eCFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/eyecontact.txt");
                FileWriter writ = new FileWriter(eCFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(eC);
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    public void saveAppearance()
    {
        //wellgroomed, casual, disheveled, bizarre, inappropriate, appearanceother;
        
                String appearance = " ";
        
        if(wellgroomed.isSelected() == true)
        {
            appearance = appearance + "wellgroomed,";
        }
        if(casual.isSelected() == true)
        {
            appearance = appearance + "casual,";
        }
        if(disheveled.isSelected() == true)
        {
            appearance = appearance + "disheveled,";
        }
        if(bizarre.isSelected() == true)
        {
            appearance = appearance + "bizarre,";
        }
        if(inappropriate.isSelected() == true)
        {
            appearance = appearance + "inappropriate,";
        }
        if(appearanceother.isSelected() == true)
        {
            appearance = appearance + "other,";
        }
        
        appearance = appearance.substring(0,appearance.length()-1);
        appearance = appearance.trim();
    
        
        try{
                File appearanceFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/appearance.txt");
                FileWriter writ = new FileWriter(appearanceFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(appearance.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File appearanceBoxFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/appearancebox.txt");
                FileWriter writ = new FileWriter(appearanceBoxFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(appearanceotherbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveAllergies()
    {
            String allergies = " ";
        
        if(nkda.isSelected() == true)
        {
            allergies = allergies + "nkda,";
        }
        if(environmental.isSelected() == true)
        {
            allergies = allergies + "environmental,";
        }
        
        allergies = allergies.substring(0,allergies.length()-1);
        allergies = allergies.trim();
    
        
        try{
                File allergiesTypes = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/allergiestype.txt");
                FileWriter writ = new FileWriter(allergiesTypes, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(allergies.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File allergiesDescriptions = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/allergiesdescription.txt");
                FileWriter writ = new FileWriter(allergiesDescriptions, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(allergiesdescriptionbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void savePastMedicalHistory()
    {
        try{
                File medicalHistory = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/pastmedicalhistory.txt");
                FileWriter writ = new FileWriter(medicalHistory, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(pastmedicalhistory.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveLegalHistory()
    {
        try{
                File legalHistory = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/legalhistory.txt");
                FileWriter writ = new FileWriter(legalHistory, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(legalhistory.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveEmployment()
    {
            String e = " ";
        
        if(emp.isSelected() == true)
        {
            e = e + "employed,";
        }
        if(unemp.isSelected() == true)
        {
            e = e + "unemployed,";
        }
        if(disabilityincome.isSelected() == true)
        {
            e = e + "disabilityincome,";
        }
        
        
        e = e.substring(0,e.length()-1);
        e = e.trim();
    
        
        try{
                File eFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/employed.txt");
                FileWriter writ = new FileWriter(eFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(e.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
    }
    
    public void saveEducation()
    {
        try{
                File educationFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/education.txt");
                FileWriter writ = new FileWriter(educationFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(education.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    public void saveFamilyHistoryOfMentalIllness()
    {
        String faHist = "blah";
        
        if(fhomiNO.isSelected() == true)
        {
            faHist = "no";
        }
        else
        {
            faHist = "yes";
        }
        
        try{
                File fhomiFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/familyhistoryofmentalillnessyesno.txt");
                FileWriter writ = new FileWriter(fhomiFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(faHist);
                bw.close();
                writ.close();}
        catch(IOException e){}
        
        try{
                File familyHistory = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/familyhistoryofmentalillness.txt");
                FileWriter writ = new FileWriter(familyHistory, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(familyhistoryofmentalillness.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveParentsSiblingsChildren()
    {
                try{
                File parentsFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/parents.txt");
                FileWriter writ = new FileWriter(parentsFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(parents.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
                
                        try{
                File siblingsFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/siblings.txt");
                FileWriter writ = new FileWriter(siblingsFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(siblings.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
                        
                                try{
                File childrenFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/children.txt");
                FileWriter writ = new FileWriter(childrenFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(children.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    public void saveSocialHistory()
    {
        try{
                File socialHistory = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/socialhistory.txt");
                FileWriter writ = new FileWriter(socialHistory, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(socialhistorygeneral.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveDeniesHistoryOf()
    {
        //CheckBox significantwithdrawals, dts, withdrawalseizures, historyofdetox, outpatient, inpatient, na, aa, substancetreatmentprogram;
    
        //TextField inpatientbox;
        
        String denies = " ";
        
        if(significantwithdrawals.isSelected() == true)
        {
            denies = denies + "significantwithdrawals,";
        }
        if(dts.isSelected() == true)
        {
            denies = denies + "dts,";
        }
        if(withdrawalseizures.isSelected() == true)
        {
            denies = denies + "withdrawalseizures,";
        }
        if(historyofdetox.isSelected() == true)
        {
            denies = denies + "historyofdetox,";
        }
        if(outpatient.isSelected() == true)
        {
            denies = denies + "outpatient,";
        }
        if(inpatient.isSelected() == true)
        {
            denies = denies + "inpatient,";
        }
        if(na.isSelected() == true)
        {
            denies = denies + "na,";
        }
        if(aa.isSelected() == true)
        {
            denies = denies + "aa,";
        }
        if(substancetreatmentprogram.isSelected() == true)
        {
            denies = denies + "substancetreatmentprogram,";
        }
        
        denies = denies.substring(0,denies.length()-1);
        denies = denies.trim();
        
        try{
                File inpatientBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/inpatientbox.txt");
                FileWriter writ = new FileWriter(inpatientBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(inpatientbox.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
        
        try{
                File deniesFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/denieshistoryof.txt");
                FileWriter writ = new FileWriter(deniesFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(denies.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    public void saveSubstanceUseHistory()
    {
        try{
                File substanceUseHistory = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/substanceusehistory.txt");
                FileWriter writ = new FileWriter(substanceUseHistory, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(substanceusehistory.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveHistoryOfMedicationTrialsInThePast()
    {
        try{
                File medicationTrials = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/historyofmedicationtrialsinthepasttable.txt");
                FileWriter writ = new FileWriter(medicationTrials, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(historyofmedicationtrialsinthepasttable.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        
        try{
                File medicationTrials = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/historyofmedicationtrialsinthepastcomments.txt");
                FileWriter writ = new FileWriter(medicationTrials, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(historyofmedicationtrialsinthepastcomments.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void savePastHistoryOf()
    {
            String pastHist = " ";
        
        if(sano.isSelected() == true)
        {
            pastHist = pastHist + "suicideattemptsno,";
        }
        else if(sayes.isSelected() == true)
        {
            pastHist = pastHist + "suicideattemptsyes,";
        }
        if(physicalabuseno.isSelected() == true)
        {
            pastHist = pastHist + "physicalabuseno,";
        }
        else if(physicalabuseyes.isSelected() == true)
        {
            pastHist = pastHist + "physicalabuseyes,";
        }
        if(sexualabuseno.isSelected() == true)
        {
            pastHist = pastHist + "sexualabuseno,";
        }
        else if(sexualabuseyes.isSelected() == true)
        {
            pastHist = pastHist + "sexualabuseyes,";
        }
        if(violentaggressivebehaviorsno.isSelected() == true)
        {
            pastHist = pastHist + "violentaggressivebehaviorsno,";
        }
        else if(violentaggressivebehaviorsyes.isSelected() == true)
        {
            pastHist = pastHist + "violentaggressivebehaviorsyes,";
        }
        if(selfinjuriousbehaviorsno.isSelected() == true)
        {
            pastHist = pastHist + "selfinjuriousbehaviorsno,";
        }
        else if(selfinjuriousbehaviorsyes.isSelected() == true)
        {
            pastHist = pastHist + "selfinjuriousbehaviorsyes,";
        }
        
        pastHist = pastHist.substring(0,pastHist.length()-1);
        pastHist = pastHist.trim();
        
        try{
                File phoOther = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/pasthistoryoftext.txt");
                FileWriter writ = new FileWriter(phoOther, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(pasthistoryoftext.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
        
        try{
                File pastHistoryFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/pasthistoryof.txt");
                FileWriter writ = new FileWriter(pastHistoryFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(pastHist.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    public void savePastPsychiatricHistory()
    {
        try{
                File pastPsychiatricHistoryFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/pastpsychiatrichistory.txt");
                FileWriter writ = new FileWriter(pastPsychiatricHistoryFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(pastpsychiatrichistory.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveName()
    {
        try
        {
                    File firstNameFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/first.txt");
                    FileWriter writ = new FileWriter(firstNameFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(firstName);
                    bw.close();
                    writ.close();
                    
                    File lastNameFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/last.txt");
                    FileWriter writ2 = new FileWriter(lastNameFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    writ2.append(lastName);
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
    }
    
    public void saveDOB()
    {
        try
        {
                    File dobFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + "/EvaluationForm/dateofbirth.txt");
                    FileWriter writ = new FileWriter(dobFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(dob);
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
    }
    
    public void saveAge()
    {
        try
        {
                    File ageFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/age.txt");
                    FileWriter writ = new FileWriter(ageFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(ageText.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){}
    }
    
    public void saveMaritalStatus()
    {
              
        String maritalStatus = "blah";
        
        if(single.isSelected() == true)
        {
            maritalStatus = "Single";
        }
        else if(married.isSelected() == true)
        {
            maritalStatus = "Married";
        }
        else if(seperated.isSelected() == true)
        {
            maritalStatus = "Seperated";
        }
        else if(commonlawspouse.isSelected() == true)
        {
            maritalStatus = "Common Law Spouse";
        }
        else if(cohabiting.isSelected() == true)
        {
            maritalStatus = "Cohabiting";
        }
        else if(divorced.isSelected() == true)
        {
            maritalStatus = "Divorced";
        }
        else if(engaged.isSelected() == true)
        {
            maritalStatus = "Engaged";
        }
        
        try{
                File maritalStatusFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/maritalstatus.txt");
                FileWriter writ = new FileWriter(maritalStatusFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(maritalStatus);
                bw.close();
                writ.close();}
        catch(IOException e){}
  
    }
    
    public void saveEthnicity()
    {
        
        String ethnicity = " ";
        
        if(caucasian.isSelected() == true)
        {
            ethnicity = ethnicity + "caucasian,";
        }
        if(africanamerican.isSelected() == true)
        {
            ethnicity = ethnicity + "africanamerican,";
        }
        if(nativeamerican.isSelected() == true)
        {
            ethnicity = ethnicity + "nativeamerican,";
        }
        if(hispanic.isSelected() == true)
        {
            ethnicity = ethnicity + "hispanic,";
        }
        if(asian.isSelected() == true)
        {
            ethnicity = ethnicity + "asian,";
        }
        if(ethnicityother.isSelected() == true)
        {
            ethnicity = ethnicity + "other,";
        }
        
        ethnicity = ethnicity.substring(0,ethnicity.length()-1);
        ethnicity = ethnicity.trim();
        
        try{
                File ethnicityOtherFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/ethnicity-other.txt");
                FileWriter writ = new FileWriter(ethnicityOtherFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(ethnicityothertext.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
        
        try{
                File ethnicityFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/ethnicity.txt");
                FileWriter writ = new FileWriter(ethnicityFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(ethnicity.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException e){}
        
    }
    
    public void saveSex()
    {
        
        String gender = "blah";
        
        if(male.isSelected() == true)
        {
            gender = "male";
        }
        if(female.isSelected() == true)
        {
            gender = "female";
        }
        
        try{
                File sexFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/sex.txt");
                FileWriter writ = new FileWriter(sexFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(gender);
                bw.close();
                writ.close();}
        catch(IOException e){}
        
    }
    
    public void saveReferredBy()
    {
        String referredBy = "blah";
        
        if(insurance.isSelected() == true)
        {
            referredBy = "Insurance";
        }
        else if(internet.isSelected() == true)
        {
            referredBy = "Internet";
        }
        else if(pcp.isSelected() == true)
        {
            referredBy = "PCP";
        }
        else if(cps.isSelected() == true)
        {
            referredBy = "CPS";
        }
        else if(therapist.isSelected() == true)
        {
            referredBy = "Therapist";
        }
        else if(referredbyother.isSelected() == true)
        {
            referredBy = "Other";
        }
        
        try{
                File referredByFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/referredby.txt");
                FileWriter writ = new FileWriter(referredByFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(referredBy);
                bw.close();
                writ.close();}
        catch(IOException e){}
        
        try{
                File referredByTherapistFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/referredby-therapist.txt");
                FileWriter writ = new FileWriter(referredByTherapistFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(referredbytherapisttext.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
        
        try{
                File referredByOtherFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/referredby-other.txt");
                FileWriter writ = new FileWriter(referredByOtherFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(referredbyothertext.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }

    public void saveReasonForReferral()
    {
        String rfr = "blah";
        
        if(reasonforreferralpsychiatricevaluation.isSelected() == true)
        {
            rfr = "psychiatricevaluation";
        }
        if(reasonforreferralmedicationmanagement.isSelected() == true)
        {
            rfr = "medicationmanagement";
        }
        
        try{
                File sexFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/reasonforreferral.txt");
                FileWriter writ = new FileWriter(sexFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(rfr);
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    //bangalore pictures I want: mbalc tree,exhibit hall's bench area (1), and mini bench area (2), cubb's gov aquarium
    //get poster frame
    //get posters made
    public void saveSourceOfInformation()
    {
        String sOI = " ";
        
        if(patient.isSelected() == true)
        {
            sOI = sOI + "patient,";
        }
        if(mother.isSelected() == true)
        {
            sOI = sOI + "mother,";
        }
        if(father.isSelected() == true)
        {
            sOI = sOI + "father,";
        }
        if(spouse.isSelected() == true)
        {
            sOI = sOI + "spouse,";
        }
        if(othersourceofinformation.isSelected() == true)
        {
            sOI = sOI + "other,";
        }
        
        
        sOI = sOI.substring(0,sOI.length()-1);
        sOI = sOI.trim();
        
        try{
                File sourceofinformationfile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/sourceofinformation.txt");
                FileWriter writ = new FileWriter(sourceofinformationfile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(sOI.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException e){}
        
        try{
                File sourceofinformationotherfile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/sourceofinformation-other.txt");
                FileWriter writ = new FileWriter(sourceofinformationotherfile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(othersourceofinformationbox.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    public void saveReliabilityOfInformation()
    {
        String rOI = "";
        
        if(good.isSelected() == true)
        {
            rOI = "good";
        }
        else if(fair.isSelected() == true)
        {
            rOI = "fair";
        }
        else if(vague.isSelected() == true)
        {
            rOI = "vague";
        }
        else if(minimizing.isSelected() == true)
        {
            rOI = "minimizing";
        }
        else if(otherreliabilityofinformation.isSelected() == true)
        {
            rOI = "other";
        }
        
        try{
                File reliabilityofinformationfile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/reliabilityofinformation.txt");
                FileWriter writ = new FileWriter(reliabilityofinformationfile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(rOI.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException e){}
        
        try{
                File reliabilityofinformationotherfile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/reliabilityofinformation-other.txt");
                FileWriter writ = new FileWriter(reliabilityofinformationotherfile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(otherreliabilityofinformationbox.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    public void saveHistoryOfPresentIllness()
    {
        try{
                File historyofpresentillnessfile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/historyofpresentillness.txt");
                FileWriter writ = new FileWriter(historyofpresentillnessfile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(historyofpresentillness.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    //wrestling, hgg, 1, 1, etc..., bel v wrist up hold
    //aoro, asnake, ngals, 1 more:  
    public void saveSignsSymptoms()
    {
        String ss = " ";
        
        if(ocd.isSelected() == true)
        {
            ss = ss + "ocd,";
        }
        if(bipolardisorder.isSelected() == true)
        {
            ss = ss + "bipolardisorder,";
        }
        if(socialphobia.isSelected() == true)
        {
            ss = ss + "socialphobia,";
        }
        if(panicdisorder.isSelected() == true)
        {
            ss = ss + "panicdisorder,";
        }
        if(eatingdisorder.isSelected() == true)
        {
            ss = ss + "eatingdisorder,";
        }
        if(majordepressivedisorder.isSelected() == true)
        {
            ss = ss + "majordepressivedisorder,";
        }
        if(psychosis.isSelected() == true)
        {
            ss = ss + "psychosis,";
        }
        
        
        ss = ss.substring(0,ss.length()-1);
        ss = ss.trim();
        
        try{
                File signsSymptoms = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/signsandsymptoms.txt");
                FileWriter writ = new FileWriter(signsSymptoms, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(ss.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    //on exit: would you like to save the evaluation form before quitting (regardless of whether changes have been made or not)? -yes -no
    
    public void fillPastHistoryOf()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/pasthistoryof.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("suicideattemptsno"))
                    {
                        sano.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("suicideattemptsyes"))
                    {
                        sayes.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("physicalabuseno"))
                    {
                        physicalabuseno.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("physicalabuseyes"))
                    {
                        physicalabuseyes.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("sexualabuseno"))
                    {
                        sexualabuseno.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("sexualabuseyes"))
                    {
                        sexualabuseyes.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("violentaggressivebehaviorsno"))
                    {
                        violentaggressivebehaviorsno.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("violentaggressivebehaviorsyes"))
                    {
                        violentaggressivebehaviorsyes.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("selfinjuriousbehaviorsno"))
                    {
                        selfinjuriousbehaviorsno.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("selfinjuriousbehaviorsyes"))
                    {
                        selfinjuriousbehaviorsyes.setSelected(true);
                    }
                    
                }
                
                FileReader reader2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/pasthistoryoftext.txt");
                BufferedReader br2 = new BufferedReader(reader2); 
                
                pasthistoryoftext.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br2.readLine()) != null)
                 {
                     pasthistoryoftext.appendText(aLine);
                     pasthistoryoftext.appendText("\n");
                 }
                
                br2.close();
                reader2.close();
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillPastPsychiatricHistory()
    {
     try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/pastpsychiatrichistory.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                pastpsychiatrichistory.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     pastpsychiatrichistory.appendText(aLine);
                     pastpsychiatrichistory.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
    }
    
    public void fillCurrentMedications()
    {
        try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/currentmedications.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                currentmedications.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     currentmedications.appendText(aLine);
                     currentmedications.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
        
        /*try
       {
           FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/currentmedications.txt");
                BufferedReader br = new BufferedReader(reader); 
         
                 ArrayList sentences = new ArrayList();
                 String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     sentences.add(aLine);
                 }
                 
                 currentmedications.setWrapText(true);
                 
                for(int i = 0; i < sentences.size(); i++)
                {
                    currentmedications.appendText(sentences.get(i).toString());
                }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}*/
    }
    
    public void fillSignsSymptoms()
    {
        try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/signsandsymptoms.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("ocd"))
                    {
                        ocd.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("bipolardisorder"))
                    {
                        bipolardisorder.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("socialphobia"))
                    {
                        socialphobia.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("eatingdisorder"))
                    {
                        eatingdisorder.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("panicdisorder"))
                    {
                        panicdisorder.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("majordepressivedisorder"))
                    {
                        majordepressivedisorder.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("psychosis"))
                    {
                        psychosis.setSelected(true);
                    }
                }
                
       }
       catch(Exception e)
       {}   
    }
    
    public void saveCurrentMedications()
    {
           try{
                File currentMedicationsFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/currentmedications.txt");
                FileWriter writ = new FileWriter(currentMedicationsFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(currentmedications.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void fillName()
    {
        
        //fills name
        first.setText(firstName.substring(0,1).toUpperCase() + firstName.substring(1));
        last.setText(lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
         





/*
//reads the first file
                 FileReader reader = new FileReader(installationPath + "/Patients.txt");
                         //+ "/userdata/" + get.currentPatientFirstName + get.currentPatientLastName + "/EvaluationForm/first.txt");
                 BufferedReader br = new BufferedReader(reader); 
                 ArrayList elements = new ArrayList();
                 String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     elements.add(aLine);
                 }
                 
                 String name;
                 name = elements.get(0).toString().toLowerCase();
                 
                 String rI = "";
        StringTokenizer tokenizer = new StringTokenizer(containsIndexes);
        int counter = 0;
        while(tokenizer.hasMoreElements())
        {
            counter++;
            String token = tokenizer.nextElement().toString();
            if(counter == 1)
            {
                rI = token;
            }
        }
                 
                 br.close();
                 reader.close();

                 
                 
                 
                 
                 
                 
                 
                 //reads the second file
                 FileReader reader2 = new FileReader(installationPath + "/userdata/" + get.currentPatientFirstName + get.currentPatientLastName + "/EvaluationForm/first.txt");
                 BufferedReader br2 = new BufferedReader(reader2); 
                 ArrayList elements2 = new ArrayList();
                 String aLine2 = "";
    
                 while((aLine2 = br2.readLine()) != null)
                 {
                     elements2.add(aLine2);
                 }
                 
                 lastName = elements2.get(0).toString().toLowerCase();
                 
                 br2.close();
                 reader2.close();
        }
        catch(Exception e) {}
                 
        //fills name
        first.setText(firstName.substring(0,1).toUpperCase() + lastName.substring(1));
        last.setText(lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
    }*/
   }   
    
   public void fillDOB()
   {
       dobText.setText(dob.substring(0,2) + "/" + dob.substring(2,4) + "/" + dob.substring(4,8));
   }
   
   public void fillAge(boolean loaded)      
   {
    if(loaded == false)
       {
            int month = Integer.parseInt(dob.substring(0,2).toString());
            int day = Integer.parseInt(dob.substring(2,4).toString());
            int year = Integer.parseInt(dob.substring(4,8).toString());
       
       
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Date date = new Date();
            String alpha = dateFormat.format(date);
            
            String[] monthDayYear = alpha.split("-");
            
            int currentMonth = Integer.parseInt(monthDayYear[0]);
            int currentDay = Integer.parseInt(monthDayYear[1]);
            int currentYear = Integer.parseInt(monthDayYear[2]);
            
            int age = currentYear - year;
            
            if(currentMonth < month)
            {
                age = age - 1;
            }
            
            if(currentMonth == month && currentDay < day)
            {
                age = age - 1;
            }
            
            ageText.setText(Integer.toString(age));
       }
       else
       {
           try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/age.txt");
                BufferedReader br = new BufferedReader(reader); 
                String age = br.readLine();
                br.close();
                reader.close();
                
                ageText.setText(age);
            }
            catch(Exception e)
            {}
       }
            

   }
//that <3 statue of v-era female attire <3 <3 <3 (it was on a wikipedia page)   
   
//wikipedia page containing the pic of a cross section of an insulated stone home in the britain (contains labels for all the layers)
   public void fillMaritalStatus()
   {
       
    try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/maritalstatus.txt");
                BufferedReader br = new BufferedReader(reader); 
                String mS = br.readLine();
                br.close();
                reader.close();
                
                if(mS.equalsIgnoreCase("single"))
                {
                    single.setSelected(true);
                }
                if(mS.equalsIgnoreCase("married"))
                {
                    married.setSelected(true);
                }
                if(mS.equalsIgnoreCase("divorced"))
                {
                    divorced.setSelected(true);
                }
                if(mS.equalsIgnoreCase("engaged"))
                {
                    engaged.setSelected(true);
                }
                 if(mS.equalsIgnoreCase("seperated"))
                {
                    seperated.setSelected(true);
                }
                  if(mS.equalsIgnoreCase("common law spouse"))
                {
                    commonlawspouse.setSelected(true);
                }
                   if(mS.equalsIgnoreCase("cohabiting"))
                {
                    cohabiting.setSelected(true);
                }
       }
       catch(Exception e)
       {}
   }
   
   public void fillEthnicity()
   {
       try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/ethnicity.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ethnicity = br.readLine();
                br.close();
                reader.close();
                
                String[] ethnicityArray = ethnicity.split(",");
                
                for(int i = 0; i < ethnicityArray.length; i++)
                {
                    if(ethnicityArray[i].equalsIgnoreCase("caucasian"))
                    {
                        caucasian.setSelected(true);
                    }
                    if(ethnicityArray[i].equalsIgnoreCase("asian"))
                    {
                        asian.setSelected(true);
                    }
                    if(ethnicityArray[i].equalsIgnoreCase("hispanic"))
                    {
                        hispanic.setSelected(true);
                    }
                    if(ethnicityArray[i].equalsIgnoreCase("africanamerican"))
                    {
                        africanamerican.setSelected(true);
                    }
                    if(ethnicityArray[i].equalsIgnoreCase("nativeamerican"))
                    {
                        nativeamerican.setSelected(true);
                    }
                    if(ethnicityArray[i].equalsIgnoreCase("other"))
                    {
                        ethnicityother.setSelected(true);
                    }
                }
                
                
                
                FileReader reader2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/ethnicity-other.txt");
                BufferedReader br2 = new BufferedReader(reader2); 
                String ethnicityOtherText = br2.readLine();
                br2.close();
                reader2.close();
                
                if(ethnicityOtherText == null)
                {
                    ethnicityothertext.setText("");
                }
                else
                {
                    ethnicityothertext.setText(ethnicityOtherText);
                }
                
       }
       catch(Exception e)
       {}   
   }
   
   public void fillGender()
   {
       try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/sex.txt");
                BufferedReader br = new BufferedReader(reader); 
                String gender = br.readLine();
                br.close();
                reader.close();
                
                if(gender.equalsIgnoreCase("male"))
                {
                    male.setSelected(true);
                }
                if(gender.equalsIgnoreCase("female"))
                {
                    female.setSelected(true);
                }
                
       }
       catch(Exception e)
       {}
   }
   
   public void fillReferredBy()
   {
              try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/referredby.txt");
                BufferedReader br = new BufferedReader(reader); 
                String rB = br.readLine();
                br.close();
                reader.close();
                
                String[] rBArray = rB.split(",");
                
                for(int i = 0; i < rBArray.length; i++)
                {
                    if(rBArray[i].equalsIgnoreCase("insurance"))
                    {
                        insurance.setSelected(true);
                    }
                    if(rBArray[i].equalsIgnoreCase("internet"))
                    {
                        internet.setSelected(true);
                    }
                    if(rBArray[i].equalsIgnoreCase("pcp"))
                    {
                        pcp.setSelected(true);
                    }
                    if(rBArray[i].equalsIgnoreCase("cps"))
                    {
                        cps.setSelected(true);
                    }
                    if(rBArray[i].equalsIgnoreCase("therapist"))
                    {
                        therapist.setSelected(true);
                    }
                    if(rBArray[i].equalsIgnoreCase("other"))
                    {
                        referredbyother.setSelected(true);
                    }
                }
                
                
                
                FileReader reader2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/referredby-other.txt");
                BufferedReader br2 = new BufferedReader(reader2); 
                String rBO = br2.readLine();
                br2.close();
                reader2.close();
                
                if(rBO == null)
                {
                    referredbyothertext.setText("");
                }
                else
                {
                    referredbyothertext.setText(rBO);
                }
                
                
                FileReader reader3 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/referredby-therapist.txt");
                BufferedReader br3 = new BufferedReader(reader3); 
                String rBT = br3.readLine();
                br3.close();
                reader3.close();
                
                if(rBT == null)
                {
                    referredbytherapisttext.setText("");
                }
                else
                {
                    referredbytherapisttext.setText(rBT);
                }
                
       }
       catch(Exception e)
       {}   
   }
   
   public void fillReasonForReferral()
   {
       try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/reasonforreferral.txt");
                BufferedReader br = new BufferedReader(reader); 
                String rfr = br.readLine();
                br.close();
                reader.close();
                
                if(rfr.equalsIgnoreCase("psychiatricevaluation"))
                {
                    reasonforreferralpsychiatricevaluation.setSelected(true);
                }
                if(rfr.equalsIgnoreCase("medicationmanagement"))
                {
                    reasonforreferralmedicationmanagement.setSelected(true);
                }
            }
       catch(Exception e)
       {}
       
   }
   
   public void fillSourceOfInformation()
   {
       try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/sourceofinformation.txt");
                BufferedReader br = new BufferedReader(reader); 
                String sOI = br.readLine();
                br.close();
                reader.close();
                
                String[] sourcesArray = sOI.split(",");
                
                for(int i = 0; i < sourcesArray.length; i++)
                {
                    if(sourcesArray[i].equalsIgnoreCase("patient"))
                    {
                        patient.setSelected(true);
                    }
                    if(sourcesArray[i].equalsIgnoreCase("spouse"))
                    {
                        spouse.setSelected(true);
                    }
                    if(sourcesArray[i].equalsIgnoreCase("mother"))
                    {
                        mother.setSelected(true);
                    }
                    if(sourcesArray[i].equalsIgnoreCase("father"))
                    {
                        father.setSelected(true);
                    }
                    if(sourcesArray[i].equalsIgnoreCase("other"))
                    {
                        othersourceofinformation.setSelected(true);
                    }
                    
                }
                
                
                
                FileReader reader2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/sourceofinformation-other.txt");
                BufferedReader br2 = new BufferedReader(reader2); 
                String sOIOther = br2.readLine();
                br2.close();
                reader2.close();
                
                if(sOIOther == null)
                {
                    othersourceofinformationbox.setText("");
                }
                else
                {
                    othersourceofinformationbox.setText(sOIOther);
                }
                
       }
       catch(Exception e)
       {}
   }
   
   public void fillReliabilityOfInformation()
   {
          try{
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/reliabilityofinformation.txt");
                BufferedReader br = new BufferedReader(reader); 
                String rOI = br.readLine();
                br.close();
                reader.close();
                
                if(rOI.equalsIgnoreCase("good"))
                {
                    good.setSelected(true);
                }
                if(rOI.equalsIgnoreCase("fair"))
                {
                    fair.setSelected(true);
                }
                if(rOI.equalsIgnoreCase("vague"))
                {
                    vague.setSelected(true);
                }
                if(rOI.equalsIgnoreCase("minimizing"))
                {
                    minimizing.setSelected(true);
                }
                if(rOI.equalsIgnoreCase("other"))
                {
                    otherreliabilityofinformation.setSelected(true);
                }
                
                FileReader reader2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/reliabilityofinformation-other.txt");
                BufferedReader br2 = new BufferedReader(reader2); 
                String rOIO = br2.readLine();
                br2.close();
                reader2.close();
                
                otherreliabilityofinformationbox.setText(rOIO);
       }
       catch(Exception e)
       {}
   }
   
   public void fillHistoryOfPresentIllness()
   {
       
       try
       {
                FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/historyofpresentillness.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                historyofpresentillness.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     historyofpresentillness.appendText(aLine);
                     historyofpresentillness.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}   
       
       /*try
       {
           FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/EvaluationForm/historyofpresentillness.txt");
                BufferedReader br = new BufferedReader(reader); 
                //String hOPI = br.readLine();
                

               /* Ciel has painfully obvious PTSD (post-traumatic stress disorder). This is a disorder that was not recognized as a psychiatric diagnosis formally until the year 1980; Kuroshitsuji/Black Butler currently takes place in 1889 â€“ 91 years prior to said recognition. Up until that time, people who suffered from it, such as soldiers whoâ€™d fought in a war, were simply said to be â€œweak,â€� of heart or mind, lacking in bravery, or that they werenâ€™t â€œprepared,â€� for the horrors of war, etc. Considering Cielâ€™s character, that he is afflicted by it surely bothers him because of said implications that would have tagged along with it in this time period, even though it wasnâ€™t recognized as an actual disorder, but rather recognized as â€œsomething being wrong with someone.â€� Anyone can develop PTSD. Read more about PTSD in children, adolescents, and teenagers here and here for a better explanation. Please note: as many as 100% of children who witness a parental homicide (Iâ€™m sure this includes being the first to stumble across their bodies) develop PTSD. Also consider the torture Ciel was forced through as a 10 year old â€“ being kidnapped, sold into slavery, and made to do God knows what before his rescue. Many of the other things heâ€™s gone through after that are triggers for PTSD as well.
Amnesia in children who have PTSD is rare, especially compared to its presence in adults with PTSD, but not impossible. Amnesia, when with PTSD, for those who donâ€™t know, is when a person loses part or all of their memory regarding a traumatic event or events they experienced or went through. Time skew and omen formation are more common, though all three are possible in Cielâ€™s case. Time skew is when the victim is unable to recall the chronological order of events of the experienced trauma. Considering the â€œtimeline of events,â€� concerning Cielâ€™s trauma after kidnapping seems to change or have inconsistencies each time he thinks of it, that he might experience time skew or amnesia (or both?) is very likely. He also seems to have displayed omen formation and/or survivorâ€™s guilt or just generally guilt concerning both the initial trauma other things, such as Mary Kellyâ€™s murder by Jack the Ripper (â€œThere would have been any number of ways to save her, but I didnâ€™tâ€�). 
The images of the â€œdead Cielâ€� could be imagined from fear or panic, OR a metaphor for the child that Ciel was before the trauma occurred. His old self was killed, and his innocence and the life he once lived sacrificed, by people who intended to sacrifice him for their own selfish reasons. Given his childhood up to that point, he probably never realized people could be so cruel.
The only time the body of the child who was murdered just before Ciel and Sebastian made their contract is shown is when the characters are either a) speaking hypothetically or b) Ciel is having a breakdown or panic attack. Considering that Ciel does not have antisocial personality disorder, human sympathy would play a part in this.*/

/*


                 ArrayList sentences = new ArrayList();
                 String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     sentences.add(aLine);
                 }
                 
                 historyofpresentillness.setWrapText(true);
                 
                for(int i = 0; i < sentences.size(); i++)
                {
                    historyofpresentillness.appendText(sentences.get(i).toString());
                }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}*/
   }
   //that she pleasures herself with their carcasses before bathing in their blood. Either that or she devours them alive/feasts on them while they're alive.
   public void print()
   {//thrashing/flailing wildly until the very last moments before it stilled/until it eventually stilled.
//"What a nice addition" He fingered the newly    pelt on the wall. a sly girn. "I have done little to discourage that particular rumor."
       //She refilled his goblet. "Although if you would like a [practical] demonstration, I am certainly not averse to the idea" She nibbled on her bottom lip/licked her lips.
       
       //And of ____? What rumors are circulating about him these days.
       //"Oh, only the usual. That he's prone to/has bouts of crazed [], necrophilic sodomy, and bisexual 
       
       //A/N: striking a balance, as a writer
       //"Show me then. M w/ b. I had this collected specifically for the occasion" He handed her a narrow/cylindrical vessel. "and Put on a good show."
       
       //"________ swears he saw you m i t b of/he's seen you m i t b of..." "put on a good show then"
       
       //"...although I don't really see how the blood is of any assistance, I saw it fit to have this collected"
       
       //A/N: omg...HAWT
       //A/N: the order- Oh, so,... I had this specifically collected for m p tonight..., he handed her a narrow vessel about five feet in height. "Show me then."
       
       //playing personal attendant to an old hermit is not conducive to/does not fit well with wmg, now does it?
       
       //-----
       //she removed her mask, hanging it on one of the hooks on the wall. She did the same with the belt/kilt, chest plate and greaves.
       try
       {           
            writeEvalToDocX(false, "");
            
            Desktop.getDesktop().print(new File(installationPath + "/userdata/" + firstName + lastName + dob + "/" + firstName + lastName + dob + "psychiatricevaluation.docx"));
       }
       catch(IOException e)
       {}
      //String filename = "";
      //System.getRuntime().exec("start /min winword \"" + filename + "\" /q /n /f /mFilePrint /mFileExit");

   }
   //"...but as a consequence, various other depts...[begin to] suffer" he lingered on the word
   
   public void convertToPDF()
   {
        /*try {
            InputStream doc = new FileInputStream(new File(installationPath + "/userdata/" + firstName + lastName + dob + "/" + firstName + lastName + dob + "psychiatricevaluation.docx"));
            XWPFDocument document = new XWPFDocument(doc);
            PdfOptions options = PdfOptions.create();
            OutputStream out = new FileOutputStream(new File(installationPath + "/userdata/" + firstName + lastName + dob + "/" + firstName + lastName + dob + "psyeval.pdf"));
            PdfConverter.getInstance().convert(document, out, options);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Convert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("file not found");
        } catch (IOException ex) {
            //Logger.getLogger(Convert.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
       // 1) Load DOCX into XWPFDocument
        /*try
        {
               InputStream in= new FileInputStream(new File(installationPath + "/userdata/" + firstName + lastName + dob + "/" + firstName + lastName + dob + "psychiatricevaluation.docx"));
        XWPFDocument document = new XWPFDocument(in);
System.out.println("Hello");
        // 2) Prepare Pdf options
        PdfOptions options = PdfOptions.create();

        // 3) Convert XWPFDocument to Pdf
        System.out.println("Hello 1");
        OutputStream out = new FileOutputStream(new File(installationPath + "/userdata/" + firstName + lastName + dob + "/" + firstName + lastName + dob + "imapdf.pdf"));
        System.out.println("Hello 2");
        PdfConverter.getInstance().convert(document, out, options);
        System.out.println("Hello 3");
        }

        catch(Exception e)
        {
            //System.out.println(e);
        }*/
   }
   
   public void export()
   {//this is not unlike old age, and eventually death
            //"Save As" Dialog Box:
            JFrame parentFrame = new JFrame();
       
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save to/Save as/Save file as.../Where would you like to save this file?/ Where would you like to save this evaluation?");
       
            int selectedPathAndName = fileChooser.showSaveDialog(parentFrame);
            String path = "";
            
            if(selectedPathAndName == JFileChooser.APPROVE_OPTION)
            {
                File fileToSave = fileChooser.getSelectedFile();
                path = fileToSave.getAbsolutePath();
            

            writeEvalToDocX(true, path);
            
            
            
            //A Basic Browse Box:
            try
            {         
                /*JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(null);
                if(value == JFileChooser.APPROVE_OPTION)
                {
                            XWPFDocument docToAppend = new XWPFDocument(new FileInputStream(chooser.getSelectedFile()));
                            XWPFWordExtractor extract = new XWPFWordExtractor(docToAppend);
                            Primary.appendText(extract.getText());
               
                }
                
                save();
                Primary.selectAll();
                Primary.clear();
                reinitializePrimary();*/
                        
                            
            }
            catch(Exception e)
            {
            
            }
            
            JOptionPane.showMessageDialog(null, "Export Successful!");
        }
        else
        {
        
        }
   }
   
   public void printAdv()
   {
       final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                final TextField textField = new TextField();
                Button submit = new Button();
                Button cancel = new Button();
                final Label label = new Label();
                
                cancel.setText("Cancel");
                cancel.setAlignment(Pos.CENTER);
                submit.setText("Submit");
                submit.setAlignment(Pos.BOTTOM_RIGHT);
               
                
                final VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("Enter the master password: "));
                dialogVbox.getChildren().add(textField);
                dialogVbox.getChildren().add(submit);
                dialogVbox.getChildren().add(cancel);
                dialogVbox.getChildren().add(label);
                
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.setTitle("Security/Physician Authentication");
                dialog.show();
                
                submit.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    String password = textField.getText();
                    
                    if(password.equalsIgnoreCase("protooncogene"))
                    {
                        dialog.close();
                        
                        writeEvalToDocX(false, "");
                        
                        //OPENS the document for printing:
                        try 
                        {
                            if (Desktop.isDesktopSupported()) 
                            {
                                Desktop.getDesktop().open(new File(installationPath + "/userdata/" + firstName + lastName + dob + "/" + firstName + lastName + dob + "psychiatricevaluation.docx"));
                            }
                        } 
                        catch (IOException ioe) 
                        {
                            ioe.printStackTrace();
                        }
                    }
                    else
                    {
                        label.setText("The password you entered is incorrect. Please try again.");
                    }
                    
                    //adds files to file tracker
                 
                }
            });
                        
            cancel.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });
       

   }
   
   public void writeEvalToDocX(boolean customPath, String path)
   {
       FileOutputStream outstream;
       
                       try{
                           if(customPath == false)
                           {
                               outstream = new FileOutputStream(installationPath + "/userdata/" + firstName + lastName + dob + "/" + firstName + lastName + dob + "psychiatricevaluation.docx");
                           }
                           else
                           {
                               outstream = new FileOutputStream(path + ".docx");
                           }
                           
        XWPFDocument doc = new XWPFDocument();
        //due to the redirection of these e's, even physically, your str will begin to deteriorate. Corpse-like, in other words.
        
        /*XWPFParagraph para = doc.createParagraph();
        para.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun paraRun = para.createRun();
        paraRun.setBold(true);
        paraRun.setFontSize(12);
        //paraRun.setFontSize(16);
        paraRun.setText("Hello World");*/
        
        
        XWPFParagraph header = doc.createParagraph(); //Paragraph
        XWPFRun headerLabel = header.createRun();  //Where the text will be written from
        header.setAlignment(ParagraphAlignment.CENTER);
        headerLabel.setFontFamily("16");
        headerLabel.setBold(true);
        headerLabel.setText("Advanced Psychiatric Associates");
        headerLabel.addBreak();
        headerLabel.setText("Psychiatric Evaluation");
        headerLabel.addBreak();
        
        
        
        XWPFParagraph p = doc.createParagraph(); //Paragraph
        XWPFRun run = p.createRun();  //Where the text will be written from
        XWPFRun run2 = p.createRun();
        XWPFRun run3 = p.createRun();
        XWPFRun run4 = p.createRun();
        XWPFRun run5 = p.createRun();
        XWPFRun run6 = p.createRun();
        XWPFRun run7 = p.createRun();
        XWPFRun run8 = p.createRun();
        XWPFRun run9 = p.createRun();
        XWPFRun run10 = p.createRun();
        XWPFRun run11 = p.createRun();
        XWPFRun run12 = p.createRun();
        XWPFRun run13 = p.createRun();
        XWPFRun run14 = p.createRun();
        XWPFRun run15 = p.createRun();
        XWPFRun run16 = p.createRun();
        XWPFRun run17 = p.createRun();
        XWPFRun run18 = p.createRun();
        XWPFRun anEdit1 = p.createRun();
        XWPFRun run19 = p.createRun();
        XWPFRun run20 = p.createRun();
        XWPFRun run21 = p.createRun();
        XWPFRun run22 = p.createRun();
        XWPFRun run23 = p.createRun();
        XWPFRun run24 = p.createRun();
        XWPFRun run25 = p.createRun();
        XWPFRun run26 = p.createRun();
        XWPFRun run27 = p.createRun();
        XWPFRun run28 = p.createRun();
        XWPFRun run29 = p.createRun();
        XWPFRun run30 = p.createRun();
        XWPFRun run31 = p.createRun();  //Where the text will be written from
        XWPFRun run32 = p.createRun();
        XWPFRun run33 = p.createRun();
        XWPFRun run34 = p.createRun();
        XWPFRun run35 = p.createRun();
        XWPFRun run36 = p.createRun();
        XWPFRun run37 = p.createRun();
        XWPFRun run38 = p.createRun();
        XWPFRun run39 = p.createRun();
        XWPFRun run40 = p.createRun();
        XWPFRun run41 = p.createRun();
        XWPFRun run42 = p.createRun();
        XWPFRun run42Bold = p.createRun();
        XWPFRun runPre43 = p.createRun();
        XWPFRun run43 = p.createRun();
        XWPFRun run44 = p.createRun();
        XWPFRun run45 = p.createRun();
        XWPFRun run46 = p.createRun();
        XWPFRun run47 = p.createRun();
        XWPFRun run48 = p.createRun();
        XWPFRun run49 = p.createRun();
        XWPFRun run50 = p.createRun();
        XWPFRun run51 = p.createRun();
        XWPFRun run52 = p.createRun();
        XWPFRun run53 = p.createRun();
        XWPFRun run54 = p.createRun();
        XWPFRun run55 = p.createRun();
        XWPFRun run56 = p.createRun();
        XWPFRun run57 = p.createRun();
        XWPFRun run58 = p.createRun();
        XWPFRun run59 = p.createRun();
        XWPFRun run60 = p.createRun();
        
            run.setBold(true);
            run2.setBold(false);
            run3.setBold(true);
            run4.setBold(false);
            run5.setBold(true);
            run6.setBold(false);
            run7.setBold(true);
            run8.setBold(false);
            run9.setBold(true);
            run10.setBold(false);
            run11.setBold(true);
            run12.setBold(false);
            run13.setBold(true);
            run14.setBold(false);
            run15.setBold(true);
            run16.setBold(false);
            run17.setBold(true);
            run18.setBold(false);
            run19.setBold(true);
            run20.setBold(false);
            run21.setBold(true);
            run22.setBold(false);
            run23.setBold(true);
            run24.setBold(false);
            run25.setBold(true);
            run26.setBold(false);
            run27.setBold(true);
            run28.setBold(false);
            run29.setBold(true);
            run30.setBold(false);
            
                    /*
                        @FXML
    AnchorPane ap;
    @FXML
    TextField first, last, ageText, dobText;
    @FXML
    TextField ethnicityothertext;
    @FXML
    RadioButton male, female;
    @FXML
    RadioButton single, engaged, married, seperated, divorced, commonlawspouse, cohabiting; 
    @FXML
    CheckBox africanamerican, nativeamerican, hispanic, asian, caucasian, ethnicityother, ocd, bipolardisorder, socialphobia, panicdisorder, eatingdisorder, majordepressivedisorder, psychosis;
    @FXML
    RadioButton insurance, internet, pcp, cps, therapist, referredbyother;
    @FXML
    TextField referredbytherapisttext, referredbyothertext, reasonforreferralbox;
    @FXML
    Button sign, saveButton;
    @FXML
    Label signature;
    @FXML
    CheckBox patient, spouse, mother, father, othersourceofinformation, emp, unemp, disabilityincome;
    @FXML
    TextField othersourceofinformationbox, otherreliabilityofinformationbox;
    @FXML
    RadioButton good, fair, vague, minimizing, otherreliabilityofinformation, sano, sayes, physicalabuseno, physicalabuseyes, sexualabuseno, sexualabuseyes, violentaggressivebehaviorsno, violentaggressivebehaviorsyes, selfinjuriousbehaviorsno, selfinjuriousbehaviorsyes;
    @FXML
    TextArea historyofpresentillness, currentmedications, pastpsychiatrichistory, pasthistoryoftext, historyofmedicationtrialsinthepasttable, historyofmedicationtrialsinthepastcomments, substanceusehistory;
    @FXML
    ListView listOfProgressReports;
    @FXML
    CheckBox significantwithdrawals, dts, withdrawalseizures, historyofdetox, outpatient, inpatient, na, aa, substancetreatmentprogram, nkda, environmental;
    @FXML
    TextField inpatientbox, parents, siblings, children, education, allergiesdescriptionbox;
    @FXML
    TextArea socialhistorygeneral, familyhistoryofmentalillness, legalhistory, pastmedicalhistory;
    @FXML
    RadioButton fhomiNO, fhomiYES, eyecontactgood, eyecontactpoor, eyecontactvariable;
    @FXML
    TextField appearanceotherbox, attitudeotherbox, motoractivityotherbox;
    @FXML
    CheckBox wellgroomed, casual, disheveled, bizarre, inappropriate, appearanceother, cooperative, guarded, suspicious, withdrawn, uncooperative, hostile, defensive, attitudeother;
    @FXML
    CheckBox normal, agitated, motorretardation, hyperactive, catatonia, tremorstics, motoractivityother;
    @FXML
    CheckBox appropriate, labile, expansive, constricted, affecthappy, affectsad, blunted, flat, masking, affectnormalrange;
    @FXML
    CheckBox euthymic, depressed, dysphoric, anxious, euphoric, angry, irritable, moodsad;
    @FXML
    CheckBox normal2, delayed, soft, loud, slurred, excessive, pressured, perseverating, rapid, rambling, incoherent, disorganized, decreasedproductivity;
    @FXML
    CheckBox intact, circumstantial, loa, tangential, foi, logicalgoaldirected, thoughtblocking, ruminating, racingthoughts, thoughtinsertionwithdrawalbroadcast;
            */
            
        //alternative solution: so I guess, a seperate run for each form element, followed by an if statement
            //run is created here if(divorced.isSelected == "true"){run.setBold(true); run.setText("divorced");} else {run.setBold(false); run.setText("divorced")}
            //single, engaged, married, seperated, divorced, commonlawspouse, cohabiting; 
            
               //greater: MM, gbits, (much) lesser: id'ing
            run.setText("Patient Name: ");
            //doc.write(outstream);
        //outstream.close();
       // doc.createParagraph().createRun().setBold(true);
        
        //run.setBold(false);
        //run.setText("Ciel Phantomhive");
        
            run2.setText(first.getText() + " " + last.getText());
            run3.setText("              Age: ");
            //run2.setTextPosition(run2.getTextPosition());
            run4.setText(ageText.getText());
            run5.setText("                              DOB: ");
            run6.setText(dobText.getText());
            run6.addBreak();
            run6.addBreak();
            
            run7.setBold(false);
            run7.setText("Marital Status: ");
//single, engaged, married, seperated, divorced, commonlawspouse, cohabiting;             
            if(single.isSelected())
            {
                run7.setText("     Single");
            }
            if(engaged.isSelected())
            {
                run7.setText("     Engaged");
            }
            if(married.isSelected())
            {
                run7.setText("     Married");
            }
             if(seperated.isSelected())
            {
                run7.setText("     Seperated");
            }
            if(divorced.isSelected())
            {
                run7.setText("     Divorced");
            }
            if(commonlawspouse.isSelected())
            {
                run7.setText("     Common Law Spouse");
            }
            if(cohabiting.isSelected())
            {
                run7.setText("     Cohabiting");
            }
            run7.addBreak();
            run7.setText("Ethnicity: ");
            //africanamerican, nativeamerican, hispanic, asian, caucasian, ethnicityother, ocd, bipolardisorder, socialphobia, panicdisorder, eatingdisorder, majordepressivedisorder, psychosis;
            if(africanamerican.isSelected())
            {
                run7.setText("     African American");
            }
            if(nativeamerican.isSelected())
            {
                run7.setText("      Native American");
            }
            if(hispanic.isSelected())
            {
                run7.setText("     Hispanic");
            }
             if(asian.isSelected())
            {
                run7.setText("     Asian");
            }
            if(caucasian.isSelected())
            {
                run7.setText("     Caucasian");
            }
            if(ethnicityother.isSelected())
            {
                run7.setText("     " + ethnicityothertext.getText());
            }
            
            run7.addBreak();
            run7.setText("Sex: ");
            if(male.isSelected())
            {
                run7.setText("     Male");
            }
            if(female.isSelected())
            {
                run7.setText("      Female");
            }
            
            run7.addBreak();
            run7.setText("Referred By: ");
            //insurance, internet, pcp, cps, therapist, referredbyother
            if(insurance.isSelected())
            {
                run7.setText("     Insurance");
            }
            if(internet.isSelected())
            {
                run7.setText("     Internet");
            }
            if(pcp.isSelected())
            {
                run7.setText("     PCP");
            }
            if(cps.isSelected())
            {
                run7.setText("     CPS");
            }
            if(therapist.isSelected())
            {
                run7.setText("     therapist- " + referredbytherapisttext.getText());
            }
            if(referredbyother.isSelected())
            {
                run7.setText("     " + referredbyothertext.getText());
            }
            
            run7.addBreak();
            run7.setText("Reason for Referral: ");
            if(reasonforreferralpsychiatricevaluation.isSelected())
            {
                run7.setText("     Psychiatric Evaluation");
            }
            if(reasonforreferralmedicationmanagement.isSelected())
            {
                run7.setText("      Medication Management");
            }
            
            run7.addBreak();
            run7.setText("Source of Information: ");
            //insurance, internet, pcp, cps, therapist, referredbyother
            if(patient.isSelected())
            {
                run7.setText("     Patient");
            }
            if(spouse.isSelected())
            {
                run7.setText("     Spouse");
            }
            if(mother.isSelected())
            {
                run7.setText("     Mother");
            }
            if(father.isSelected())
            {
                run7.setText("     Father");
            }
            if(othersourceofinformation.isSelected())
            {
                run7.setText("     " + othersourceofinformationbox.getText());
            }
            
            run7.addBreak();
            run7.setText("Reliability of Information: ");
            //insurance, internet, pcp, cps, therapist, referredbyother
            if(good.isSelected())
            {
                run7.setText("     Good");
            }
            if(fair.isSelected())
            {
                run7.setText("     Fair");
            }
            if(vague.isSelected())
            {
                run7.setText("     Vague");
            }
            if(minimizing.isSelected())
            {
                run7.setText("     Minimizing");
            }
            if(otherreliabilityofinformation.isSelected())
            {
                run7.setText("     " + otherreliabilityofinformationbox.getText());
            }
            
            run7.setText(" (Options: good, fair, vague, minimizing, other)");
            run7.addBreak();
            run7.addBreak();
            run8.setBold(true);
            run8.setUnderline(UnderlinePatterns.SINGLE);
            run8.setText("History of Present Illness");
            run8.addBreak();
            run9.setBold(false);
            run9.setText(historyofpresentillness.getText());
            run9.addBreak();
            run9.addBreak();
            run10.setBold(true);
            run10.setText("Patient denied signs or symptoms of: ");
            run11.setBold(false);
            
            //ocd, bipolardisorder, socialphobia, panicdisorder, eatingdisorder, majordepressivedisorder, psychosis
            
            if(ocd.isSelected() == true)
            {
                run11.setText("     OCD");
            }
            if(bipolardisorder.isSelected() == true)
            {
                run11.setText("     Bipolar Disorder");
            }
            if(socialphobia.isSelected() == true)
            {
                run11.setText("     Social Phobia");
            }
            if(panicdisorder.isSelected() == true)
            {
                run11.setText("     Panic Disorder");
            }
            if(eatingdisorder.isSelected() == true)
            {
                run11.setText("     Eating Disorder");
            }
            if(majordepressivedisorder.isSelected() == true)
            {
                run11.setText("     Major Depressive Disorder");
            }
            if(psychosis.isSelected() == true)
            {
                run11.setText("     Psychosis");
            }
            run11.addBreak();
            run11.addBreak();
            
            run12.setUnderline(UnderlinePatterns.SINGLE);
            run12.setBold(true);
            run12.setText("Current Medications (including over-the-counter medications and vitamins)");
            run12.addBreak();
            run13.setBold(false);
            run13.setText(currentmedications.getText());
            
            run13.addBreak();
            run13.addBreak();
            
            run14.setUnderline(UnderlinePatterns.SINGLE);
            run14.setBold(true);
            run14.setText("Past Psychiatric History");
            run14.addBreak();
            run15.setBold(false);
            run15.setText(pastpsychiatrichistory.getText());
            run15.addBreak();
            run15.addBreak();
            
            run16.setBold(true);
            run16.setText("Past History Of");
            run16.addBreak();
            
            run17.setBold(false);
            run17.setText("Suicide Attempts: ");
            
            
            //past history of
        if(sano.isSelected() == true)
        {
            run17.setText("No");
        }
        else if(sayes.isSelected() == true)
        {
            run17.setText("Yes");
        }
        run17.addBreak();
        if(physicalabuseno.isSelected() == true)
        {
            run17.setText("Physical Abuse: No");
        }
        else if(physicalabuseyes.isSelected() == true)
        {
            run17.setText("Physical Abuse: Yes");
        }
        run17.addBreak();
        if(sexualabuseno.isSelected() == true)
        {
            run17.setText("Sexual Abuse: No");
        }
        else if(sexualabuseyes.isSelected() == true)
        {
            run17.setText("Sexual Abuse: Yes");
        }
        run17.addBreak();
        if(violentaggressivebehaviorsno.isSelected() == true)
        {
            run17.setText("Violent/Aggressive Behaviors: No");
        }
        else if(violentaggressivebehaviorsyes.isSelected() == true)
        {
            run17.setText("Violent/Aggressive Behaviors: Yes");
        }
        run17.addBreak();
        if(selfinjuriousbehaviorsno.isSelected() == true)
        {
            run17.setText("Self-Injurious Behaviors: No");
        }
        else if(selfinjuriousbehaviorsyes.isSelected() == true)
        {
            run17.setText("Self-Injurious Behaviors: Yes");
        }
        run17.addBreak();
        run17.setText(pasthistoryoftext.getText());
        run17.addBreak();
        run17.addBreak();
        
        run18.setUnderline(UnderlinePatterns.SINGLE);
        run18.setBold(true);
        run18.setText("History of Medication Trials in the Past");
        run18.addBreak();
        anEdit1.setBold(true);
        anEdit1.setText("Medication                                   Dosage                                 Duration");
        anEdit1.addBreak();
        
        run19.setBold(false);
        
        String fulltext = historyofmedicationtrialsinthepasttable.getText();
        String[] lines = fulltext.split("\n");
        
        for(int i = 0; i < lines.length; i++)
        {
            String[] modifyThis = lines[i].split("    ");
            for(int j = 0; j < modifyThis.length; j++)
            {
                run19.setText(modifyThis[j].trim() + "                ");
            }
            
            //run19.setText(lines[i]);
            
            run19.addBreak();
        }
        
        
        //run19.setText(lines[0]);
        run19.addBreak();
        run19.addBreak();
        run19.setText("Comments: " + historyofmedicationtrialsinthepastcomments.getText());
        run19.addBreak();
        run19.addBreak();
        
        run20.setBold(true);
        run20.setText("Substance Use History:");
        run20.addBreak();
        
        run21.setBold(false);
        run21.setText(substanceusehistory.getText());
        run21.addBreak();
        //run21.setText("Denies history of: ");
        
        String denies = "";
        
        if(significantwithdrawals.isSelected() == true)
        {
            denies = denies + "Significant Withdrawals, ";
        }
        if(dts.isSelected() == true)
        {
            denies = denies + "DTS, ";
        }
        if(withdrawalseizures.isSelected() == true)
        {
            denies = denies + "Withdrawal Seizures, ";
        }
        if(historyofdetox.isSelected() == true)
        {
            denies = denies + "History Of Detox, ";
        }
        if(outpatient.isSelected() == true)
        {
            denies = denies + "Outpatient, ";
        }
        if(inpatient.isSelected() == true)
        {
            denies = denies + "Inpatient, ";
        }
        if(na.isSelected() == true)
        {
            denies = denies + "NA, ";
        }
        if(aa.isSelected() == true)
        {
            denies = denies + "AA, ";
        }
        if(substancetreatmentprogram.isSelected() == true)
        {
            denies = denies + "Substance Treatment Program, ";
        }
        
        if(denies.length() > 2)
        {
            denies = denies.substring(0,denies.length()-2);
            denies = denies.trim();
        }
        
        //Fandom Follower- anonomously discuss your fandom
//select/create/add a new fandom group to the list/search
//browse fanart, view fandom updates, add materials to your local board
        run21.setText("Denies History Of: " + denies);
        run21.addBreak();
        run21.addBreak();
        
        run22.setUnderline(UnderlinePatterns.SINGLE);
        run22.setBold(true);
        run22.setText("Social History: ");
        run22.addBreak();
        //y the fm, m homu cov e's, ah chained, ank snk
        //
        //ASP.NET in visual studio, eclipse, netbeans
        
        //dk y lol
        run23.setBold(false);
        run23.setText(socialhistorygeneral.getText());
        run23.addBreak();
        run23.addBreak();
        run23.setText("Parents: " + parents.getText());
        run23.addBreak();
        run23.setText("Siblings: " + siblings.getText());
        run23.addBreak();
        run23.setText("Children: " + children.getText());
        run23.addBreak();
        
        String faHist;
        if(fhomiNO.isSelected() == true)
        {
            faHist = "No";
        }
        else
        {
            faHist = "Yes";
        }
        
        run23.setText("Family History of Mental Illness? " + faHist);
        run23.addBreak();
        run23.setText(familyhistoryofmentalillness.getText());
        run23.addBreak();
        run23.addBreak();
        run23.setText(education.getText());
        run23.addBreak();
        
        String e = "";
        if(emp.isSelected() == true)
        {
            e = e + "Employed, ";
        }
        if(unemp.isSelected() == true)
        {
            e = e + "Unemployed, ";
        }
        if(disabilityincome.isSelected() == true)
        {
            e = e + "Disability Income, ";
        }
        
        if(e.length() > 2)
        {
            e = e.substring(0,e.length()-2);
            e = e.trim();
        }
    
        run23.setText("Employment: " + e);
        run23.addBreak();
        
        run23.setText(legalhistory.getText());
        run23.addBreak();
        run23.addBreak();
        
        run24.setUnderline(UnderlinePatterns.SINGLE);
        run24.setBold(true);
        run24.setText("Past Medical History");
        run24.addBreak();
        run25.setBold(false);
        run25.setText(pastmedicalhistory.getText());
        run25.addBreak();
        run26.setBold(true);
        run26.setText("Allergies: ");
        String allergies = " ";
        
        if(nkda.isSelected() == true)
        {
            allergies = allergies + "nkda, ";
        }
        if(environmental.isSelected() == true)
        {
            allergies = allergies + "environmental, ";
        }
        
        if(allergies.length() > 2)
        {
            allergies = allergies.substring(0,allergies.length()-2);
            allergies = allergies.trim();
        }
        
        
        run27.setBold(false);
        run27.setText(allergies);
        run27.addBreak();
        run27.setText(allergiesdescriptionbox.getText());
        run27.addBreak();
        run27.addBreak();
        
        run28.setUnderline(UnderlinePatterns.SINGLE);
        run28.setBold(true);
        run28.setText("Mental Status Examination:");
        run29.addBreak();
        run30.setBold(false);
        
        String appearance = " ";
        
        if(wellgroomed.isSelected() == true)
        {
            appearance = appearance + "Well Groomed, ";
        }
        if(casual.isSelected() == true)
        {
            appearance = appearance + "Casual, ";
        }
        if(disheveled.isSelected() == true)
        {
            appearance = appearance + "Disheveled, ";
        }
        if(bizarre.isSelected() == true)
        {
            appearance = appearance + "Bizarre, ";
        }
        if(inappropriate.isSelected() == true)
        {
            appearance = appearance + "Inappropriate,";
        }
        if(appearanceother.isSelected() == true)
        {
            appearance = appearance + "Other: ";
        }
        
        if(appearance.length() > 2)
        {
            appearance = appearance.substring(0,appearance.length()-2);
            appearance = appearance.trim();
        }
    
        run30.setText("Appearance: " + appearance);
        if(appearanceother.isSelected())
        {
            run30.setText(" - " + appearanceotherbox.getText());
        }
        
        run30.addBreak();        
        
        String eC = "blah";
        
        if(eyecontactgood.isSelected() == true)
        {
            eC = "Good";
        }
        if(eyecontactpoor.isSelected() == true)
        {
            eC = "Poor";
        }
        if(eyecontactvariable.isSelected() == true)
        {
            eC = "Variable";
        }
        
        run30.setText("Eye Contact: " + eC);
        run30.addBreak();
        
        String attitude = " ";
        
        if(cooperative.isSelected() == true)
        {
            attitude = attitude + "Cooperative, ";
        }
        if(guarded.isSelected() == true)
        {
            attitude = attitude + "Guarded, ";
        }
        if(suspicious.isSelected() == true)
        {
            attitude = attitude + "Suspicious, ";
        }
        if(withdrawn.isSelected() == true)
        {
            attitude = attitude + "Withdrawn, ";
        }
        if(uncooperative.isSelected() == true)
        {
            attitude = attitude + "Uncooperative, ";
        }
        if(hostile.isSelected() == true)
        {
            attitude = attitude + "Hostile, ";
        }
        if(defensive.isSelected() == true)
        {
            attitude = attitude + "Defensive, ";
        }
        if(attitudeother.isSelected() == true)
        {
            attitude = attitude + "Other: ";
        }
        
        if(attitude.length() > 2)
        {
            attitude = attitude.substring(0,attitude.length()-2);
            attitude = attitude.trim();
        }
    
        run30.setText("Attitude: " + attitude);
        if(attitudeother.isSelected())
        {
            run30.setText(" - " + attitudeotherbox.getText());
        }
        run30.addBreak();
        
        String motoractivity = " ";
        
        if(normal.isSelected() == true)
        {
            motoractivity = motoractivity + "Normal, ";
        }
        if(agitated.isSelected() == true)
        {
            motoractivity = motoractivity + "Agitated, ";
        }
        if(motorretardation.isSelected() == true)
        {
            motoractivity = motoractivity + "Motor Retardation, ";
        }
        if(hyperactive.isSelected() == true)
        {
            motoractivity = motoractivity + "Hyperactive, ";
        }
        if(catatonia.isSelected() == true)
        {
            motoractivity = motoractivity + "Catatonia, ";
        }
        if(tremorstics.isSelected() == true)
        {
            motoractivity = motoractivity + "Tremors/Tics, ";
        }
        if(motoractivityother.isSelected() == true)
        {
            motoractivity = motoractivity + "Other: ";
        }
        
        if(motoractivity.length() > 2)
        {
            motoractivity = motoractivity.substring(0,motoractivity.length()-2);
            motoractivity = motoractivity.trim();
        }
        
        run30.setText("Motor Activity: " + motoractivity);
        if(motoractivityother.isSelected())
        {
            run30.setText(" - " + motoractivityotherbox.getText());
        }
        
        run30.addBreak();
        
        String affect = " ";
        
        if(appropriate.isSelected() == true)
        {
            affect = affect + "Appropriate, ";
        }
        if(labile.isSelected() == true)
        {
            affect = affect + "Labile, ";
        }
        if(expansive.isSelected() == true)
        {
            affect = affect + "Expansive, ";
        }
        if(constricted.isSelected() == true)
        {
            affect = affect + "Constricted, ";
        }
        if(affecthappy.isSelected() == true)
        {
            affect = affect + "Happy, ";
        }
        if(affectsad.isSelected() == true)
        {
            affect = affect + "Sad, ";
        }
        if(blunted.isSelected() == true)
        {
            affect = affect + "Blunted, ";
        }
        if(flat.isSelected() == true)
        {
            affect = affect + "Flat, ";
        }
        if(masking.isSelected() == true)
        {
            affect = affect + "Masking, ";
        }
        if(affectnormalrange.isSelected() == true)
        {
            affect = affect + "Normal Range, ";
        }
        
        if(affect.length() > 2)
        {
            affect = affect.substring(0,affect.length()-2);
            affect = affect.trim();
        }
    
        run30.setText("Affect: " + affect);
        run30.addBreak();
        
        String mood = " ";
        
        if(euthymic.isSelected() == true)
        {
            mood = mood + "Euthymic, ";
        }
        if(depressed.isSelected() == true)
        {
            mood = mood + "Depressed, ";
        }
        if(dysphoric.isSelected() == true)
        {
            mood = mood + "Dysphoric, ";
        }
        if(anxious.isSelected() == true)
        {
            mood = mood + "Anxious, ";
        }
        if(euphoric.isSelected() == true)
        {
            mood = mood + "Euphoric, ";
        }
        if(angry.isSelected() == true)
        {
            mood = mood + "Angry, ";
        }
        if(irritable.isSelected() == true)
        {
            mood = mood + "Irritable, ";
        }
        if(moodsad.isSelected() == true)
        {
            mood = mood + "Sad, ";
        }
        
        if(mood.length() > 2)
        {
            mood = mood.substring(0,mood.length()-2);
            mood = mood.trim();
        }
    
        run30.setText("Mood: " + mood);
        run30.addBreak();
        
        String speech = " ";
        
        if(normal2.isSelected() == true)
        {
            speech = speech + "Normal, ";
        }
        if(delayed.isSelected() == true)
        {
            speech = speech + "Delayed, ";
        }
        if(soft.isSelected() == true)
        {
            speech = speech + "Soft, ";
        }
        if(loud.isSelected() == true)
        {
            speech = speech + "Loud, ";
        }
        if(slurred.isSelected() == true)
        {
            speech = speech + "Slurred, ";
        }
        if(excessive.isSelected() == true)
        {
            speech = speech + "Excessive, ";
        }
        if(pressured.isSelected() == true)
        {
            speech = speech + "Pressured, ";
        }
        if(perseverating.isSelected() == true)
        {
            speech = speech + "Perseverating, ";
        }
        if(rapid.isSelected() == true)
        {
            speech = speech + "Rapid, ";
        }
        if(rambling.isSelected() == true)
        {
            speech = speech + "Rambling, ";
        }
        if(incoherent.isSelected() == true)
        {
            speech = speech + "Incoherent, ";
        }
        if(disorganized.isSelected() == true)
        {
            speech = speech + "Disorganized, ";
        }
        if(decreasedproductivity.isSelected() == true)
        {
            speech = speech + "Decreased Productivity, ";
        }
        
        if(speech.length() > 2)
        {
            speech = speech.substring(0,speech.length()-2);
            speech = speech.trim();
        }
    
        run30.setText("Speech: " + speech);
        run30.addBreak();
        
        String per = " ";
        
        if(visualhallucinations.isSelected() == true)
        {
            per = per + "Visual Hallucinations, ";
        }
        if(auditoryhallucinations.isSelected() == true)
        {
            per = per + "Auditory Hallucinations, ";
        }
        if(depersonalization.isSelected() == true)
        {
            per = per + "Depersonalization, ";
        }
        if(derealization.isSelected() == true)
        {
            per = per + "Derealization, ";
        }
        if(commandah.isSelected() == true)
        {
            per = per + "Command AH, ";
        }
        if(delusions2.isSelected() == true)
        {
            per = per + "Delusions, ";
        }
        if(illusions.isSelected() == true)
        {
            per = per + "Illusions, ";
        }
        if(perceptionnoimpairment.isSelected() == true)
        {
            per = per + "No Impairment, ";
        }        
        
        if(per.length() > 2)
        {
            per = per.substring(0,per.length()-2);
            per = per.trim();
        }
            
        run30.setText("Perception: " + per);
        run30.addBreak();
        
        String thoughtProcess = " ";
        
        if(intact.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "Intact, ";
        }
        if(circumstantial.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "Circumstantial, ";
        }
        if(loa.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "LOA, ";
        }
        if(tangential.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "Tangential, ";
        }
        if(foi.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "FOI, ";
        }
        if(logicalgoaldirected.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "Logical Goal Directed, ";
        }
        if(thoughtblocking.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "Thought Blocking, ";
        }
        if(ruminating.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "Ruminating, ";
        }
        if(racingthoughts.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "Racing Thoughts, ";
        }
        if(thoughtinsertionwithdrawalbroadcast.isSelected() == true)
        {
            thoughtProcess = thoughtProcess + "Thought Insertion/Withdrawal/Broadcast, ";
        }
        
        if(thoughtProcess.length() > 2)
        {
            thoughtProcess = thoughtProcess.substring(0,thoughtProcess.length()-2);
            thoughtProcess = thoughtProcess.trim();
        }
    
        run30.setText("Thought Process: " + thoughtProcess);
        run30.addBreak();
        
        String thoughtContent = "";
        //hummus/tahini, "steak", p seeds/walnuts, k p + sm papr; curry, hazelnut meal + a fig + 1tsp pb + 1tsp white flour + a few drops of maple syrup
        //get some (pepper) A1!!!
        //bbq sauce
        if(logicalcoherent.isSelected() == true)
        {
            thoughtContent = thoughtContent + "Logical Coherent, ";
        }
        if(povertyofcontent.isSelected() == true)
        {
            thoughtContent = thoughtContent + "Poverty Of Content, ";
        }
        if(ideasofreference.isSelected() == true)
        {
            thoughtContent = thoughtContent + "Ideas Of Reference, ";
        }
        if(obsessions.isSelected() == true)
        {
            thoughtContent = thoughtContent + "Obsessions, ";
        }
        if(phobias.isSelected() == true)
        {
            thoughtContent = thoughtContent + "Phobias, ";
        }
        if(paranoidideation.isSelected() == true)
        {
            thoughtContent = thoughtContent + "Paranoid Ideation, ";
        }
        if(delusions.isSelected() == true)
        {
            thoughtContent = thoughtContent + "Delusions, ";
        }
        
        if(thoughtContent.length() > 2)
        {
            thoughtContent = thoughtContent.substring(0,thoughtContent.length()-2);
            thoughtContent = thoughtContent.trim();
        }
    
        run30.setText("Thought Content: " + thoughtContent);
        if(delusions.isSelected())
        {
            run30.setText(" - " + delusionsbox.getText());
        }
        run30.addBreak();
        
        
        String suicidality = " ";
        
        if(suicidalitydenied.isSelected() == true)
        {
            suicidality = suicidality + "Suicidality Denied, ";
        }
        if(suicidalityideation.isSelected() == true)
        {
            suicidality = suicidality + "Suicidality Ideation, ";
        }
        if(suicidalityintent.isSelected() == true)
        {
            suicidality = suicidality + "Suicidality Intent, ";
        }
        if(suicidalityplan.isSelected() == true)
        {
            suicidality = suicidality + "Suicidality Plan: ";
        }
        
        if(suicidality.length() > 2)
        {
            suicidality = suicidality.substring(0,suicidality.length()-2);
            suicidality = suicidality.trim();
        }
    
        run30.setText("Suicidality: " + suicidality);
        if(suicidalityplan.isSelected())
        {
            run30.setText(" - " + suicidalityplanbox.getText());
        }
        run30.addBreak();
        
        String homicidality = " ";
        
        if(homicidalitydenied.isSelected() == true)
        {
            homicidality = homicidality + "Homicidality Denied, ";
        }
        if(homicidalityideation.isSelected() == true)
        {
            homicidality = homicidality + "Homicidality Ideation, ";
        }
        if(homicidalityintent.isSelected() == true)
        {
            homicidality = homicidality + "Homicidality Intent, ";
        }
        if(homicidalityplan.isSelected() == true)
        {
            homicidality = homicidality + "Homicidality Plan: ";
        }
        
        if(homicidality.length() > 2)
        {
            homicidality = homicidality.substring(0,homicidality.length()-2);
            homicidality = homicidality.trim();
        }
    
        run30.setText("Homicidality: " + homicidality);
        if(homicidalityplan.isSelected())
        {
            run30.setText(" - " + homicidalityplanbox.getText());
        }
        run30.addBreak();
        if(suicidalityhomicidalitycomments.getText().length() >= 2)
        {
            run30.setText(" \t Comments - " + suicidalityhomicidalitycomments.getText());
        }
        run30.addBreak();
        
        String orientation = " ";
        
        if(fullyoriented.isSelected() == true)
        {
            orientation = orientation + "Fully Oriented, ";
        }
        if(disoriented.isSelected() == true)
        {
            orientation = orientation + "Disoriented: ";
        }
        if(person.isSelected() == true)
        {
            orientation = orientation + "Person, ";
        }
        if(place.isSelected() == true)
        {
            orientation = orientation + "Place, ";
        }
        if(time.isSelected() == true)
        {
            orientation = orientation + "Time, ";
        }
        
        if(orientation.length() > 2)
        {
            orientation = orientation.substring(0,orientation.length()-2);
            orientation = orientation.trim();
        }
    
        run30.setText("Orientation: " + orientation);
        run30.addBreak();
        
        String stm = " ";
        
        //shorttermmemorywithinnormallimits, shorttermmermorydeficits, longtermmemorywithinnormallimits,longtermmemorydeficits, shorttermmemorydeficitsbox, longtermmemorydeficitsbox
        if(shorttermmemorywithinnormallimits.isSelected() == true)
        {
            stm = stm + "Within Normal Limits, ";
        }
        if(shorttermmemorydeficits.isSelected() == true)
        {
            stm = stm + "Deficits, ";
        }
        
        if(stm.length() > 2)
        {
            stm = stm.substring(0,stm.length()-2);
            stm = stm.trim();
        }
    
        run30.setText("Short Term Memory: " + stm);
        if(shorttermmemorydeficits.isSelected() == true)
        {
            run30.setText(" - " + shorttermmemorydeficitsbox.getText());
        }
        run30.addBreak();
        
        
        String ltm = " ";
                
        if(longtermmemorywithinnormallimits.isSelected() == true)
        {
            ltm = ltm + "Within Normal Limits, ";
        }
        if(longtermmemorydeficits.isSelected() == true)
        {
            ltm = ltm + "Deficits, ";
        }
        
        if(ltm.length() > 2)
        {
            ltm = ltm.substring(0,ltm.length()-2);
            ltm = ltm.trim();
        }
    
        run30.setText("Long Term Memory: " + ltm);
        if(longtermmemorydeficits.isSelected() == true)
        {
            run30.setText(" - " + longtermmemorydeficitsbox.getText());
        }
        run30.addBreak();
        
        
        String gfok = " ";
        
        if(generalfundofknowledgewithinnormallimits.isSelected() == true)
        {
            gfok = gfok + "Within Normal Limits, ";
        }
        if(generalfundofknowledgedeficits.isSelected() == true)
        {
            gfok = gfok + "Deficits, ";
        }
        
        if(gfok.length() > 2)
        {
            gfok = gfok.substring(0,gfok.length()-2);
            gfok = gfok.trim();
        }
    
        run30.setText("General Fund of Knowledge: " + gfok);
        if(generalfundofknowledgedeficits.isSelected() == true)
        {
            run30.setText(" - " + generalfundofknowledgedeficitsbox.getText());
        }
        run30.addBreak();
        
        
        String intellect = " ";
        
        if(intellectaboveaverage.isSelected() == true)
        {
            intellect = intellect + "Above Average, ";
        }
        if(intellectaverage.isSelected() == true)
        {
            intellect = intellect + "Average, ";
        }
        if(intellectbelowaverage.isSelected() == true)
        {
            intellect = intellect + "Below Average, ";
        }
        
        if(intellect.length() > 2)
        {
            intellect = intellect.substring(0,intellect.length()-2);
            intellect = intellect.trim();
        }
            
    
        run30.setText("Intellect: " + intellect);
        if(intellectbelowaverage.isSelected() == true)
        {
            run30.setText(" - " + intellectbelowaveragebox.getText());
        }
        run30.addBreak();
        
        
        String abstraction = " ";
        
        if(abstractionintact.isSelected() == true)
        {
            abstraction = abstraction + "Intact, ";
        }
        if(abstractionconcrete.isSelected() == true)
        {
            abstraction = abstraction + "Concrete, ";
        }
        if(abstractionidiosyncratic.isSelected() == true)
        {
            abstraction = abstraction + "Idiosyncratic, ";
        }
        
        if(abstraction.length() > 2)
        {
            abstraction = abstraction.substring(0,abstraction.length()-2);
            abstraction = abstraction.trim();
        }
    
        run30.setText("Abstraction: " + abstraction);
        run30.addBreak();
        
        
        String judgement = " ";
        
        if(judgementintact.isSelected() == true)
        {
            judgement = judgement + "Intact, ";
        }
        if(judgementimpaired.isSelected() == true)
        {
            judgement = judgement + "Impaired -  ";
        }
        if(judgementminimal.isSelected() == true)
        {
            judgement = judgement + "Minimal, ";
        }
        if(judgementmoderate.isSelected() == true)
        {
            judgement = judgement + "Moderate, ";
        }
        if(judgementsevere.isSelected() == true)
        {
            judgement = judgement + "Severe, ";
        }
        
        if(judgement.length() > 2)
        {
            judgement = judgement.substring(0,judgement.length()-2);
            judgement = judgement.trim();
        }
    
        run30.setText("Judgement: " + judgement);
        run30.addBreak();
        
        
        String insight = " ";
        
        if(insightintact.isSelected() == true)
        {
            insight = insight + "Intact, ";
        }
        if(insightimpaired.isSelected() == true)
        {
            insight = insight + "Impaired -  ";
        }
        if(insightminimal.isSelected() == true)
        {
            insight = insight + "Minimal, ";
        }
        if(insightmoderate.isSelected() == true)
        {
            insight = insight + "Moderate, ";
        }
        if(insightsevere.isSelected() == true)
        {
            insight = insight + "Severe, ";
        }
        
        if(insight.length() > 2)
        {    
            insight = insight.substring(0,insight.length()-2);
            insight = insight.trim();
        }
            
        run30.setText("Insight: " + insight);
        run30.addBreak();
        run30.addBreak();
        
        run31.setUnderline(UnderlinePatterns.SINGLE);
        run31.setBold(true);
        run31.setText("Clinical Notes pertaining to MSE");
        run31.addBreak();
        run32.setBold(false);
        run32.setText(clinicalnotes.getText());
        run32.addBreak();
        run32.addBreak();
        
        run33.setBold(true);
        run33.setText("Diagnosis: ");
        run33.addBreak();
        
        run34.setBold(false);
        run34.setText("Axis I: " + axis1.getText());
        run34.addBreak();
        run34.setText("Axis II: " + axis2.getText());
        run34.addBreak();
        run34.setText("Axis III: " + axis3.getText());
        run34.addBreak();
        run34.setText("Axis IV: " + axis4.getText());
        run34.addBreak();
        
        String a4cb = " ";
        
        if(a4none.isSelected() == true)
        {
            a4cb = a4cb + "None, ";
        }
        if(a4primarysupportgroup.isSelected() == true)
        {
            a4cb = a4cb + "Primary Support Group, ";
        }
        if(a4partnerrelationalproblems.isSelected() == true)
        {
            a4cb = a4cb + "Partner Relational Problems, ";
        }
        if(a4parentchildrelationalproblems.isSelected() == true)
        {
            a4cb = a4cb + "Parent Child Relational Problems, ";
        }
        if(a4socialenvironment.isSelected() == true)
        {
            a4cb = a4cb + "Social Environment, ";
        }
        //a4occupation, a4economics, a4legalsystem, a4education, a4housing, 
       //a4noncompliancewithtreatment, a4other, axis5none;
        if(a4occupation.isSelected() == true)
        {
            a4cb = a4cb + "Occupation, ";
        }
        if(a4economics.isSelected() == true)
        {
            a4cb = a4cb + "Economics, ";
        }
        if(a4legalsystem.isSelected() == true)
        {
            a4cb = a4cb + "Legal System, ";
        }
        if(a4education.isSelected() == true)
        {
            a4cb = a4cb + "Education, ";
        }
        if(a4housing.isSelected() == true)
        {
            a4cb = a4cb + "Housing, ";
        }
        if(a4noncompliancewithtreatment.isSelected() == true)
        {
            a4cb = a4cb + "Noncompliance With Treatment, ";
        }
        if(a4other.isSelected() == true)
        {
            a4cb = a4cb + "Other, ";
        }
        
        if(a4cb.length() > 2)
        {
            a4cb = a4cb.substring(0,a4cb.length()-2);
            a4cb = a4cb.trim();
        }
    
        run34.setText(a4cb);
        if(a4other.isSelected() == true)
        {
            run34.setText(" - " + axis4otherbox.getText());
        }
        run34.addBreak();
        
        run34.setText("Axis V: GAF " + "Current: " + axis5current.getText() + "  Highest in Past Year: " + axis5highestinpastyear.getText());
        if(axis5none.isSelected() == true)
        {
            run34.setText("   None");
        }
        run34.addBreak();
        run34.addBreak();

        run35.setUnderline(UnderlinePatterns.SINGLE);
        run35.setBold(true);
        run35.setText("Reccommendations and Plans");
        run35.addBreak();
        
        run36.setBold(false);
        run36.setText("Diagnosis and treatment options discussed with the patient? - ");
        if(treatmentplancheckbox1.isSelected() == true)
        {
            run36.setText("Yes");
        }
        else
        {
            run36.setText("No");
        }
        run36.addBreak();
        
        run36.addBreak();
        
        //run36.setText("Treatment Plan: " + treatmentplanbox1.getText());
        
        run36.setText("Treatment Plan: ");
        
        String[] tpLines = treatmentplanbox1.getText().split("\n");
        
        for(int i = 0; i < tpLines.length; i++)
        {
            run36.setText(tpLines[i]);
            run36.addBreak();
        }
        
        
        run36.addBreak();
        run36.addBreak();
        
        run36.setText("Discussed that any overuse or abuse of prescription Benzodiazepines could result in patient being discharged from the practice. - ");
        if(treatmentplancheckbox2.isSelected() == true)
        {
            run36.setText("Yes");
        }
        else
        {
            run36.setText("No");
        }
        run36.addBreak();
        
        run36.setText("Nevada Prescription Monitoring Board Reviewed? - ");
        if(treatmentplancheckbox3.isSelected() == true)
        {
            run36.setText("Yes");
        }
        else
        {
            run36.setText("No");
        }
        run36.addBreak();
        run36.setText(treatmentplantextfield.getText());
        run36.addBreak();
        run36.addBreak();
        
        run37.setUnderline(UnderlinePatterns.SINGLE);
        run37.setItalic(true);
        run37.setText("Medication Prescribed");
        run37.addBreak();
        
        run38.setBold(false);
        run38.setText(treatmentplanbox2.getText());
        run38.addBreak();
        run38.addBreak();
        
        run39.setUnderline(UnderlinePatterns.SINGLE);
        run39.setBold(true);
        run39.setText("Side Effects Discussed: ");
        run39.addBreak();
        
        run40.setBold(false);
        
        String se = " ";
        
        if(riskforreboundhypertension.isSelected() == true)
        {
            se = se + "Risk For Rebound Hypertension, ";
        }
        if(complexsleeprelatedbehavior.isSelected() == true)
        {
            se = se + "Complex Sleep Related Behavior, ";
        }
        if(ssoftoxicity.isSelected() == true)
        {
            se = se + "S/S of Toxicity, ";
        }
        if(withdrawalsyndrome.isSelected() == true)
        {
            se = se + "Withdrawal Syndrome, ";
        }
        if(riskforaddiction.isSelected() == true)
        {
            se = se + "Risk for Addiction, ";
        }
        if(seizures.isSelected() == true)
        {
            se = se + "Seizures, ";
        }
        if(prolongedqtc.isSelected() == true)
        {
            se = se + "Prolonged QTC, ";
        }
        if(tardivedyskinesiadystonia.isSelected() == true)
        {
            se = se + "Tardive Dyskinesia/Dystonia, ";
        }
        if(acuteneurologicalse.isSelected() == true)
        {
            se = se + "Acute Neurological SE, ";
        }
        if(metabolicsyndrome.isSelected() == true)
        {
            se = se + "Metabolic Syndrome, ";
        }
        
        //decreasedeffectivenessofobc, teratogenicity, hyponatremia, hypothyroidism, rashsjsyndrome, 
        //weightgainloss, constipation, drymouth, increasedriskofsi, hyperprolactinemia, serotoninsyndrome, 
        //hairloss, hypotension, htn, dizziness, insomnia, sedation, sexual, gi;
        if(decreasedeffectivenessofobc.isSelected() == true)
        {
            se = se + "Decreased Effectiveness of OBC, ";
        }
        if(teratogenicity.isSelected() == true)
        {
            se = se + "Teratogenicity- ";
            se = se + sebox2.getText() + ", ";
        }
        if(hyponatremia.isSelected() == true)
        {
            se = se + "Hyponatremia, ";
        }
        if(hypothyroidism.isSelected() == true)
        {
            se = se + "Hypothyroidism, ";
        }
        if(rashsjsyndrome.isSelected() == true)
        {
            se = se + "Rash - SJ Syndrome- ";
            se = se + sebox1.getText() + ", ";
        }
        if(weightgainloss.isSelected() == true)
        {
            se = se + "Weight Gain/Loss, ";
        }
        if(constipation.isSelected() == true)
        {
            se = se + "Constipation, ";
        }
        if(drymouth.isSelected() == true)
        {
            se = se + "Dry Mouth, ";
        }
        if(increasedriskofsi.isSelected() == true)
        {
            se = se + "Increased Risk of SI, ";
        }
        if(hyperprolactinemia.isSelected() == true)
        {
            se = se + "Hyperprolactinemia, ";
        }
        if(serotoninsyndrome.isSelected() == true)
        {
            se = se + "Serotonin Syndrome, ";
        }
        if(hairloss.isSelected() == true)
        {
            se = se + "Hair Loss, ";
        }
        if(hypotension.isSelected() == true)
        {
            se = se + "Hypotension, ";
        }
        if(htn.isSelected() == true)
        {
            se = se + "HTN, ";
        }
        if(dizziness.isSelected() == true)
        {
            se = se + "Dizziness, ";
        }
        if(insomnia.isSelected() == true)
        {
            se = se + "Insomnia, ";
        }
        if(sedation.isSelected() == true)
        {
            se = se + "Sedation, ";
        }
        if(sexual.isSelected() == true)
        {
            se = se + "Sexual, ";
        }
        if(gi.isSelected() == true)
        {
            se = se + "GI, ";
        }
        
        if(se.length() > 2)
        {
            se = se.substring(0,se.length()-2);
            se = se.trim();
        }
    
        run40.setText(se);
        run40.addBreak();
        run40.addBreak();
        
        run41.setUnderline(UnderlinePatterns.SINGLE);
        run41.setBold(true);
        run41.setText("Labs:");
        run41.addBreak();
        
        run42.setBold(false);
        
        
        String labs = " ";
        
        if(vitd.isSelected() == true)
        {
            labs = labs + "Vit D, ";
        }
        
        if(hivscreen.isSelected() == true)
        {
            labs = labs + "HIV Screen, ";
        }
        if(vitaminb12folicacid.isSelected() == true)
        {
            labs = labs + "Vitamin B12/Folic Acid, ";
        }
        
        if(ua.isSelected() == true)
        {
            labs = labs + "UA, ";
        }
        
        if(uds.isSelected() == true)
        {
            labs = labs + "UDS, ";
        }
        
        if(selectrolyte.isSelected() == true)
        {
            labs = labs + "S Electrolyte, ";
        }
        
        if(lithium.isSelected() == true)
        {
            labs = labs + "Lithium, ";
        }
        
        if(lamictallevel.isSelected() == true)
        {
            labs = labs + "Lamictal Level, ";
        }
        
        if(trileptallevel.isSelected() == true)
        {
            labs = labs + "Trileptal Level, ";
        }
        
        if(depakotelevel.isSelected() == true)
        {
            labs = labs + "Depakote Level, ";
        }
        
        if(bmp.isSelected() == true)
        {
            labs = labs + "BMP, ";
        }
        
        if(tft.isSelected() == true)
        {
            labs = labs + "TFT, ";
        }
        
        if(lft.isSelected() == true)
        {
            labs = labs + "LFT, ";
        }
        
        if(hgba1c.isSelected() == true)
        {
            labs = labs + "HGB A1C, ";
        }
        
        if(lipidprofile.isSelected() == true)
        {
            labs = labs + "Lipid Profile, ";
        }
        
        if(cmp.isSelected() == true)
        {
            labs = labs + "CMP, ";
        }
        
        if(cbc.isSelected() == true)
        {
            labs = labs + "CBC, ";
        }
        if(blanklabs.isSelected() == true)
        {
            labs = labs + labstextfield.getText() + ", ";
        }
        
        if(labs.length() > 2)
        {
            labs = labs.substring(0,labs.length()-2);
            labs = labs.trim();
        }
            
        run42.setText(labs);
        
        
        run42.addBreak();
        run42.addBreak();
        
        run42Bold.setBold(true);
        run42Bold.setText("Verbal informed consent obtained from patient for trial of " + ebox1.getText() + ": ");
        
        if(yes1.isSelected() == true)
        {
            run42Bold.setText("Yes");
        }
        if(no1.isSelected() == true)
        {
            run42Bold.setText("No");
        }
        
        run42Bold.addBreak();
        
        run42Bold.setText("Risks/benefits of prescribed medications discussed with patient: ");
        
        if(yes2.isSelected() == true)
        {
            run42Bold.setText("Yes");
        }
        if(no2.isSelected())
        {
            run42Bold.setText("No");
        }
        
        run42Bold.addBreak();
        run42Bold.addBreak();
        
        String end = "", end2 = "";
        
        if(riskofsuicidelow.isSelected() == true)
        {
            end = end + "Low, ";
        }
        
        if(riskofsuicidemoderate.isSelected() == true)
        {
            end = end + "Moderate, ";
        }
        
        if(riskofsuicidehigh.isSelected() == true)
        {
            end = end + "High, ";
        }
        
        if(riskofsuicidemodifiableriskfactorsaddressed.isSelected() == true)
        {
            end = end + "Modifiable Risk Factors Addressed, ";
        }
        
        if(dangertootherslow.isSelected() == true)
        {
            end2 = end2 + "Low, ";
        }
        
        if(dangertoothersmoderate.isSelected() == true)
        {
            end2 = end2 + "Moderate, ";
        }
        
        if(dangertoothershigh.isSelected() == true)
        {
            end2 = end2 + "High, ";
        }
        
        if(dangertoothersmodifiableriskfactorsaddressed.isSelected() == true)
        {
            end2 = end2 + "Modifiable Risk Factors Addressed, ";
        }
        
        if(end.length() > 2)
        {
            end = end.substring(0,end.length()-2);
            end = end.trim();
        }
        
        if(end2.length() > 2)
        {
            end2 = end2.substring(0,end2.length()-2);
            end2 = end2.trim();
        }
    
        run42Bold.setText("Risk of Suicide/Self-Harm: " + end);
        run42Bold.addBreak();
        run42Bold.setText("Danger to others: " + end2);
        run42Bold.addBreak();
        run42Bold.addBreak();
        run42Bold.addBreak();
        run42Bold.addBreak();
        
        if(partnerSigned == true)
        {
            if(businesscardprovided.isSelected())
            {
                runPre43.setText("Business Card Provided: Yes");
                runPre43.addBreak();
            }
            else
            {
                runPre43.setText("Business Card Provided: No");
                runPre43.addBreak();
            }

            if(discussedassistant.isSelected())
            {
                if(who.getText() != null || who.getText() != "" || who.getText() != " ")
                {
                    runPre43.setText("Discussed with [" + who.getText() + "] accompanying the patient that I am a physician assistant");
                    runPre43.addBreak();
                }
                else
                {
                    runPre43.setText("Discussed with patient that I am a physician assistant");
                    runPre43.addBreak();
                }

            }
            else
            {

            }
            
            //runPre43.addBreak();
            //runPre43.addBreak();
            
            run43.setBold(true);
            run43.setText("Signature: This Document Has Been Digitally Signed By Izabella Ostolski, PA-C            Date: ");
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Date date = new Date();
            String alpha = dateFormat.format(date);
            run43.setText(alpha);
        }
        
        if(dccSigned == true)
        {
            run44.addBreak();
            run44.addBreak();
            run44.addBreak();
            run44.setBold(false);
            run44.setItalic(true);
            //run44.setTextPosition(20);
            run44.setText("I have reviewed and discussed the case. I agree with the current treatment plan.");
            run44.addBreak();
            //run44.setText(signaturenotes.getText());
            //run44.addBreak();
            run46.setBold(true);
            run46.setText("Signature: This Document Has Been Digitally Signed By David Zhvikov MD           Date: ");
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Date date = new Date();
            String alpha = dateFormat.format(date);
            run46.setText(alpha);
            
            try{
            //code prac'k wrkoxx
      /*FileInputStream is = new FileInputStream("C:/Users/Quiggy/Desktop/javascript-based psych forms/sig.bmp");
      //doc.addPictureData(IOUtils.toByteArray(is), doc.PICTURE_TYPE_BMP)
      
      XWPFParagraph title = doc.createParagraph();    
      XWPFRun imageRun = title.createRun();
      imageRun.setText("Fig.1 A Natural Scene");
      imageRun.setBold(true);
      title.setAlignment(ParagraphAlignment.CENTER);
      imageRun.addPicture(is, XWPFDocument.PICTURE_TYPE_BMP, "sig.bmp", 300, 200);*/
      

                
                
                
                    //String picId = "C:/Users/Quiggy/Desktop/javascript-based psych forms/sig1.png";
                            //doc.addPictureData(new FileInputStream("C:/Users/Quiggy/Desktop/javascript-based psych forms/sig1.png"), XWPFDocument.PICTURE_TYPE_PNG);  
                    //doc.add
                   
                    //doc.createPicture(picId, doc.getNextPicNameNumber(XWPFDocument.PICTURE_TYPE_PNG), 200, 150);  






            //String imgFile = "C:/Users/Quiggy/Desktop/javascript-based psych forms/sig1.png";
            //FileInputStream is = new FileInputStream(picId);
            //run43.addBreak();
            //run43.addPicture(is, XWPFDocument.PICTURE_TYPE_PNG, picId, 200, 300); // 200x200 pixels
            //run43.addPicture(is, XWPFDocument.PICTURE_TYPE_JPEG, null, 0, 100);
            //run43.add
            //is.close();
            }
            catch(Exception anException)
            {
                //System.out.println(anException);
                
                //add the selected ones to the arraylist, and remove these from the second array list. print the first arraylist in bold, and then print the second arraylist unbolded.
                
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Find: laundry bags(3), black pants (cargos), 2nd scientific calculator, iPAD mini CHARGER
        
        //Daskin NOW 36C
        //Masi pants
        //google jacket model number
        
        //dcc's old phone (with the lb, lx, & a lockscreen pic:)
        
        
        
        
        
        
        
        
        //"Enter the Physician's Assistant Passcode OR the Physician's Passcode to enable/unlock editing"
        
        
        //general-access password: dolphin-->dolphin92
        //Isabella's Password: siberianplatypus
        //Your Password: protooncogene-->protooncogene6
        
        
        //the "go-to" choice for disorganized writers/authors
        
        
        //also make an xml and php -based web chat application to complement f f
        //code this in visual studio with ASP.NET
        //that IBM? tutorial with the "free website" thing
        
            /*if(single.isSelected())
            {   
                run8.setItalic(true);
                run8.setBold(true);
                run8.setText("      Single");
            }
            else
            {
                run8.setItalic(false);
                run8.setBold(false);
                run8.setText("      Single");
            }
            
            if(engaged.isSelected())
            {
                run9.setItalic(true);
                run9.setBold(true);
                run9.setText("      Engaged");
            }
            else
            {
                run9.setBold(false);
                run9.setItalic(false);
                run9.setText("      Engaged");
            }
            //but not (both AT THE SAME TIME/ARE TRUE/HOLD)
            if(married.isSelected())
            {
                run10.setItalic(true);
                run10.setBold(true);
                run10.setText("     Married");
            }//nightmares, when they occurred, were less terrifying, somehow.
            else
            {
                run10.setItalic(false);
                run10.setBold(false);
                run10.setText("     Married");
            }//is fundamentally incomprehensible from the level of c at which you've considered it
            //because NEITHER are true
            //there is no
            if(seperated.isSelected())
            {
                run11.setItalic(true);
                run11.setBold(true);
                run11.setText("     Seperated");
            }
            else
            {
                run11.setItalic(false);
                run11.setBold(false);
                run11.setText("     Seperated");
            }
            
            if(divorced.isSelected())
            {
                run12.setItalic(true);
                run12.setBold(true);
                run12.setText("     Divorced");
            }//there is only choice...choice is the only thing left to identify/indicate [that] individuality [exists indeed]
            else
            {
                run12.setItalic(false);
                run12.setBold(false);
                run12.setText("     Divorced");
            }
            
            if(commonlawspouse.isSelected())
            {
                run13.setItalic(true);
                run13.setBold(true);
                run13.setText("     Common Law Spouse");
            }
            else
            {
                run13.setItalic(false);
                run13.setBold(false);
                run13.setText("     Common Law Spouse");
            }
            
            if(cohabiting.isSelected())
            {
                run14.setItalic(true);
                run14.setBold(true);
                run14.setText("     Cohabiting");
            }
            else
            {
                run14.setItalic(false);
                run14.setBold(false);
                run14.setText("     Cohabiting");
            }*/
            
            //run is created here if(divorced.isSelected == "true"){run.setBold(true); run.setText("divorced");} else {run.setBold(false); run.setText("divorced")}
            //single, engaged, married, seperated, divorced, commonlawspouse, cohabiting; 
            
            
            //printDOB(doc);
            
            //one (not-so-great) solution to the numerous runs problem: list everything to be bolded first (array 1- run 1), and then everything else (array 2- run 2)
            
            
            //doc.createParagraph().createRun().setText("           " + paragraphs.get(c).toString());
            //doc.createParagraph().createRun().addBreak();
        
        
        
        doc.write(outstream);
        outstream.close();
        
        
   
        
        
        //paraRun.setText(Primary.getText());
        
        //doc.createParagraph().createRun().addBreak();                 //inserts a line break
        //doc.createParagraph().createRun().setText("blah");            //creates another paragraph
        
        /*for(int c = 0; c < paragraphs.size(); c++)
        {
             /*XWPFParagraph p = doc.createParagraph(); //Paragraph
             XWPFRun run = p.createRun();  //Where the text will be written from
             run.setText("\t");*/
            
        /*            XWPFParagraph p = doc.createParagraph(); //Paragraph
                    XWPFRun run = p.createRun();  //Where the text will be written from
            
            String currentParagraph = paragraphs.get(c).toString();
            for(int d = 0; d < currentParagraph.length(); d++)
            {
                if(currentParagraph.charAt(d) == '@')
                {
                    currentParagraph = currentParagraph.substring(d+1, currentParagraph.length() - 2);
                    
                    run.setBold(true);
                    
                    
                }
                else
                {
                    //run.setBold(false);
                }
            }
            
            run.setText("           " + currentParagraph);
            //doc.createParagraph().createRun().setText("           " + paragraphs.get(c).toString());
            //doc.createParagraph().createRun().addBreak();
        }
        
        
        doc.write(outstream);
        outstream.close();
        //JOptionPane.showConfirmDialog(null, "Are you sure you want to create the word document?");
        
        //Makes the chapter titles bold and removes the "@" & "-"
        
        JOptionPane.showMessageDialog(null, "Document Successfully Created. The program/AA will now exit");
        System.exit(0);*/
        
    }
    catch(Exception e)
    {
    
    }
   }
   
   public void printDOB(XWPFDocument doc)
   {
       /*XWPFParagraph p = doc.createParagraph(); //Paragraph
        XWPFRun run = p.createRun();  //Where the text will be written from
        XWPFRun run2 = p.createRun();
        XWPFRun run3 = p.createRun();
        XWPFRun run4 = p.createRun();            
            run.setText("Patient Name: ");
            run2.setText("Ciel Phantomhive          ");
            run3.setText("Age: ");
            //run2.setTextPosition(run2.getTextPosition());
            run4.setText("13");

            doc.write(outstream);
        outstream.close();*/
   }
   //flayed while impaled on the stake
   //----------------------------------------------------------------------------------------------------
   //_____________'s punishment-
   
   //"rumor has it that the king is livid"
   //enraged--no--furious. He had rarely seen him lose his composure in such a blatant/obvious/undignified manner.
   
   //"I will take full responsibility"
   
   //"HOW will you take responsibility? This entire debacle doesn't have a reset switch that's activated just because you've been punished/the minute you're pun or "take responsibility"" he scoffed.
   
   //removes the backmost four teeth
   
   //"leave us"
   
   //covered with welts of varying depths
   //the "shredding device" was quickly replaced with 
   //her teeth clenched tightly around the gag
   
   //finally succumbing to the inky blackness on the peripheries of her vision.
   //passing out from blood loss rather than/before overstimulation

   
   
   
   
   //this is a favorite of ours when it comes to interrogating female prisoners, although I suppose it would work just as well on the males/men.
   //made of thick leather embedded with short spikes/glass shards and thin hooks of varying lengths, about an inch in length. A single, two inch, razor-sharp/a single spike placed strategically on the top/tip.
   //it comes in three/five varieties: the rod, the wrapping, the metal spike, ___, or the pear. You may pick one.
   //
   //
   
   //Rest assured that...you're going to be in enough pain that/I'm going to put you in enough pain that _____ will be the furthest thing from your mind.
   //"I am feeling quite...energetic...tonight. So I will use this opportunity to satisfy both of my urges (ie. to vent his anger/to have someone feel the backlash of his anger/to punish someone/hold someone responsible for the messup and to get laid)/kill/It looks like I'll get the opportunity to kill two birds with one stone. Feel free to scream as much as you would like. This is going to hurt enough that I do not expect any sane person to hold in their screams, regardless of their post/profession. Even warriors with as much/high pain tolerance like you/as you."
   
   //"Open your mouth" she complied, wincing as the glass sharts began to cut ribbons into her tongue on entry.
   
   //thrusting with
   
//skewers
   
   //branding- (the brand/mark of    on her upper/lower arm) this is the only thing she begs him not to do)
   //were reserved for officers who had committed some severe misdemeanor, but yet not so severe that they would be dismissed from their posts/court martialled. But only just short of that. A mark of shame.
   
   //
   
   //was, for the first time in his life, infinitely grateful for his mask. It hid the less-than-flattering portions of his expressions from the public view very effectively. 
   //choosing to refocus, instead, on 's parted legs. to more easily banish the other thoughts/sense of foreboding from his mind.
   //darting surreptitious glances at her forearm
   public void speechTranscription()
   {//glances darting surr to her arm.
      // /transcribeFromSpeech
       
       

   }
   
   public void launchSpeechRecognition()
   {
       Runtime rt = Runtime.getRuntime();
       try
       {
       //Process process = rt.exec("control panel");
       //Process process2 = rt.exec("cmd.exe");
           Process process = rt.exec("Control Panel");
           
           try
           {process.wait(2500);} catch(Exception e){}
            
           Process process3 = rt.exec("notepad");
           
           
       //Process process4 = rt.exec("Speech Recognition");
           
            
        
       }
       catch(Exception e){
       //    System.out.println(e);
       }
       
           try
           {
                Audio audio = Audio.getInstance();
                InputStream sound = audio.getAudio("Type 'speech' into the control panel search bar.", Language.ENGLISH);
                audio.play(sound);
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null, "Type 'Speech' into the control panel search bar. It will guide you through how to use Windows 7 Native Dictation");
           }
       
   }
   
   public void save()
   {
       saveEval();
       
       JOptionPane.showMessageDialog(null, "Saved!");
   }
}





//RO C: Precipice
