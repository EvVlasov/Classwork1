package Nasledovanie;

/**
 * Created by ITHILLEL6 on 20.11.2015.
 */
public class Student extends Person {
    public int[] marks;

    public Student(int id, String surname) {
        super(id, surname);
    }
    public String GetSurname(){
        return "HELOO my name " + super.getSurname();
    }
}
