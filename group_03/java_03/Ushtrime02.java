package group_03.java_03;


import java.util.Scanner;

public class Ushtrime02 {
    public static void main(String[] args){
        //Scanner - []
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vendose vleren e numrit: ");
        // [  10 sot eshte nje dite e bukur ]
        int numri = scanner.nextInt(); // cin >> numri;

        System.out.print("Vendose vleren: ");
        double vlera = scanner.nextDouble();

        System.out.print("Vendose fjalen: ");
        String fjala = scanner.next();
        scanner.nextLine();

        System.out.print("Vendose fjaline: ");
        String fjalia = scanner.nextLine();

        System.out.println("Numri i shtypur: " + numri);
        System.out.println("Vlera: " + vlera);
        System.out.println("Fjala: " + fjala);
        System.out.println("Fjalia: " + fjalia);


    }
}
