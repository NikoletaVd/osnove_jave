package d10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu Proizvod koja ima
//        Naziv proizvoda
//        kupca/musteriju
//        cenu izrade proizvoda
//        gettere i settere
//                konstruktore
//        Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//        cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//        Metodu za stampanje proizvoda u formatu:
//        naziv proizvoda - cena
//        ime i prezime - broj kartice
//
//        Kreirati klasu Kupac koja ima:
//        ime i prezime
//        clansku kartu
//        gettere i settere, clanska karta ne moze da se menja
//        konstruktore
//        metodu stampaj koja stampa u formatu
//        ime i prezime - broj kartice
//
//        Kreirati klasu ClanskaKarta koja ima:
//        popust (u rasponu od 5 do 10 %)
//        broj kartice (npr: 9329-0239)
//        gettere i setter
//                konstuktore

        ClanskaKarta clanskaKarta1 = new ClanskaKarta(10, "1334-0987");
        ClanskaKarta clanskaKarta2 = new ClanskaKarta(5, "5644-2289");

        Kupac kupac1 = new Kupac("Marko Markovic", clanskaKarta1);
        Kupac kupac2 = new Kupac("Petar Petrovic", clanskaKarta2);

        Proizvod proizvod1 = new Proizvod("Apple watch 8", kupac1, 40788);
        proizvod1.print();
        System.out.println();

        Proizvod proizvod2 = new Proizvod("Gejmerska stolica", kupac2, 20500);
        proizvod2.print();

    }
}
