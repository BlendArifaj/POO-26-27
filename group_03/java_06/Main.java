package group_03.java_06;

public class Main {
    public static void main(String[] args){
        //String pool = [ ]
        String name = "Filan Fisteku"; // ["Filan Fisteku"]
        name = "Fisteku Filan"; // ["Filan Fisteku", "Fisteku Filan"]

        String name2 = "Filan Fisteku"; // ["Filan Fisteku", "Fisteku Filan"]

        String name3 = "Filan Fisteku";

        String name4 = new String("Filan Fisteku");

        System.out.println("Name: " + name);
        System.out.println("Name2: " + name2);
        System.out.println("Name3: " + name3);
        System.out.println("Name4: " + name4);

        System.out.println("Name3 == Name4: " + (name3 == name4));
        System.out.println("Name2 == Name3: " + (name2 == name3));

        System.out.println(name.toUpperCase());
        System.out.println(name);
        name = name.toUpperCase();
        name = name.toLowerCase();
        boolean isEmpty = name.isEmpty();
        char c = name.charAt(0);
        //"Sot eshte nje dite e mire"
        name.split(" "); // ["Sot", "eshte", "nje", "dite", "e", "mire"]
        name.split(""); // ["S", "o", "t", " ", "e", ..., "r", "e"]
        name.split("e"); // "Sot ,sht, nj, dit, , mir," => {"Sot", "sht", " nj", " dit", " ", " mir", ""}
        name.split("eshte");// "Sot , nje dite e mire" ["Sot ", " nje dite e mire"]

        char[] chars = name.toCharArray();
        String name5 = new String(chars);
        // "Filan Fisteku"
        name = name.substring(0, 5); // "Filan"
        // "  Filan Fisteku "
        name = name.trim();// "Filan Fisteku"
        name = name.replace("Fi","Li"); // "Lilan Listeku"
        name.equals("Filan Fisteku");
        boolean isEquals = name.equals(name4);
        boolean contains = name.contains("Filan");


        // Detyra e provimit
//        String numrat = "";
//        //012345678910
//        for(int i = 0; i < 1000000; i++){
//            numrat += i;
//        }
//        System.out.println(numrat);


        //StringBuilder && StringBuffer
        StringBuilder sb = new StringBuilder("Filan Fisteku");
        sb.replace(0, 3, "Replace Text");
        sb.reverse();
        sb.insert(0, "Inserted Text");
        sb.deleteCharAt(1);
        sb.delete(0, 3);
        sb.append("Append text");
        sb.isEmpty();
        System.out.println(sb);
        String sbText = sb.toString();
    }
}
