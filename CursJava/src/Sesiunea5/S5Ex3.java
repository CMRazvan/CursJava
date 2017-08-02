package Sesiunea5;

import java.util.Scanner;

public class S5Ex3 {
    public static void main(String[] args) {
        System.out.println("3. Scrieti un program care  cere doua numere si afiseaza produsul dintre ele.");
        System.out.println("Buna sunt un program care calculez suma dintre 2 numere ");
        System.out.println("Dami primul numar");
        Scanner variabilaTastatura = new Scanner(System.in);
        int primulnumar = variabilaTastatura.nextInt();
        System.out.println("Dami al doilea numar");
        int aldoileanumar = variabilaTastatura.nextInt();
        System.out.println("Suma dintre numere este : " + (primulnumar+aldoileanumar));
    }
}
