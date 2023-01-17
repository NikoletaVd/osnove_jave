package p13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Sastojak koja ima:
//        naziv
//                cenu
//        gettere i settere
//                konstruktore
//        metodu za stampanje koja stampa  podatke u formatu:
//        naziv - cena.din
//
//        Kreirati klasu Pasta koja ima:
//        niz sastojaka
//        metodu za dodavanje sastojka
//        defaultni konstruktor
//        metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//        metodu za stampu koja stampa podatke u formatu:
//        Pasta je sa sastojcima:
//        naziv - cena.din
//        naziv - cena.din
//        naziv - cena.din
//        Cena paste je cena.din
//
//
//                (ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//
//                U glavnom programu kreirati objekte i testirati funkcionalnosti

        Pasta carbonara = new Pasta();

        carbonara.dodajSastojak(new Sastojak("Pene", 60));
        carbonara.dodajSastojak(new Sastojak("Neutralna pavlaka", 100));
        carbonara.dodajSastojak(new Sastojak("Slanina", 150));
        carbonara.dodajSastojak(new Sastojak("Jaje", 24));
        carbonara.dodajSastojak(new Sastojak("Prsuta", 180));

        carbonara.print();
        System.out.println();

        carbonara.brisanjeSastojka("Prsuta");
        carbonara.print();



    }
}
