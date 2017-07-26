package Sesiunea3;

import java.util.Scanner;

public class S3Ex2 {
    public static void main(String[] args) {
        System.out.println("Scrieți un program care arată cât câștigă într-o luna un vânzător.\n" +
                "Salariul de bază este fix 5000 ron.\n" +
                "Programul întreabă ce bonus a luat în luna respectivă și calculează salariul total din luna respectivă.\n");
        int salar = 5000;
        System.out.println("Buna , salariul de baza este: " +salar);
        System.out.println("Ce bonus a luat luna asta angajatorul nostru? ");
        Scanner variabilaPrimita = new Scanner(System.in);
        int bonus = variabilaPrimita.nextInt();
        System.out.println("Bonusul pentru salariat este de : " + bonus);
        System.out.println("Salariatul a cumulat salar + bonus in valoare de : " + (bonus+salar));
        //din cauza ca doream sa calculam 2 variabile trebuia sa le punem in paranteze daca nu le concantena si aveam salar limit de suma
    }
}
