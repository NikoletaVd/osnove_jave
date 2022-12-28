package p16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10)
//        i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//        Primer izvrsenja;
//        Unesite jacinu zvuka: 8
//                < | | | | | | | |
        System.out.print("Unesite jacinu zvuka: ");
        int zvuk = s.nextInt();
        System.out.print("<");

        for (int i = 1; i <= zvuk; i++) {
            System.out.print("|");
        } if (zvuk == 0) {
            System.out.println("/");
        }
    }
}
