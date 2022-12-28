package d26_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        stampajVrednostZa10Vecu(5);
        System.out.println();
        stampajVrednostZa10Vecu(3);
        System.out.println();
        stampajVrednostZa10Vecu(10);
        System.out.println();

    }
    public static void stampajVrednostZa10Vecu (int a) {
        int b = a * 10;
        System.out.println(b);

    }
}
