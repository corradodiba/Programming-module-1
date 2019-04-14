import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void switchCase(char choice, ArrayList<Library> libraries){

        Scanner input = Library.scanIn();

        try{
            switch (choice) {

                case '1': System.out.println("[***] Creazione nuova biblioteca: ");
                    System.out.print("Nome ==> ");
                    String name = input.nextLine();
                    System.out.print("Numero di scaffali ==> ");
                    int numberOfShelves = input.nextInt();

                    libraries.add(new Library(name));

                    for(int i = 0; i < libraries.size(); i++){
                        if(libraries.get(i).getName() == name){
                            for(int j = 0; j < numberOfShelves; j++){
                                System.out.print("Inserisci la dimensione del " + (j + 1) + "° scaffale: ");
                                int size = input.nextInt();
                                libraries.get(i).getShelves().add(new Shelf(size));
                            }
                        }
                    }
                    break;

                case '2': System.out.println("[***] Inserimento nuovo libro");
                    System.out.print("Titolo ==> ");
                    String title = input.nextLine();
                    System.out.print("Autore ==> ");
                    String author = input.nextLine();
                    System.out.print("Prezzo ==> ");
                    float price = input.nextFloat();

                    printLibraries(libraries);

                    System.out.println("In quale libreria vuoi aggiungere il libro?");
                    int choiceLibrary = input.nextInt();

                    printShelves(libraries.get(choiceLibrary-1));
                    System.out.println("In quale scaffale? ");
                    int choiceShelf = input.nextInt();
                    libraries.get(choiceLibrary - 1).getShelves().get(choiceShelf - 1).setReleases(title, author, price);
                    break;

                case '3': printAllReleaseOfALibrary(libraries);
                    break;

                case '4': printAllReleaseOfAll(libraries);
                    break;

                case '5': System.out.println("Inserisci l'autore da ricercare: ");
                    String nameAuthor = input.nextLine();
                    searchReleases(libraries, nameAuthor);



                default:  System.out.println("[***] Si è verificato un errore");
                    break;
            }
        }
        catch(InputMismatchException inputException){
            System.out.println("[***] Hai inserito un tipo di dato errato");
        }
        catch (IndexOutOfBoundsException indexException){
            System.out.println("[***] Hai inserito un parametro di riferimento errato");
        }

    }

    private static void printLibraries(ArrayList<Library> libraries){
        for(int i = 0; i < libraries.size(); i++){
            System.out.println( "Biblioteca " + (i + 1) + ": " + libraries.get(i).toString());
        }
    }

    private static void printShelves(Library library){
        for(int i = 0; i < library.getShelves().size(); i++){
            System.out.println( "==> Scaffale " + (i + 1) + ": " + library.getShelves().get(i).toString());
        }
    }

    private static void printAllReleaseOfAll(ArrayList<Library> libraries){
        for(int i = 0; i < libraries.size(); i++){
            for(int j = 0; j < libraries.get(i).getShelves().size(); j++){
                System.out.println(libraries.get(i).getShelves().get(j).getReleases().toString());
            }
        }
    }

    private static void printAllReleaseOfALibrary(ArrayList<Library> libraries){
        Scanner input = Library.scanIn();

        System.out.println("Scegli una biblioteca: ");
        printLibraries(libraries);
        int idLibrary = input.nextInt();


        for(int j = 0; j < libraries.get(idLibrary-1).getShelves().size(); j++){
            System.out.println(libraries.get(idLibrary-1).getShelves().get(j).getReleases().toString());
        }
    }

    private static void searchReleases(ArrayList<Library> libraries, String nameAuthor){

        int log = 1;

        for(int i = 0; i < libraries.size(); i++){

            for(int j = 0; j < libraries.get(i).getShelves().size(); j++){

                for(int k = 0; k < libraries.get(i).getShelves().get(j).getReleases().size(); k++){

                    if(nameAuthor.equals(libraries.get(i).getShelves().get(j).getReleases().get(k).getAuthor())){

                        System.out.println("Biblioteca: " +libraries.get(i) + ", scaffale " + (j + 1) + ":\n" + libraries.get(i).getShelves().get(j).getReleases().get(k).toString());
                        log = 0;
                    }

                }
            }

        }
        if(log == 1) {
            System.out.println("Nessun libro trovato!");
        }
    }



}
