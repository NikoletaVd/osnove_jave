package p21_12_2022;

import java.util.ArrayList;

public class UvodNizovi {
    public static void main(String[] args) {
        System.out.println("Pocetak");

        ArrayList<String> cars = new ArrayList<String>();
//        System.out.println(cars.size());
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.set(0, "Audi");
        cars.add(0, "Kia");
        cars.remove(2);

//        String prvi = cars.get(1);
//        System.out.println(cars.get(1) + " Auto");
//        System.out.println("Kraj");
    }
}
