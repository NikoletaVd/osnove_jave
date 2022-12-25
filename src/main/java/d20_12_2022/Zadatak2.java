package d20_12_2022;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
//        sve dok korisnik ne unese KRAJ..

        String rimskiBroj = " ";
        int arapskiBroj = 1;

        while (!rimskiBroj.equals("KRAJ")) {
            System.out.print("Unesite rimski broj: ");
            rimskiBroj = s.next();
            if (rimskiBroj.equals("I")) {
                arapskiBroj = 1;
            }
            if (rimskiBroj.equals("V")) {
                arapskiBroj = 5;
            }
            if (rimskiBroj.equals("X")) {
                arapskiBroj = 10;
            }
            if (rimskiBroj.equals("L")) {
                arapskiBroj = 50;
            }
            if (rimskiBroj.equals("C")) {
                arapskiBroj = 100;
            }
            if (rimskiBroj.equals("D")) {
                arapskiBroj = 500;
            }
            if (rimskiBroj.equals("M")) {
                arapskiBroj = 1000;
            }
            System.out.println("Arapski broj: " + arapskiBroj);

        } System.out.println("Kraj programa.");
    }
}
