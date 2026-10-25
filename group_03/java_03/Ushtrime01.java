package group_03.java_03;

public class Ushtrime01 {
    public static void main(String[] args){
        Student studenti1 = new Student();
        studenti1.emri = "Filan";
        studenti1.notaMesatare = 8.8;
        studenti1.departamenti = "Kompjuterike";
        studenti1.shtypDetajet();

        Student studenti2 = new Student();
        studenti2.emri = "Fistek";
        studenti2.shtypDetajet();

//        Math
        int max = Math.max(5, 9);
        double cos = Math.cos(90);
        Math.random(); // [0, 1)
        for(int i = 0; i < 5; i++){
            System.out.println("Random value: " + Student.randomId());
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

    static int randomId(){
        // [1000, 9999)
        // Math.random() -> [0, 1) -> [0, 10000)
        // [0, 1) * 8999 => [0, 8999) + 1000 => [1000, 9999)
        return (int)(Math.random() * 8999 + 1000);
    }

    static void shtypDetajetStatike(){
//        this.shtypDetajet(); X
        System.out.println("Universiteti: " + Student.universiteti);
    }
}