package group_04.java_03;

import java.util.Scanner;

public class Ushtrimi01 {

   public static void main(String[] args){
       Student student1 = new Student();
       student1.emri = "Filan";
       student1.notaMesatare = 9.9;
       student1.departamenti = "Kompjuterike";
       Student.universiteti = "UPZ";
       student1.shtypDetajet();

       Student student2 = new Student();
       student2.emri = "Fisteku";
       student2.shtypDetajet();

       // Math
       int min = Math.min(1, 5);
       double sin = Math.sin(123);
       Math.random(); // [0, 1)
       for (int i = 0; i < 5; i++){
           System.out.println("Vlera: " + Student.getRandomId());
       }
   }
}

class Student{
    String emri;
    double notaMesatare;
    String departamenti;
    static String universiteti = "UP";

    void shtypDetajet(){
        System.out.println("Emri: " + this.emri);
        System.out.println("Nota mesatare: " + this.notaMesatare);
        System.out.println("Departamenti: " + this.departamenti);
        Student.shtypDetajetStatike();
    }

    static void shtypDetajetStatike(){
        // System.out.println("Emri: " + this.emri);
        System.out.println("Universiteti: " + Student.universiteti);
    }

    static int getRandomId(){
        //[100, 999)
        // Math.random() -> [0, 1)
        // [0, 1) -> [0, 1000)
        // [0, 1) * [0, 899) + 100 => [100, 999)
        return (int)(Math.random() * 899 + 100);
    }

    static Student getStudentFromTerminal(){
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.print("Vendose emrin, noten mesatare dhe drejtimin: ");
        st.emri = sc.next();
        st.notaMesatare = sc.nextDouble();
        st.departamenti = sc.next();
        return st;
    }

}
