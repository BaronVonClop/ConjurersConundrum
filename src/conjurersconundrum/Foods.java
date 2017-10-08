package conjurersconundrum;

//Initializes and stores all the foods.

import conjurersconundrum.fluff.FD;


public class Foods {
    //new Food(Name, Calories, Size, Suspicion, Happiness, stamina, fanciness, desc)
    static Food eggsAndBacon = new Food("Eggs and Bacon", 750, 25, 0, 5, 0, 1, FD.eggsAndBacon);
    static Food heavyCream = new Food("Pint of Heavy Cream", 800, 10, 2, -1, -5, 0, FD.heavyCream);
}
