package group_02.java_02;

public class Ushtrime01 {
    public static void main(String[] args){
        Student filan = new Student(
                "2026-05-193",
                "Filan Fisteku",
                19,
                "filan@student.uni-pr.edu"
        );
        filan.shtypDetajet();

        Student arta = new Student(
                "2026-05-194",
                "Arta Fisteku",
                19,
                "arta@student.uni-pr.edu"
        );
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

