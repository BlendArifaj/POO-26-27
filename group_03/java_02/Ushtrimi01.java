package group_03.java_02;

public class Ushtrimi01 {
    public static void main(String[] args){
        Studenti filan = new Studenti("2026-07-544", "Filan Fisteku", 20, "Kompjuterike");
        filan.shtypDetajet();

        Studenti arta = new Studenti("2026-07-545", "Arta Fiskute", 20, "Telekom");
        arta.shtypDetajet();
    }
}

class Studenti{
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
        System.out.println("Mosha: " + this.mosha);
        System.out.println("Departamenti: " + this.departamenti);
    }
}