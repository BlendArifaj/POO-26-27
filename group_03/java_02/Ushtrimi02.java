package group_03.java_02;
/*
Banka:
    Atributet:
        -   id : int
        -   emri : String

LlogariaBankare
    Atributet:
        -   id : int
        -   emri : String
        -   banka : Banka
        -   bilanci : double
        -   valuta : String
    Metodata:
        -   void shtypDetajet()
        -   void depono(int shuma)
        -   void terheq(int shuma)
        -   void shtypBilancin()

Main:
    -   krijoni 3 objekte dhe perdorni metodat e tyre
*/
public class Ushtrimi02 {
    public static void main(String[] args){
        Banka rbko = new Banka();
        Banka nlb = new Banka();
        LlogariaBankare l1, l2, l3;

        l1 = new LlogariaBankare(1, "Filan Fisteku",rbko,"EUR");
        l2 = new LlogariaBankare(2, "Filan Fisteku", nlb, "USD");

        l1.depono(500);
        l1.depono(100);
        l1.terheq(1000);
        l1.terheq(250);
        l1.shtypDetajet();
    }
}

class Banka{
    int id;
    String emri;
}

class LlogariaBankare{
    int id;
    String emri;
    Banka banka;
    double bilanci;
    String valuta;

    LlogariaBankare(int id, String emri, Banka banka, String valuta){
        this.id = id;
        this.emri = emri;
        this.banka = banka;
        this.bilanci = 0.0;
        this.valuta = valuta;
    }

    void shtypBilancin(){
        System.out.println("Bilanci i llogarise: " + this.bilanci + this.valuta);
//        System.out.printf("Bilanci i llogarise: %f.2 %s", this.bilanci, this.valuta);
    }
    void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        // this.banka.shtypDetajet()
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
        if(shuma <= 0 || shuma > this.bilanci){
            System.out.println("Shume nuk eshte valide!");
            return;
        }
        this.bilanci -= shuma;
        this.shtypBilancin();
    }
}
