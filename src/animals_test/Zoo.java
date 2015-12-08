package animals_test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ITHILLEL6 on 24.11.2015.
 */
public class Zoo {
private List<Animal> animals = new ArrayList<>();
   public static   int ID;

    public Zoo() {
        ID++;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public  void voiceAll(){
        for(Animal animal : animals){
            System.out.println(animal.getVoice());
        }
    }

   public static void printDomesticAnimalName(Domestic domesticAnimal){
       System.out.println(domesticAnimal.getName());
   }

}
