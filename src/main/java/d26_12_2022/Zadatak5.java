package d26_12_2022;

public class Zadatak5 {
    public static void main(String[] args) {
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//          / / / / /
//        Napomena: Metoda nista ne vraca.

        stampa(5, "/");
        System.out.println();
        stampa(10, "*");
        System.out.println();

    }
    public static void stampa (int n, String s) {
        for (int i = 0; i < n ; i++) {
            System.out.print(s + " ");

        }
    }
}
