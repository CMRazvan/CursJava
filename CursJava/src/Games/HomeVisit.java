package Games;

import java.util.Scanner;

public class HomeVisit {
    public static void main(String[] args) {
        Scanner scanKey = new Scanner(System.in);
        boolean jocActiv = true;
        while (jocActiv) {
            System.out.println("Meniu:" +
                    "1. Intra in casa");
            int optiune = scanKey.nextInt();
            String raspuns;
            switch (optiune) {
                case 1:  raspuns = casa();
                    break;
                case 2:  raspuns = "February";
                    break;
                default: raspuns = "Invalid month";
                    break;
            }

        }
    }
    public static String casa(){
        System.out.println("Ai intrat in casa");
        return "In casa gasesti:";
    }
}
