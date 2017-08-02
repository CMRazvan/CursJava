package Sesiunea6;

import java.util.Scanner;

public class S6Ex5 {
    public static void main(String[] args) {
//        5. Scrieti un program care sa ceara un numar si sa scrie toate numerele de la 1 la acel numar
        System.out.println("Scrieti un numar");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        for (int i = 1; i<= numar; i++){
            System.out.println(i);
        }
    }
}
