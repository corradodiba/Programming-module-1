public class Fish extends Marine {

    public Fish(String name) {
        super(name);
        animalCall = "non faccio versi";
    }

    public String itMoves() {return "nuotando";}
    public String description() {return "un pesce di mare"; }
}
