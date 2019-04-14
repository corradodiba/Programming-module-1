import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Institute {
    private String name;
    private String typology;
    private String dateOfFondation;
    private ArrayList<Course> courses;

    public static void main(String[] args) {
        Scanner input = scanIn();

        // Array objects
        ArrayList<Course> courses = new ArrayList<Course>();

        // Default object istances
        Institute institute = new Institute("SteveJobs Academy", "ITS", "2016", courses);
        Course courseCatania = new Course(11, 2018, "Catania", 2);
        Course courseCaltagirone = new Course(10, 2018, "Caltagirone", 2);

        // ArrayList instances
        courses.add(courseCaltagirone);
        courses.add(courseCatania);
        courseCatania.setStudent("DBTCRD97", "Dibattista", "Corrado", "CT012");
        courseCatania.setStudent("CRFGTN98", "Carfi", "Gaetano", "CT008");
        courseCatania.setSubject("CT001", "Front-end", 100);
        courseCatania.setSubject("CT002", "Programming - Module 1", 80);
        courseCatania.setSubject("CT003", "Back-end", 100);


        // Main
        int choice;

        do {
                System.out.println("\n******************** Menu ********************");
                System.out.println("1.Visualizza i dati dell'istituto");
                System.out.println("2.Inserisci una nuova materia nel corso");
                System.out.println("3.Inserisci un nuovo studente nel corso");
                System.out.println("4.Visualizza la lista degli studenti di un corso");
                System.out.println("5.Inserisci un voto ad uno studente");
                System.out.println("6.Visualizza voti di uno studente");
                System.out.println("7.Calcola media voti di uno studente");

                choice = input.next().charAt(0);

            try{
                switch (choice) {

                    case '1':
                        System.out.println(institute.toString());
                        break;

                    case '2':
                        Subject.addSubject(courses);
                        break;

                    case '3':
                        Student.addStudent(courses);
                        break;

                    case '4':
                        Student.printStudents(courses);
                        break;

                    case '5':
                        Course.printAllCourses(courses);
                        int progressiveNumber = input.nextInt();

                        if (Course.searchCourse(courses, progressiveNumber) == -1) {
                            System.out.println("Corso non presente in archivio");
                        }
                        int course = Course.searchCourse(courses, progressiveNumber);
                        System.out.println(courses.get(course).studentsToString());
                        System.out.println("Digita la matricola dello studente: ");

                        String buffer = input.nextLine();
                        String matriculationCode = input.nextLine();

                        Student student = Student.searchStudent(courses.get(course).getStudents(), matriculationCode);
                        Student.addRowToBooklet(student);
                        break;

                    case '6':
                        Course.printAllCourses(courses);
                        progressiveNumber = input.nextInt();

                        if (Course.searchCourse(courses, progressiveNumber) == -1) {
                            System.out.println("Corso non presente in archivio");
                        }
                        course = Course.searchCourse(courses, progressiveNumber);
                        System.out.println(courses.get(course).studentsToString());
                        System.out.println("Digita la matricola dello studente: ");
                        buffer = input.nextLine();
                        matriculationCode = input.nextLine();
                        student = Student.searchStudent(courses.get(course).getStudents(), matriculationCode);
                        System.out.println(student.bookletToString());
                        break;

                    case '7':
                        Course.printAllCourses(courses);
                        progressiveNumber = input.nextInt();

                        if (Course.searchCourse(courses, progressiveNumber) == -1) {
                            System.out.println("Corso non presente in archivio");
                        }
                        course = Course.searchCourse(courses, progressiveNumber);
                        System.out.println(courses.get(course).studentsToString());
                        System.out.println("Digita la matricola dello studente: ");
                        buffer = input.nextLine();
                        matriculationCode = input.nextLine();
                        student = Student.searchStudent(courses.get(course).getStudents(), matriculationCode);
                        Student.averageBooklet(student.getBooklet());
                        break;


                    default:
                        System.out.println("[***] Opzione non disponibile, riprova");
                        break;
                }
            }
            catch (InputMismatchException inputException){
                System.out.println("[***] Errore: Hai inserito un tipo di dato errato");
            }
            catch (ArrayIndexOutOfBoundsException arrayException){
                System.out.println("[***] Errore: Il parametro inserito non trova alcun riferimento");
            }
        }
        while(choice != '0');
    }


    public Institute(String name, String typology, String dateOfFondation, ArrayList<Course> courses) {
        this.name = name;
        this.typology = typology;
        this.dateOfFondation = dateOfFondation;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "[***] I'm printing the Institute data\n" +
                "Name: '" + name + '\'' +
                "\nTypology:'" + typology + '\'' +
                "\nDate of fondation: '" + dateOfFondation + '\'' +
                "\nCourses" + courses.toString();
    }

    //*** Scanner object
    public static Scanner scanIn(){
        return new Scanner(System.in);
    }
}


