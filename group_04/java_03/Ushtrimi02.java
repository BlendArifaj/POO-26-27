package group_04.java_03;


import java.util.Scanner;

//Scanner
public class Ushtrimi02 {
    public static void main(String[] args){
        // [10 5.5 Sot eshte nje dite e mire]
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vendose numrin: ");
        int numri = scanner.nextInt();

        System.out.print("Vendose vleren: ");
        double vlera = scanner.nextDouble();

        System.out.print("Vendose fjalen: ");
        String fjala = scanner.next();

        scanner.nextLine();
        System.out.print("Vendosje fjaline: ");
        String fjalia = scanner.nextLine();

        System.out.println("Numri i vendosur: " + numri);
        System.out.println("Vlera: " + vlera);
        System.out.println("Fjala: " + fjala);
        System.out.println("Fjalia: " + fjalia);
    }
}
