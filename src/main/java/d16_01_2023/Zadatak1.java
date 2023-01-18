package d16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//                jmbg
//        godinu rodjenja
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)
//
//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere za broj, kapiten i poziciju
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//        U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//        (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati
//        sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

        Igrac i1 = new Igrac("Dusan Tadic", "1011988767899", 1988, 14, "Vezni igrac", true);
        Igrac i2 = new Igrac("Aleksandar Mitrovic", "1609994564322", 1994, 12, "Napadac", false);
        i1.print();
        System.out.println();
        i2.print();
        System.out.println();

        Trener t1 = new Trener("Dragan Stojkovic", "0303965564432", 1965, 37, "Glavni trener");
        Trener t2 = new Trener("Goran Djorovic", "0512975543211", 1975, 25, "Pomocni trener");
        t1.print();
        System.out.println();
        t2.print();


    }
}
