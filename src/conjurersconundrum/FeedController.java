package conjurersconundrum;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class FeedController implements Initializable {
    
    @FXML private Label nameLabel;
    @FXML private Label fullnessLabel;
    @FXML private Label happinessLabel;
    @FXML private Button feedButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameLabel.textProperty().bind(PH.feedNameUpdater);
        fullnessLabel.textProperty().bind(PH.fullnessLabelUpdater);
        happinessLabel.textProperty().bind(PH.happinessLabelUpdater);
    }    
    
    @FXML private void load(ActionEvent event) throws Exception{
        Button button = (Button) event.getSource();
        String id = button.getId();
        feedButton.setId(id);
        if("eggsAndBacon".equals(id)){loadLoader(Foods.eggsAndBacon);}
        else if("heavyCream".equals(id)){loadLoader(Foods.heavyCream);}
    }
    
    private void loadLoader(Food toLoad){
        PH.feedNameUpdater.set(toLoad.getName());
        PH.fullnessLabelUpdater.set("Size: " + toLoad.getSize());
        PH.happinessLabelUpdater.set("Happiness: " + toLoad.getHappinessAlteration());
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
