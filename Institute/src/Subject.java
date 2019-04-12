import java.util.ArrayList;
import java.util.Scanner;

public class Subject {
    private String code;
    private String name;
    private int hours;
    //private Professor professors; TODO


    public Subject(String code, String name, int hours) {
        this.code = code;
        this.name = name;
        this.hours = hours;
    }


    @Override
    public String toString() {
        return "\n\t==> code:'" + code + '\'' +
                ", name: '" + name + '\'' +
                ", hours: '" + hours + '\'';
    }

    //*** Add a ew subject course
    public static void addSubject(ArrayList<Course> courses){
        Scanner input = Institute.scanIn();

        String code;
        String name;
        int hours;

        Course.printAllCourses(courses);
        int progressiveNumber = input.nextInt();

        if(Course.searchCourse(courses, progressiveNumber) == -1){
            System.out.println("Corso non presente in archivio");
        }
        else{
            System.out.print("Enter the subject code: ");
            code = input.next();
            System.out.print("Enter the name: ");
            name = input.next();
            System.out.print("Enter the hours: ");
            hours = input.nextInt();
            courses.get(Course.searchCourse(courses, progressiveNumber)).setSubject(code, name, hours);

            System.out.println("Materia inserita con successo!");
        }
    }

}
