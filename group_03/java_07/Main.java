package group_03.java_07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// ArrayList, HashSet, HashMap
public class Main {
    public static void main(String[] args){
        HashSet<String> examStudents = new HashSet<>();
        examStudents.add("Student 1");
        examStudents.add("Student 2");
        examStudents.add("Student 1");

        examStudents.remove("Student 1");
        boolean contains = examStudents.contains("Student 3");
        System.out.println("Contains: " + contains);
        examStudents.size();

        examStudents.forEach(
                (e) -> {
                    System.out.println("Element: " + e);
                }
        );
        for(String e : examStudents){

        }

        System.out.println(examStudents);

        // Detyra
        String name1 = "Filan Fisteku";
        String name2 = new String("Filan Fisteku");
        HashSet<String> names = new HashSet<>();
        names.add(name1);
        names.add(name2);
        System.out.println(names);


        HashMap<String, Student> idStudent = new HashMap<>();
        idStudent.put("2026-05-109", new Student("Filan", "filan@gmail.com"));
        Student student = new Student("Jon", "jon@uni-pr.edu");
        idStudent.put("2026-05-110", student);

        Student student1 = idStudent.get("2026-05-109");
        System.out.println(student1.name + " - " + student1.email);

        Student student2 = idStudent.get("2025-05-109");
        System.out.println(student2);

        idStudent.put("2026-05-110", new Student("Filani", "filani@uni-pr.edu"));
        System.out.println(idStudent);

        idStudent.remove("2026-05-110");
        idStudent.remove("2026-05-110", student);

        idStudent.forEach(
                (id, std)->{
                    System.out.println(id + ": " + std.email);
                }
        );

//        idStudent.containsKey();
//        idStudent.containsValue();


//        HashMap<Provim, ArrayList<Student> > provime = new HashMap<>();

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















