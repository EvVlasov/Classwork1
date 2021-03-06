package animals_test;

/**
 * Created by ITHILLEL6 on 24.11.2015.
 */
public abstract class Wild extends Animal {
    private boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setIsPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }
}
