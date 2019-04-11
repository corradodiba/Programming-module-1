public class Person extends Biped{

    public Person(String name) {
        super(name);
        animalCall = "parlo";
    }

    public String itMoves() { return "su due gambe";}
    public String description() { return "un homo sapiens";}
    public String habitat() { return "in condominio";}

}
