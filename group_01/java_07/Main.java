package group_01.java_07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// ArrayList
// HashSet & HashMap
public class Main {
    public static void main(String[] args){
//        ArrayList<String> studentList = new ArrayList<>();
        HashSet<String> studentIdSet = new HashSet<>();
        studentIdSet.add("2025-05-110");
        studentIdSet.add("2025-05-111");
        studentIdSet.add("2025-06-112");

        boolean containsId = studentIdSet.contains("2025-05-112");

        studentIdSet.remove("2025-05-110");

        studentIdSet.add("2025-05-111");

        System.out.println("Student ids: " + studentIdSet);
        for (String e : studentIdSet){
            System.out.println("Elementi: " + e);
        }

        studentIdSet.forEach(
                (e) -> {
                    System.out.println("Element: " + e);
                }
        );

        // Detyra 1
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i % 10);
        }
        System.out.println(numbers);
        // [0-9]*random

        // Detyra 2
        HashSet<String> names = new HashSet<>();
        String name1 = "Filan Fisteku";
        String name2 = new String("Filan Fisteku");
        names.add(name1);
        names.add(name2);
        System.out.println(names);
        // [Filan Fisteku]

        /*
        {
                key -> value
            2025-05-111 -> {Student 1},
            2025-05-112 -> {Student 2},
            ...
        }
        {
        0 -> {Student 1},
        1 -> {Student 2},
        ...
        }
         */
        HashMap<String, Studenti> studentIdMap = new HashMap<>();
//        studentIdMap["Student"] = new Studenti();
        studentIdMap.put("2025-05-110", new Studenti("Filan", 20));
        Studenti std = new Studenti("Fisteku", 21);
        studentIdMap.put("2025-05-111", std);
        studentIdMap.put("2025-05-112", new Studenti("Arta", 20));
        studentIdMap.put("2025-05-111", new Studenti("Jon", 21));
        System.out.println("Student map: " + studentIdMap);

        studentIdMap.remove("2025-05-111");
//        studentIdMap.remove("2025-05-111", new Studenti("Jon", 21));
        System.out.println("Student map: " + studentIdMap);
        Studenti std2 = studentIdMap.get("2025-05-112");
        System.out.println(std2.name + " " + std2.age);

        // studentIdMap.containsKey()
//        studentIdMap.containsValue()

        studentIdMap.forEach(
                (k, v) -> {
                   // code to execute
                }
        );

    }
}

class Studenti{
    String name;
    int age;

    public Studenti(String name, int age){
        this.name = name;
        this.age = age;
    }
}