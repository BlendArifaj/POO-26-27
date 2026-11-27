package group_02.java_08;
/*
IdScanner -> id, room, scan(), ???

Card -> id
StudentCard -> name
ProfessorCard -> subject
 */
public class Detyra01 {
    public static void main(String[] args){
        IdScanner idScanner = new IdScanner(101, "621");

        Card card1 = new Card("1234567");
        Card card2 = new StudentCard("2026-05-101", "Filan Fisteku");
        StudentCard card3 = new StudentCard("2026-05-102", "Artan Fisteku");
        Card card4 = new ProfessorCard("250101", "POO");
        ProfessorCard card5 = new ProfessorCard("250102", "KNK");

        idScanner.scan(card1);
        idScanner.scan(card2);
        idScanner.scan(card3);
        idScanner.scan(card4);
        idScanner.scan(card5);
    }
}

class Card{
    private final String id;
    public Card(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void log(String room){
        System.out.printf("Unknown card with %s is scanned in room %s \n", this.id, room);
    }
}
class StudentCard extends Card{
    private String name;
    public StudentCard(String id, String name){
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void log(String room){
        System.out.printf("Student scanned card with %s in room %s\n", this.getId(), room);
    }
}

class ProfessorCard extends Card{
    private String subject;

    public ProfessorCard(String id, String subject) {
        super(id);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void log(String room){
        System.out.printf("Professor scanned card with %s in room %s for subject %s\n",
                this.getId(), room, this.getSubject()
                );
    }
}

class IdScanner{
    private final int id;
    private String room;

    public IdScanner(int id, String room){
        this.id = id;
        this.room = room;
    }
    public void scan(Card card){
        card.log(this.room);
    }

}





