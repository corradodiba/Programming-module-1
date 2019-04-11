import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("Inserisci valore di partenza del contatore: ");

        Counter cont = new Counter(input.nextInt());


        do {
            System.out.println("******* MENU ********");
            System.out.println("Contatore = " + cont.getValue());
            System.out.println("1.Incrementa contatore");
            System.out.println("2.Decrementa contatore");
            System.out.println("3.Resetta contatore");
            System.out.print("==> ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    cont.increase();
                    break;

                case 2:
                    cont.decrease();
                    break;

                case 3:
                    cont.reset();
                    break;
            }
        }
        while(choice != 0);
    }
}
