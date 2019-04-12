public abstract class Carnivorous extends Animal {

    public Carnivorous(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getCategory() {
        return "carnivoro";
    }

    public int vegetableNeededToFeed(){
        return 0;
    }

}

