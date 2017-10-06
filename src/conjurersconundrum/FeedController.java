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


public class FeedController implements Initializable {
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    //Feed the selected food on press
    @FXML private void feedEggsAndBacon(ActionEvent event) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Play.fxml"));
        loader.load();
        PlayController c = loader.<PlayController>getController();
        
        System.out.println("Fullness before:" + CC.pc.getFullness());

        c.feed(CC.pc, Foods.eggsAndBacon);
        c.updateBars();
        
        System.out.println("Fullness after:" + CC.pc.getFullness());
        
    }
}
