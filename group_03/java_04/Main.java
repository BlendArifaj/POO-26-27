package group_03.java_04;

public class Main {
    public static void main(String[] args){
        Student student = Student.getInstance("Filan Fisteku", -100, 8.8);

        if(student == null){
            System.out.println("Object is not created!");
            return;
        }

        student.displayDetails();

        student.setAge(-100); // 18 - 50
        student.setGpa(250); // 6.0 - 10.0

        student.setGpa(9.2);

        student.displayDetails();
    }
}

// private, public, protected and default
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
        if(age < 18 || age > 50){
            return null;
        }
        if(gpa < 6 || gpa > 10){
            return null;
        }
        return new Student(name, age, gpa);
    }

    void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gpa: " + this.gpa);
    }

    // getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getGpa(){
        return this.gpa;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age >= 18 && age <= 50){
            this.age = age;
        }
    }
    public void setGpa(double gpa){
        if(gpa >= 6.0 && gpa <= 10.0){
            this.gpa = gpa;
        }
    }
}
