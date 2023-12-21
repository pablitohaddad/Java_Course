import java.util.Scanner;
import java.util.Locale;
public class Atividade4 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employeeNumber;
        double workHour, hourlyHate, salary;

        employeeNumber = sc.nextInt();
        workHour = sc.nextDouble();
        hourlyHate = sc.nextDouble();

        salary = workHour * hourlyHate;

        System.out.println("NUMBER = " + employeeNumber);
        System.out.println("SALARY = " + salary);


        sc.close();

    }
}