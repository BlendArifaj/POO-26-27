package group_05.java_04;

public class Main {
    public static void main(String[] args){
//        Student student = new Student("Filan Fisteku", -5, 120.0f);
        Student student = Student.getInstance("Filan Fisteku", -5, 120.0f);
        if(student == null){
            System.out.println("Object is not created!");
            return;
        }

        student.displayDetails();

        student.setAge(-5); // student.age = -5;
        student.setGpa(120.0f);

        student.displayDetails();
    }
}

// private, public, protected, default
class Student{
    private String name;
    private int age;
    private float gpa;

    private Student(String name, int age, float gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public static Student getInstance(String name, int age, float gpa){
        if(age < 18 || age > 65){
            return null;
        }
        if(gpa < 6.0f || gpa > 10.0f){
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
    public float getGpa(){
        return this.gpa;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        // 18 - 65
        if(age >= 18 && age <= 65){
            this.age = age;
        }
    }
    public void setGpa(float gpa){
        // 6.0 - 10.0
        if(gpa >= 6.0f && gpa <= 10.0f){
            this.gpa = gpa;
        }
    }
}








