package p14_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Znak karte koja je na stolu: ");
        String znakKarte = s.next();
        System.out.print("Broj karte koja je na stoli: ");
        String brojKarte = s.next();
        System.out.print("Znak karte koju igrac zeli da odigra: ");
        String odigraniZnak = s.next();
        System.out.print("Broj karte koju igrac zeli da odigra: ");
        String odigraniBroj = s.next();
        if (znakKarte.equals(odigraniZnak) || brojKarte.equals(odigraniBroj)) {
            System.out.println("Potez je validan.");
        } else {
            System.out.println("Potez nije validan.");
        }
    }
}
