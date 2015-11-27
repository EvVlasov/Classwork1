package animals_test;

/**
 * Created by ITHILLEL6 on 24.11.2015.
 */
public class Dog extends Domestic {
    public Dog(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    @Override
    public String getVoice() {
        return super.getVoice()+" ,Woof";
    }
}
