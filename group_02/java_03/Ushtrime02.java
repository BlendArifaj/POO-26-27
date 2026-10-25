package group_02.java_03;

import java.util.Scanner;

public class Ushtrime02 {
    public static void main(String[] args){
        //Scanner
        Scanner scanner = new Scanner(System.in);

        //next() -> fjale
        //nextInt() -> number
        //nextFloat() -> vlere me presje dhjetore
        //nextLine() -> fjali
        int numri;
        System.out.print("Vendose numrin: ");
        // cin >> numri;
        numri = scanner.nextInt();

        System.out.print("Vendose vleren e cmimit: ");
        double cmimi = scanner.nextDouble();

        System.out.print("Vendose fjalen: ");
        String fjala = scanner.next();

        System.out.print("Vendose fjaline: ");
        scanner.nextLine();
        String fjalia = scanner.nextLine();

        System.out.println("Numri qe keni shtypur: " + numri);
        System.out.println("Cmimi: " + cmimi);
        System.out.println("Fjala: " + fjala);
        System.out.println("Fjalia: " + fjalia);

    }
}
