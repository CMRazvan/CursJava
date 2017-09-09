package Sesiunea6;

import java.util.Scanner;

public class S6Ex6 {
    public static void main(String[] args) {
//        1. Scrieti un program care sa ceara un numar si sa scrie toate numele impare de la 1 la acel numar
        System.out.println("Scrieti un numar mai mare decat 1");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        for (int i = 1; i<= numar; i++) {
            if (i%2 == 1)
                System.out.println(i);
        }
    }
}
