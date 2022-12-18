package p14_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int zvuk = 75;

        System.out.println("Pocetna jacina zvuka je " + zvuk);

        System.out.print("Unesite akciju: ");
        String akcija1 = s.next();
        if (akcija1.equals("pojacaj")) {
            zvuk = zvuk + 10;
            System.out.println("Nova jacina zvuka je " + zvuk);
        }
        System.out.print("Unesite akciju: ");
        String akcija2 = s.next();
        if (akcija2.equals("pojacaj")) {
            zvuk = zvuk + 10;
            System.out.println("Nova jacina zvuka je " + zvuk);
        }
        System.out.print("Unesite akciju: ");
        String akcija3 = s.next();
        if (akcija3.equals("pojacaj")) {
            zvuk = 100;
            System.out.println("Nova jacina zvuka je " + zvuk);
        }
        System.out.print("Unesite akciju: ");
        String akcija4 = s.next();
        if (akcija4.equals("mute")) {
            zvuk = 0;
            System.out.println("Nova jacina zvuka je " + zvuk);
        }
        System.out.print("Unesite akciju: ");
        String akcija5 = s.next();
        if (akcija5.equals("smanji")) {
            zvuk = 0;
            System.out.println("Nova jacina zvuka je " + zvuk);
        }

    }
}

