package Dog;

import animal_1.Animal;
import animal_1.Food;

/**
 * Created by inga on 22.05.2016.
 */
public class dog extends Animal implements iDog
{
    public String nameD;
    public int weightD;
    public dog(String nameD, int weightD)
    {
        super(nameD, weightD);
    }
    public void doBark()
    {
        System.out.print("Меня зовут " + getName() + ". Гав гав");
    }
    @Override
    public void eat(Food food)
    {
        super.eat(food);
        doBark();
    }
}