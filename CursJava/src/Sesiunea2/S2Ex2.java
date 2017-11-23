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


        //aici ne vom juca cu textul

        String nume = "Razvan";
        String text = "Ce mai faci?";
        System.out.println(nume + text); // la nivelul acesta o sa vedeti ca textul 'RazvanCe mai faci' este legat sa il dezlegam trebuie sa facem o CONCATENARE cu un text spatiu
        System.out.println(nume + " " + text); // prin faptul ca am pus + si " " am adaugat variabila plus spatiul lasat intre ghilimele plus textul 2 si asta face sa fie cu spatiu sau daca vrem putem sa lasam direct spatiu in Sting cand salvam textul

        //Aici ne jucam cu text si cu numere

        String numeA = "Ana";
        int mere = 55;
        System.out.println(numeA + " are " + mere + " mere.");// aici am adaugat variabile si text pentru a ne creea propriul scenariu in textul care il dorim

        // Aici ne jucam cu text si cu socoteli

        String numeB = "Razvan";
        int pere = 34;
        int fructe = mere + pere; // aici am creeat variabila fructe care o sa contina valoarea de mere si pere adunate

        System.out.println(numeA + " si " + numeB+  " au impreuna " + fructe + " fructe."); // aici am folosit mere lui aia si l-am adunat cu perele lui Razvan si am facut un totla de Fructe


    }
}
