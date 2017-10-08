package conjurersconundrum;

//CC = Character Controller
//Holds the things that affect the character, such as feeding and other checks.
public class CC {
    static Character pc;
    
    //Create the main character. THIS SHOULD ONLY EVER BE CALLED ONCE.
    //Calling a second time will ERASE THE PLAYER CHARACTER.
    //There's probably a way to make this only callable once, but I don't know what it is so OOPS.
    public static void CreateCharacter(String name, String race){
    pc = new Character(name, race);
}
    //Used to feed the character. Simply pass in a Food.
    //TODO: Suspicion for certain foods, Stamina gained/lost based on what was eaten.
    public static void feed(Food food){
         pc.setFullness(pc.getFullness() + food.getSize());
         PH.fullnessUpdater.set(pc.getFullness());
         pc.setHappiness(pc.getHappiness() + food.getHappinessAlteration());
         PH.happinessUpdater.set(pc.getHappiness());
        }
    }

