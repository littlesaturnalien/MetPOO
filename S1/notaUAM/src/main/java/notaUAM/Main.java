package notaUAM;

import models.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\u001B[32m");
        System.out.println("UAM");

        //Create an object
        Student st = new Student();
        String cif, names, surnames, course;
        int grade1, grade2, grade3, fg;
        Scanner sc = new Scanner(System.in);

        System.out.println("Add the following data: ");

        System.out.print("CIF: ");
        cif = sc.nextLine();

        System.out.print("Names: ");
        names = sc.nextLine();

        System.out.print("Surnames: ");
        surnames = sc.nextLine();

        System.out.print("Course: ");
        course = sc.nextLine();

        System.out.print("First Term: ");
        grade1 = Integer.parseInt(sc.nextLine());

        System.out.print("Second Term: ");
        grade2 = Integer.parseInt(sc.nextLine());

        System.out.print("Third Term: ");
        grade3 = Integer.parseInt(sc.nextLine());

        st.setCif(cif);
        st.setNames(names);
        st.setSurnames(surnames);
        st.setCourse(course);
        st.setTerm1(grade1);
        st.setTerm2(grade2);
        st.setTerm3(grade3);
        fg = st.getFinalGrade();
        System.out.println("\nFinal Grade: "+ fg);
        System.out.println("Course status: " + st.evalFinalGrade());
        System.out.println("Eligibility for make-up test: " + st.evalMakeUpTest());
    }
}
