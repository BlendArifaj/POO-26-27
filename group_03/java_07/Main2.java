package group_03.java_07;

public class Main2 {

}

// A -> B (protected)
// A -> B, C
// A -> B -> C (protected)
class Person{
    private int id;
    private String emri;
    private String email;
    private String fakulteti;

    public Person(int id, String emri, String email, String fakulteti) {
        this.id = id;
        this.emri = emri;
        this.email = email;
        this.fakulteti = fakulteti;
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

    public String getFakulteti() {
        return fakulteti;
    }

    public void setFakulteti(String fakulteti) {
        this.fakulteti = fakulteti;
    }

    public void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Email: " + this.email);
        System.out.println("Fakulteti: " + this.fakulteti);
    }
}

class StafAkademik extends Person{
    private String titulli;
    private String lenda;
    public StafAkademik(int id, String emri, String email, String fakulteti,
                        String titulli, String lenda){
        super(id, emri, email, fakulteti);
        this.titulli = titulli;
        this.lenda = lenda;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public String getLenda() {
        return lenda;
    }

    public void setLenda(String lenda) {
        this.lenda = lenda;
    }

    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Titulli: " + this.titulli);
        System.out.println("Lenda: " + this.lenda);
    }
}

class Studenti extends Person{
    private double notaMesatare;

    public Studenti(int id, String emri, String email, String fakulteti,
                    double notaMesatare) {
        super(id, emri, email, fakulteti);
        this.notaMesatare = notaMesatare;
    }

    public double getNotaMesatare(){
        return this.notaMesatare;
    }

    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Nota mesatare: " + this.notaMesatare);
    }
}
