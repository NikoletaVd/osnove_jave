package p14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji sa tastature ucitava tri broja a, b i c i ispisuje srednju vrednost za ta tri broja. Sve promenljive u programu su po tipu double

        System.out.println("Unesite vrednost za a: ");
        double a = s.nextDouble();
        System.out.println("Unesite vrednost za b: ");
        double b = s.nextDouble();
        System.out.println("Unesite vrednost za c: ");
        double c = s.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("AVG je: " + avg);


    }
}
