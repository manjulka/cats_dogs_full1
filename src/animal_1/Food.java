package animal_1;

/**
 * Created by inga on 22.05.2016.
 */
public class Food implements iFood
{
    public int weight;
    String name;
    public Food(int weight)
    {
        this.weight=weight;
    }
    public int getDozeWeight()
    {
        return weight;
    }
}