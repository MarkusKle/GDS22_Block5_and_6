package Collection_Block_6;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.add(new Student(1,"Susi Sorglos"));
        students.add(new Student(2, "Max Mustermann"));
        students.add(new Student(3, "Anna Ahnungslos"));

        //Gleichen Studenten hinzufügen
        students.add(new Student(1,"Susi Sorglos"));
        System.out.println(students.size());
        System.out.println(students.toString());

        //Student entfernen
        students.remove(1);
        System.out.println(students.size());
        System.out.println(students.toString());

        //Student vergleichen

        //Übungsabend -> Auflösung


    }
}
