package Sesiunea6;

import java.util.Scanner;

public class S6Ex13 {
    public static void main(String[] args) {
//       Programul cere numarul de coloane si numarul de randuri si tipareste randuri de #
        System.out.println("Cate coloane?");
        Scanner scanner = new Scanner(System.in);
        int coloane = scanner.nextInt();
        System.out.println("Cate randuri?");
        int randuri = scanner.nextInt();
        for (int j = 1; j <= randuri; j++) {
            for (int i = 1; i <= coloane; i++)
                System.out.print("#");
            System.out.println("");
        }
    }
}
