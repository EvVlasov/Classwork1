package StudentApp;

/**
 * Created by ITHILLEL6 on 20.11.2015.
 */
public class StudentApp {
    public static void main(String[] args) {

        Student student1 = new Student(0, "Ivanov");
        Student student2 = new Student(1,"Petrov");
//        student1.setMark(2,5);
//        student2.setMark(6, 4);

        Group group = new Group();
        group.add(student1);
        group.add(student2) ;
        System.out.println(group.toString());
        System.out.println(group.getStudentsNum());



    }
}
