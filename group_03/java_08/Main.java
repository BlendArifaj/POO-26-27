package group_03.java_08;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Arta", "Computer Science");
        student.introduce();

        Professor professor = new Professor("Artan", "OOP");
        professor.introduce();
        professor.getSubject();
//        professor = new Person("Filan");
//        professor = new Student();
        Person person = new Person("Filan Fisteku");
        person.introduce();

        person = new Professor("Artan", "KNK");
        person.introduce();
//        person.getSubject();
        person = new Student("Filan", "Telecom");
        person.introduce();

        Person obj = new Professor("Filan Fisteku", "KNK");
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
        System.out.println("I am student, my name is " + this.getName()
                +" and I study " + this.department);
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
        System.out.println("I am professor, my name is " + this.getName() +
                " and I teach " + this.getSubject());
    }
}
















