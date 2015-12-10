//phys (mat sci) , str, ps'
//RIP/Q

//CURRENT menu items (not including sub menus): 18

//count the menu bar
//add "download brainac" to the menu bar
//add the (PN) delete option to the menu bar ONLY
//"load" should be disabled if there is nothing to load



//what particle are you poster (the sapz)

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//those 5 in margin
//pres, tabs, HAL ph's & resume backup
package patientmanagerv1;
//1) extreme self-sufficiency, 2) 1, 3) NOT merely a shift towards higher exports to imports, but rather, a shift towards a focus on/appreciation of/lifetyle oriented around existing "assets" (kinda like the lifestyle 50 yrs ago, and the g d's oriented principles and strong cultural identity, which is even more important), a greater bar on imports themselves, and the elimination of outsourcing 4) an increased focus on "assets" and qol 5)merc-istic policies?
//similar to the condition 50 years ago
//Germany's economic recovery post WWII
//what truly defines an "asset": n, qol, quality, etc...

//DO NOT's: be the recipient/acceptors of o-s

//other precedents- t G D (I do not know if this is a valid precedent or not...)

//note: "e s-s" does NOT mean o-s in reverse.

//focus on qol, Wol, & vohl- this is what really makes or breaks (in the case of a lack of it) a country
    //where cultural identity falls into this...

//n r are/can be a significant part of this (recall the four tiers (factors/variables) of env influence: 1) olity 2)ng//lia 3) programming 4) managed/minimized and optimized (but sufficient) a

import com.gtranslate.Audio;
import com.gtranslate.Language;
import java.io.*;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 * FXML Controller class
 *
 * @author Quiggy
 */      //crusades, inquisition (1&2 (spanish)); famous (either through bloody/disease) conversions: the conversion of the n a's, ...
//dent torture
//medieval torture methods (and the iron fist of the c)
//aztecs

//famous japanese torture techniques/a history of torture in japan
//japan- a history of alternative sexuality
//the prehistory of sex: 4 million years of human sexual culture


//guns, germs, and steel

//

//applying this attitude to the extremely (read: utmost) confusing field of e s...

//what are n's d's i?

//how to be a good history teacher: get into the moment, examine each event in detail- a story as it unfolds
//why india is an archaeologists nightmare
//ktl amv, h hq


//monty python h g sceneXD, terminator parody, ... :P






//a history of Earth's n r's (millions of years of organic and inorganic ev)





//possible titles: edge of ety: precipice, edge of ety: et denied, edge of ety: ety's reach/asserted/orig
//
//ety's reach

//eternal penance/agy



//making your first amv- software?
//I have, kinda, an academic i in this...
public class FXMLProgressReportController implements Initializable {

    boolean fillingFromEval = false;
    String installationPath = System.getProperty("user.home") + "/patientsdata";
    String firstName, lastName, dob;
    boolean loaded;
    private HomeController lemmeaccessthis;
    String currentForm, currentPN, currentFillPath;
    
    boolean created;
    
    boolean dccSigned, partnerSigned;
    
    public MenuBar menu;
    //private Stage stage;
    
    @FXML
    RadioButton stableminimal, lowtomoderate, moderate, moderatetohigh;
    @FXML
    TextField minimentalstatusexam, aims, sideeffects;
    @FXML
    CheckBox impulsecontrolgood, impulsecontrolfair, impulsecontrolpoor, impulsecontrolimproving, attentionconcentrationgood, attentionconcentrationfair, attentionconcentrationpoor;
    @FXML
    TextArea subjective, currentmedications;
    @FXML
    TextField fn, ln, dateOfBirth;
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
    Button load, createPN, toPatientSelection;
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
    TextArea historyofpresentillness, pastpsychiatrichistory, pasthistoryoftext, historyofmedicationtrialsinthepasttable, historyofmedicationtrialsinthepastcomments, substanceusehistory;
    @FXML
    ListView listOfProgressReports;
    @FXML
    CheckBox significantwithdrawals, dts, withdrawalseizures, historyofdetox, outpatient, inpatient, na, aa, substancetreatmentprogram, nkda, environmental;
    @FXML
    CheckBox education;
    @FXML
    TextField inpatientbox, parents, siblings, children, allergiesdescriptionbox;
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
    CheckBox a4none, a4primarysupportgroup, a4partnerrelationalproblems, a4parentchildrelationalproblems, a4socialenvironment, a4occupation, a4economics, a4legalsystem, a4education, a4housing, a4noncompliancewithtreatment, a4other, axis5none, medicationmanagement, noshow, cancellation, phonecontact;
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
    @FXML
    Button readToMe, backButton;
    @FXML
    Label progressreportlabel;
    
    //breathing heavilly in rattling/ragged pants, sliding/eventually slumping down the wall and 
    //her breaths coming in ragged, uneven pants, as her fingers found  
    //the pulsating "burn" bwhl's.
    
    /**
     * Initializes the controller class.
     */
    //THE PROBLEM WAS WITH RECOGNIZING THE FUNCTION, both in </>, and in scene builder. (make sure they are synchronized)
    
        @FXML
    private void toEvaluationForm(javafx.event.ActionEvent event) throws IOException 
    {
        int result = JOptionPane.showConfirmDialog(null, "Do you want to save any unsaved changes?","Save changes?", JOptionPane.YES_NO_CANCEL_OPTION);
         //System.out.println(result);
        //JOptionPane.showConfirmDialog(null, "Would you like to save any changes before logging out?", "save changes?", YES_NO_CANCEL_OPTION);
        //Object selection = JOptionPane.get    
        
        if(result == 0)
        {
            saveProgressNote();
            Parent root3 = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene scene = new Scene(root3);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
            
        }
        if(result == 1)
        {
            Parent root3 = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene scene = new Scene(root3);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }
        if(result == 2)
        {
            
        }
        
        
    }
    //save/load & add "download Brainac" to the list, writing the forms to word/pdf, security (additional password prompt windows, additional are you sure windows, signing and settings), package it up (create installer in netbeans (youtube vid))
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //stage.setTitle("Patient Manager");

