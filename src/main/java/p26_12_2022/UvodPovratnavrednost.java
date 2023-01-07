package p26_12_2022;

public class UvodPovratnavrednost {
    public static void main(String[] args) {
        int x = suma(10, 5);

        int z = abs(-5);
        System.out.println(z);

    }
    public static int suma (int a, int b) {
        int suma = a + b;

        return suma;
    }
    public static int abs (int x) {
        if (x<0) {
           return -x;
        } else {
          return x;
        }

    }
}
