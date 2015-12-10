/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagerv1;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;                 
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Quiggy
 */
public class FXMLFirstLoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
   
    public Button login;
    public PasswordField pwf1;
    public Label label1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        //some idiocy goes here
        /*try
        {
            Audio audio = Audio.getInstance();
            InputStream sound = audio.getAudio("Welcome to advanced psychiatric associate's patient manager!", Language.ENGLISH);
            audio.play(sound);
        }
        catch(Exception excep)
        {System.out.println(excep);}*/

    }  
    
    @FXML
    private void login(javafx.event.ActionEvent event) throws IOException
    {
        if(pwf1.getText().equals("dolphin"))
        {
                Parent blah = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
                Scene scene = new Scene(blah);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
        }
        else
        {
                label1.setText("Password is incorrect. Please Try Again");
        }
    }
    
}
