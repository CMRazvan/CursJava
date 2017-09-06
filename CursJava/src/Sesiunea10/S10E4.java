package Sesiunea10;

import java.util.Scanner;

public class S10E4 {
    public static void main(String[] args) {
        try {
            System.out.println("Dati un numar intre 2 si 5");
            Scanner scann = new Scanner(System.in);
            int numar = scann.nextInt();
            if (numar <= 2 || numar >= 5) throw new ArithmeticException("Numarul nu este intre 2 si 5");
            else System.out.println("Numarul este: " + numar);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
