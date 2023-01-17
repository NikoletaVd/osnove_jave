package p13_01_2023;

public class UvodniZadata {
    public static void main(String[] args) {

        Reziser r = new Reziser("Petar Petrovic", 49);

        Film b1 = new Film("Brat 1", 2002);
        Film b2 = new Film("Brat 2", 2005);

        r.dodajFilm(b1);
        r.dodajFilm(b2);


    }
}
