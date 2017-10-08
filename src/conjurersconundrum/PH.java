
package conjurersconundrum;

//PH = Property Holder
//Holds the Properties for updating bars/labels in the UI

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class PH {
    static DoubleProperty fullnessUpdater = new SimpleDoubleProperty(CC.pc.getFullness());
    static DoubleProperty happinessUpdater = new SimpleDoubleProperty(CC.pc.getHappiness());
}
