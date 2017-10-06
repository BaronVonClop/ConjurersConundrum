/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjurersconundrum;

/**
 *
 * @author Baron
 */
public class Character {
    
    private String name;
    private String race;
    private double fullness = 25;
    private double capacity = 100;
    private double happiness = 75;
    private double suspicion = 0;
    private double weight = 160;
    private double stamina = 100;
    private double mana = 0;
    private double researchDone;
    private double researchRate;
    private double digestionRate;
    private double caloriesInGut;
    
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

    
    
    
}
