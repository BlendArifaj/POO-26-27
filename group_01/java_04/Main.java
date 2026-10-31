package group_01.java_04;

public class Main {
    public static void main(String[] args){
        Student student1 = Student.getInstance("Filan", 20, 8.8);
        student1.displayDetails();

//        student1.age = -100;
        student1.setAge(-100);
//        student1.gpa = 200;
        student1.setGpa(200);
        student1.setGpa(9.5);
        student1.displayDetails();


    }
}

// private, public, protected, default
class Student{
    private String name;
    private int age;
    private double gpa;

    private Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public static Student getInstance(String name, int age, double gpa){
        if(age < 18 || age > 100 || gpa < 6 || gpa > 10){
            System.out.println("Object cannot be created!");
            return null;
        }
        return new Student(name, age, gpa);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 65){
            this.age = age;
        }
    }

    public void setGpa(double gpa){
        if(gpa >= 6 && gpa <= 10){
            this.gpa = gpa;
        }
    }

    void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
    }
}
