package conjurersconundrum;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Baron
 */
public class PlayController implements Initializable {
    
    @FXML private ComboBox<String> ordersBox;
    @FXML private ProgressBar timeBar;
    @FXML ProgressBar fullnessBar;
    @FXML private ProgressBar happinessBar;
    @FXML private ProgressBar suspicionBar;
    @FXML private ProgressBar staminaBar;
    @FXML private ProgressBar manaBar;
    @FXML private ProgressBar researchBar;
    @FXML private Label dayLabel;
     double time = 8;
     int day = 1;
     
    static DoubleProperty fullnessUpdater = new SimpleDoubleProperty(.25);
    


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Populate the Order selection box.
        ordersBox.getItems().setAll("Rest", "Laze", "Quest");
        fullnessBar.progressProperty().bind(fullnessUpdater);
        System.out.print("Fullness Bar Progress on Init:" + fullnessBar.getProgress() + "\n");
    }    
    
    //Open food window when Feed button is pressed.
    @FXML private void feedButton(ActionEvent event) throws Exception{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Feed.fxml"));
            Parent feed = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(feed));
            stage.show();
        } catch(IOException e) {
            System.out.println(e);
          }
    }
    
    public void updateBars(){
        
        fullnessUpdater.set(CC.pc.getFullness()/100);
        
}
    

    
    
    
    public void feed(Character pc, Food food){
        pc.setFullness(pc.getFullness() + food.getSize());
    }    
    
  
}
