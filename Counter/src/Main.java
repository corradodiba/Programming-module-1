import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice = '0';


        try{
            System.out.println("Inserisci valore di partenza del contatore: ");

            Counter cont = new Counter(input.nextInt());

            do {
                System.out.println("******* MENU ********");
                System.out.println("Contatore = " + cont.getValue());
                System.out.println("1.Incrementa contatore");
                System.out.println("2.Decrementa contatore");
                System.out.println("3.Resetta contatore");
                System.out.print("==> ");
                choice = input.next().charAt(0);
                switch (choice) {
                    case '1':
                        cont.increase();
                    break;

                    case '2':
                        cont.decrease();
                    break;

                    case '3':
                        cont.reset();
                    break;

                    default: System.out.println("[***] Errore: Hai scelto un'opzione non disponibile");
                    break;
                }
            }
            while(choice != '0');
        }
        catch (InputMismatchException inputException){
            System.out.println("[***] Errore: Hai inserito un tipo di dato sbagliato");
        }
    }
}
