package group_01.java_08;

import java.util.ArrayList;

/*
Restaurant -> name, address, delivery list, amount (delivery amount)
Delivery ->
    - pick up (0$)
    - fast delivery (5$/km)
    - normal delivery (1$/km)
 */
public class Detyra01 {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant("Koha 1", "Prishtine");
        restaurant.addDelivery(new Delivery(10));
        restaurant.addDelivery(new FastDelivery(12));
        restaurant.addDelivery(new NormalDelivery(22.5f));
        restaurant.addDelivery(new FastDelivery(5.5f));
        restaurant.addDelivery(new Delivery(2.5f));
        restaurant.addDelivery(new NormalDelivery(12.2f));
        System.out.println("Amount: " + restaurant.amount());
    }
}

class Delivery{ // pickup
    private final float charge = 1;
    private float distance;
    public Delivery(float distance){
        this.distance = distance;
    }
    public float cost(){
        return this.charge + this.distance * 0;
    }

    public float getDistance(){
        return this.distance;
    }
}

class FastDelivery extends Delivery{
    public FastDelivery(float distance){
        super(distance);
    }

    @Override
    public float cost(){
        return super.cost() + this.getDistance() * 5.0f;
    }
}

class NormalDelivery extends Delivery{
    public NormalDelivery(float distance){
        super(distance);
    }

    @Override
    public float cost(){
        return super.cost() + this.getDistance();
    }
}

class Restaurant{
    private String name;
    private String address;
    private ArrayList<Delivery> deliveries;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        this.deliveries = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Delivery> getDeliveries() {
        return deliveries;
    }

    public void addDelivery(Delivery delivery) {
        this.deliveries.add(delivery);
    }

    public float amount(){
        float amount = 0.0f;
        for(Delivery d : this.deliveries){
            amount += d.cost();
        }
        return amount;
    }
}
