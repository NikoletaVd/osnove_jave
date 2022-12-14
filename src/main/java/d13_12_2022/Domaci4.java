package d13_12_2022;

public class Domaci4 {
    public static void main(String[] args) {
//        Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//                Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30
        int a = 8;
        final double KOREN_BROJA_3 = 1.73;
        double Povrsina = (a * a * KOREN_BROJA_3) / 4;
        int Obim = 3 * a;
        System.out.println("a: " + a);
        System.out.println("Povrsina je " + Povrsina);
        System.out.println("Obim je " + Obim);




    }
}
