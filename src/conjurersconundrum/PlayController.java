package conjurersconundrum;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

//This controller is used for the main screen of the game once started.

public class PlayController implements Initializable {
    
    //Implement ALL THE SHIT.
    @FXML private ComboBox<String> ordersBox;
    @FXML private ProgressBar timeBar;
    @FXML private ProgressBar fullnessBar;
    @FXML private ProgressBar happinessBar;
    @FXML private ProgressBar suspicionBar;
    @FXML private ProgressBar staminaBar;
    @FXML private ProgressBar manaBar;
    @FXML private ProgressBar researchBar;
    @FXML private Label dayLabel;
    @FXML private Label weightLabel;
    


    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //Populate the Order selection box.
         ordersBox.getItems().setAll("Rest", "Laze", "Quest");
         //Bind the bars to their updaters
         fullnessBar.progressProperty().bind(PH.fullnessUpdater);
         happinessBar.progressProperty().bind(PH.happinessUpdater.divide(100d));
         suspicionBar.progressProperty().bind(PH.suspicionUpdater.divide(100d));
         staminaBar.progressProperty().bind(PH.staminaUpdater.divide(100d));
         timeBar.progressProperty().bind(PH.timeUpdater.divide(24d));
         weightLabel.textProperty().bind(PH.weightUpdater);
         dayLabel.textProperty().bind(PH.dayUpdater);
         updateBars();
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
    
    @FXML private void waitButton(ActionEvent event) throws Exception{
        //Increment time half an hour; if 24th hour begins, roll over into new day
         CC.pc.setTime(CC.pc.getTime() + .5);
         if(CC.pc.getTime() >= 24){
             CC.pc.setTime(0);
             CC.pc.setDay(CC.pc.getDay() + 1);
         }
         CC.digest();
         CC.gainWeight();
         //Debug strings.
//         System.out.println("Cal In Gut: " + CC.pc.getCaloriesInGut());
//         System.out.println("Cal Digested: " + CC.pc.getCaloriesDigested());
//         System.out.println("Weight Gained: " + CC.pc.getWeightGained());
//         System.out.println("Time: " + CC.pc.getTime());
//         System.out.println("Base Weight: " + CC.pc.getBaseWeight());
         System.out.println("Capacity: " + CC.pc.getCapacity());
         System.out.println("Digestion Rate: " + CC.pc.getDigestionRate());
         System.out.println("Fullness: " + CC.pc.getFullness());
         System.out.println("Calc Fullness: " + CC.pc.calcFullness());
    }
    
    //Update the Updaters which Update the bars. yes really.
    public static void updateBars(){
        PH.fullnessUpdater.set(CC.pc.calcFullness());
        PH.happinessUpdater.set(CC.pc.getHappiness());
        PH.staminaUpdater.set(CC.pc.getStamina());
        PH.suspicionUpdater.set(CC.pc.getSuspicion());
        PH.weightUpdater.set("Weight: " + CC.pc.weightString());
        PH.timeUpdater.set(CC.pc.getTime());
        PH.dayUpdater.set(CC.pc.dayString());
    }
}
