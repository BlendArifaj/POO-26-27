package group_05.java_04;

/*
Te krijohet klasa BankAccount:
    -   clientName
    -   bankName
    -   amount
    -   address

Metodat:
    -   withdraw()
    -   deposit()
    -   displayDetails()
 */
public class Detyra01 {
    public static void main(String[] args){
        BankAccount acc = BankAccount.getInstance("Filan Fisteku", "RBKO", "Prishtine");
        acc.deposit(200);
        acc.deposit(124);
        acc.deposit(-100);
        acc.withdraw(150);
        acc.withdraw(500);
        acc.displayDetails();
    }
}

class BankAccount{
    private String clientName;
    private String bankName;
    private double amount;
    private String address;

    private BankAccount(String clientName, String bankName, String address){
        this.clientName = clientName;
        this.bankName = bankName;
        this.address = address;
    }

    public static BankAccount getInstance(String clientName, String bankName, String address){
        // validate data
        return new BankAccount(clientName, bankName, address);
    }
    // getters
    public String getClientName(){
        return this.clientName;
    }
    public String getBankName(){
        return this.bankName;
    }
    public String getAddress(){
        return this.address;
    }
    public double getAmount(){
        return this.amount;
    }
    //setters
    public void setClientName(String clientName){
        this.clientName = clientName;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public void withdraw(int amount){
        if(amount < 0 || amount > this.amount){
            System.out.println("Amount is not valid!");
            return;
        }
        this.amount -= amount;
    }

    public void deposit(int amount){
        if(amount < 0){
            System.out.println("Amount is not valid!");
            return;
        }
        this.amount += amount;
    }

    public void displayDetails(){
        System.out.println("Client name: " + this.clientName);
        System.out.println("Bank name: " + this.bankName);
        System.out.println("Address: " + this.address);
        System.out.println("Amount: " + this.amount);
    }
}
