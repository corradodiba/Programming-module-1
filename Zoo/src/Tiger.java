public class Tiger extends Carnivorous {

    public Tiger(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getSpecies() {
        return "tigre";
    }

    public int meatNeededToFeed() {
        return (this.weight / 200) * 7;
    }
}
