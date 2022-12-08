package Collection_Block_6;

import java.util.HashSet;

public class SetsDemo {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        // zum set hinzufügen
        strings.add("Hallo");
        strings.add("Servus");
        System.out.println(strings.size());
        System.out.println(strings.toString());

        //Wird nicht doppelt hinzugefügt
        strings.add("Hallo");
        strings.add("hallo"); //KLEIN geschrieben!
        System.out.println(strings.size());
        System.out.println(strings.toString());

        // neues HashSet von Person erstellen
        HashSet<Person> persons = new HashSet<>();
        // Person Max hinzufügen
        persons.add(new Person("Max", "Mustermann"));
        // Person Max nochmals hinzufügen
        persons.add(new Person("Max", "Mustermann"));
        System.out.println(persons.toString());



    }
}
