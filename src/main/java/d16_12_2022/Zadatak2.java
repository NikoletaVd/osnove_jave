package d16_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red.
//                Zadatak resiti pomocu FOR petlje.

        for (int i = 1; i <= 25; i++) {
            System.out.print("_");
            if (i == 5 || i ==10 || i ==15 || i ==20) {
                System.out.println();
            }

        }

    }
}
