package p21_12_2022;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula)
//        i zadnjeg elemnta niza.


        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(10);
        int backUp0 = brojevi.get(0);

        brojevi.set(0, brojevi.get(brojevi.size() - 1));
        brojevi.set(brojevi.size() - 1, backUp0);

        System.out.println(brojevi);


    }
}
