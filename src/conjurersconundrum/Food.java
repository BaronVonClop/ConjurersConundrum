package conjurersconundrum;

public class Food {
    private double calories;
    private double size;
    private double suspicionAlteration;
    private double happinessAlteration;
    private double staminaAlteration;
    private double fanciness;
    private String name;
    private String desc;
    
    public Food(String name, double calories, double size, double suspicionAlteration, double happinessAlteration, 
            double staminaAlteration, double fanciness, String desc){
        this.name = name;
        this.calories = calories;
        this.size = size;
        this.suspicionAlteration = suspicionAlteration;
        this.happinessAlteration = happinessAlteration;
        this.staminaAlteration = staminaAlteration;
        this.fanciness = fanciness;
        this.desc = desc;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSuspicionAlteration() {
        return suspicionAlteration;
    }

    public void setSuspicionAlteration(double suspicionAlteration) {
        this.suspicionAlteration = suspicionAlteration;
    }

    public double getHappinessAlteration() {
        return happinessAlteration;
    }

    public void setHappinessAlteration(double happinessAlteration) {
        this.happinessAlteration = happinessAlteration;
    }

    public double getFanciness() {
        return fanciness;
    }

    public void setFanciness(double fanciness) {
        this.fanciness = fanciness;
    }

    public double getStaminaAlteration() {
        return staminaAlteration;
    }

    public void setStaminaAlteration(double staminaAlteration) {
        this.staminaAlteration = staminaAlteration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    
    
    

}
