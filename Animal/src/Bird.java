public class Bird extends Terrestrial {

    public Bird(String name) {
        super(name);
        animalCall = "cinguetto";
    }
    public String itMoves() { return "volando"; }
    public String description() { return "un uccello";}
    public String habitat() { return "in un nido su un albero";}
}
