package Sesiunea10;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class S10E5 {
    public static void main(String[] args) {
        try {
            System.out.println("Salut am generat un numar intre 1 si 10 , te rog sa il ghicesti:");
            Random randomGenerator = new Random();
            int randNumber = randomGenerator.nextInt(10) + 1;
            boolean stop = false;
            int count = 0;
            do {
                count++;
                Scanner scann = new Scanner(System.in);
                int myNumber = scann.nextInt();
                if (myNumber <1 || myNumber>10)throw new ArithmeticException("Numarul nu este intre 1 si 10");
                if (randNumber == myNumber) {
                    System.out.println("Ai ghicit");
                    stop = true;
                } else if (randNumber > myNumber) {
                    System.out.println("Numarul este mai mare");
                } else if (randNumber < myNumber) {
                    System.out.println("Numarul este mai mic");
                }
                System.out.println("Ai incercat de " + count + " ori");
                System.out.println("Numarul tau este : " + myNumber);
                System.out.println("Numarul dat a fost : " + randNumber);
            } while (!stop);
        } catch (InputMismatchException e) {
            System.out.println("Nu ai introdus un numar!");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Is a general error");
        }

    }
}
