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
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 *
 * @author Baron
 */
public class MainMenu implements Initializable {
    
    @FXML
    private Button NewGame;

    
    @FXML
    private void startNewGame(ActionEvent event) throws Exception{   
        Stage stage;
        Parent root;
        
        stage=(Stage) NewGame.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("NewGame.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
