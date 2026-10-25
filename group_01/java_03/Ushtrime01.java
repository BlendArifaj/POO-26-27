package group_01.java_03;

public class Ushtrime01 {
    public static void main(String[] args){
        Student studenti1 = new Student();
        studenti1.emri = "Filan Fisteku";
        studenti1.notaMes = 9.5;
        studenti1.departamenti = "Kompjuterike";

//        studenti1.universiteti = "UPZ";
        Student.universiteti = "UPZ";

        studenti1.shtypDetajet();

        Student studenti2 = new Student();
        studenti2.emri = "Fisteku Filan";
        studenti2.shtypDetajet();

        // Math
        int max = Math.max(5, 8);
        int min = Math.min(12, 18);

        // Math.random(); [0, 1)
        for(int i = 0; i < 5; i++){
            System.out.println(Student.randomId());
        }
        // [10000, 99999)
    }
}

class Student{
    String emri;
    double notaMes;
    String departamenti;
    static String universiteti = "UP";

    void shtypDetajet(){
        System.out.println("Emri: " + this.emri);
        System.out.println("Nota mes: " + this.notaMes);
        System.out.println("Departamenti: " + this.departamenti);
        Student.shtypDetajetStatike();
    }

    static void shtypDetajetStatike(){
        System.out.println("Universiteti: " + Student.universiteti);
    }

    static int randomId(){
        // Math.random() -> [0, 1)
        // [0, 10000)
        // [0, 89999)
        // [10000, 99999)

        // [10000, 99999)
        return (int) (10000 + Math.random() * 89999);
    }
}
