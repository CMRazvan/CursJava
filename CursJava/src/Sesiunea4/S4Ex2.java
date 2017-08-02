package Sesiunea4;

import java.util.Scanner;

public class S4Ex2 {
//    Scrieți un program care arată cât câștigă într-o luna un vânzător.
//    Salariul de bază este fix 5000 ron.
//    Programul întreabă ce bonus a luat în luna respectivă și calculează salariul total din luna respectivă.
//    Pentru ajutor aveți exemple la sfârșitul documentului.
    public static void main(String[] args) {
        int salariuBaza = 5000;
        System.out.println("Ce bonus ai avut luna aceasta?");
        Scanner scanner = new Scanner(System.in);
        int bonus = scanner.nextInt();
        System.out.println("Luna aceasta ati primit " + (bonus + salariuBaza) + " RON");
    }
}
