package group_02.java_03;

public class Ushtrime01 {
    public static void main(String[] args){
        Student student = new Student();
        student.emri = "Filan";
        student.notaMesatare = 8.8;
        student.departamenti = "Kompjuterike";
        Student.universiteti = "UPZ";
        student.shtypDetajet();

        Student.shtypDetajetStatike();

        Student student2 = new Student();
        student2.emri = "Fisteku";
        student2.shtypDetajet();

        // Math
        int min = Math.min(7, 8);
        int abs = Math.abs(-54);
        Math.random(); // [0, 1)
        for(int i = 0; i < 5; i++){
            System.out.println(Student.getRandomId());
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
        System.out.println("Universiteti: " + Student.universiteti);
    }

    static void shtypDetajetStatike(){
       System.out.println("Universiteti: " + Student.universiteti);
    }

    static int getRandomId(){
        // [0, 1) * 899 999
        // [0, 899 999)
        // [100 000, 999 999)
        // random number [100_000, 999_999)
        return (int)(899999 * Math.random() + 100000);
    }
}
















