public class Lion extends Carnivorous {

    public Lion(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getSpecies() {
        return "leone";
    }

    public int meatNeededToFeed() {
        return (this.weight / 200) * 7;
    }


}
