package d29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        gettere za sve atribute
//        settere za sve atribute osim broja lajkova i broja deljenja
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)
//
//        U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//        Primer stampanja:
//        Milan Jovanovic >>> Pera Peric
//        Ovo je tekst objave
//        Likes 3 | Shares 1

        FacebookPost facebookPost1 = new FacebookPost();
        facebookPost1.setImeIPrezime1("Albus Dumbledore");
        facebookPost1.setImeIPrezime2("Severus Snape");
        facebookPost1.setTekstObjave("After all this time?");
        facebookPost1.like();
        facebookPost1.like();
        facebookPost1.like();
        facebookPost1.share();
        facebookPost1.print();
        System.out.println();

        FacebookPost facebookPost2 = new FacebookPost();
        facebookPost2.setImeIPrezime1("Severus Snape");
        facebookPost2.setImeIPrezime2("Albus Dumbledore");
        facebookPost2.setTekstObjave("Always.");
        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.share();
        facebookPost2.print();

    }
}
