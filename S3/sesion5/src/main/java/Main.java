import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Admission admission = new Admission();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            Student student = new Student();
            float average;
            System.out.print("Add the average score of the student #" + (i + 1) + ": ");
            average = Float.parseFloat(sc.nextLine());
            student.setAverage(average);
            admission.calcScholarship(student);
            students.add(student);
        }

        for (Student student : students){
            System.out.println(student.getAverage() + " " + student.isHasScholarship());
        }
    }
}
