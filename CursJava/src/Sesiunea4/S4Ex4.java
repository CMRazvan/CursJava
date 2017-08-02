package Sesiunea4;

import java.util.Scanner;

public class S4Ex4 {
    //    Scrieți un program care cere utilizatorului două numere și afișează toate numerele între ele.
//    De exemplu: utilizatorul dă numerele 3 și 7, programul afișează: 4 5 6.
//    Pentru ajutor aveți exemple la sfârșitul documentului.
    public static void main(String[] args) {
        System.out.println("Scrieti numarul mai mic");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.println("Scrieti numarul mai mare");
        int max = scanner.nextInt();
        for (int i = min + 1; i < max; i++)
            System.out.println(i);
    }
}
