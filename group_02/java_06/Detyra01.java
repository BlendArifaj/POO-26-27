package group_02.java_06;

import java.util.ArrayList;

//ArrayList, HashMap, HashSet
public class Detyra01 {
    public static void main(String[] args){
        //int <-> Integer
        //double <-> Double
        //float <-> Float
        Integer numri = 5;
        ArrayList<Integer> numrat = new ArrayList<>();
        numrat.add(10);
        numrat.add(20);
        numrat.add(30);
        numrat.add(0, 50);
        numrat.addFirst(70);
        numrat.add(4, 100);
        numrat.addFirst(0);
        System.out.println(numrat);

        numrat.contains(100);
        numrat.indexOf(100);

        Integer numberToRemove = 100;
        numrat.remove(numberToRemove);
        numrat.remove(1);
        System.out.println(numrat);

        numrat.toArray();
        numrat.size();
        numrat.forEach(
                (e) ->{
                    System.out.println("Element: " + e);
                }
        );

    }
}
