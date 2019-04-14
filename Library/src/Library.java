import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private String name;
    private ArrayList shelves = new ArrayList<Shelf>();


    public static void main(String[] args) {

        Scanner input = scanIn();
        ArrayList libraries = new ArrayList<Library>();

        char choice;

        do {
            System.out.println("*************** Menù ***************");
            System.out.println("1. Crea una nuova biblioteca");
            System.out.println("2. Inserisci un nuovo libro");
            System.out.println("3. Stampa elenco publicazioni di una biblioteca");
            System.out.println("4. Stampa elenco pubblicazioni di tutte le biblioteche");
            System.out.println("5. Ricerca libri di un autore");
            System.out.println("0. exit");

            choice = input.next().charAt(0);
            Menu.switchCase(choice, libraries);
        }
        while(choice != '0');
    }

    public Library(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Shelf> getShelves() {
        return shelves;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Scanner scanIn(){
        return new Scanner(System.in);
    }
}
