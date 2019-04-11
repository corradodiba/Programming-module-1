import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList animals = new ArrayList<Object>();

        addDefaultAnimals(animals);
        viewList(animals);

    }

    public static void addDefaultAnimals(ArrayList animals){
        animals.add(new Horse("Spirit"));
        animals.add(new Person("Corrado"));
        animals.add(new Crow("Corvy"));
        animals.add(new Tuna("Thunnus"));
        animals.add(new Bird("Gabbiano"));
        animals.add(new Penguin("Tweety"));

    }

    public static void viewList(ArrayList animals){
        for(int i = 0; i < animals.size(); i++){
            System.out.print((i + 1) + "°\t");
            System.out.println(animals.get(i).toString());
        }
    }

}
