package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program{

    public static void main(String[] args){


        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\Pablito\\reps\\IdeaProjects\\exercicios\\semana3\\ExerciciosResolvidoInterface\\out\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(","); // Posição 0 = Nome, Posição 1 = Salario
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list); // ordena a lista
            for (Employee emp : list) {
                System.out.println(emp.getName() + " , " + emp.getSalary()); // imprime cada elemeto na lista
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

