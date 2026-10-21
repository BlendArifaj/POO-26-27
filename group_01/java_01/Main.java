package group_01.java_01;

public class Main{
    static double llogariteNotenMesatare(int[] notat){
        int sum = 0;
        int notatLength = notat.length;
        for(int nota : notat){
            sum += nota;
        }
//        for(int i = 0; i < notat.length; i++){
//            sum += notat[i];
//        }
        return (sum * 1.0) / notatLength;
    }

    public static void main(String[] args){
        // cout << "Hello World!" << "\n";
        // cin >>
        System.out.println("Hello World!");
        System.out.print("Hello World!");

        int numri;
        numri = 10;
        float vlera = 5.6f;
        double vleraDouble = 5.6;
        boolean check = true; // false
        char c = 'c';
        long longInt = 1;
        // float, double, boolean, char,long, short, byte

        // String
        String emri = "filan fisteku";
        System.out.println(emri);

        if(numri >= 5){
            System.out.println("Numri eshte me i madh se 5.");
        }else if(numri >= 10){
            System.out.println("Numri eshte me i madh se 10.");
        }else if(numri >= 15){
            // ..
        }else{
            System.out.println("Numri eshte 0.");
        }
        c = 'a';
        switch (c){
            case 'e':
                System.out.println("Vlera 'e'");
                break;
            case 'b':
                // ...
                break;
            default:
                System.out.println("default");
        }
        //for, while, do-while, foreach
        // i++ = i+=1 = i = i + 1
        for(int i=0; i <10; i++){
            // ...
        }
        int i = 0;
        while(i < 5){
            // ...
            i++;
            i += 2;
        }
        while(true){
            break;
        }
        do{
            // logic ...
            if(numri == 2){
                continue;
            }
        }while (numri < 5);

        int[] vargu = new int[5];
        vargu[0] = 5;
        vargu[1] = 3;
        for(int j = 0; j < vargu.length; j++){
            int elementi = vargu[j];
        }

        // foreach
        for(int elementi : vargu){

        }


        double nota_mesatare;
        double notaMesatare;


    }
}
