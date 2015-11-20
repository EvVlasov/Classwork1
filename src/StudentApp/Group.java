package StudentApp;

/**
 * Created by ITHILLEL6 on 20.11.2015.
 */
public class Group {
    private Student[] students = new Student[0];

    public void add(Student student) {
        Student[] newArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newArray[i] = students[i];
        }
        newArray[students.length] = student;
        students = newArray;
    }

    public int getStudentsNum() {
        return students.length;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < students.length; i++) {
            result += students[i] + " ";
        }
        return result;
    }

    public void changeName(Student student) {
        student.setSurname("!!!TEST!!!!!");

    }


}
