package d16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite dimenziju table: ");
        int dimenzija = s.nextInt();

        for (int i = 1; i <= dimenzija; i++) {

            for (int j = 1; j <= dimenzija; j++) {
                System.out.print("_|");
            }
            System.out.println();
        }
    }
}

