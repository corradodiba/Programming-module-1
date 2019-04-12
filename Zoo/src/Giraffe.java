public class Giraffe extends Herbivore {

    public Giraffe(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getSpecies() {
        return "giraffa";
    }

    public int vegetableNeededToFeed() {
        return (this.weight / 800) * 50;
    }
}
