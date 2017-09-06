package Sesiunea10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S10E1 {
    public static void main(String[] args) {
        System.out.println("Scrie un numar");
        boolean stop = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                int i = scanner.nextInt();
                System.out.println("Numarul este: " + i);
            } catch (InputMismatchException e) {
                System.out.println("Nu ati introdus numar corect");
            }
        } while (!stop);

    }
}
