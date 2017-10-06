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
    private Float fullness;
    private Float capacity;
    private Float happiness;
    private Float suspicion;
    
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

    public Float getFullness() {
        return fullness;
    }

    public void setFullness(Float fullness) {
        this.fullness = fullness;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public Float getHappiness() {
        return happiness;
    }

    public void setHappiness(Float happiness) {
        this.happiness = happiness;
    }

    public Float getSuspicion() {
        return suspicion;
    }

    public void setSuspicion(Float suspicion) {
        this.suspicion = suspicion;
    }
    
    
    
}
