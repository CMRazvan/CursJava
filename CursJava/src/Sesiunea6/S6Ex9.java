package Sesiunea6;

import java.util.Scanner;

public class S6Ex9 {
    public static void main(String[] args) {
//      Programul cere utilizatorului sa scrie o propozitie si apoi o litera. Programul afiseaza de cate ori apare litera data in propozitie
        System.out.println("Scrieti o propozitie");
        Scanner scan = new Scanner(System.in);
        String propozitie = scan.nextLine();
        System.out.println("Scrieti o litera");
        char litera = scan.next().charAt(0);
        int counter = 0;
        for (int i = 0; i < propozitie.length(); i++) {
            if (litera == propozitie.charAt(i)) {
                counter++;
                System.out.println("Litera " + litera + " o gasim de " + counter + " ori");
            }
        }
    }
}
