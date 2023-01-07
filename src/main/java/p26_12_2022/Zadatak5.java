package p26_12_2022;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.


        apsolutnaVrednost(13);
        System.out.println();
        apsolutnaVrednost(-10);


    }

    public static void apsolutnaVrednost(int a) {
        if (a < 0) {
            System.out.println("Apsolutna vrednost je: " + a * (-1));
        } else {
            System.out.println("Apsolutna vrednost je: " + a);
        }
    }
}
