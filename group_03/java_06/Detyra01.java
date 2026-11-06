package group_03.java_06;

import java.util.ArrayList;
import java.util.List;

// ArrayList, HashSet, HashMap
public class Detyra01 {
    public static void main(String[] args){
        //Integer <-> int
        //Double <-> double
        //Float <-> float
        //Boolean <-> boolean
        //Character <-> char

        Integer numri = 5;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(15);
        numbers.add(1, 30);
        numbers.set(3, 50);
        numbers.addFirst(22);
        numbers.addLast(90);
        numbers.get(0);
        int size = numbers.size();
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        for(Integer i : numbers){
            System.out.println(i);
        }
        numbers.forEach(
                (i) ->{
                    System.out.println(i);
                }
        );
        numbers.contains(10);
        numbers.removeFirst();
        numbers.removeLast();
        Integer numberToRemove = 10;
        numbers.remove(numberToRemove);
        numbers.remove(2);
        System.out.println(numbers);
    }
}
