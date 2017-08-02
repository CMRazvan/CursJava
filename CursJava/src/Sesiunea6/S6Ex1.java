package Sesiunea6;

import java.util.Scanner;

public class S6Ex1 {
    public static void main(String[] args) {
//        1. Programul citeste un numar si scrie daca e pozitiv, negativ sau 0
        System.out.println("Scrieti un numar");
        Scanner scan = new Scanner(System.in);
        int numar = scan.nextInt();
        if (numar > 0) {
            System.out.println("Numarul este pozitiv");
        }else if (numar< 0) {
            System.out.println("Numarul este negativ");
        }else{
            System.out.println("Numarul este 0");
        }
    }
}
