public class Animal {

    protected String name;
    protected int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getCategory(){return null;}
    public String getSpecies(){return null;}
    public int vegetableNeededToFeed(){return 0;}
    public int meatNeededToFeed(){return 0;}

    public String meatToString() {
        return getSpecies() + " " + name + " ha bisogno di: " + meatNeededToFeed() + "kg di carne e " + vegetableNeededToFeed() + " di verdura";
    }

    @Override
    public String toString() {
        return name + ", " + getSpecies() + " " + getCategory() + ", ha un peso di " + weight + "kg.";
    }
}
