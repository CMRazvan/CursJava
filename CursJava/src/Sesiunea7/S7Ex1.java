package Sesiunea7;

public class S7Ex1 {
    public static void main(String[] args) {
//        1. Scrieti un program care afiseaza doar numerele pare din sir
        int[]a = {23, 1, 34, 54, 3, 7, 5, 12, 5, 8};
        for (int i = 0 ; i < a.length; i++){
            if (a[i] % 2 == 0){
                System.out.println(a[i]);
            }
        }
    }
}
