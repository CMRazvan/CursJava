package Sesiunea3;

import java.util.Scanner;

public class S3Ex4 {
    public static void main(String[] args) {
        System.out.println("Scrieți un program care cere utilizatorului două numere și afișează toate numerele între ele.\n" +
                "De exemplu: utilizatorul dă numerele 3 și 7, programul afișează: 4 5 6.\n");
        System.out.println("Dami 2 numere si eu o sa iti afisez toate numerele dintre ele:");
        Scanner variabilaTastatura = new Scanner(System.in);
        int primulnumar = variabilaTastatura.nextInt();
        int aldoileanumar = variabilaTastatura.nextInt();
        for (int a = primulnumar+1; a < aldoileanumar ; a++){
            System.out.println(a);
        }
    }
}
