package p14_12_2022;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int zvuk = 75;
        System.out.println("Pocetna jacina zvuka je " + zvuk);
        System.out.println("Unesite akciju: ");
        String akcija = s.next();
        if (akcija.equals("pojacaj")) {
            zvuk = zvuk + 10;
        } else if (akcija.equals("smanji")) {
            zvuk = zvuk - 10;
        } else if (akcija.equals("mute")) {
            zvuk = 0;
        }  System.out.println("Nova jacina zvuka je " + zvuk);
    }

}
