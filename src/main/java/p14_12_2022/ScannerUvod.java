package p14_12_2022;

import java.util.Scanner;

public class ScannerUvod {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Unesite vrednost za a: ");
        int a = s.nextInt();

        System.out.println("Unesite vrednost za b: ");
        int b = s.nextInt();
        int sum = a + b;

        System.out.println("Unesite vrednost za double: ");
        double d = s.nextDouble();
        System.out.println("Suma " + a + "+" + b + "=" + sum);
    }
}
