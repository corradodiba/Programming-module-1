import java.util.ArrayList;

public class Course {
    private int progressiveNumber;
    private int startYear;
    private String city;
    private int period = 2; // In Years, default = 2
    private ArrayList<Subject> subjects = new ArrayList<Subject>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(int progressiveNumber, int startYear, String city, int period) {
        this.progressiveNumber = progressiveNumber;
        this.startYear = startYear;
        this.city = city;
        this.period = period;
    }

    public int getProgressiveNumber() {
        return progressiveNumber;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public static void printAllCourses(ArrayList<Course> courses){
        System.out.println("Indica il numero progressivo del corso: \n");
        for(int i = 0; i < courses.size(); i++){
            System.out.println("Corso " + courses.get(i).getProgressiveNumber() + "(" + courses.get(i).getCity() + ")");
        }
    }

    public static int searchCourse(ArrayList<Course> courses, int progressiveNumber){
        int i, j = -1;


        for(i = 0; (i < courses.size()) && (j == -1); i++){
            if(courses.get(i).getProgressiveNumber() == progressiveNumber) {
                j = i;
            }
        }

        return j;
    }

    public String getCity() {
        return city;
    }

    public void setSubject(String code, String name, int hours) {
        Subject subject = new Subject(code, name, hours);
        this.subjects.add(subject);
    }

    public void setStudent(String taxCode, String surname, String name, String matricolationCode) {
        Student student = new Student(taxCode, surname, name, matricolationCode);
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "\n==> COURSE " + progressiveNumber +
                "\n\tstart year: '" + startYear + '\'' +
                "\n\tcity: '" + city + '\'' +
                "\n\tperiod: '" + period + '\'' +
                "\n\tMaterie:" + subjects + "\n";
    }

    public String studentsToString() {
        return "\n==> Studenti corso " + progressiveNumber +
                "\n" + students;
    }
}