    //determine whether loaded should be true or false
      try
      {
           String entireFileText = new Scanner(new File(installationPath + "/currentpatient.txt")).useDelimiter("//A").next();
        String[] nameArray = entireFileText.split(",");
            
            firstName = nameArray[0].toLowerCase();
            lastName = nameArray[1].toLowerCase();
            dob = nameArray[2];
    
            fillNameAndDOB();
            
            
            FileReader read = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/currentprogressreport.txt");
                BufferedReader breader = new BufferedReader(read); 
                String currentprogressnote = breader.readLine();
            
                currentPN = currentprogressnote;
                
        FileReader reader = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressNotes/loaded.txt");
                BufferedReader br = new BufferedReader(reader); 
                String s = br.readLine();
                
                if(s.equalsIgnoreCase("false"))
                {
                    loaded = false;
                }
                else
                {
                    loaded = true;
                }
                //her lucss cves, just as beautiful in death.
                
                //Sitara watched her final struggles sympathetically. she was ext b, even i d.
                //Her gaze was sympathetic.//looking/gazing down at the now cooling form in her arms sympathetically.
                //2
                //still containing the primordial b that it had held for...
                
                //"I will still continue to w beside y/wander w y...but every s I t...it hurts"
                //"Then I look forward to the continued company/your continued company."
                
                
                
                //"...Shit!/Fuck!"
                //Sitara made a mad dash forwards for/towards the gurgling
                //At last, they spotted her squirming/writhing in place, the noose constricting painfully/ever more tightly about her neck., starving her brain of oxygen.

                //"Sitara. Leave her."
                //Sitara gazed/stared/looked at him as if he'd grown another head. "But whyy--" ["I thought -we came here to stop her?"]
                //"It's too late for her now. If we were to take her down now, chances are/it is more than likely, she would have already suffered considerable brain damage from the lack of oxygen."
                //"People have held their breath for longer--"
                //"The damage is clearly visible. Recovery would be impossible at this point./"The damage would most probably/more than likely be irreversible.""
                
                
                //"cut her loose. We'll bring h back to V. I will deliver the news to him personally."
                //Sitara effortlessly hoisted
                
                //Dhiraj seemed to stare past her for a moment, at an unspecified point on the wall "may she rest in peace."
                
                //"with this type of tr...he must have h h."
                //"nope."
                
                br.close();
                reader.close();     
                //towards the sound of the/in the direction of g noise
                //Dhiraj, predictably, said nothing.
                //System.out.println(loaded);
                
                
                //newly created progress notes:
                if(loaded == false)
                { created = true;
                    //Check whether previous progress notes exist
                    String previous = "";
                     String cpn;
                        ArrayList progressNotes = new ArrayList();
                    
                        try
                        {
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/signed.txt");
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
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/assistantsigned.txt");
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
                        FileReader r2 = new FileReader(installationPath + "/userdata/" + firstName + lastName + dob + "/ProgressReports.txt");              
                        BufferedReader b2 = new BufferedReader(r2); 
                
                //while avoiding...certain thoughts, as the figure in her arms was prone and at her mercy                       
                //trying not to let her mind take that particular train of thought/trying not to, out of habit, derive enjoyment from
                
                        while((cpn = b2.readLine()) != null)
                        {
                            previous = cpn;
                            //System.out.println(previous + " Hello previous");
                            progressNotes.add(cpn);
                        }
                        //a h borne of
                        //picked her up gingerly, carrying her bridal-style towards 
                        
                        //borne of eons & innumerable lte's on B
                        //ucla squirrels, papyrus, 1
                        
                        previous = progressNotes.get(progressNotes.size() - 2).toString();
                        //System.out.println("previous: " + previous);
                        previous = previous.replace(":", "");
                        previous = previous.trim();
                        
                        b2.close();
                        r2.close();
                    }
                    catch(Exception e)
                    {
                    
                    }
                    
                    if(progressNotes.size() <= 1)
                    {
                        //If there are no previous progress notes, populate based on the eval form
        //                fillFromEval();
                        
                        fillingFromEval = true;
                        
                        currentFillPath = installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/EvaluationForm/";
                        fillProgressNote();
                        saveProgressNote();
                    }
                    else
                    {                        
                        //If previous progress notes exist, populate based on the most recent previous progress note
        //                fillFromPreviousNote();                                                                                           //+ currentPN + "/"
                        currentFillPath = installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + previous + "/";
                        fillProgressNote();
                        saveProgressNote();
                                                
                    }                    
        //"delete selected progress report" --> prompt for "dolphin/protooncogene (for admin priviledges)"            
                }
        
                //for a loaded progress note
                if(loaded == true)
                { created = false;
                    //assign the current form
                    currentForm = s.replace(":", "");
                    
                    //load based on the data stored within "progress notes"
    //                fillFromThisProgressNote();
                    currentFillPath = installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/";
                    fillProgressNote();
                }
                
      }
      catch(Exception e)
      {
          //System.out.println("file not found");
      }

            //loaded = lemmeaccessthis.passLoaded();
            //System.out.println(lemmeaccessthis.passLoaded());
      
              //checks the signed status
        /*try
        {
            FileReader reader = new FileReader(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/signed.txt");
                         //+ "/userdata/" + get.currentPatientFirstName + get.currentPatientLastName + "/EvaluationForm/first.txt");
                 BufferedReader br = new BufferedReader(reader); 
                 String signedStatus = br.readLine();
                 br.close();
                 reader.close();
                 
                 
                 /*saveButton.setDisable(false);
                 sign.setVisible(true);
                 sign.setDisable(true);
                 signature.setVisible(false);*/
                 
        /*         if(signedStatus.equalsIgnoreCase("false"))
                 {
                     saveButton.setDisable(false);
                     sign.setVisible(true);
                     sign.setDisable(false);
                     signature.setVisible(false);
                 }
                 else
                 {
                     saveButton.setDisable(true);
                     sign.setVisible(false);
                     signature.setVisible(true);
                     signature.setText("This document has been digitally signed by David Zhvikov MD");
                     ap.setDisable(true);
                 }
        }
        catch(Exception e)
        {}*/
      
      //checks the signed status
        try
        {
            FileReader reader = new FileReader(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/signed.txt");
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
                 
                 
                FileReader reader2 = new FileReader(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/assistantsigned.txt");
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


        //
        /*readToMe.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
               final String voiceName = "kevin";
        
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(voiceName);
        
        voice.allocate();
        
        try
        {
            //voice.speak(ln.getText());
            //voice.speak(subjective.getText());
            //voice.speak(dateOfBirth.getText());
            voice.speak("Hello World, nice to see you!");
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }

                }
            });*/
        
        
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
            MenuItem toEval = new MenuItem("Return to Evaluation");
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
        file.getItems().add(toEval);
        file.getItems().add(exit);
        
        edit.getItems().add(undo);
        edit.getItems().add(redo);    
        edit.getItems().add(selectAll);    
        edit.getItems().add(cut);
        edit.getItems().add(copy);
        edit.getItems().add(paste);
        edit.getItems().add(enableBackdoorModifications);
        
//        view.getItems().add(submenu1);
//        view.getItems().add(submenu2);
//        view.getItems().add(deleteProgressReport);
        
        help.getItems().add(howToUse);
        help.getItems().add(versionInfo);
        
        speech.getItems().add(read);
        speech.getItems().add(launch);
        
        
        menu.prefWidthProperty().bind(masterPane.widthProperty());
        //menu.setStyle("-fx-padding: 0 20 0 20;");
        
        //menu.getMenus().addAll(file, edit, view, help, speech);
        menu.getMenus().add(file);
        menu.getMenus().add(edit);
        //menu.getMenus().add(view);
        menu.getMenus().add(speech);
        menu.getMenus().add(help);
        
        
        undo.setDisable(true);
        redo.setDisable(true);
        cut.setDisable(true);
        copy.setDisable(true);
        paste.setDisable(true);
        selectAll.setDisable(true);
            
        
        
        save.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    save();
                }
            });
        
        
        versionInfo.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Patient Manager version 5.0.6 \n Compatible with: Windows 7");
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
                       saveProgressNote();
                       
                       
                       //some idiocy goes here
                        try
                        {
                            //Audio audio = Audio.getInstance();
                            //InputStream sound = audio.getAudio("Have a nice day!", Language.ENGLISH);
                            //audio.play(sound);
                        }
                        catch(Exception excep)
                        {
                            //System.out.println(excep);
                        }
                       
