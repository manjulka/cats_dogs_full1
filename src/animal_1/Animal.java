package animal_1;

import  animal_1.Food;

/**
 * Created by inga on 22.05.2016.
 */
public abstract class Animal
{
    private String name;
    private int weight;
    public void eat(int foodWeight)
    {
        weight=+foodWeight;

    }
    public void eat(Food food)
    {
        weight+=food.weight;
    }
}
