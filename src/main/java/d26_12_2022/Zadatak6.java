package d26_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
//        Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//                Primer poziva funkcija:
//        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//        Primer izvrsenja main programa:
//        Unesite vrednost u eurima: 3
//        Unesite valutu za konverziju: RSD
//        3 EUR je 351.6339 RSD
//        Konverzija eura u druge valute:
//        1 EUR = 117.5 RSD
//        1 EUR = 1.1 USD
//        1 EUR = 62.98 RUB

        System.out.print("Unesite vrednost u evrima: ");
        double vrednost = s.nextDouble();
        System.out.print("Unesite valutu za konverziju: ");
        String valuta = s.next();
        double d = konvertuj(vrednost, valuta);
        System.out.println(d);

    }
    public static double konvertuj (double vrednost, String valuta) {
        if (valuta.equals("RSD")) {
            return vrednost * 117.5;
        } if (valuta.equals("USD")) {
            return vrednost * 1.1;
        } if (valuta.equals("RUB")) {
            return vrednost * 62.98;
        } else {
            return 0;
        }
    }
}
