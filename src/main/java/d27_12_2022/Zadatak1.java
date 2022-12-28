package d27_12_2022;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima
//        jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Leg Press Machine";
        proizvod1.cena = 1200;
        proizvod1.tezina = 34500;
        proizvod1.stampaj();
        System.out.println("Tezina u kilogramima: " + proizvod1.konvertuj("kg"));
        System.out.println();

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Samsung TV";
        proizvod2.cena = 600;
        proizvod2.tezina = 4520;
        proizvod2.stampaj();
        System.out.println("Tezina u kilogramima: " +  proizvod2.konvertuj("kg"));
        System.out.println();

        Proizvod proizvod3 = new Proizvod();
        proizvod3.naziv = "Plazma keks";
        proizvod3.cena = 2.4;
        proizvod3.tezina = 400;
        proizvod3.stampaj();
        System.out.println("Tezina u kilogramima: " + proizvod3.konvertuj("kg"));


    }
}
