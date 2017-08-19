package BankAccount;

/**
 * Created by ABC on 16-Aug-17.
 */
public class Cont {
    private String numeCient;
    private int numarCont;
    private int sold;

    public int getSold() {
        return sold;
    }

    public void setSold(int suma) {
        sold = suma;
    }

    public Cont(String numeClient, int numarCont, int sold) {
        this.numeCient = numeClient;
        this.numarCont = numarCont;
        this.sold = sold;
    }

    public Cont() {
    }

    public void afiseazaSold() {
        System.out.println("Sold este: " + sold + " Ron.");
    }

    public int afiseazaSoldInt() {
        System.out.println("Ai disponibil: " + sold);return sold; }

    public void depoziteazaSold(int suma) {
        System.out.println("S-a depozitat " + suma + " Ron.");

        if (suma > 0) {
            sold += suma;
            System.out.println("Sold este: " + sold + " Ron.");
        } else {
            System.out.println("Suma introdusa nu este valabila");
        }
    }

    public void retragereNumerar(int suma) {
        if (suma > sold) {
            System.out.println("Nu aveti destule Fonduri mai ai nevoie de: " + (suma - sold));
        } else {
            sold -= suma;
            System.out.println("S-a extras suma de " + suma + " si mai aveti: " + sold + " Ron.");
        }
    }
}
