package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //Usar a wrapper class do int para criar a lista

        list.add("Maria");
        list.add("João");
        list.add("Paulo");
        list.add("Sophia");
        list.add(2, "Marcos");

        System.out.println(list.size()); // TAMANHO DA LISTA
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("-------------------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); //Predicado que remove todos que começar com M
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("-------------------------------");

        System.out.println("Index Bob = " + list.indexOf("Bob"));
        System.out.println("Index Marco = " + list.indexOf("Marco"));
        System.out.println("-------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
        /*

         A linha de cima faz com que sobre, na lista, apenas os nomes que começam com S

        */
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("-------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
        System.out.println(name);


    }
}