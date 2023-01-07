package d29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//        Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//                vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost
//                je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je
//                parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//        Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Milka cokolada";
        proizvod1.cena = 349.99;
        proizvod1.tezina = 300;

        proizvod1.stampaj();
        proizvod1.povecajCenu(30);
        System.out.println("Cena nakon povecanja: " + proizvod1.cena + " din.");
        System.out.println("Cena sa popustom: " + proizvod1.vratiCenuSaPopustom(50) + " din.");
        System.out.println("Cena postarine: " + proizvod1.racunajPostarinu() + " din.");
        System.out.println();

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Adidas patike";
        proizvod2.cena = 9899.99;
        proizvod2.tezina = 1200.50;

        proizvod2.stampaj();
        proizvod2.povecajCenu(60);
        System.out.println("Cena nakon povecanja: " + proizvod2.cena + " din.");
        System.out.println("Cena sa popustom: " + proizvod2.vratiCenuSaPopustom(90) + " din.");
        System.out.println("Cena postarine: " + proizvod2.racunajPostarinu() + " din.");
        System.out.println();

        Proizvod proizvod3 = new Proizvod();
        proizvod3.naziv = "Nescafe gold";
        proizvod3.cena = 549.99;
        proizvod3.tezina = 100;

        proizvod3.stampaj();
        proizvod3.povecajCenu(20);
        System.out.println("Cena nakon povecanja: " + proizvod3.cena + " din.");
        System.out.println("Cena sa popustom: " + proizvod3.vratiCenuSaPopustom(40) + " din.");
        System.out.println("Cena postarine: " + proizvod3.racunajPostarinu() + " din.");

    }
}
