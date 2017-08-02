package Sesiunea6;

import java.util.Scanner;

public class S6Ex2 {
    public static void main(String[] args) {
//        2. Programul citeste un numar si scrie daca e par sau impar
        System.out.println("Scrieti un numar");
        Scanner scan = new Scanner(System.in);
        int numar = scan.nextInt();
        if (numar%2 == 0 ) {
            System.out.println("Numarul este par.");
        }else{
            System.out.println("Numarul este impar.");
        }
    }
}
