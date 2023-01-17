package p12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Kreirati klasu Sastojak koja ima:
//        naziv sastojka
//        cenu
//        gettere i settere
//                konstuktore
//
//
//        --U glavnom programu kreirati 3 sastojka.
//                U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
//                Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

        ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
        Scanner s = new Scanner(System.in);

        //        Sastojak sastojak1 = new Sastojak("Secer", 149.99);
//        Sastojak sastojak2 = new Sastojak("So", 139.99);
//        Sastojak sastojak3 = new Sastojak("Biber", 89.99);
//
//        sastojci.add(sastojak1);
//        sastojci.add(sastojak2);
//        sastojci.add(sastojak3);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        for (int i = 0; i < broj; i++) {

            System.out.print("Unesite sastojak: ");
            String sastojak = s.next();
            System.out.print("Unesite cenu: ");
            double cena = s.nextDouble();

            Sastojak x = new Sastojak(sastojak, cena);
            sastojci.add(x);
        }

        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println("Sastojak: " + sastojci.get(i).getNaziv() + " - Cena: " + sastojci.get(i).getCena() + " din.");

        }
    }
}
