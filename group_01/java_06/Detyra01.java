package group_01.java_06;

import java.util.ArrayList;

// ArrayList, HashSet, HashMap
public class Detyra01 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5); // [5]
        numbers.add(9); // [5, 9]
        numbers.addFirst(10); // [10, 5, 9]
        numbers.add(1, 20); // [10, 20, 5, 9]
        Integer numberToRemove = 5;
        numbers.remove(numberToRemove); // [10, 20, 9]
        numbers.remove(2); // [10, 20]
        int numri = numbers.get(1);
        System.out.println(numri);
        numbers.set(1, 30);
        numbers.getFirst();
        numbers.getLast();
        numbers.size();
        numbers.contains(20);
//        numbers.clear();
        numbers.reversed();
        numbers.forEach(
                (element) -> {
                    System.out.println("Element:" + element);
                }
        );
        numbers.toArray();
        numbers.indexOf(20);
        System.out.println(numbers);
    }
}
