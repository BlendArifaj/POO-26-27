package group_01.java_05;

import java.util.Scanner;

public class Detyra01 {
    public static void main(String[] args){
        StudentApp.run();
    }
}

// Student - id, name, department, year, grades
// Grade - subject, grade
class Grade{
    private String subject;
    private int grade;
    private Grade(String subject, int grade){
        this.subject = subject;
        this.grade = grade;
    }
    public static Grade getInstance(String subject, int grade){
        if(grade < 5 || grade > 10){
            return null;
        }
        return new Grade(subject, grade);
    }
    // getters
    public String getSubject(){
        return this.subject;
    }
    public int getGrade(){
        return this.grade;
    }
    // setters
    public void setGrade(int grade){
        if(grade >= 5 && grade <= 10){
            this.grade = grade;
        }
    }

    public void displayDetails(){
        System.out.println("Subject: " + this.subject + ", Grade: " + this.grade);
    }

}

class Student{
    private String id;
    private String name;
    private int year;
    private Grade[] grades;

    public Student(String id, String name, int year){
        this.id = id;
        this.name = name;
        this.year = year;
        this.grades = new Grade[10];
    }
    // getters
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public Grade[] getGrades(){
        return this.grades;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }

    public double gpa(){
        int count = 0;
        double sum = 0.0;
        for(int i = 0; i < this.grades.length; i++){
            Grade grade = this.grades[i];
            if(grade != null && grade.getGrade() > 5){
                count++;
                sum += grade.getGrade();
            }
        }
        if(count > 0){
            return sum / count;
        }
        return 0.0;
    }

    public void addNewGrade(Grade grade){
        if(grade == null){
            System.out.println("Grade is not valid!");
            return;
        }
        this.grades = StudentUtils.addStudentGrade(this.grades, grade);
        System.out.println("Grade is added to the grades list!");
    }

    public void displayDetails(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.year);
        System.out.println("GPA: " + this.gpa());
        System.out.println("Grades: ");
        for(Grade grade : this.grades){
            if(grade == null){
                continue;
            }
            grade.displayDetails();
        }
    }
}

class StudentUtils{
    public static Grade[] addStudentGrade(Grade[] grades, Grade grade){// [Grade1, Grade2,...,Grade10]
        int index = StudentUtils.getNextAvailableIndex(grades);
        if(index == -1){
            grades = StudentUtils.extendGradeArray(grades);
            index = StudentUtils.getNextAvailableIndex(grades);
        }

        grades[index] = grade;

        return grades; // [Grade1, ..., Grade10, Grade11, null, null, null, ..., null]
    }

    public static int getNextAvailableIndex(Grade[] grades){ // [Grade(), Grade(), null]
        for(int i = 0; i < grades.length; i++){
            if(grades[i] == null){
                return i;
            }
        }
        return -1;
    }
    public static Grade[] extendGradeArray(Grade[] grades){
        Grade[] newGradesArray = new Grade[grades.length + 10];
        for(int i = 0; i < grades.length; i++){
            newGradesArray[i] = grades[i];
        }
        return newGradesArray;
    }
}

class StudentApp{
    private static Student student = null;

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            StudentApp.displayMenu();
            int userInput = scanner.nextInt();
            switch (userInput){
                case 1:
                    StudentApp.createOrUpdateStudentData(scanner);
                    break;
                case 2:
                    StudentApp.addNewGrade(scanner);
                    break;
                case 3:
                    StudentApp.displayStudentData();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid user input! Try again!");
            }
        }

    }
    private static void createOrUpdateStudentData(Scanner scanner){
        if(StudentApp.student == null){
           System.out.println("You are creating data now!");
           System.out.print("Type your ID: ");
           String id = scanner.next();
           System.out.print("Type your name: ");
           scanner.nextLine();
           String name = scanner.nextLine();
           System.out.print("Type year: ");
           int year = scanner.nextInt();

           StudentApp.student = new Student(id, name, year);
        }else{
            System.out.println("You are updating data now!");
            System.out.print("Update name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Update year: ");
            int year = scanner.nextInt();

            StudentApp.student.setName(name);
            StudentApp.student.setYear(year);
        }
    }

    private static void addNewGrade(Scanner scanner){
        if(StudentApp.student == null){
            System.out.println("You need to create a student first!");
            return;
        }

        System.out.println("You are adding new grade now!");
        System.out.print("Subject: ");
        String subject = scanner.next();
        System.out.print("Grade: ");
        int grade = scanner.nextInt();

        Grade gradeObj = Grade.getInstance(subject, grade);
        if(gradeObj == null){
            System.out.println("Grade is not valid!");
            return;
        }

        StudentApp.student.addNewGrade(gradeObj);
        System.out.println("Grade is added successfully!");
    }

    private static void displayStudentData(){
        if(StudentApp.student == null){
            System.out.println("You need to create a student first!");
            return;
        }
        StudentApp.student.displayDetails();
    }

    private static void displayMenu(){
        System.out.println("=============== Student APP Menu ===============");
        System.out.println("Press 1 to create/update student data");
        System.out.println("Press 2 to insert new grade");
        System.out.println("Press 3 to display all data");
        System.out.println("Press 0 to exit!");
        System.out.print("User input: ");
    }
}