package Sesiunea7;

public class S7Ex3 {
    public static void main(String[] args) {
//        3. Scrieti un program care afiseaza doar numerele divizibile cu 3 din sirul de mai sus
        int[]a = {23, 1, 34, 54, 3, 7, 5, 12, 5, 8};
        for (int i = 0 ; i < a.length; i++){
            if (a[i] % 3 == 0){
                System.out.println(a[i]);
            }
        }
    }
}
