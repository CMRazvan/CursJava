package BankAccount;

/**
 * Created by ABC on 16-Aug-17.
 */
public class ContCredit extends Cont {
    private int credit;

    public ContCredit(String numeClient, int numarCont, int sold, int credit) {
        super(numeClient, numarCont, sold);
        this.credit = credit;

    }

    public void retragereNumerar(int suma) {
        int solVechi = getSold();
        if (suma > solVechi + credit) {
            System.out.println("");
        } else {

        }
    }
}
