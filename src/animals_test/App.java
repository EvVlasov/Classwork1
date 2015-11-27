package animals_test;

/**
 * Created by ITHILLEL6 on 24.11.2015.
 */
public class App {
    public static void main(String[] args) {
        Cat murka = new Cat(1,3,12,"White","Murka",true);
        Cat barsik = new Cat(2,5,23.12,"Black","Barsik",true);
       // Animal animal = new Animal(3,34,11,"blue");

        Zoo zoo = new Zoo();
        zoo.addAnimal(murka);
        zoo.addAnimal(barsik);
        Animal tuzik = new Dog(1,2,4,"ew","tuzik",true);
        zoo.addAnimal(tuzik);

        System.out.println(murka.getVoice());
        System.out.println(tuzik.getVoice());
        System.out.println(barsik.getVoice());

        //zoo.voiceAll();

    }
}
