package group_01.java_03;


import java.util.Scanner;

public class Ushtrime02 {
    public static void main(String[] args){
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // int numri; cin >> numri;
        int numri;
        System.out.print("Vendoseni numrin: ");
        numri = scanner.nextInt();

//        char c = scanner.next();
        System.out.print("Vendose vleren: ");
        double vlera = scanner.nextDouble();
        System.out.print("Vendose shumen: ");
        float shuma = scanner.nextFloat();
//        boolean check = scanner.nextBoolean();
        System.out.print("Vendose fjalen: ");
        String word = scanner.next();

        System.out.print("Vendose nje fjali: ");
        String sentence = scanner.nextLine();

        System.out.println("Ju keni vendosur numrin: " + numri);
        System.out.println("Ju keni vendosur vleren: " + vlera);
        System.out.println("Ju keni vendosur shumen: " + shuma);
        System.out.println("Ju keni vendoru fjalen: " + word);
        System.out.println("Fjalia: " + sentence);
//        String sentence = scanner.nextLine();
    }
}
