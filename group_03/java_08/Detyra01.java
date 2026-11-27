package group_03.java_08;

/*
    MyShop -> name, pay(payment: PaymentMethod,
                           Product: string,
                           Cmimi: float)
    PaymentMethod ->
        - CashPayment
        - CryptoPayment
        - CardPayment
 */
public class Detyra01 {
    public static void main(String[] args){
        MyShop myShop = new MyShop("Shop24/7");

        // Options
        Payment payment1 = new Payment();
        Payment payment2 = new CardPayment();
        Payment payment3 = new CashPayment();
        CryptoPayment payment4 = new CryptoPayment();
        CardPayment payment5 = new BankTransferPayment();

        myShop.pay(payment1, "Product 1", 10.5f);
        myShop.pay(payment2, "Product 2", 100.0f);
        myShop.pay(payment3, "Product 3", 112.2f);
        myShop.pay(payment4, "Product 4", 55.55f);
        myShop.pay(payment5, "Product 5", 12.22f);

    }
}
class MyShop{
    private String name;
    public MyShop(String name){
        this.name = name;
    }
    public void pay(Payment payment, String product, float cost){
        boolean isSuccess = payment.pay(product, cost);
        if(isSuccess){
            System.out.println("Payment confirmed!");
            return;
        }
        System.out.println("Please, retry again later!");
    }
}

class Payment{
    public boolean pay(String product, float cost){
        System.out.println("Payment is not valid!");
        return false;
    }
}

class CashPayment extends Payment{
    public boolean pay(String product, float cost){
        System.out.println("Client is paying product " + product
                            + "that costs " + cost +" with cash!"
        );
        // ...
        return true;
    }
}
class CardPayment extends Payment{
    public boolean pay(String product, float cost){
        System.out.println("User is paying with card.");
        // ... logic
        return true;
    }
}
class CryptoPayment extends Payment{
    public boolean pay(String product, float cost){
        System.out.println("User is paying with crypto.");
        // ... logic
        return true;
    }
}
class BankTransferPayment extends CardPayment{

}
