/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjurersconundrum;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Baron
 */
public class NewGameController implements Initializable {
    
    @FXML private TextField nameField;
    @FXML private Button startGame;
    @FXML private ComboBox<String> raceBox;
    @FXML private TextArea raceDesc;
    
    //Placeholders. Obviously this will contain real info later.
    String worgen = "Dog people or some shit, idk.";
    String draenei = "Space aliens.";
    String tauren = "Moo.";
    
    static String name;
    static String race;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        raceDesc.setEditable(false);
        //Will expand to include all races later.
        raceBox.getItems().setAll("Worgen", "Draenei", "Tauren");

    }    
    
    @FXML public void chooseRace() {
        //When a race is selected, check what it is and set the description box.
        switch (raceBox.getValue()) {
            case "Worgen":
                raceDesc.setText(worgen);
                race = "worgen";
                break;
            case "Draenei":
                raceDesc.setText(draenei);
                race = "draenei";
                break;
            case "Tauren":
                raceDesc.setText(tauren);
                race = "tauren";
                break;
            default:
                raceDesc.setText("Shouldn't see this. If you do, file a bug report on the forums.");
                break;
        }
    }
    
    @FXML
    private void startGame(ActionEvent event) throws Exception{   
        name = nameField.getText();
        Stage stage;
        Parent root;
        
        stage=(Stage) startGame.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Play.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
