package p26_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju
//        sa razlicitim prosledjenim vrednostima.

        rezultat(10,2);
        System.out.println();
        rezultat(25, 5);
        System.out.println();
        rezultat(12,6);

    }
    public static void rezultat (int a, int b) {
        System.out.println("Zbir je: " + (a+b));
        System.out.println("Razlika je: " + (a-b));
        System.out.println("Proizvod je: " + (a*b));
        System.out.println("Kolicnik je: " + (a/b));

    }
}
