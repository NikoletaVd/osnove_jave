package d19_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        StaklenaAmbalaza staklo = new StaklenaAmbalaza("Nescafe gold", "q3477-0098", 150,
                200, 30, false, 649.99);
        Tetrapak tetrapak1 = new Tetrapak("Pavlaka za kuvanje", "i998076-11123", 490, 500,
                true, 359.99);
        Tetrapak tetrapak2 = new Tetrapak("Jogurt", "l987709-0087", 1020, 1030,
                true, 149.99);
        SuperKartica kartica = new SuperKartica("1345-9908-3455-9876", "Petar Petrovic", 150);
        Korpa korpa = new Korpa();

        korpa.dodajAmbalazu(staklo);
        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(tetrapak2);
        korpa.print();
        System.out.println("Ukupna cena korpe je: " + korpa.ukupnaCenaKorpe(kartica));
        System.out.println();

        korpa.izbaciAmbalazu("l987709-0087");
        korpa.print();
        System.out.println("Ukupna cena korpe je: " + korpa.ukupnaCenaKorpe(kartica));

    }
}
