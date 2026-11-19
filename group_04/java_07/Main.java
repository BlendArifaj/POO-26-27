package group_04.java_07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// HashSet
public class Main {
    public static void main(String[] args) {
        HashSet<String> studentSet = new HashSet<>();
        studentSet.add("Student 1");
        studentSet.add("Student 2");
        studentSet.add("Student 3");

        studentSet.add("Student 1");
        studentSet.remove("Student 1");
        boolean contains = studentSet.contains("Student 5");
        studentSet.size();

        for (String e : studentSet) {
            System.out.println("Element: " + e);
        }
        studentSet.forEach(
                (e) -> {
                    System.out.println("Element: " + e);
                }
        );

        System.out.println(studentSet);

        // Detyra 1
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i % 10);
        }
        System.out.println(numbers);

        // Detyra 2
        HashSet<String> names = new HashSet<>();
        String name1 = "Filan Fisteku";
        String name2 = new String("Filan Fisteku");
        names.add(name1);
        names.add(name2);
        System.out.println(names);

        // ArrayLis
        // {0->v1, 1->v2, 2->v3, ...}

        // HashMap
        // {k1->v1, k2->v2}
        /*
        {
               202605100200 -> Student(....),
               202605100201 -> Student(....),
        }
         */
        HashMap<String, Student> studentMap = new HashMap<>();
        Student student1 = new Student("Filan", "filan@uni-pr.edu");
        Student student2 = new Student("Jon", "jon@uni-pr.edu");
        Student student3 = new Student("Arta", "arta@uni-pr.edu");
        studentMap.put("202605100200", student1);
        studentMap.put("202605100201", student2);
        studentMap.put("202605100202", student3);
        System.out.println(studentMap);

//        studentMap.keySet().stream().filter(
//                (item) ->{
//
//                }
//        );

        Student std = studentMap.get("202605100201");
        studentMap.getOrDefault("100200", new Student("filan", ""));
        studentMap.remove("202605100200");
        studentMap.remove("202605100200", student3);
        studentMap.forEach(
                (id, student) -> {
                    System.out.println(id + ": " + student.email);
                }
        );
    }
}

class Student{
    String name;
    String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}


