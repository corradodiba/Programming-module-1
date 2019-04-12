public abstract class Omnivorous extends Animal{

    public Omnivorous(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getCategory() {
        return "onnivoro";
    }
}
