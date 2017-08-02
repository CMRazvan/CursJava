package Sesiunea4;

import java.util.Scanner;

public class S4Ex1 {
//    Scrieți un program care sa verifice parola care trebuie să fie ”java”.
//    O variabilă primește valoarea ”java”.
//    Programul întreabă pe utilizator parola.
//    Compară parola dată de utilizator cu cea din program (adică ”java”).
//    Afișează dacă parola este corectă sau nu.
//    Pentru ajutor aveți exemple la sfârșitul documentului.
    public static void main(String[] args) {
        String parolaCorecta = "java";
        System.out.println("Introduceti va rog parola");
        Scanner scanner = new Scanner(System.in);
        String parolaCitita = scanner.next();
        if (parolaCitita.equals(parolaCorecta))
            System.out.println("Parola este corecta");
        else
            System.out.println("Parola este gresita");
    }
}
