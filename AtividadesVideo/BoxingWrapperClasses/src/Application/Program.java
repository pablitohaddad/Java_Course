package Application;

public class Program {
    public static void main(String[] args) {

        int x = 20;

        Integer obj = x; // Boxing. Integer faz com que possa ser valor NULL, pois apenas int é primitivo

        System.out.println(obj);

        int y = obj; // Unboxing

        System.out.println(y);

    }
}