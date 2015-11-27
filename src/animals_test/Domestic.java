package animals_test;

/**
 * Created by ITHILLEL6 on 24.11.2015.
 */
public abstract class Domestic extends Animal {

    private String name;
    private boolean isVactinated;

    public Domestic(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVactinated() {
        return isVactinated;
    }

    public void setIsVactinated(boolean isVactinated) {
        this.isVactinated = isVactinated;
    }

    public  String getVoice(){
        String s = super.getVoice();
        s += "my name is ";
        s += getName();
        return s;
    }

}
