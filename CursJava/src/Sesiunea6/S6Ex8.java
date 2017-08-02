package Sesiunea6;

import java.util.Scanner;

public class S6Ex8 {
    public static void main(String[] args) {
//        3. Scrie un program care cere un numar intre 1 si 12 si afiseaza ce luna a anului ii corespunde(foloseste switch)
        System.out.println("Scrieti un numar intre 1 si 12");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        switch (numar) {
            case 1:
                System.out.println("Ianuarie");
                break;
            case 2:
                System.out.println("Februarie");
                break;
            case 3:
                System.out.println("Martie");
                break;
            case 4:
                System.out.println("Aprilie");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Iunie");
            case 7:
                System.out.println("Iulie");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Septembrie");
                break;
            case 10:
                System.out.println("Octombrie");
                break;
            case 11:
                System.out.println("Noiembrie");
                break;
            case 12:
                System.out.println("Decembrie");
                break;
            default:
                System.out.println("Numarul este gresit");
        }
    }
}
