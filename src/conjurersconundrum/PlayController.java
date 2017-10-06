/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjurersconundrum;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Baron
 */
public class PlayController implements Initializable {
    
    @FXML private ComboBox<String> ordersBox;
    int time;
    


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Initialize the player character.
        Character pc = new Character(NewGameController.race, NewGameController.name);
        
        //Populate the Order selection box.
        ordersBox.getItems().setAll("Rest", "Laze", "Quest");
        
        
    }    
    
}
