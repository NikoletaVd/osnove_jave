package p21_12_2022;

import java.util.ArrayList;

public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i racuna i stampa sumu svih brojeva niza.
//    Primer: Ako je niz 1,2,4,5,7
//    Stampa se, suma = 19

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(10);
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            suma = suma + brojevi.get(i);

        }  System.out.println(suma);
    }








}
