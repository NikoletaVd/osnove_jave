package p20_12_2022;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zadatak7_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int suma = 0;
        boolean running = true;

        while (running == true) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (suma + broj > 100) {
                running = false;
            } else {
                suma = suma + broj;
            }
        }
        System.out.println("Prekoracenje. Sracunata suma je " + suma
        );
    }
}
