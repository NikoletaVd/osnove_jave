package p21_12_2022;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3
//        tako sto je povecava 10 puta.

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(10);

        brojevi.set(3, brojevi.get(3)*10);

        System.out.println(brojevi);



    }
}
