package group_03.java_01;

public class Main {

    static double notaMesatare(int[] notat){ // void
        double sum = 0.0;
        for(int nota : notat){
            sum += nota;
            // sum = sum + nota;
        }
        return sum / notat.length;
    }

    void shtypDetajet(){

    }

    public static void main(String[] args){
       // cout << "Hello World \n";
       System.out.println("Hello World!");
       System.out.print("Hello World!");
       //float, int, boolean, char, double
       //String
       int numri = 10;
       boolean check = true; //false
       double vlerad = 4.54;
       float vleraf = 4.54f;
       char c = 'a';

       String emri = "filan fisteku";
       System.out.println("Emri: " + emri);

       int[] notat = new int[]{8, 10, 8, 9, 5};
       int[][] matrix = new int[][]{
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
       };
       // for, while, do-while, foreach
       for(int i = 0; i < notat.length; i++){ // for
           int nota = notat[i];

       }
       for(int nota : notat){ //foreach

       }
//       for(;;){
//
//       }

//       while(true){
//
//       }

       int i = 0;
       while(i < notat.length){

           i++;
       }

       do{

       }while (i < notat.length);

       if(notat[0] > 10){
           // logic ...
       }else if(notat[0] < 5){
           // logic ...
       }else{
           // logic ...
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

       double notaMesatare = notaMesatare(notat);
       System.out.println("Nota mesatare: " + notaMesatare);

   }
}
