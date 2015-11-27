package animals_test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ITHILLEL6 on 24.11.2015.
 */
public class Zoo {
private List<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public  void voiceAll(){
        for(Animal animal : animals){
            System.out.println(animal.getVoice());
        }
    }



}
