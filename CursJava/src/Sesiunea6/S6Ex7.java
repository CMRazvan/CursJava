package Sesiunea6;

import java.util.Scanner;

public class S6Ex7 {
    public static void main(String[] args) {
//        2. Scrieti un program care sa scrie toate numerele, incepand cu acel numar pana la 1 in ordine descrescatoare
        System.out.println("Scrieti un numar");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        for (int i = numar; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
