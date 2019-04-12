import java.util.ArrayList;
import java.util.Scanner;

public class MainZoo {

    public static void main(String[] args) {

        ArrayList animals = new ArrayList<Animal>();
        Scanner input = scanIn();

        char choice;

        do {
            System.out.println("*************** Menù ***************");
            System.out.println("1. Inserisci un nuovo animale");
            System.out.println("2. Elimina un animale presente");
            System.out.println("3. Fabisogno giornaliero per ciascun animale presente");
            System.out.println("4. Calcolo cibo necessario a sfamare tutti gli animali");
            System.out.println("5. Visualizza tutti gli animali presenti nello zoo");
            System.out.println("6. Caricamento oggetti preimpsotato");
            System.out.println("0. exit");

            choice = input.next().charAt(0);
            Menu.switchCase(choice, animals);
        }
        while(choice != '0');
    }


    public static Scanner scanIn(){
        return new Scanner(System.in);
    }
}

