package Sesiunea2;

public class S2Ex2 {
    public static void main(String[] args) {
        System.out.println("Aici vom face socoteli");


        //Avem 2 numere declarate si trebuie sa le adunam

        int numarA = 1; //Aici am declarat numarul 1
        int numarB = 23; //Aici am declarat numarul 2

        //Matematica numere
        //Aici facem adunarea
        int adunare = numarA + numarB;
        System.out.println(adunare);
        //Aici facem scaderea
        int scadere = numarA - numarB;
        System.out.println(scadere);
        //aici facem inmultire
        int inmultire = numarA * numarB;
        System.out.println(inmultire);
        //Aici facem impartire
        int impartire = numarA / numarB;
        System.out.println(impartire);

        //folosim tipuri de numere diferite
        numarA = 23;
        double numarC = 100.5; // aici avem numar cu virgula

        double adunareDouble = numarA + numarC; // aici adunam un numar cu virugla si unu fara virgula si rezultatul trebuie sa fie cu virgula deoarece ne asteptam sa vina numere cu virugla
        System.out.println(adunareDouble);



    }
}
