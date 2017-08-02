package Sesiunea6;

import java.util.Scanner;

public class S6Ex4 {
    public static void main(String[] args) {
//        4. Scrieti un program care sa intrebe utilizatorul numele si apoi prenumele si sa afiseze „ Buna seara nume prenume!”
        System.out.println("Care este numele tau?");
        Scanner scan = new Scanner(System.in);
        String nume = scan.next();
        System.out.println("Care este prenumele?");
        String prenume = scan.next();
        System.out.println("Buna seara " + nume + " " + prenume + "!");
    }
}
