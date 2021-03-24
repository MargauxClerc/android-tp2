package fr.clerc.tp2;

import java.util.ArrayList;
import java.util.List;

public class StudentContent {

    public static final List<Student> ITEMS = new ArrayList<>();

    static {
        // Add some sample items.
        ITEMS.add(new Student(0, "Robert", "Brown", "M", 21));
        ITEMS.add(new Student(1, "Jason", "Jones", "M", 22));
        ITEMS.add(new Student(2, "Jane", "Smith", "F", 21));
        ITEMS.add(new Student(3, "Theodore", "Putman", "M", 23));
        ITEMS.add(new Student(4, "Karen", "Martinez", "F", 20));
        ITEMS.add(new Student(5, "Jame", "Chase", "M", 21));
        ITEMS.add(new Student(6, "Louise", "Lee", "F", 21));
        ITEMS.add(new Student(7, "Claire", "Green", "F", 21));
        ITEMS.add(new Student(8, "Helen", "Cranberry", "F", 22));
        ITEMS.add(new Student(9, "Jacob", "Graves", "M", 21));
        ITEMS.add(new Student(10, "Elliot", "Edwards", "M", 20));
        ITEMS.add(new Student(11, "Lily", "Richard", "F", 21));
        ITEMS.add(new Student(12, "Violet", "Miles", "F", 22));
        ITEMS.add(new Student(13, "John", "Farell", "M", 22));
        ITEMS.add(new Student(14, "Rachel", "Caine", "F", 23));
    }


}
