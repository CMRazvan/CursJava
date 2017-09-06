package Sesiunea10;

public class S10E3 {
    public static void main(String[] args) {
        try {
            int[] a = {23, 1, 34, 54, 3, 7, 12, 5, 8};
            for (int i = 0; i <= a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
