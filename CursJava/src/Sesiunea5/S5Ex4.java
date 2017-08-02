package Sesiunea5;

import java.util.Scanner;

public class S5Ex4 {
    public static void main(String[] args) {
        System.out.println("4. Scrieti un program care cere trei numere si afiseaza produsul dintre ele.");
        System.out.println("Buna sunt un program care calculez suma dintre 3 numere ");
        System.out.println("Dami primul numar");
        Scanner variabilaTastatura = new Scanner(System.in);
        int primulnumar = variabilaTastatura.nextInt();
        System.out.println("Dami al doilea numar");
        int aldoileanumar = variabilaTastatura.nextInt();
        System.out.println("Dami al treilea numar ");
        int altreileanumar = variabilaTastatura.nextInt();
        System.out.println("Suma dintre numere este : " + (primulnumar+aldoileanumar+altreileanumar));
    }
}
