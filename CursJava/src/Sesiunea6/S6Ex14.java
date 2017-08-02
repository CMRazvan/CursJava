package Sesiunea6;

import java.util.Scanner;

public class S6Ex14 {
    public static void main(String[] args) {
//        Scrie un program care cere numarul de randuri si tipareste urmatorul triunghi
        System.out.println("Cate randuri?");
        Scanner scanner = new Scanner(System.in);
        int randuri = scanner.nextInt();
        for (int i = 1; i<= randuri; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
