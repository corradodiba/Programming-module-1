public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
        animalCall = "non faccio versi";
    }

    public String description() { return "un pinguino";}
    public String itMoves() { return "ma non so volare";}
}
