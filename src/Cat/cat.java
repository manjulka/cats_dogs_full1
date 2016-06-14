package Cat;
import animal_1.Animal;
/**
 * Created by inga on 14.06.2016.
 */
public class cat extends Animal implements iCat {

    public cat(String catName, int catWeight) {

        super(catName, catWeight);
    }

    public void doMeow(){
            System.out.println("My name is " + getName() + ". Meow meow");
        }

    @Override
    public void eat(int foodWeight)
    {
        super.eat(foodWeight);
        doMeow();
    }

}
