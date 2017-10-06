/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjurersconundrum;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Baron
 */
public class NewGameController implements Initializable {
    
    @FXML private TextField NameField;
    @FXML private Button StartGame;
    @FXML private ComboBox<String> raceBox;
    @FXML private TextArea raceDesc;
    
    String worgen = "Dog people or some shit, idk.";
    String draenei = "Space aliens.";
    String tauren = "Moo.";
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        raceDesc.setEditable(false);
        raceBox.getItems().setAll("Worgen", "Draenei", "Tauren");

    }    
    
    @FXML public void chooseRace() {
        switch (raceBox.getValue()) {
            case "Worgen":
                raceDesc.setText(worgen);
                break;
            case "Draenei":
                raceDesc.setText(draenei);
                break;
            case "Tauren":
                raceDesc.setText(tauren);
                break;
            default:
                raceDesc.setText("Shouldn't see this. If you do, file a bug report on the forums.");
                break;
        }
    }
    
    @FXML public void startGame(){
        
    }
    
}
