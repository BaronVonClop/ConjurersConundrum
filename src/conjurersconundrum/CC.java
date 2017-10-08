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
         if(race.equals("tauren")){
             pc.setBaseWeight(250);
             pc.setWeight(250);
             pc.setCapacity(130);
             pc.setDigestionRate(5.50);
        }
    }
    //Used to feed the character. Simply pass in a Food.
    //TODO: Suspicion for certain foods; for example, the character would be weirded out by chugging a bucket of lard!
    //TODO: Stamina for certain foods. Cramming five cakes into your adventurer would make them quite sluggish...
    public static void feed(Food food){

         pc.setFullness(pc.getFullness() + food.getSize());

         pc.setHappiness(pc.getHappiness() + food.getHappinessAlteration());

         pc.setSuspicion(pc.getSuspicion() + food.getSuspicionAlteration());

         pc.setStamina(pc.getStamina() + food.getStaminaAlteration());
         
         pc.setCaloriesInGut(pc.getCaloriesInGut() + food.getCalories());

         PlayController.updateBars();
    }
    
    public static void digest(){
         double digested = pc.getCaloriesInGut()/pc.getDigestionRate();
         pc.setFullness(pc.getFullness() - pc.getDigestionRate());
         pc.setCaloriesInGut(pc.getCaloriesInGut() - digested);
         pc.setCaloriesDigested(pc.getCaloriesDigested() + digested);
         PlayController.updateBars();
    }
    
    public static void gainWeight(){
         pc.setWeightGained(pc.getCaloriesDigested()/3500d);
         pc.setWeight(pc.getBaseWeight() + pc.getWeightGained());
         PlayController.updateBars();
    }
    
}

