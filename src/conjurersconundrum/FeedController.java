package conjurersconundrum;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class FeedController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    //Feed the selected food on press
    @FXML private void feedEggsAndBacon(ActionEvent event) throws Exception{
        CC.feed(Foods.eggsAndBacon);
    }
}
