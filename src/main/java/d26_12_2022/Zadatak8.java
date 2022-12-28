package d26_12_2022;

public class Zadatak8 {
    public static void main(String[] args) {
//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        int d = najmanjiBroj(2,4,6);
        System.out.println("Najmanji broj je: " + d);
        int g = najmanjiBroj(15,5, 12);
        System.out.println("Najmanji broj je : " + g);

    }
    public static int najmanjiBroj (int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } if (b < a && b < c) {
            return b;
        } if (c < a && c < b) {
            return c;
        } else {
            return 0;
        }
    }
}
