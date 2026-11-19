package group_04.java_07;

public class Main2 {

}


//Student: id, emri, email, notaMesatare
//StafAkademik: id, emri, email, titulli, lenda

/*
Person: id, emri, email

Student -> Person: notaMesatare
StafAkademik -> Person: titullin, lenden
 */
class Person{
    private int id;
    private String name;
    private String email;

    protected Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printDetails(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
    }
}

class StafAkademik extends Person{
    private String title;
    private String subject;

    public StafAkademik(int id, String name, String email,
                        String title, String subject){
        super(id, name, email);
        this.title = title;
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Title: " + this.title);
        System.out.println("Subject: " + this.subject);
    }
}

class Studenti extends Person{
    private double avgGrade;
    public Studenti(int id, String name, String email,
                   double avgGrade){
        super(id, name, email);
        this.avgGrade = avgGrade;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Avg grade: " + this.avgGrade);
    }
}






