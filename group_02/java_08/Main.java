package group_02.java_08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Professor professor = new Professor("Artan", "OOP");
        professor.introduce();

        Student student = new Student("Arta", "Computer Engineering");
        student.introduce();

        Person person = new Person("Filan Fisteku");
        person.introduce();

        person = new Professor("Blerim", "KNK");
//        person.getSubject();
        person.introduce();

        person = new Student("Artan", "EAR");
//        person.getDepartment();
        person.introduce();

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(student);
        people.add(professor);

        for(Person p : people){
            p.introduce();
//            p.getDepartment();
//            p.getSubject();
        }
    }
}





class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void introduce(){
        System.out.println("I am " + this.name);
    }
}

class Student extends Person{
    private String department;
    public Student(String name, String department){
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("I am part of department: " + this.department);
    }
}

class Professor extends Person{
    private String subject;
    public Professor(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("I teach: " + this.subject);
    }
}

















