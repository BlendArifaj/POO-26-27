package group_02.java_02;

// LlogariaBankare
// - id: int
// - emri: String
// - banka: Banka
// - bilanci (mjetet/shuma): double
// - valuta: String

// + void shtypDetajet
// + void deponoShumen(int shuma)
// - void terheqShumen(int shuma)
// main -> 3 objekte + perdorimi i metodave

// Banka
// - id
// - emri
public class Ushtrime02 {
    public static void main(String[] args){
        Banka rbko = new Banka(1234, "RBKO");

        LlogariaBankare l1 = new LlogariaBankare(
                12434,
                "Filan Fisteku",
                rbko,
                "EUR"
        );
        l1.deponoShumen(250);
        l1.terheqShumen(500);
        l1.terheqShumen(100);
        l1.shtypDetajet();
    }
}

class LlogariaBankare{
    int id;
    String emri;
    Banka banka;
    double bilanci;
    String valuta;

    LlogariaBankare(
            int id, String emri,
            Banka banka, String valuta
    ){
        this.id = id;
        this.emri = emri;
        this.banka = banka;
        this.bilanci = 0;
        this.valuta = valuta;
    }
    void shtypDetajet(){
        // ...
        this.banka.shtypDetajet();
    }
    void deponoShumen(int shuma){
        if(shuma <= 0){
            System.out.println("Shuma nuk eshte valide!");
            return;
        }
        this.bilanci += shuma;
        System.out.println("Bilanci aktual: " + this.bilanci);
    }
    void terheqShumen(int shuma){
        if(shuma <= 0 || shuma > this.bilanci){
            System.out.println("Shuma nuk eshte valide!");
            return;
        }
        this.bilanci -= shuma;
        System.out.println("Bilanci aktual: " + this.bilanci);
    }
}

class Banka{
    int id;
    String emri;

    Banka(int id, String emri){
        this.id = id;
        this.emri = emri;
    }

    void shtypDetajet(){

    }
}







