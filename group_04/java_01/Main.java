package group_04.java_01;

public class Main {

    static void shtypDetajet(int[] vargu){
        // logic ...
    }

    static double llogariteNotenMestare(int[] notat){
        double sum = 0.0;
        for (int nota : notat) {
            sum += nota;
        }
        return sum / notat.length;
    }

    public static void main(String[] args){
        // cout << "Hello World! \n";
        System.out.println("Hello World!");

        // int, char, float, double, boolean
        // string -> String

        int numri;

        numri = 10;

        char c = 'c';
        double vleraD = 5.5;
        float vleraF = 5.5f;
        boolean check = true; // false

        String emri = "Filan Fisteku";

        int[] vargu = new int[]{9, 10, 8, 5, 6};
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        vargu[0] = 10;
        matrix[1][0] = 0;

        //for, while, do-while, foreach
        for(int i = 0; i < vargu.length; i++){ // for
            int nota = vargu[i];
            // logic ...
            if(nota == 10){
//                continue;
                break;
            }
        }
        for(int nota : vargu){ // foreach
            // logic ...
        }
        int i = 0;
        while(i < vargu.length){
            // logic
            if(vargu[i] == 10){
                i++;
                continue;
            }
            i++;
        }

        do{
            i++;
        }while (i < vargu.length);

        if(vargu[0] == 10){
            System.out.println("Nota eshte maksimale!"); //sout
        }else if(vargu[0] == 5){
            System.out.println("Nota eshte minimale!");
        }else{
            System.out.println("Nota eshte e mire!");
        }
        // +, -, /, *
        char operation = '+';
        switch (operation){
            case '+':
                // logic ...
                break;
            case '-':
                // logic ...
                break;
            case '/':
                // logic ..
                break;
            default:
                // logic ...
        }

        double notaMesatare = llogariteNotenMestare(vargu);
        shtypDetajet(vargu);
    }
}
