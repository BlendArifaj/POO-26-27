package group_01.java_02;

public class Ushtrimet01 {
    public static void main(String[] args){
        Student filan = new Student("2026-15-052", "Filan Fisteku", 18, "filan@uni-pr.edu");
        filan.shtypDetajet();

        Student arta = new Student("2026-15-053", "Arta Fisteku", 18, "arta@uni-pr.edu");
        arta.shtypDetajet();
    }
}
class Student{
    String id;
    String emri;
    int mosha;
    String email;

    Student(String id, String emri, int mosha, String email){
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
        this.email = email;
    }

    void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Mosha: " + this.mosha);
        System.out.println("Email: " + this.email);
    }
}