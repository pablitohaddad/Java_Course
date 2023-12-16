package Application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.printf("FINAL GRADE =  %.2f\n", student.sumNot());

        if (student.sumNot() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING = %.2f POINTS\n", student.missing());
        } else {
            System.out.println("PASS");
        }

        sc.close();

    }
}