package group_01.java_06;

public class Main {
    public static void main(String[] args){
        // Spring pool = [ ]
        // Spring pool = ["Filan Fisteku"]
        String name = "Filan Fisteku";
        name = "Fisteku Filan"; // Spring pool = ["Filan Fisteku", "Fisteku Filan"]

        String name2 = new String("Filan Fisteku");

        // metodat e klases String
        //["Filan Fisteku"]
        name = name.toLowerCase();
        name = name.toUpperCase();
        boolean isEmpty = name.isEmpty();
        char c = name.charAt(5);
        int length = name.length();
        char[] chars = name.toCharArray(); // ['F', 'i', 's', ...,'a','n']
        name = new String(chars);
        name = name.replace("FI", "LI");
        //name.replaceFirst("FI","LI");
        name = name.substring(3, 5);
        name = name.trim();//"  Filan Fisteku  " => "Filan Fisteku"
        //"Sot eshte nje dite e mire";
        name.split(""); // => ["S","o","t"," ","e"...]
        name.split(" ");// ["Sot", "eshte","nje","dite","e","mire"];
        //"Sot ,sht, nj, dit, , mir,"
        name.split("e");//["Sot ","sht"," nj"," dit"," "," mir",""]

        System.out.println("Name: " + name);
        System.out.println("Name2: " + name2);

        String string1 = new String("Hello World!");
        String string2 = "Hello World!";//new String("Hello World!");

        System.out.println(string1 == string2);
        boolean sameContent = string1.equals(string2);
        System.out.println(sameContent);

        //StringBuilder StringBuffer
        StringBuilder sb = new StringBuilder("Filan Fisteku");
        sb.append(" Fisteku");
        sb.reverse();
        sb.replace(0, 4, "Test");
        sb.deleteCharAt(0);
        sb.insert(6, "Inserted String");
        String content = sb.toString();
        System.out.println(sb);

    }
}
