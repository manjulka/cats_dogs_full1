package Dog;

import animal_1.Food;

/**
 * Created by inga on 22.05.2016.
 */
public class testDog
{
    public static void main(String[] args)
    {
        Food korm = new Food(50);
        dog myDog = new dog("Sharik", 10000);
        myDog.eat(korm);
    }
}