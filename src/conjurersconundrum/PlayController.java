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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Baron
 */
public class PlayController implements Initializable {
    
    @FXML private TextField raceTest;
    @FXML private TextField nameTest;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Character pc = new Character(NewGameController.race, NewGameController.name);
        
        raceTest.setText(pc.getRace());
        nameTest.setText(pc.getName());
        
    }    
    
}
