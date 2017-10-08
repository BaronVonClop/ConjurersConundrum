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
        double trueRate = pc.getDigestionRate();
        double digested = pc.getCaloriesInGut() / pc.getDigestionRate();
        //Check if there is a digestion bonus. If there is, calculate it.
        if (pc.getDigestionBonus() > 0){
            trueRate = pc.getDigestionRate() * pc.getDigestionBonus();
            digested = pc.getCaloriesInGut() / trueRate;
        }

         pc.setFullness(pc.getFullness() - trueRate);
         pc.setCaloriesInGut(pc.getCaloriesInGut() - digested);
         pc.setCaloriesDigested(pc.getCaloriesDigested() + digested);
         PlayController.updateBars();
    }
    
    public static void gainWeight(){
         pc.setWeightGained(pc.getCaloriesDigested()/3500d);
         pc.setWeight(pc.getBaseWeight() + pc.getWeightGained());
         PlayController.updateBars();
    }
    
    public static void orderMod(String selection){
        //Beginnings of the Orders mechanic.
        //Different orders have different effects.
        if(selection.equals("Laze")){
            pc.setCaloriesDigested(pc.getCaloriesDigested() - 25);
            pc.setSuspicion(pc.getSuspicion() + 1);
            pc.setStamina(pc.getStamina() + 5);
            pc.setDigestionBonus(0);
        } else if(selection.equals("Work Out")){
            pc.setCaloriesDigested(pc.getCaloriesDigested() - 250);
            pc.setSuspicion(pc.getSuspicion() - 3);
            pc.setStamina(pc.getStamina() - 15);
            pc.setDigestionBonus(0);
        } else if(selection.equals("Quest")){
            //NYI: Finding items/gold. Questing will give the player items to use and gold to spend at the shop.
            pc.setCaloriesDigested(pc.getCaloriesDigested() - 150);
            pc.setSuspicion(pc.getSuspicion() - 2);
            pc.setStamina(pc.getStamina() - 10);
            pc.setDigestionBonus(0);
        } else if(selection.equals("Rest")){
            //Resting speeds digestion, giving a 10% bonus.
            pc.setStamina(pc.getStamina() + 15);
            pc.setDigestionBonus(1.1);
        }
    }
    
}

