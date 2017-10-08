package conjurersconundrum;

import java.text.DecimalFormat;

//This is the class for the character to be fattened up. Any of the character's stats should be held in this class.
//Even though storywise it is the player, not the character, who does the magic/research, those are stored here
//because there is no technical reason to make a seperate character.
public class Character {
    
    private String name;
    private String race;
    private double fullness = 25;
    private double capacity = 100;
    private double happiness = 75;
    private double suspicion = 0;
    private double baseWeight = 160;
    private double weight = baseWeight;
    private double weightGained = 0;
    private double stamina = 100;
    private double mana = 0;
    private double researchDone = 0;
    private double researchRate = 0;
    private double digestionRate = 6.25;
    private double caloriesInGut = 500;
    private double caloriesDigested = 0;
    private double time = 8;
    private int day = 1;
    
    public Character(String name, String race){
        this.name = name;
        this.race = race;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getFullness() {
        return fullness;
    }

    public void setFullness(double fullness) {
        this.fullness = fullness;
        //Block fullness from going under zero
        if(this.fullness < 0){
            this.fullness = 0;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public double getSuspicion() {
        return suspicion;
    }

    public void setSuspicion(double suspicion) {
        this.suspicion = suspicion;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
        //Block Stamina from going over 100 or below 0.
        if(this.stamina > 100){
            this.stamina = 100;
        } else if(this.stamina < 0){
            this.stamina = 0;
        }
    }

    public double getDigestionRate() {
        return digestionRate;
    }

    public void setDigestionRate(double digestionRate) {
        this.digestionRate = digestionRate;
    }

    public double getCaloriesInGut() {
        return caloriesInGut;
    }

    public void setCaloriesInGut(double caloriesInGut) {
        this.caloriesInGut = caloriesInGut;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getResearchDone() {
        return researchDone;
    }

    public void setResearchDone(double researchDone) {
        this.researchDone = researchDone;
    }

    public double getResearchRate() {
        return researchRate;
    }

    public void setResearchRate(double researchRate) {
        this.researchRate = researchRate;
    }

    public double getCaloriesDigested() {
        return caloriesDigested;
    }

    public void setCaloriesDigested(double caloriesDigested) {
        this.caloriesDigested = caloriesDigested;
    }

    public double getBaseWeight() {
        return baseWeight;
    }

    public void setBaseWeight(double baseWeight) {
        this.baseWeight = baseWeight;
    }

    public double getWeightGained() {
        return weightGained;
    }

    public void setWeightGained(double weightGained) {
        this.weightGained = weightGained;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    //Generates day as a string for the label on the Play screen.
    public String dayString(){
         String formattedDay = "Day: " + this.day;
         return formattedDay;
    }
            
    //Generates character's weight as a string, for the weight indicator
    public String weightString(){
         //Grab weight, format it to 2 decimal places, display it
         double fatIdiot = this.weight;
         DecimalFormat twoPlaces = new DecimalFormat("#.##");
         String weightToSend = "" + twoPlaces.format(fatIdiot);
         return weightToSend; 
    }
    
}
