package group_01.java_04;

import java.util.Scanner;

/*
Te krijohet sistemi interakiv "Banka"

Menu:
    1 - Perditeso te dhenat (Id, Emri, Adresa, Shuma)
    2 - Depono shumen
    3 - Terheq shumen
    4 - Shfaq detajet ne ekran
 */
public class Detyra01 {
    public static void main(String[] args){
        BankApp.run();
    }
}

class BankApp{
    private BankClient client;

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            BankApp.printMenu();
            System.out.print("User input: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    // TODO
                    break;
                case 2:
                    // TODO
                    break;
                case 3:
                    // TODO
                    break;
                case 4:
                    // TODO
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Wrong input! Try again!");
            }

        }
    }

    private static void printMenu(){
        System.out.println("============== Bank App Menu: =================");
        System.out.println("Press 1 to update Client data");
        System.out.println("Press 2 to deposit amount");
        System.out.println("Press 3 to withdraw amount");
        System.out.println("Press 4 to display client data");
        System.out.println("Press 0 to exit");
        System.out.println("===============================================");
    }
}

class BankClient{
    private int id;
    private String name;
    private double balance;
    private String address;

    public BankClient(int id, String name, double balance, String address) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean deposit(int amount){
        if(amount > 0){
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(int amount){
        if(amount < 0 || amount > this.balance){
            return false;
        }
        this.balance -= amount;
        return true;
    }
}
