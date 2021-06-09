package grades;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : grades) {
            total = total + grade;
        }
        double gradeAvg = total / grades.size();
        return gradeAvg;
    }
public static void main(String[] args) {
    Student Austin = new Student("Austin");

    Austin.addGrade(95);
    Austin.addGrade(100);
    Austin.addGrade(98);
    System.out.println(Austin.getGradeAverage());
}

}
