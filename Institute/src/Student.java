import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private String matriculationCode;
    private ArrayList<RowBooklet> booklet = new ArrayList<RowBooklet>();


    public Student(String taxCode, String surname, String name, String matriculationCode) {
        super.taxCode = taxCode;
        super.surname = surname;
        super.name = name;
        this.matriculationCode = matriculationCode;
    }

    public String getMatriculationCode() {
        return matriculationCode;
    }

    public ArrayList<RowBooklet> getBooklet() {
        return booklet;
    }

    //*** Add a new student
    public static void addStudent(ArrayList<Course> courses){
        Scanner input = Institute.scanIn();

        String taxCode, surname, name, matriculationCode;

        System.out.println("[***] New student insertion");
        Course.printAllCourses(courses);
        int progressiveNumber = input.nextInt();

        if(Course.searchCourse(courses, progressiveNumber) == -1) {
            System.out.println("Corso non presente in archivio");
        }
        else{
                System.out.print("Inserisci il codice fiscale dello studente: ");
                taxCode = input.next();
                System.out.print("Inserisci il cognome; ");
                surname = input.next();
                System.out.print("Inserisci il nome: ");
                name = input.next();
                System.out.print("Inserisci numero matricola: ");
                matriculationCode = input.next();

                courses.get(Course.searchCourse(courses, progressiveNumber)).setStudent(taxCode, surname, name, matriculationCode);

                System.out.println("Studente inserito con successo");
        }
    }

    //*** Print all student of a course
    public static void printStudents(ArrayList<Course> courses) {
        Scanner input = Institute.scanIn();

        Course.printAllCourses(courses);
        int progressiveNumber = input.nextInt();

        if(Course.searchCourse(courses, progressiveNumber) == -1) {
            System.out.println("Corso non presente in archivio");
        }
        else{
            System.out.println(courses.get(Course.searchCourse(courses, progressiveNumber)).studentsToString());
        }

    }

    //*** Search a student
    public static Student searchStudent(ArrayList<Student> students, String matriculationCode){
        int j = 0;

        System.out.println(matriculationCode);

        for(int i = 0; (i < students.size()); i++){
            if(students.get(i).getMatriculationCode() == matriculationCode) {
                j = i;
            }
        }
        return students.get(j);
    }



    //*** Add new row to the booklet
    public static void addRowToBooklet(Student student){
        Scanner input = Institute.scanIn();

        System.out.println("[***] Inserimento del voto");

        System.out.println("Inserisci il codice della materia: ");
        String code = input.next();
        System.out.println("Inserisci il nome: ");
        String name = input.next();
        System.out.println("Inserisci le ore: ");
        int hours = input.nextInt();
        Subject subject = new Subject(code, name, hours);

        System.out.println("Voto: ");
        int vote = input.nextInt();
        System.out.println("Data(GG/MM/AAAA)");
        String date = input.next();

        student.booklet.add(new RowBooklet(subject, date, vote));
    }

    public static void averageBooklet(ArrayList<RowBooklet> row){
        float average = 0;

        for(int i = 0; i < row.size(); i++){
            average += row.get(i).getVote();
            System.out.print(row.get(i).toString() + ", ");
            if((i+1) == row.size()){
                System.out.println(" = ");
            }
        }
        System.out.println(average/row.size());

    }


    @Override
    public String toString() {
        return "{ " +
                "Codice matricola: '" + matriculationCode + '\'' +
                ", Cognome: '" + surname + '\'' +
                ", Nome: '" + name + '\'' +
                '}';
    }

    public String bookletToString() {
        return  "Riga '" + booklet;
    }
}

