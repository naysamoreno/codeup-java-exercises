package grades;
import java.util.HashMap;
import java.util.Map;
import util.Input;

public class GradesApplication {

    private final Map<String, Student> students;
    private final Input input;

    public void welcome() {
        System.out.println("Welcome!");
        runInteraction();
    }
    private void runInteraction() {
        System.out.println(getStudentsList());
        System.out.println("\nWhat student would you like to see more information on?");
        String response = input.getString();
        if (students.containsKey(response)) {
            System.out.println(getStudentInfo(response));
        } else {
            System.out.println("\nSorry, no student found with the GitHub username of " + response);
        }
    }
    private String getStudentsList() {
        String output = "Here are the user names of our students:\n\n";
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            output += "|" + entry.getKey() + "| ";
        }
        return "\n" + output.trim();
    }

    public GradesApplication(Map<String, Student> students, Input input) {
        this.students = students;
        this.input = input;
    }
    private String getStudentInfo(String username) {
        return String.format(
                "%nName: %s - GitHub Username: %s%nCurrent Average: %.2f",
                students.get(username).getName(),
                username,
                students.get(username).getGradeAverage());
    }

    private static HashMap<String, Student> createStudents() {

        HashMap<String, Student> students = new HashMap<>();

        Student user1 = new Student("Bethany");
        user1.addGrade(98);
        user1.addGrade(72);
        user1.addGrade(85);

        Student user2 = new Student("Chaz");
        user2.addGrade(98);
        user2.addGrade(100);
        user2.addGrade(95);

        Student user3= new Student("Kevin");
        user3.addGrade(92);
        user3.addGrade(75);
        user3.addGrade(95);

        students.put("bestcoast323", user1);
        students.put("Toroymoi", user2);
        students.put("Kparker", user3);

        return students;
    }


    public static void main(String[] args) {
        GradesApplication gradesApp = new GradesApplication(createStudents(), new Input());
        gradesApp.welcome();
    }
}
