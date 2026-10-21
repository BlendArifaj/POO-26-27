package group_04.java_02;

public class Ushtrimi01 {
    public static void main(String[] args){
        Studenti filan = new Studenti("2026-12-122", "Filan Fisteku", 22, "Kompjuterike");
        filan.shtypDetajet();

        Studenti arta = new Studenti("2025-11-115", "Arta Fisteku", 23, "EAR");
        arta.shtypDetajet();


    }
}

class Studenti{ // int, double, float, String
    String id;
    String emri;
    int mosha;
    String departamenti;

    Studenti(String id, String emri, int mosha, String departamenti){
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
        this.departamenti = departamenti;
    }

    void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Departamenti: " + this.departamenti);
        System.out.println("Mosha: " + this.mosha);
    }

}