package p26_12_2022;

public class Zadatak8 {
    public static void main(String[] args) {
//        Napisati metodu koja proverava da li je trougao pravougli.
//        Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//                Trougao je pravougli ukoliko je a*a+b*b=c*c

      boolean z = trougao(10, 15, 20);
        System.out.println(z);

    }
    public static boolean trougao (int a, int b, int c) {
        if (a*a + b*b == c*c) {
            return true;
        } else {
            return false;
        }
    }

}
