package p20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
//                Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:1
//        Unesite broj:0
//        Kraj programa jer je uneto 2 nule.

        int broj = 1;
        int counter = 0;

        while (counter < 2) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj == 0) {
                counter = counter + 1;
            }
        } System.out.println("Kraj programa jer je uneto dve nule.");
    }
}
