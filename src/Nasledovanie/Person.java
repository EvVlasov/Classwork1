package Nasledovanie;

/**
 * Created by ITHILLEL6 on 20.11.2015.
 */
public class Person {
    private int id;
    private String surname;

    public Person() {
    }

    public Person(int id, String surname) {
        this.id = id;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
