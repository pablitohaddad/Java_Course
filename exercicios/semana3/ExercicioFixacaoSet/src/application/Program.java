package application;

import entities.Alunos;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        Set<Alunos> set  = new HashSet<>();

        System.out.print("Quantos estudantes no curso A? ");
        int N = sc.nextInt();
        for (int i=1; i <= N; i++){
            set.add(new Alunos(sc.nextInt()));
        }
        System.out.print("Quantos estudantes no curso B? ");
        int N1 = sc.nextInt();
        for (int i=1; i <= N1; i++){
            set.add(new Alunos(sc.nextInt()));
        }
        System.out.print("Quantos estudantes no curso C? ");
        int N2 = sc.nextInt();
        for (int i=1; i <= N2; i++){
            set.add(new Alunos(sc.nextInt()));
        }
        System.out.println("Total students: " + set.size());

        sc.close();
    }
}