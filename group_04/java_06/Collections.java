package group_04.java_06;

import java.util.ArrayList;

// ArrayList, HashMap, HashSet
public class Collections {
    public static void main(String[] args){
        /*
        int -> Integer
        double -> Double
        float -> Float
        char -> Character
        boolean -> Boolean
         */
        Integer numri = 10;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(15);
        numbers.addFirst(50);
        numbers.addLast(30);
        numbers.add(1, 100);
        numbers.set(1, 55);
        numbers.get(2);

        Integer numberToRemove = 55;
        numbers.remove(numberToRemove);
//        numbers.removeFirst();
        numbers.remove(1);
        numbers.size();
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        for(Integer number : numbers){
            System.out.println(numbers);
            numbers.indexOf(number);
        }
        numbers.forEach(
                (number) -> {
                    System.out.println(number);
                }
        );
        System.out.println(numbers);









    }
}
