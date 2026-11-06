package group_02.java_06;

public class Main {
    public static void main(String[] args){
        //String pool = [ ]
        String name = "Filan Fisteku"; // ["Filan Fisteku"]

        name = "  Fisteku Filan  "; // ["Filan Fisteku", "Fisteku Filan"]

        name.toUpperCase(); //  ["Filan Fisteku", "Fisteku Filan", "FILAN FISTEKU"]

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();//
        name = name.replace("fi", "li");
        name = name + " Fiteku";
        name.concat("Fiteku");
        //"Sot eshte nje dite e mire"
        name = name.substring(0, 5);//"Sot e",
        char c = name.charAt(3);
        char[] chars = name.toCharArray(); // "Filan" => ['F','i','l','a','n']
        name = new String(chars);
        //Sot eshte nje dite e mire
        //
        name.split(" "); //["Sot", "eshte", "nje", "dite", "e", "mire"]
        name.split("");//["S","o","t"," ","e",..."e"]
        //[Sot ,sht, nj, dit, , mir,]
        name.split("e");//["Sot ","sht"," nj"," dit"," "," mir",""]
        boolean isEmpty = name.isEmpty();
        name.indexOf("eshte");

        System.out.println(name.toUpperCase());
        System.out.println(name);

        String name3 = "Filan Fisteku"; // ["Filan Fisteku", "Fisteku Filan"]
        String name4 = "Filan Fisteku";


        String name2 = new String("Filan Fisteku");
        name2 = "A";
        name2 = new String("A");


        String text1 = "Hello World!"; // new String("Hello World!");
        String text2 = new String("Hello World!"); // new String("Hello World!");

        System.out.println("text1 == text2: " + (text1 == text2));

        boolean sameContent = text1.equals(text2);
        boolean contains = text1.contains(text2);

        //StringBuilder && StringBuffer
        StringBuilder sb = new StringBuilder("Filan Fisteku");
        sb.append(" Student");
        sb.insert(0,"Mr. ");
        sb.insert(3, "Test");
        sb.reverse();
        sb.replace(0, 5, "Replace");
        sb.delete(0, 2);
        sb.deleteCharAt(10);
        String sub = sb.substring(10, 12);
        String s = sb.toString();

        System.out.println("SB: " + sb);

//
//        String numrat = "";
//        for(int i = 0; i < 1000000;i++){
//            numrat += i;
//        }
//        System.out.println(numrat);

    }
}
