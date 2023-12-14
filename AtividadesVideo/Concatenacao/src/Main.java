import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 1235.43;

        double measure = 34.234525;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender %c\n\n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.2f", measure);
        System.out.printf("Rouded (three decimal place):%.3f\n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point:%.2f\n", measure);

    }

}