package BankAccount;

/**
 * Created by ABC on 16-Aug-17.
 */
public class BancaNoastra {
    public static void main(String[] args) {
        ContEconomii cont1 = new ContEconomii("Razvan", 111, 2000, 0);
        cont1.afiseazaSold();
        cont1.depoziteazaSold(100);
        cont1.retragereNumerar(5000);
        cont1.afiseazaSold();
        cont1.depoziteazaSold(123);
        cont1.retragereNumerar(200);
    }
}
