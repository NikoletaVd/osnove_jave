package p21_12_2022;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(10);

        int suma = 0;
        int lastIndex = brojevi.size() - 1;
        suma = brojevi.get(0) + brojevi.get(brojevi.size() - 1);
//        int a = brojevi.size() / 2;
//        System.out.println(a);

        System.out.println("Suma: " + suma);




    }
}
