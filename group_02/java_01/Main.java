package group_02.java_01;

public class Main {
    // nota_mesatare
    static double notaMesatare(int[] notat){ //void
       int sum = 0;
       for(int nota : notat){
           sum += nota;
       }

       return sum * 1.0 / notat.length;
    }

    public static void main(String[] args){
        // cout << "Hello World" << "\n";
        System.out.println("Hello World!");
        // int, float, double, char, boolean
        // String
        int numri;
        numri = 10;
        float vlera1 = 5.0f;
        double vlera2 = 5.0;
        char c = 'c';
        String emri = "Filan Fisteku";
        boolean check = true; // false

        System.out.println("Emri: " + emri);

        int[] vargu = new int[5];
        vargu[0] = 10;
        vargu[1] = 8;
        vargu[2] = 7;
        vargu[3] = 8;
        vargu[4] = 9;

        int[][] matrix = new int[3][3];
        matrix[0][0] = 5;
        matrix[1][2] = 7;

        if(vargu[0] > 5){
            System.out.println("Vlera eshte me e madhe se 5!");
        }else if(vargu[1] < 4){
            // logic ...
        }
        //...
        else{
            System.out.println("Else ...");
        }

        switch (numri){
            case 1:
                System.out.println("1");
                break;
            case 2:
                // logic ...
                break;
            default:
                break;
        }

        // for, while, do-while, foreach
        for(int i = 0; i < 5; i+=2){
            // break;

            // continue;
        }
        int i = 0;
        while(i < 5){
            // logic ...
            i++;
        }
        while(true){
            break;
        }

        int j = 0;
        do{
            // logic ...
        }while (j < 5);

        //foreach
//        for(int i = 0; i < vargu.length; i++){
//            int numri = vargu[i];
//
//        }
        for(int numer : vargu){

        }

        double notaMesatare = notaMesatare(vargu);


    }
}
