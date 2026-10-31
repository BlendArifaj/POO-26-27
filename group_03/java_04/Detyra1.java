package group_03.java_04;

/*
class BankAccount:
    -   client: String
    -   amount: double
    -   address: String
    -   bankName: String

    - withdraw(int amount)
    - deposit(int amount)
    - displayDetails()
 */
public class Detyra1 {
}

class BankAccount{
    private String client;
    private double amount;
    private String address;
    private String bankName;

    public BankAccount(String client, String address, String bankName) {
        this.client = client;
        this.amount = 0.0;
        this.address = address;
        this.bankName = bankName;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}