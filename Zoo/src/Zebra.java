public class Zebra extends Herbivore {

    public Zebra(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getSpecies() {
        return "zebra";
    }

    public int vegetableNeededToFeed() {
        return (this.weight / 100) * 15;
    }


}
