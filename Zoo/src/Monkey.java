public class Monkey extends Omnivorous {

    public Monkey(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getSpecies() {
        return "scimmia";
    }

    public int meatNeededToFeed() {
        return (this.weight / 30);
    }

    public int vegetableNeededToFeed(){
        return (this.weight / 30);
    }


}
