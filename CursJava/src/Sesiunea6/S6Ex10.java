package Sesiunea6;

import java.util.Scanner;

public class S6Ex10 {
    public static void main(String[] args) {
//       Programul cere o litera si scrie daca e vocala sau consoana (folositi String)
        System.out.println("Scrieti o litera");
        Scanner scanner = new Scanner(System.in);
        char litera = scanner.next().charAt(0);
        switch (litera) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Litera " + litera + " este o vocala.");
                break;
            default:
                System.out.println("Litera " + litera + " este o consoana.");
        }
    }
}
