package Sesiunea11.Colectii;

import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Maria");//asa se adauga il lista
        obj.add("Ana");
        obj.add("Razvan");
        System.out.println(obj);//asa se afiseaza lista
        obj.remove("Maria");
        System.out.println(obj);
        obj.add("Marcel");
        System.out.println(obj);
        obj.remove(1);//asa se strge pe baza de index si am ales 1 se incepem numaratoarea de la 0
        System.out.println(obj);
        if (obj.contains("Marcel")){// asa se cauta daca avem ceva
            System.out.println("Il avem pe Marcel");
        }else{
            System.out.println("Nu il avem pe Marcel");
        }
    }
}
