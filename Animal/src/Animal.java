public abstract class Animal {
    String name;
    String animalCall;

    public Animal(String name){
        this.name = name;
    }

    public abstract String itMoves();
    public abstract String habitat();
    public abstract String description();

    @Override
    public String toString(){
        return "Sono " + name +
                ", " + description() +
                " e vivo " + habitat() + "." +
                " " + animalCall +
                ". Mi muovo " + itMoves();
    }
}
