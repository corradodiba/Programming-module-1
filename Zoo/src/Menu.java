import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    public static void switchCase(char choice, ArrayList<Animal> animals){
        try{
            String name;
            int weight;
            Scanner input = MainZoo.scanIn();

            switch (choice){
                case '1':
                    System.out.println("Nome ==> ");
                    name = input.next();

                    System.out.println("Peso ==> ");
                    weight = input.nextInt();

                    System.out.println("Scegli che specie aggiungere: ");
                    System.out.println("1. Leone");
                    System.out.println("2. Giraffa");
                    System.out.println("3. Scimmia");
                    System.out.println("4. Tigre");
                    System.out.println("5. Zebra");
                    choice = input.next().charAt(0);

                    if(chooseAnAnimal(choice, name, weight) == null){
                        System.out.println("Errore");
                    }
                    else {
                        animals.add(chooseAnAnimal(choice, name, weight));
                    }


                    break;

                case '2': System.out.println("Scegli quale animale rimuovere dallo zoo: ");
                    if(!animals.isEmpty()) {
                        printAllAnimals(animals);
                        int deleteAnimal = input.nextInt();
                        animals.remove(deleteAnimal - 1);
                        System.out.println("[***] Animale rimosso correttamente! ");
                    }
                    else{
                        System.out.println("[***] Si è verificato un errore!");
                    }
                    break;

                case '3': System.out.println("[***] Sto stampando il fabbisogno giornaliero per ciascun animale: ");
                    for(int i = 0; i < animals.size(); i++){
                        System.out.println(animals.get(i).meatToString());
                    }
                    break;

                case '4': System.out.println("[***] Fabbisogno giornaliero complessivo dello zoo ");

                    int meatNeededToFeed = 0, vegetableNeededToFeed = 0;

                    for(int i = 0; i < animals.size(); i++){
                        meatNeededToFeed += animals.get(i).meatNeededToFeed();
                        vegetableNeededToFeed += animals.get(i).vegetableNeededToFeed();
                    }

                    System.out.println("Occorre procurarsi una scorta giornaliera di: ");
                    System.out.println(meatNeededToFeed + "kg di carne e " + vegetableNeededToFeed + "kg di verdura");
                    break;

                case '5': System.out.println("[***] Sto stampando gli animali dello zoo: ");
                    printAllAnimals(animals);
                    break;

                case '6': animals.add(new Lion("Lion", 400));
                    animals.add(new Monkey("Monkey", 30));
                    animals.add(new Zebra("Zebra", 100));
                    animals.add(new Giraffe("Giraffe", 300));
                    animals.add(new Tiger("Tiget", 150));
                    System.out.println("[***] Caricamento effettuato!");
                    break;

                default: System.out.println("[***] Input non valido, riprova!");
                    break;

            }
        }
        catch (InputMismatchException inputException){
            System.out.println("[***] Errore: Hai inserito un tipo di dato non valido");
        }
    }

    private static Animal chooseAnAnimal(char choice, String name, int weight){

        Animal animal;

        switch(choice){

            case '1': animal = new Lion(name,weight);
            break;
            case '2': animal = new Giraffe(name,weight);
            break;
            case '3': animal = new Monkey(name,weight);
            break;
            case '4': animal = new Tiger(name,weight);
            break;
            case '5': animal = new Zebra(name,weight);

            break;

            default: animal = null;
            break;
        }
        return animal;
    }

    private static void printAllAnimals(ArrayList animals){
        for(int i = 0; i < animals.size(); i++){
            System.out.println((i + 1) + " " + animals.get(i).toString());
        }
    }
}
