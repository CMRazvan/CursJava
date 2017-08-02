package Sesiunea5;

import java.util.Scanner;

public class S5Ex2 {
    public static void main(String[] args) {
        System.out.println("2. Scrieti un program care sa intrebe utilizatorul care e culoarea lui preferata si sa afiseze:\n" +
                "„Culoarea ta preferata este …”");
        System.out.println("Care este culoarea ta preferata? ");
        Scanner variabilaTastatura = new Scanner(System.in);
        String culoarePreferata = variabilaTastatura.next();
        System.out.println("Culoarea ta preferata este " + culoarePreferata+ ".");


    }
}
