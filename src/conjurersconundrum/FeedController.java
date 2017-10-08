package conjurersconundrum;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class FeedController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    //Check for the ID of the button. Feed food based on the ID. Button ID must correspond with the exact name of a
    //food item in Foods.
    @FXML private void feed(ActionEvent event) throws Exception{
        Button button = (Button) event.getSource();
        String id = button.getId();
        
        if ("eggsAndBacon".equals(id)) {CC.feed(Foods.eggsAndBacon);}
        else if("heavyCream".equals(id)){CC.feed(Foods.heavyCream);}
        
    }
}
