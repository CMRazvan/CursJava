package Sesiunea11.Colectii;

import java.util.HashMap;

public class ExHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();//in <> se trece keya si valoarea
        hmap.put("Mere", 5);
        hmap.put("Pere", 10);
        hmap.put("Pere", 16);//daca avem aceasi keye o sa fie luata ultima
        hmap.put("Banane", 1);
        System.out.println(hmap);
        hmap.remove("Pere");//asa se sterge toata inregistrarea
        System.out.println(hmap);
        int cantitate = hmap.get("Mere");//aici citim doar cantiata aferenta keyei care am dat-o
        System.out.println("Cantitate are valoarea intiala " + cantitate);
        cantitate =+ 10;
        hmap.put("Caise", cantitate);
        System.out.println(hmap);

    }
}
