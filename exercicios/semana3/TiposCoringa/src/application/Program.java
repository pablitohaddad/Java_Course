package application;
import java.util.Arrays;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myWords = Arrays.asList("Pablo, Sophia, Andrea");
        printList(myWords);

    }
    public static void printList(List<?> list) { // Tipo coringa, pode aceitar todos, mas não pode se adicionar
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}