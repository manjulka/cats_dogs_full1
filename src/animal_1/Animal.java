package animal_1;

//import class Food;
/**
 * Created by inga on 22.05.2016.
 */
public abstract class Animal
{
    private String name;
    private int weight;
    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public void eat(int foodWeight)
    {
        weight=+foodWeight;

    }
    public String getName(){
        return name;
    }

    public void eat(Food food)
    {
        weight+=food.weight;
    }
}
//chANGE