                       System.exit(0);
                   }
                   if(result == 1)
                   {
                       //some idiocy goes here
                       try
                        {
                            //Audio audio = Audio.getInstance();
                            //InputStream sound = audio.getAudio("Have a nice day!", Language.ENGLISH);
                            //audio.play(sound);
                        }
                        catch(Exception excep)
                        {
                            //System.out.println(excep);
                        }
                       
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
            
            /*deleteProgressReport.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    deleteProgressReport();
                }
            });*/
            
            
            //<MenuItem fx:id="loadProgressReport" onAction="#loadProgressReport" />
            
        /*    loadProgressReport.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    load.fire();
                }
            });*/
            
          /*  createProgressReport.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    createPN.fire();
                }
            });*/ //read to me menu, dictation menu- select a document to read aloud, read this passage aloud, launch windows in-built dictation, download brainac dictation online
            
          
        
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
            
            
            toEval.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    backButton.fire();
                }
            });
        
        
        
        
        
        progressreportlabel.setText("Progress Report: " + currentPN);
    }

    public void fillAppearance()
    {
            try{
                FileReader reader = new FileReader(currentFillPath + "appearance.txt");
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
                FileReader reader = new FileReader(currentFillPath + "appearancebox.txt");
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
    
    public void fillEyeContact()
    {
        //the outward reflection of true freedom is a flex/highly variable personality
        //is temperamental and flexible
        
        
        try{
                FileReader reader = new FileReader(currentFillPath + "eyecontact.txt");
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
        
    }//(true free will)
    
    public void fillAttitude()
    {
        try{
                FileReader reader = new FileReader(currentFillPath + "attitude.txt");
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
                FileReader reader = new FileReader(currentFillPath + "attitudebox.txt");
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
    //Highlight (make bold): ASP.NET, Eclipse, Netbeans
    //Upload RS
    //desired certifications: ceh, network administrator, secure programmer
    public void fillMotorActivity()
    {
            
        try{
                FileReader reader = new FileReader(currentFillPath + "motoractivity.txt");
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
                FileReader reader = new FileReader(currentFillPath + "motoractivitybox.txt");
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
    //pher'es in h's + p
    public void fillAffect()
    {
        try{
                FileReader reader = new FileReader(currentFillPath + "affect.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
        //blueberries, g's or nuts
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
    
    public void signProgressNote()
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
                dialogVbox.getChildren().add(new Text("Only the physician can sign this document. Please Enter the master password: "));
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
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/signed.txt");
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
                        //"when you share a body with T F...she wouldn't let that remain for even a second..."XDD
            cancel.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });
                /*final Stage dialog = new Stage();
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
                dialogVbox.getChildren().add(new Text("Only the physician can sign this document. Please Enter the master password: "));
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
                        
                        sign.setVisible(false);
                        saveButton.setDisable(true);
                        signature.setText("This document has been digitally signed by David Zhvikov MD");
                        signature.setVisible(true);

                        //update the "signed" status document here, checked the "signed" status in the initialize() method and enable/disable the buttons and message accordingly onLoad...when the signed document is first created, it should be set to false (f) by default
                        try
                        {
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/signed.txt");
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
            });*/

    }
    
    public void fillMood()
    {
        try{
                FileReader reader = new FileReader(currentFillPath + "mood.txt");
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
    
     public void fillSpeech()
    {
            try{
                FileReader reader = new FileReader(currentFillPath + "speech.txt");
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
     
    public void fillSideEffectsDiscussed()
    {
               try{
                FileReader reader = new FileReader(currentFillPath + "sideeffectsdiscussed.txt");
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
                FileReader reader = new FileReader(currentFillPath + "sebox1.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //sebox1.setText(cn);
                
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
                FileReader reader = new FileReader(currentFillPath + "sebox2.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //sebox2.setText(cn);
                
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
                FileReader reader = new FileReader(currentFillPath + "treatmentplantextfield.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //treatmentplantextfield.setText(cn);
                
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
                FileReader reader = new FileReader(currentFillPath + "treatmentplanbox1.txt");
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
                FileReader reader = new FileReader(currentFillPath + "treatmentplanbox2.txt");
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
                FileReader reader = new FileReader(currentFillPath + "treatmentplancheckboxes.txt");
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
    
    public void fillCurrentMedications()
    {
        try
       {
                FileReader reader = new FileReader(currentFillPath + "currentmedications.txt");
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
    
    public void fillDiagnosis()
    {

        try{
                FileReader reader = new FileReader(currentFillPath + "axis4.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //axis4.setText(cn);
                
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
                FileReader reader = new FileReader(currentFillPath + "axis4otherbox.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //axis4otherbox.setText(cn);
                
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
                FileReader reader = new FileReader(currentFillPath + "axis5current.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //axis5current.setText(cn);
                
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
                FileReader reader = new FileReader(currentFillPath + "axis5highestinpastyear.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //axis5highestinpastyear.setText(cn);
                
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
                FileReader reader = new FileReader(currentFillPath + "axis1.txt");
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
                FileReader reader = new FileReader(currentFillPath + "axis2.txt");
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
                FileReader reader = new FileReader(currentFillPath + "axis3.txt");
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
                FileReader reader = new FileReader(currentFillPath + "axis4checkboxes.txt");
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
        
        /*try{
                FileReader reader = new FileReader(currentFillPath + "axis5none.txt");
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
       {}*/
    }
    
    public void fillLabs()
    {
            
               try{
                FileReader reader = new FileReader(currentFillPath + "labs.txt");
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
                FileReader reader = new FileReader(currentFillPath + "labstextfield.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //labstextfield.setText(cn);
                
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
    
    public void fillEnd()
    {
                       try{
                FileReader reader = new FileReader(currentFillPath + "endcheckboxes.txt");
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
                FileReader reader = new FileReader(currentFillPath + "endbox1.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //ebox1.setText(cn);
                
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
                FileReader reader = new FileReader(currentFillPath + "endbox2.txt");
                BufferedReader br = new BufferedReader(reader); 
                String cn = br.readLine();
                br.close();
                reader.close();
                
                //ebox2.setText(cn);
                
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
    
    public void fillSubjective()
    {
        try
       {
                FileReader reader = new FileReader(currentFillPath + "subjective.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                subjective.setWrapText(true);
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     subjective.appendText(aLine);
                     subjective.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
    }
    
    public void fillTypeOfContact()
    {
        //medicationmanagement, noshow, cancellation, phonecontact
        try{
                FileReader reader = new FileReader(currentFillPath + "typeofcontact.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("medicationmanagement"))
                    {
                        medicationmanagement.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("noshow"))
                    {
                        noshow.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("cancellation"))
                    {
                        cancellation.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("phonecontact"))
                    {
                        phonecontact.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillSideEffects()
    {
        //se.txt
        
        try
       {
                FileReader reader = new FileReader(currentFillPath + "se.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     sideeffects.appendText(aLine);
                     sideeffects.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
    }
    //EDA, AA, P M; Matrices
    public void fillImpulseControl()
    {
        //impulsecontrolgood, impulsecontrolfair, impulsecontrolpoor, impulsecontrolimproving
        
        try{
                FileReader reader = new FileReader(currentFillPath + "impulsecontrol.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("impulsecontrolgood"))
                    {
                        impulsecontrolgood.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("impulsecontrolfair"))
                    {
                        impulsecontrolfair.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("impulsecontrolpoor"))
                    {
                        impulsecontrolpoor.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("impulsecontrolimproving"))
                    {
                        impulsecontrolimproving.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillAttentionConcentration()
    {
        //attentionconcentrationgood, attentionconcentrationfair, attentionconcentrationpoor
        
        //ankorochi/anksnakeneck, homu cov mado eyes/de hom is b (fallin), chained ahso in dull g clo
        try{
                FileReader reader = new FileReader(currentFillPath + "attentionconcentration.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
                
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("attentionconcentrationgood"))
                    {
                        attentionconcentrationgood.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("attentionconcentrationfair"))
                    {
                        attentionconcentrationfair.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("attentionconcentrationpoor"))
                    {
                        attentionconcentrationpoor.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
    }
    
    public void fillMiniMentalStatusExam()
    {
        //minimentalstatusexam
        
        try
       {
                FileReader reader = new FileReader(currentFillPath + "minimentalstatusexam.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     minimentalstatusexam.appendText(aLine);
                     minimentalstatusexam.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
    }
    
    public void fillAIMS()
    {
        //aims (textfield)
        try
       {
                FileReader reader = new FileReader(currentFillPath + "aims.txt");
                BufferedReader br = new BufferedReader(reader); 
                
                
                String aLine = "";
    
                 while((aLine = br.readLine()) != null)
                 {
                     aims.appendText(aLine);
                     aims.appendText("\n");
                 }
                
                br.close();
                reader.close();
       }
       catch(Exception e)
       {}
    }
    
    public void fillSeverityOfPresentingIllness()
    {
        //stableminimal, lowtomoderate, moderate, moderatetohigh;
        try{
                FileReader reader = new FileReader(currentFillPath + "severityofpresentingillness.txt");
                BufferedReader br = new BufferedReader(reader); 
                String ss = br.readLine();
                br.close();
                reader.close();
                
                String[] ssArray = ss.split(",");
        
                for(int i = 0; i < ssArray.length; i++)
                {
                    if(ssArray[i].equalsIgnoreCase("stableminimal"))
                    {
                        stableminimal.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("lowtomoderate"))
                    {
                        lowtomoderate.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("moderate"))
                    {
                        moderate.setSelected(true);
                    }
                    if(ssArray[i].equalsIgnoreCase("moderatetohigh"))
                    {
                        moderatetohigh.setSelected(true);
                    }
                    
                }
                
       }
       catch(Exception e)
       {}
        
    }
    
    public void fillProgressNote()
    {
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
        
        fillHomicidality();
        fillSuicidality();
        
        fillJudgementAndInsight();
        fillOrientation();
        
        fillSideEffectsDiscussed();                             //is NOT unique to progress notes, HOWEVER, this was "saveSideEffects()" in the Eval
        fillCurrentMedications();
        fillDiagnosis();
        
        fillTreatmentPlan();
        fillLabs();
        fillEnd();
        
        fillSignatureZone();
        
        if(fillingFromEval == false)
        {
            //do these
            fillSideEffects();
            
            if(created == false)
            {
                fillTypeOfContact();                                    
            }
                
            fillSubjective();                                           
            
            fillImpulseControl();                                   //is unique to the progress notes
            fillAttentionConcentration();                           //ditto
            fillMiniMentalStatusExam();                             //ditto
            fillAIMS();                                             //ditto

            fillSeverityOfPresentingIllness();
            
        }
    }
 //phys,str,ps'
    
 //dmltt Q   
    
    public void fillSignatureZone()
    {
        try{
                FileReader reader = new FileReader(currentFillPath + "bcp.txt");
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
                FileReader reader = new FileReader(currentFillPath + "discussedassistant.txt");
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
                FileReader reader = new FileReader(currentFillPath + "who.txt");
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
                FileReader reader = new FileReader(currentFillPath + "signaturenotes.txt");
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
    
    public void fillJudgementAndInsight()
    {
        try{
                FileReader reader = new FileReader(currentFillPath + "judgement.txt");
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
                FileReader reader = new FileReader(currentFillPath + "insight.txt");
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
    
    public void fillOrientation()
    {
            try{
                FileReader reader = new FileReader(currentFillPath + "orientation.txt");
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
                FileReader reader = new FileReader(currentFillPath + "homicidality.txt");
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
                FileReader reader = new FileReader(currentFillPath + "suicidalityhomicidalitycomments.txt");
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
                FileReader reader = new FileReader(currentFillPath + "homicidalitybox.txt");
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
                FileReader reader = new FileReader(currentFillPath + "suicidality.txt");
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
        //G dne chapter
        //except    is far more intelligent than a tree, if you can conceive of that.
        
        //with an intense sense of foreboding...
            
        //what if y're REALLY NOT a''''?    
        try
       {
                FileReader reader = new FileReader(currentFillPath + "suicidalitybox.txt");
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
    }
    
    public void fillPerception()
    {
            try{//any new tortures for me? Why choose wisdom when I was better off in ignorance? Wisdom is torture. The bastard's laughing. "It's quite the opposite. You misunderstand, heavily/badly.
            //the only thing this has t m is that my l is not in fact, infallible
                //Sti mil jga, huh?
                FileReader reader = new FileReader(currentFillPath + "perception.txt");
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
                FileReader reader = new FileReader(currentFillPath + "thoughtcontent.txt");
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
                FileReader reader = new FileReader(currentFillPath + "thoughtcontentdelusionsbox.txt");
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
                FileReader reader = new FileReader(currentFillPath + "thoughtprocess.txt");
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
                //pumpkin seeds, 1?, hummus, rasam
                //"steak"
       }
       catch(Exception e)
       {}
    }
    //Florida's OJ, does the long choc have s lecithin?
    
    //crushed pepper and A1 steak sauce
    
    //crush garlic with the pepper?
    //melted bleu cheese
    //or garlic butter with rosemary
    public void saveProgressNote()
    {
        saveName();
        saveDOB();
        saveTypeOfContact();                                    //is unique to progress notes
        saveSubjective();                                       //is unique to progress notes    
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
        saveHomicidality();
        saveSuicidality();
        
        saveJudgementAndInsight();
        saveOrientation();
        
        saveImpulseControl();                                   //is unique to the progress notes
        saveAttentionConcentration();                           //ditto
        saveMiniMentalStatusExam();                             //ditto
        saveAIMS();                                             //ditto
    
        saveSideEffects();                                      //ditto
        
        saveSideEffectsDiscussed();                             //is NOT unique to progress notes, HOWEVER, this was "saveSideEffects()" in the Eval
        
        saveCurrentMedications();
        saveDiagnosis();
        
        saveSeverityOfPresentingIllness();                      //ditto
        
        saveTreatmentPlan();
        
        saveLabs();
        
        saveEnd();
        
        saveSignatureZone();
    }
    
    public void saveSignatureZone()
    {
        if(businesscardprovided.isSelected() == true)
        {
            try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/bcp.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append("true");
                bw.close();
                writ.close();}
            catch(IOException exception){
            //    System.out.println(exception);
            }
        }
        else
        {
            try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/bcp.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append("false");
                bw.close();
                writ.close();}
            catch(IOException exception){
            //    System.out.println(exception);
            }
        }
        
        if(discussedassistant.isSelected() == true)
        {
            try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/discussedassistant.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append("true");
                bw.close();
                writ.close();}
            catch(IOException exception){
                //System.out.println(exception);
            }
        }
        else
        {
            try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/discussedassistant.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append("false");
                bw.close();
                writ.close();}
            catch(IOException exception){
            //    System.out.println(exception);
            }
        }
        
        //saves "WHO"
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/who.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(who.getText());
                bw.close();
                writ.close();}
            catch(IOException exception){
            //    System.out.println(exception);
            }
        
        //saves signature comments
                try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/signaturenotes.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(signaturenotes.getText());
                bw.close();
                writ.close();}
            catch(IOException exception){
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
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/endcheckboxes.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(e.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
            //System.out.println(exception);
        }
    
    
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/endbox1.txt");
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
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/endbox2.txt");
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
        //I HATE women.
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
    
        //mustard, bbq sauce (2 types), hot wings sauce, Cousin's pepper sauce
        //Ken's bleu cheese, A1 (pepper flavor), maple syrup, almond butter, peanut butter, hazelnut butter
        //pumpkin seeds, sunflower seeds, walnuts, almonds, pistachios, hazelnuts, ...
        
        //berries, waffles, pumpkin seeds/walnuts; florida's OJ; Coconut Water; marina' gnocchi; black bean snack; flavored hummus and tahini, bleu cheese and "steak"...
        
        //fresh ground peppercorns
        //okra rasam, fresh homemade hummus, pho, onigiri, sesame balls/d,...
        //kale sandwich
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/labs.txt");
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
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/labstextfield.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(labstextfield.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }
    
    }
    
    public void saveSideEffectsDiscussed()
    {
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
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/sideeffectsdiscussed.txt");
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
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/sebox1.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(sebox1.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
            //System.out.println("reached here");
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/sebox2.txt");
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
    {//and to thoroughly corrupt him...yes, that sounded like a nice goal. [like the good lil demon she is].
        //swratmipa/swratm in app
        
        //TextField treatmentplantextfield;
        //have I really taught you that much? have you really found your soln, or are yjd?
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/treatmentplantextfield.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(treatmentplantextfield.getText());
                    bw.close();
                    writ.close();
             //you say that/you act concerned, yet why you don't answer me/this. You've always answered everything else in the past. I don't understand.      Her tears threatened to fall/spill again.
        }//p f a a...fingers
        //dangled uselessly at her side. For some unfathomable reason, Amar had decided to leave her/had decided to leave. But Amar was always unfathomable, really, second to only D/ h M in unfathom-ability.
        
        //H M...she almost didn't want to think about what ...
        catch(IOException e){
        //    System.out.println("reached here");
        }
        
        //TextArea treatmentplanbox1, treatmentplanbox2;
        try{
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/treatmentplanbox1.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(treatmentplanbox1.getText());
                bw.close();
                writ.close();}      //the ebb and flow of the colors/the changing colors 
           catch(IOException e){}   //swirling around her, like little waves...of pure ecstasy/bliss
        
        //[hand crushed/stuck underneath boulder/rock]
        //she lifted the boulder fractionally attempted to move her hand out from underneath/wriggle her hand out from underneath the   , only to be rewarded with sharp bursts/bolts of pain that travelled 
        //she tried to locate the injuries/ascertain the extent of her injuries/the damage done/examined her injured hand. Her index/ring finger was undoubtedly broken in two places, the others seemed to be merely bruised/or contained hairline fractures at the worst, after all, she was able to move them albeit with considerable effort, through gritted teeth, and with sweat pouring down her brow.
        //They hurt just as much.
        //if she had been a little weaker, she mused, she would have needed to amputate her hand.
        
        //CheckBox treatmentplancheckbox1, treatmentplancheckbox2, treatmentplancheckbox3;
         String checkboxes = " ";
        
        if(treatmentplancheckbox1.isSelected() == true)
        {
            checkboxes = checkboxes + "treatmentplancheckbox1,";
        }
        if(treatmentplancheckbox2.isSelected() == true)                 //n too, seemed almost equally vibrant to her own experience
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
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/treatmentplancheckboxes.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(checkboxes.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    //she almost pitied the poor fool.
    //"if this is how you/this is your track record...let me guess...he (your prev ) hanged himself?"
    //"no. he's still alive and well." a slight grin/a demented grin "I'm sure he realized that would accomplish nothing in terms of his att to me."
    public void saveSeverityOfPresentingIllness()
    {
        
        String ac = " ";
    
        //stableminimal, lowtomoderate, moderate, moderatetohigh;
        if(stableminimal.isSelected() == true)
        {
            ac = ac + "stableminimal,";
        }
        if(lowtomoderate.isSelected() == true)
        {
            ac = ac + "lowtomoderate,";
        }//[must have hanged...]
        if(moderate.isSelected() == true)
        {
            ac = ac + "moderate,";
        }
        if(moderatetohigh.isSelected() == true)
        {
            ac = ac + "moderatetohigh,";
        }
      
        
        ac = ac.substring(0,ac.length()-1);
        ac = ac.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/severityofpresentingillness.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(ac.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    
    public void saveDiagnosis()
    {

        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/axis4.txt");
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
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/axis4otherbox.txt");
                    FileWriter writ = new FileWriter(cFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(axis4otherbox.getText());
                    bw.close();
                    writ.close();
                    
        }
        catch(IOException e){
        //    System.out.println("reached here");
        }
        
        try
        {
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/axis5current.txt");
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
                    File cFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/axis5highestinpastyear.txt");
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
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/axis1.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(axis1.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        try{
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/axis2.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(axis2.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        
        try{
                File axis = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/axis3.txt");
                FileWriter writ = new FileWriter(axis, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(axis3.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}
        
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
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/axis4checkboxes.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(a4.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
//"we only ever f i l w forms, Sitara"
//I don't think that's true. someone would just *s* something was off.
//smart kid.
    }
    
    public void saveSideEffects()
    {
            try{
                File hBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/se.txt");
                FileWriter writ = new FileWriter(hBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(sideeffects.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    public void saveCurrentMedications()
    {
           try{
                File currentMedicationsFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/currentmedications.txt");
                FileWriter writ = new FileWriter(currentMedicationsFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(currentmedications.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    public void saveImpulseControl()
    {
        //impulsecontrolgood, impulsecontrolfair, impulsecontrolpoor, impulsecontrolimproving, attentionconcentrationgood, attentionconcentrationfair, attentionconcentrationpoor;
        
        String impulse = " ";
        
        if(impulsecontrolgood.isSelected() == true)
        {
            impulse = impulse + "impulsecontrolgood,";
        }
        if(impulsecontrolfair.isSelected() == true)
        {
            impulse = impulse + "impulsecontrolfair,";
        }
        if(impulsecontrolpoor.isSelected() == true)
        {
            impulse = impulse + "impulsecontrolpoor,";
        }
        if(impulsecontrolimproving.isSelected() == true)
        {
            impulse = impulse + "impulsecontrolimproving,";
        }//fisted his shirt/tunic, and wedged her head into the crook of his neck
        //droplets decorated the back of her hand
        //enshrouded
        
        //an intense white light/the intense, spread-out, white light that encompassed him
        impulse = impulse.substring(0,impulse.length()-1);
        impulse = impulse.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/impulsecontrol.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(impulse.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    
    public void saveAttentionConcentration()
    {
        String ac = " ";
    
        //attentionconcentrationgood, attentionconcentrationfair, attentionconcentrationpoor;
        if(attentionconcentrationgood.isSelected() == true)
        {
            ac = ac + "attentionconcentrationgood,";
        }
        if(attentionconcentrationfair.isSelected() == true)
        {
            ac = ac + "attentionconcentrationfair,";
        }
        if(attentionconcentrationpoor.isSelected() == true)
        {
            ac = ac + "attentionconcentrationpoor,";
        }
      
        
        ac = ac.substring(0,ac.length()-1);
        ac = ac.trim();
    
        
        try{
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/attentionconcentration.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(ac.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    
    public void saveMiniMentalStatusExam()
    {
        try{
                File hBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/minimentalstatusexam.txt");
                FileWriter writ = new FileWriter(hBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(minimentalstatusexam.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}
    }
    
    public void saveAIMS()
    {
        try{
                File hBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/aims.txt");
                FileWriter writ = new FileWriter(hBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(aims.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}
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
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/orientation.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(orientation.toLowerCase());
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
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/judgement.txt");
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
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/insight.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(insight.toLowerCase());
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
                File hFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/homicidality.txt");
                FileWriter writ = new FileWriter(hFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(homicidality.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File hBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/homicidalitybox.txt");
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
                File sFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/suicidality.txt");
                FileWriter writ = new FileWriter(sFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(suicidality.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File sBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/suicidalitybox.txt");
                FileWriter writ = new FileWriter(sBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(suicidalityplanbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        
        try{
                File comments = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/suicidalityhomicidalitycomments.txt");
                FileWriter writ = new FileWriter(comments, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(suicidalityhomicidalitycomments.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
        
    }
    
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
                File pFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/perception.txt");
                FileWriter writ = new FileWriter(pFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(p.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){
        //    System.out.println(exception);
        }
    }
    
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
                File thoughtContentFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/thoughtcontent.txt");
                FileWriter writ = new FileWriter(thoughtContentFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(thoughtContent.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File tcdBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/thoughtcontentdelusionsbox.txt");
                FileWriter writ = new FileWriter(tcdBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(delusionsbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    //the crook of his neck was now soggy/soaked with tears
    //certain r, being s s, were able to easily alter their f's at w. Sit was one of them. Frequently choosing to take the f of a buxom older w/temptress.
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
                File thoughtprocessFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/thoughtprocess.txt");
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
                File speechFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/speech.txt");
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
                File moodFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/mood.txt");
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
                File affectFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/affect.txt");
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
                File motoractivityFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/motoractivity.txt");
                FileWriter writ = new FileWriter(motoractivityFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(motoractivity.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File maBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/motoractivitybox.txt");
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
        //manipal
        attitude = attitude.substring(0,attitude.length()-1);
        attitude = attitude.trim();
    
        
        try{
                File attitudeFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/attitude.txt");
                FileWriter writ = new FileWriter(attitudeFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(attitude.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        
        try{
                File attitudeBox = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/attitudebox.txt");
                FileWriter writ = new FileWriter(attitudeBox, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(attitudeotherbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //found herself admiring her perfect breasts, each of which ended in a pert/cute nipple. 
    //which sloped downwards to reveal a perfect midriff form a perfect "v" at the juncture of her hips
    //"See something you like?"
    //Sitara nearly choked on her/her body temperature rising by degrees now.
    
    //the urge was getting too persistent to deny/ignore any longer, she _____ her head, frustrated.
    //afraid that her control would snap/slip and she would pounce, yet no longer caring./yet just barely managing to care/caring any longer. 'It's time to leave...before I...before my master punishes me in ways that would make hell look like '.
    //'uh-oh'
    //she glanced sideways at the   , knowing that there was no opportunity to
    
    //she excused herself from the   , making a mad-dash for the 
    //slipping off the/her waistband easily 
    //and admiring the 

    
    
    
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
                File eCFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/eyecontact.txt");
                FileWriter writ = new FileWriter(eCFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(eC);
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    public void saveAppearance()
    {
        
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
        //that enjoy the underaged/excessive youth/childishness/childish features
        appearance = appearance.substring(0,appearance.length()-1);
        appearance = appearance.trim();
    //tiny hands
        //dipping into the waistband of her
        try{
                File appearanceFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/appearance.txt");
                FileWriter writ = new FileWriter(appearanceFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(appearance.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
        //her self-control was usually at least a little better than that. (not really)
        //the insistent bbhl/waist
        try{
                File appearanceBoxFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/appearancebox.txt");
                FileWriter writ = new FileWriter(appearanceBoxFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(appearanceotherbox.getText());
                bw.close();
                writ.close();}
           catch(IOException e){}   
    }
    //the serrated whip easily found its way to
    //precipice of the etrnl
    public void saveName()
    {//d h is b comm's
        try
        {
                    File firstNameFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/first.txt");
                    FileWriter writ = new FileWriter(firstNameFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    writ.append(firstName);
                    bw.close();
                    writ.close();
                    
                    File lastNameFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/last.txt");
                    FileWriter writ2 = new FileWriter(lastNameFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    writ2.append(lastName);
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
    }//her arms were fastened/splayed to her sides...a nail driven artfully through each palm
    //in the shape of a crucifix/in a T-shape, 1
    public void saveDOB()
    {
        try
        {
                    File dobFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/dateofbirth.txt");
                    FileWriter writ = new FileWriter(dobFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw = new BufferedWriter(writ);
                    //writ.append(dobText.getText());
                    writ.append(dob);
                    bw.close();
                    writ.close();
                    
        }//eternal/eternity- real death, precipice, endgame       //eternity denied- death denied             //eternity's reach- better than death
        catch(IOException e){}
    }
    //your creativity never ceases to amaze me
    //y s a w, Sit. lol
    //don't you ever t a a else?
    
    
    //staring out over the edge of the cliff, seized by a bout of raw desperation to make it all stop/end. But alas, death would accomplish nothing.
    //lit the fire and watched it burn, her senses--no, her mind--nearly dull to the pain by this point
    //the smell of burning flesh filled the cave, assaulting his nostrils.
    //"what the hell are you doing?!"
    
    //it might be more ent if lol...except for the select few who do indeed enjoy this type of thing
    public void saveTypeOfContact()
    {
        //make a global variable called fillPath.
        //in the initialize method, set fillPath to thisprogressreportpath OR previousprogressreportpath OR evaluationpath
        //in fill(), the corresponding submethods should have paths like: fillPath + "/textfilename.txt"
                //OR: fillPath + "/" + filename
        
        //keep in mind that the text files in the evaluation may have different names, so either be consistent, or include if methods (like: if fillPath = evalPath then filename = yada), or include multiple fill() methods
        
        
        //IMO the easiest way is to write down the names of the textfiles in a comment// at the top before editing the paths
        
              String toc = " ";
        
        if(medicationmanagement.isSelected() == true)
        {
            toc = toc + "medicationmanagement,";
        }
        if(noshow.isSelected() == true)
        {
            toc = toc + "noshow,";
        }
        if(cancellation.isSelected() == true)
        {
            toc = toc + "cancellation,";
        }
        if(phonecontact.isSelected() == true)
        {
            toc = toc + "phonecontact,";
        }
        
        
        toc = toc.substring(0,toc.length()-1);
        toc = toc.trim();
    
        
        try{
                File tocFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/typeofcontact.txt");
                FileWriter writ = new FileWriter(tocFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(toc.toLowerCase());
                bw.close();
                writ.close();}
        catch(IOException exception){}
    }//y I do.[ but I think you will find those more unsav/unpl]
    //to sp o
    public void saveSubjective()
    {
                try{
                File subjectiveFile = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/subjective.txt");
                FileWriter writ = new FileWriter(subjectiveFile, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                BufferedWriter bw = new BufferedWriter(writ);
                writ.append(subjective.getText());
                bw.close();
                writ.close();}
        catch(IOException e){}
    }
    
    //what's your r/full n?
    //d p
    public void fillFromEval()
    {//His a.
        fillNameAndDOB();
    }//what's in it? //where did yl[htd]this?
    public void fillFromPreviousNote()   //tmaboutyslf...how dylhtdt?
    {
    
    }
    public void fillFromThisProgressNote()
    {
    
    }
    
    public void fillNameAndDOB()
    {//easily finding the "problem" b/w
        
        try
        {          
            fn.setText(firstName.substring(0,1).toUpperCase() + firstName.substring(1));
            ln.setText(lastName.substring(0,1).toUpperCase() + lastName.substring(1));
            dateOfBirth.setText(dob.substring(0,2) + "/" + dob.substring(2,4) + "/" + dob.substring(4,8));
        }
        catch (Exception e) 
        {}
        
    }
    //ete'l leg'y
    
    
    
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
                        
                        writeProgressNoteToDocX(false, "");
                        
                        //OPENS the document for printing:
                        try 
                        {
                            if (Desktop.isDesktopSupported()) 
                            {
                                Desktop.getDesktop().open(new File(installationPath + "/userdata/" + firstName + lastName + dob + "/" + currentPN + ".docx"));
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
    
    public void writeProgressNoteToDocX(boolean customPath, String path)
   {
       FileOutputStream outstream;
       
                       try{
                           if(customPath == false)
                           {
                               outstream = new FileOutputStream(installationPath + "/userdata/" + firstName + lastName + dob + "/" + currentPN + ".docx");
                               //outstream = new FileOutputStream(installationPath + "/userdata/" + firstName + lastName + dob + "/" + firstName + lastName + dob + "/ProgressNotes/" + currentPN + ".docx");
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
        headerLabel.setText("Progress Report: ");   //put date here
        /*DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date date = new Date();
        String alpha = dateFormat.format(date);*/
        headerLabel.setText(currentPN);
        headerLabel.addBreak();
        
        
            /*run.setText(alpha);
            run.addBreak();
            run.addBreak();*/
        
        
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
        
            run2.setText(fn.getText() + " " + ln.getText());
            //run3.setText("              Age: ");
                //run2.setTextPosition(run2.getTextPosition());
            //run4.setText(ageText.getText());
            run3.setText("                                         DOB: ");
            run4.setText(dateOfBirth.getText());
            run4.addBreak();
            run4.addBreak();
            
            run5.setBold(true);
            String toc = " ";
        //medicationmanagement, noshow, cancellation, phonecontact
        if(medicationmanagement.isSelected() == true)
        {
            toc = toc + "Medication Management, ";
        }
        if(noshow.isSelected() == true)
        {
            toc = toc + "No Show, ";
        }
        if(cancellation.isSelected() == true)
        {
            toc = toc + "Cancellation, ";
        }
        if(phonecontact.isSelected() == true)
        {
            toc = toc + "Phone Contact, ";
        }//fisted his shirt/tunic, and wedged her head into the crook of his neck
        //droplets decorated the back of her hand
        //enshrouded
        
        //an intense white light/the intense, spread-out, white light that encompassed him
        
        if(toc.length() > 2)
        {
            toc = toc.substring(0,toc.length()-2);
            toc = toc.trim();
        }
        
        run5.setText("Type of Contact: ");
        run6.setBold(false);
        run6.setText(toc);
        run6.addBreak();
        run6.addBreak();    
            
        run7.setBold(true);
        run7.setText("Subjective: ");
        run7.addBreak();
        run8.setBold(false);
        run8.setText(subjective.getText());
        run8.addBreak();    
        run8.addBreak();
        
        
        //run28.setUnderline(UnderlinePatterns.SINGLE);
        run28.setBold(true);
        run28.setText("Objective:");
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
        else
        {}
        run30.addBreak();        
        
        String eC = " ";
        
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
        else
        {}
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
        else
        {}
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
        
        //autoforms/fullforms/Easy Forms
        
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
        if(suicidalityhomicidalitycomments.getText().length() > 1)
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
        
        /*String stm = " ";
        
        //shorttermmemorywithinnormallimits, shorttermmermorydeficits, longtermmemorywithinnormallimits,longtermmemorydeficits, shorttermmemorydeficitsbox, longtermmemorydeficitsbox
        if(shorttermmemorywithinnormallimits.isSelected() == true)
        {
            stm = stm + "Within Normal Limits, ";
        }
        if(shorttermmemorydeficits.isSelected() == true)
        {
            stm = stm + "Deficits, ";
        }
        
        stm = stm.substring(0,stm.length()-2);
        stm = stm.trim();
    
        run30.setText("Short Term Memory: " + stm);
        if(shorttermmemorydeficits.isSelected())
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
        
        ltm = ltm.substring(0,ltm.length()-2);
        ltm = ltm.trim();
    
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
        
        gfok = gfok.substring(0,gfok.length()-2);
        gfok = gfok.trim();
    
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
        
        intellect = intellect.substring(0,intellect.length()-2);
        intellect = intellect.trim();
    
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
        
        abstraction = abstraction.substring(0,abstraction.length()-2);
        abstraction = abstraction.trim();
    
        run30.setText("Abstraction: " + abstraction);
        run30.addBreak();
        */
        
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
    
        String impulse = " ";
        //impulsecontrolgood, impulsecontrolfair, impulsecontrolpoor, impulsecontrolimproving
        if(impulsecontrolgood.isSelected() == true)
        {
            impulse = impulse + "Good, ";
        }
        if(impulsecontrolfair.isSelected() == true)
        {
            impulse = impulse + "Fair, ";
        }
        if(impulsecontrolpoor.isSelected() == true)
        {
            impulse = impulse + "Poor, ";
        }
        if(impulsecontrolimproving.isSelected() == true)
        {
            impulse = impulse + "Improving, ";
        }//fisted his shirt/tunic, and wedged her head into the crook of his neck
        //droplets decorated the back of her hand
        //enshrouded
        
        //an intense white light/the intense, spread-out, white light that encompassed him
        
        if(impulse.length() > 2)
        {
            impulse = impulse.substring(0,impulse.length()-2);
            impulse = impulse.trim();
        }
        
        run30.setText("Impulse Control: " + impulse);
        run30.addBreak();
        
        
        String ac = " ";
    
        //attentionconcentrationgood, attentionconcentrationfair, attentionconcentrationpoor;
        if(attentionconcentrationgood.isSelected() == true)
        {
            ac = ac + "Good, ";
        }
        if(attentionconcentrationfair.isSelected() == true)
        {
            ac = ac + "Fair, ";
        }
        if(attentionconcentrationpoor.isSelected() == true)
        {
            ac = ac + "Poor, ";
        }
      
        if(ac.length() > 2)
        {
            ac = ac.substring(0,ac.length()-2);
            ac = ac.trim();
        }
    
        run30.setText("Attention/Concentration: " + ac);
        run30.addBreak();
        
        run30.setText("Mini-Mental Status Exam (if applicable): " + minimentalstatusexam.getText() + "                               ");
        run30.setText("AIMS (if applicable): " + aims.getText());
        run30.addBreak();
        run30.addBreak();
        
        run31.setBold(true);
        run31.setUnderline(UnderlinePatterns.SINGLE);
        run31.setText("Current Medications");
        run31.addBreak();
        run32.setBold(false);
        run32.setText(currentmedications.getText());
        run32.addBreak();
        run32.setText("Side Effects: " + sideeffects.getText());
        run32.addBreak();
        run32.addBreak();
        
        run33.setBold(true);
        run33.setUnderline(UnderlinePatterns.SINGLE);
        run33.setText("Diagnosis");
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
        run34.addBreak();
        
        String sopi = " ";
    
        //stableminimal, lowtomoderate, moderate, moderatetohigh;
        if(stableminimal.isSelected() == true)
        {
            sopi = sopi + "Stable/Minimal, ";
        }
        if(lowtomoderate.isSelected() == true)
        {
            sopi = sopi + "Low to Moderate, ";
        }//[must have hanged...]
        if(moderate.isSelected() == true)
        {
            sopi = sopi + "Moderate, ";
        }
        if(moderatetohigh.isSelected() == true)
        {
            sopi = sopi + "Moderate to High, ";
        }
      
        
        if(sopi.length() > 2)
        {
            sopi = sopi.substring(0,sopi.length()-2);
            sopi = sopi.trim();
        }
        
        run34.addBreak();
        run34.setText("Severity of Presenting Illness: " + sopi);
        run34.addBreak();
        run34.addBreak();

        run35.setUnderline(UnderlinePatterns.SINGLE);
        run35.setBold(true);
        run35.setText("Treatment Plan/Recommendations");
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
        run36.setText(" " + treatmentplantextfield.getText());
        run36.addBreak();
        run36.addBreak();
        
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
        
        
//do you want to allow isabella to modify the word docs?, menubar, are you already subbed to dragon by any chance?, freetts, disabling stuff, ...
//remaining: signature images, dragon dictation, less-paper and cleaner formatting, ...
//:)        
        
        
        /*run34.setBold(false);
        run34.*/
                    
        doc.write(outstream);
        outstream.close();

   
        }
        catch(Exception e)
        {
            //System.out.println(e);
        }//pancakes, OJ, phone; bananas, blueberries, ...
     }//fix: if > 2, if other is selected, null textfields (doesn't seem to be a problem anymore?), further notes box to progress reports (DONE)
    
    
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
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/assistantsigned.txt");
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
                        //"when you share a body with T F...she wouldn't let that remain for even a second..."XDD
            cancel.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });
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
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/signed.txt");
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
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/signed.txt");
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
                            File signedStatus = new File(installationPath + "/userdata/" + firstName.toLowerCase() + lastName.toLowerCase() + dob + "/ProgressNotes/" + currentPN + "/assistantsigned.txt");
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
            writeProgressNoteToDocX(false, "");
            
            Desktop.getDesktop().print(new File(installationPath + "/userdata/" + firstName + lastName + dob + "/" + currentPN + ".docx"));
       }
       catch(IOException e)
       {}
      //String filename = "";
      //System.getRuntime().exec("start /min winword \"" + filename + "\" /q /n /f /mFilePrint /mFileExit");

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
            

                writeProgressNoteToDocX(true, path);
            
            
            
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
    
    
    public void readThisDocument()
    {
        try
        {
            writeProgressNoteToDocX(false, "");
            
            XWPFDocument doc = new XWPFDocument(new FileInputStream(installationPath + "/userdata/" + firstName + lastName + dob + "/" + currentPN + ".docx"));
            
            XWPFWordExtractor extract = new XWPFWordExtractor(doc);
            String readThis = extract.getText();

            //"C:/Users/Quiggy/patientsdata/userdata/cielphantomhive12141991/05-30-2015(064337).docx"
        Audio audio = Audio.getInstance();
        InputStream sound = audio.getAudio(readThis, Language.ENGLISH);
        //System.out.println("hi4");
        audio.play(sound);
        }
        catch (Exception e)
        {
            //System.out.println(e);
        }
    /*    final String voiceName = "kevin";
        
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(voiceName);
        
        voice.allocate();
        
        try
        {
            //voice.speak(ln.getText());
            //voice.speak(subjective.getText());
            //voice.speak(dateOfBirth.getText());
            voice.speak("Hello World, nice to see you!");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }*/
    }
     
   public void save()
   {
       saveProgressNote();
       
       JOptionPane.showMessageDialog(null, "Saved!");
   }
    
    
    
    
    
    
    
    
    
    
   }//I thought you liked/enjoyed talking b w/ me...so why are you getting ann? stitches; tick demo; 1; article on planarians where it says "cuz the telomerase levels remain constant..."
//Her lips quirked upwards in an amused grin, "your head."

//His lips quirked upwards in an amused grin, "your head."
//GOWoG

//"come back"








//the difference b/w planarians and other bugs/insects--> the "be-anything" (undifferentiated) pluripotent stem cells
//so yeah, that analogy doesn't work...
//rather than pancreatic cancer (for example)...it's more like cancer of anything? Lol
//so would a cancer IN THE PLURIPOTENT STEM CELLS (ie. nothing tells itthosethatcell to stop dividing/or conversely something tells the pluripotent stem cell to keep dividing)/neoblasts imply that the planarian would just become huge and then die
//a cancer in a differentiated cell (like a muscle/liver/pharynx/pancreas/orwhateverthehellaplanarianactuallyhas cell for example), on the other hand, would be just like in any other creature
