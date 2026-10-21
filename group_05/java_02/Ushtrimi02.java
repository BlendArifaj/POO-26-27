package group_05.java_02;
/*
Banka:
    Vecorite:
        -   id: int
        -   emri: String

LlogariaBankare
    Vecorite:
        -   id: int
        -   perdoruesi: String
        -   banka: Banka
        -   bilanci: double
        -   valuta: String
    Metodat:
        -   shtypBilancin()
        -   shtypDetajet()
        -   depono(int shuma)
        -   terheq(int shuma)

Main: 3 objekte -> perdorim metodat e objekteve
 */

public class Ushtrimi02 {
    public static void main(String[] args){
        Banka rbko = new Banka();
        Banka nlb = new Banka();

        LlogariaBankare l1 = new LlogariaBankare(
                1234,
                "Filan Fisteku",
                rbko,
                "EUR"
        );

        LlogariaBankare l2 = new LlogariaBankare(
                5432,
                "Filan Fisteku",
                nlb,
                "USD"
        );
        l1.depono(100);
        l1.terheq(50);
        l1.terheq(70);
        l1.shtypDetajet();
    }
}


class Banka{
    int id;
    String emri;
}

class LlogariaBankare{
    int id;
    String perdoruesi;
    Banka banka;
    double bilanci;
    String valuta;
    LlogariaBankare(int id, String perdoruesi, Banka banka, String valuta){
        this.id = id;
        this.perdoruesi = perdoruesi;
        this.banka = banka;
        this.bilanci = 0.0;
        this.valuta = valuta;
    }
    void shtypBilancin(){
        System.out.println("Bilanci aktual: " + this.bilanci + this.valuta);
    }
    void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Perdoruesi: " + this.perdoruesi);
        System.out.println("Banka: " + this.banka.emri);
        this.shtypBilancin();
    }
    void depono(int shuma){
        if(shuma <= 0){
            System.out.println("Shuma nuk eshte valide!");
            return;
        }
        this.bilanci += shuma;
        this.shtypBilancin();
    }
    void terheq(int shuma){
        if(shuma <=0 || shuma > this.bilanci){
            System.out.println("Shuma nuk eshte valide!");
            return;
        }
        this.bilanci -= shuma;
        this.shtypBilancin();
    }
}



















