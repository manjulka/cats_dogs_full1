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
    public dog(String name, int weight)
    {
        nameD=name;
        weightD=weight;
    }
    public void doBark()
    {
        System.out.print("Меня зовут ");
        System.out.print(nameD);
        System.out.println(". Гав гав");
    }
    @Override
    public void eat(Food food)
    {

        weightD+=food.getDozeWeight();
        doBark();
    }
}