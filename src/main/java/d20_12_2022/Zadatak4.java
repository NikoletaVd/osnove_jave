package d20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji proverava uparenost zagrada.
//        Korisnik unosi matematicku formulu sve dok ne unese znak =.
//        Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//                Primer izvrsenja:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//                (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//        Primer izvrsenja 2:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: =
//        Zagrade nisu uparene

        String unos = " ";
        int brojOtvorenihZ = 0;
        int brojZatvorenihZ = 0;

        while (!unos.equals("=")) {
            System.out.print("Unos: ");
            unos = s.next();
            if (unos.equals("(")) {
                brojOtvorenihZ++;
            } if (unos.equals(")")) {
                brojZatvorenihZ++;
            } if (brojOtvorenihZ == 2 && brojZatvorenihZ == 2 && unos.equals("=")) {
                System.out.println("Zagrade su uparene.");
            } if (brojOtvorenihZ <= 2 && brojZatvorenihZ < 2 && unos.equals("=")) {
                System.out.println("Zagrade nisu uparene.");
            }
        }
    }
}
