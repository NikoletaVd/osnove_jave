package p21_12_2022;

import java.util.ArrayList;

public class UvodPetljeNizovi {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();


        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(10);

        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i) + ", ");

        }

    }
}
