package Sesiunea11.Colectii;

import java.util.HashSet;

public class ExHasSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Maria");//Asa se adauga
        hashSet.remove("Maria");//Asa se sterge
        hashSet.add("Razvan");
        hashSet.add("Ana");
        System.out.println(hashSet);//Asa se afiseaza
        if (hashSet.contains("Ana")){//asa se cauta daca avem ceva in hashset
            System.out.println("O avem pe Ana");
        }
        if (hashSet.contains("Maria")){
            System.out.println("O avem pe Maria");
        }else {
            System.out.println("Nu o avem pe Maria");
        }
    }
}
