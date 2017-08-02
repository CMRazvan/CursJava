package Sesiunea7;

public class S7Ex2 {
    public static void main(String[] args) {
//        2. Scrieti un program care afiseaza sirul in ordine inversa
        int[]a = {23, 1, 34, 54, 3, 7, 5, 12, 5, 8};
        for (int i = a.length - 1; i >= 0 ; i--) {
                System.out.println(a[i]);
        }
    }
}
