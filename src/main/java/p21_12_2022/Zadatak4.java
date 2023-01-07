package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
//        koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.

        System.out.print("Unesite poziciju: ");
        int K = s.nextInt();

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(10);

        System.out.println("Na poziciji " + K + " je " + brojevi.get(K));

    }
}
