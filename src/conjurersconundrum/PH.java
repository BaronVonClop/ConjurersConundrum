
package conjurersconundrum;

//PH = Property Holder
//Holds the Properties for updating bars/labels in the UI

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PH {
    static DoubleProperty fullnessUpdater = new SimpleDoubleProperty(CC.pc.getFullness());
    static DoubleProperty happinessUpdater = new SimpleDoubleProperty(CC.pc.getHappiness());
    static DoubleProperty suspicionUpdater = new SimpleDoubleProperty(CC.pc.getSuspicion());
    static DoubleProperty staminaUpdater = new SimpleDoubleProperty(CC.pc.getStamina());
    static StringProperty weightUpdater = new SimpleStringProperty(CC.pc.weightString());
    static DoubleProperty timeUpdater = new SimpleDoubleProperty(CC.pc.getTime());
    static StringProperty dayUpdater = new SimpleStringProperty(CC.pc.dayString());
}
