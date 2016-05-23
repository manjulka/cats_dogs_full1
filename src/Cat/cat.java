package Cat;

import animal_1.Animal;

/**
 * Created by inga on 22.05.2016.
 */

public class cat extends Animal implements iCat
{
    public String nameC;
    public int weightC;
    public cat(String name, int weight)
    {
        nameC=name;
        weightC=weight;
    }
    public void doMeow()
    {
        System.out.print("Меня зовут ");
        System.out.print(nameC);
        System.out.println(". Мяу мяу");
    }
    @Override
    public void eat(int foodWeight)
    {
        weightC+=foodWeight;
        doMeow();
    }
}