package group_04.java_06;

public class Main {
    public static void main(String[] args){
        // String pool: { }
        String name = "Filan Fisteku"; // {"Filan Fisteku"}
        name = "Fisteku Filan"; // {"Filan Fisteku", "Fisteku Filan"}

        String name2 = new String("Filan Fisteku");
        String name3 = "Filan Fisteku"; // same ref
        String name4 = "Filan Fisteku"; // same ref

        System.out.println("Name2: " + name2);
        System.out.println("Name3: " + name3);
        System.out.println("Name4: " + name4);

        System.out.println("Name2 == Name3: " + (name2 == name3));
        System.out.println("Name3 == Name4: " + (name3 == name4));

        System.out.println("Uppercase: " + name3.toUpperCase());
        System.out.println("Name3: " + name3);
        name3 = name3.toUpperCase();
        name3 = name3.toLowerCase();
        //"Filan Fisteku"
        name3.replace("Fi", "Li"); // "Lilan Listeku"

        //" Filan Fisteku   "
        name3.trim(); // "Filan Fisteku"

        name3.substring(5, 7);

        // "Sot eshte nje dite e mire"
        name3.split(" "); // ["Sot", "eshte", "nje", "dite", "e", "mire"]
        name3.split(""); // ["S","o","t"," ","e",..."r","e"]
        //"Sot eshte nje dite e mire" => "Sot ,sht, nj, dit, , mir,"
        name3.split("e"); // ["Sot ", "sht"," nj", " dit"," "," mir", ""]
        name3.split("eshte"); // ["Sot ", " nje dite e mire"]

        char[] chars = name3.toCharArray();
        String text = new String(chars);

        char c = name3.charAt(2);
        name3.isEmpty();
        //"Filan Fisteku"
        name3.indexOf("F"); // 0
        name3.indexOf("lan"); // 2
        name3.contains("Filan"); // True

        name3.equals("Filan Fisteku");
        name3.equals(name2);


        // Detyra e provimit
        // 01234567891011121314151617.....
//        String numbers = "";
//        for(int i = 0; i < 100000000; i++){
//            numbers += i;
//        }
//        System.out.println(numbers);

//        StringBuilder sb = new StringBuilder("");
//        for(int i = 0; i < 1000000; i++){
//            sb.append(i);
//        }
//        String numbers = sb.toString();

        //StringBuilder && StringBuffer
        StringBuilder sb = new StringBuilder("Filan Fisteku");
        sb.append(" Append text");
        sb.insert(0, "Insert text");
        sb.reverse();
        sb.isEmpty();
        sb.delete(0, 10);
        sb.indexOf("text");
        sb.charAt(0);
        sb.replace(2, 5, "Replaced text");

        String newText = sb.toString();

        System.out.println(sb);
    }
}
