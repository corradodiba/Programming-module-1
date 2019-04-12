public abstract class Herbivore extends Animal{

    public Herbivore(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getCategory() {
        return "erbivoro";
    }

    @Override
    public int meatNeededToFeed(){
        return 0;
    }
}
