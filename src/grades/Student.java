package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();


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
    System.out.println();
}

}
