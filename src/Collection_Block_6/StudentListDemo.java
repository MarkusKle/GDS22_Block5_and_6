package Collection_Block_6;

import javax.lang.model.element.NestingKind;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.List;

public class StudentListDemo {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Susi Sorglos"));
        students.add(new Student(2, "Maxi Mustermann"));
        students.add(new Student(3,"Hans Meister"));

        //oder:
        Student Markus = new Student(4, "Markus Kletzi");
        students.add(Markus);

        System.out.println(students.size());

        //Student entfernen
        students.remove(Markus);
        System.out.println(students.size());

        Student Anna = new Student(5,"Anna Ahnung");
        students.add(Anna);

        //gibt es diesen Student schon?
        boolean isMaxiOnList = students.contains(Anna);
        System.out.println("isMaxiOnList = " + isMaxiOnList);

        System.out.println(students.toString());

        Student susi = new Student(1, "Susi Sorglos");
        boolean containsSusi = students.contains(susi);
        System.out.println("containsSusi = " + containsSusi);

        boolean containsSusi2 = containsName(students, "Susi Sorglos");
        System.out.println("containsSusi2 = " + containsSusi2);

        boolean containsSusi3 = containsMatNr(students, 5);
        System.out.println("containsSusi3 = " + containsSusi3);

        boolean contains4 = students.contains(new Student(1, "Susi Sorglos"));
        System.out.println("contains4 = " + contains4);




    }

    public static boolean containsMatNr(ArrayList<Student> studentList, int matrNr) {

        for (Student student : studentList){
            if (student.getMatNr() == matrNr) {
                return true;
            }
        }
        return false;


    }


    //Eigene Methode zum überprüfen ob diere Student da ist
    public static boolean containsName(ArrayList<Student> studentList, String searchName) {

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFullName().equals(searchName)){
                return true;
            }
        }
        return false;


    }
}
