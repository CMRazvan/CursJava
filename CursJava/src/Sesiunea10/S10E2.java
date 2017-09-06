package Sesiunea10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S10E2 {
    public static void main(String[] args) {
        try {
            System.out.println("Introduceti primul numar: ");
            Scanner scanner = new Scanner(System.in);
            int nr1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            int nr2 = scanner.nextInt();
            int rezultat = nr1 / nr2;
            System.out.println("Rezultatul este : " + rezultat);
        }catch (ArithmeticException e){
            System.out.println("Al doilea numar nu poate fi 0");
        }catch (InputMismatchException e){
            System.out.println("Nu ati introdus un numar corect");
        }catch (Exception e){
            //Exceptia asta este o exceptie generala adica se activeaza la orice eroare de exceptie
            // se recomanda sa fie trecuta ultima deoarece tratam toate exceptiile si pentru a nu putea lasa vreo interpretare atunci e punem pe cea generala
            System.out.println("Aveti o eroare generala");
        }
    }
}
