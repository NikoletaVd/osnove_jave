package d14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        Ime
//                Prezime
//        godinu rodjenja
//        I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god

        System.out.print("Unesite ime: ");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();

        if (ime.equals("Nikoleta") && prezime.equals("Vdovenko") && godinaRodjenja == 1995) {
            System.out.println("Nikoleta Vdovenko" + " - " + (2022-godinaRodjenja) + " godina");
        }
    }
}
