package d26_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
//        funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        int z = brojevi(2,3);
        System.out.println(z);
        int s = brojevi(5, 1);
        System.out.println(s);

    }
    public static int brojevi (int a, int b) {
        if ((a <= 0 || a < 10) && (b <= 0 || b < 10)) {
            return Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        } else {
            return 0;
        }
    }
}
