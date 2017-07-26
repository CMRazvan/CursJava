package Sesiunea3;

import java.util.Scanner;

public class S3Ex1 {
    public static void main(String[] args) {
        System.out.println("Scrieți un program care sa verifice parola care trebuie să fie ”java”.\n" +
                "O variabilă primește valoarea ”java”.\n" +
                "Programul întreabă pe utilizator parola.\n" +
                "Compară parola dată de utilizator cu cea din program (adică ”java”).\n" +
                "Afișează dacă parola este corectă sau nu.\n");
        System.out.println("Tasteaza parola: ");
        Scanner tastaturain = new Scanner(System.in);
        String variabilaPrimita = tastaturain.next();
        String valiabilaSecreta = "Java";
        if (valiabilaSecreta.equals(variabilaPrimita)){
            System.out.println("Parola Corecta");
        }else {
            System.out.println("Parola Gresita");
        }
    }
}
