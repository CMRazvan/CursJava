package Sesiunea6;

import java.util.Scanner;

public class S6Ex11 {
    public static void main(String[] args) {
//      Programul cere o luna si un an si scrie cate zile are luna respectiva
        System.out.println("Scrieti o luna");
        Scanner scanner = new Scanner(System.in);
        String luna = scanner.next();
        System.out.println("Scrieti un an");
        int an = scanner.nextInt();
        switch (luna) {
            case "ianuarie":
            case "martie":
            case "mai":
            case "iulie":
            case "august":
            case "octombrie":
            case "decembrie":
                System.out.println("Luna " + luna + " are 31 de zile.");
                break;
            case "aprilie":
            case "iunie":
            case "septembrie":
            case "noiembrie":
                System.out.println("Luna " + luna + " are 30 de zile.");
                break;
            case "februarie":
                if (an % 4 == 0)
                    System.out.println("Luna februarie in anul " + an + " are 29 de zile.");
                else
                    System.out.println("Luna februarie in anul " + an + " are 28 de zile.");
                break;
            default:
                System.out.println("Nu exista luna " + luna);

        }
    }
}
