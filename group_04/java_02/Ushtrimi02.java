package group_04.java_02;

/*
Banka:
    -   id
    -   emri

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

        LlogariaBankare l1 = new LlogariaBankare(123, "Filan", rbko, "EUR");
        l1.depono(150);
        l1.terheq(200);
        l1.terheq(100);
        l1.shtypBilancin();
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
        System.out.println("Bilanci eshte: " + this.bilanci + this.valuta);
    }
    void depono(int shuma){
        if(shuma <= 0){
            System.out.println("Shuma nuk eshte valide per deponim!");
            return;
        }
        this.bilanci += shuma;
        this.shtypBilancin();
    }
    void terheq(int shuma){
        if(shuma <= 0 || shuma > this.bilanci){
            System.out.println("Shuma per terheqje nuk eshte valide!");
            return;
        }
        this.bilanci -= shuma;
        this.shtypBilancin();
    }
}










