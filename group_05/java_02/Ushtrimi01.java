package group_05.java_02;

public class Ushtrimi01 {
    public static void main(String[] args){
        Student filan = new Student(
                "2026-07-123",
                "Filan Fisteku",
                "Kompjuterike",
                19
        );
        filan.shtypDetajet();

        Student arta = new Student(
                "2026-07-124",
                "Arta Fisteku",
                "Telekom",
                19
        );
        arta.shtypDetajet();
    }
}

class Student{
    String id;
    String emri;
    String drejtimi;
    int mosha;
    Student(String id, String emri, String drejtimi, int mosha){
        this.id = id;
        this.emri = emri;
        this.drejtimi = drejtimi;
        this.mosha = mosha;
    }

    void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Drejtimi: " + this.drejtimi);
        System.out.println("Mosha: " + this.mosha);
    }
}

