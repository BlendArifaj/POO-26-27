package group_02.java_07;

//Person
//Student, StafAkademik, StafAdministativ


public class Main2 {
}

class Person{
    // id, emri, email
    private int id;
    private String emri;
    private String email;

    public Person(int id, String emri, String email) {
        this.id = id;
        this.emri = emri;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void shtypDetajet(){
        System.out.println("Id: " + this.getId());
        System.out.println("Emri: " + this.getEmri());
        System.out.println("Email: " + this.getEmail());
    }
}

class Student extends Person{
    private double notaMesatare;

    public Student(int id, String emri, String email,
                   double notaMesatare){
        super(id, emri, email);
        this.notaMesatare = notaMesatare;
    }

    public double getNotaMesatare(){
        return this.notaMesatare;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Nota mesatare: " + this.getNotaMesatare());
    }

}
class StafAkademik extends Person{
    private String titulli;
    //...

    public StafAkademik(int id, String emri, String email,
                        String titulli) {
        super(id, emri, email);
        this.titulli = titulli;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Titulli: " + this.titulli);
    }
}
