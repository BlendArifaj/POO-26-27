package group_01.java_02;

//LlogariaBankare:
// - id
// - emri
// - banka
// - sum

// + shtypDetajet
// + depono(int shuma)
// + terheq(int shuma)

// Main -> 3 objekte

//Banka
// - id
// - emri
public class Ushtrimet02 {
    public static void main(String[] args){
        Banka rbko = new Banka(2312342, "RBKO");
        LlogariaBankare llogaria1 =
                new LlogariaBankare(100, "Filan Fisteku", rbko, 100);

        llogaria1.depono(200);
        llogaria1.terheq(500);
        llogaria1.terheq(100);
        llogaria1.shtypDetajet();
    }
}

class Banka{
    int id;
    String emri;
    Banka(int id, String emri){
        this.id = id;
        this.emri = emri;
    }
}

class LlogariaBankare{
    int id;
    String emri;
    Banka banka;
    double shuma;

    LlogariaBankare(int id, String emri, Banka banka, double shuma){
        this.id = id;
        this.emri = emri;
        this.banka = banka;
        this.shuma = shuma;
    }

    void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Banka: " + this.banka.emri);
        System.out.println("Shuma: " + this.shuma);
    }

    void depono(int shuma){
        if(shuma <= 0){
            System.out.println("Shuma nuk eshe valide!");
            return;
        }
        this.shuma += shuma;
//        System.out.println("Shuma " + shuma + " u deponua me sukses!");
        System.out.printf("Shuma %d u deponua me sukses!\n", shuma);
    }
    void terheq(int shuma){
        if(shuma > this.shuma){
            System.out.println("Shuma nuk eshte valide!");
            return;
        }
        this.shuma -= shuma;
        System.out.printf("Shuma %d u terheq me sukses! Vlera e mbetur: %f\n",
                shuma, this.shuma);
    }
}














