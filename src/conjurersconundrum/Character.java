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
    
    
    
}
