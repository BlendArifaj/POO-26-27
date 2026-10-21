package group_05.java_01;
//

public class Main {
    static double notaMesatare(int[] notat){
       double sum = 0.0;
       for(int nota : notat){
           sum += nota;
       }
       return sum / notat.length;
    }

    static void shtypDetajet(int[] notat){
        // logic ...
    }

    public static void main(String[] args){
        // cout << "Hello World! \n";
        // cin >> emri;
        System.out.println("Hello World!");

        // int, char, float, double, boolean
        // string -> String
        int numri;
        numri = 10;
        char c = 'c';
        double valueD = 10.8;
        float valueF = 10.8f;
        boolean check = true; // false
        String emri = "Filan Fisteku";
        int[] notat = new int[]{10, 9, 8, 7};
        notat[0] = 10;
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrix[0][2] = 8;

        if(notat[2] == 10){
            System.out.println("Nota maksimale");
        }else if(notat[2] == 5){
            System.out.println("Nota minimale");
        } // ... else if
        else{
            System.out.println("Nota nuk eshte valide!");
        }

        char operator = '+';
        switch (operator){
            case '+':
                // logic ...
                break;
            case '-':
                // logic ...
                break;
            default:
                // logic ...
        }

        // for, while, do-while, foreach
        for(int i = 0; i < notat.length; i++){
            int nota = notat[i];
            if(nota == 5){
                continue;
            }
            // logic...
        }
        for(int nota : notat){
            // logic...
        }
//        for(;;){
//
//        }
//        while(true){
//
//        }

        int i = 0;
        while(i < notat.length){
            i++;
        }

        do{

        }while (i < notat.length);


        double notaMes = notaMesatare(notat);

        shtypDetajet(notat);


    }
}
