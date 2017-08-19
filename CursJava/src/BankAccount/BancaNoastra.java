package BankAccount;

import java.util.Scanner;

/**
 * Created by ABC on 16-Aug-17.
 */
public class BancaNoastra {
    public static void main(String[] args) {
        ContEconomii cont1 = new ContEconomii("Razvan", 1, 0, 0);
        System.out.println("Bine ai venit la banca!" +
                "Te rugam sa alegi obtiunea dorita:");
        Scanner keyboardScan = new Scanner(System.in);
        int alegere;
        do {
            System.out.println(
                    "1.Pentru Conectare" +
                            "\n2.Pentru Verificare Sold" +
                            "\n3.Pentru Retragere" +
                            "\n4.Pentru Depunere" +
                            "\n5.Operatiuni" +
                            "\n0.Pentru Iesire\n");
            alegere = keyboardScan.nextInt();
            if (alegere == 1) {
                System.out.println("Aici vom seta numele clientului, numarul contului si dupa aia mergem sa facem operatiuni");
            } else if (alegere == 2) {
                System.out.println("------------Sold----------");
                cont1.afiseazaSold();
                System.out.println("--------------------------");
            } else if (alegere == 3) {
                cont1.afiseazaSoldInt();
                System.out.println("Cat doresti sa retragi:\n");
                int retragere = keyboardScan.nextInt();
                System.out.println("------------Retragere----------");
                cont1.retragereNumerar(retragere);
                System.out.println("-------------------------------");
            } else if (alegere == 4) {
                System.out.println("Cat doresti sa depui: ");
                int depunere = keyboardScan.nextInt();
                System.out.println("------------Depunere----------");
                cont1.depoziteazaSold(depunere);
                System.out.println("------------------------------");
            } else if (alegere == 5) {
                System.out.println("--------------Operatiuni------------");
                System.out.println("1.Creeare Depozit" +
                        "\n2.Dizolvare Depozit" +
                        "\n3.Creeare Cont nou" +
                        "\n4.Transfer Bani Intern" +
                        "\n5.Transfer Bani Extern" +
                        "\n0.Meniu Principal");

            } else {
                System.out.println("Nu ai ales nici un nr");
            }
        } while (alegere != 0);


    }
}
