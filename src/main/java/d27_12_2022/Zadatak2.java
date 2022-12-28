package d27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string
//        metodu za stampu (proizvoljno)
//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//        Metoda kao parametar prima temperaturu koja je napolju.
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode


        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Samsung";
        klima1.temperatura = 24;
        klima1.mod = "Grejanje";
        klima1.stampaj();
        System.out.println("Spoljasnja temperatura je visa" + " - " + klima1.temperaturaJeVeca(15));
        System.out.println();

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Galanz";
        klima2.temperatura = 20;
        klima2.mod = "Hladjenje";
        klima2.stampaj();
        System.out.println("Spoljasnja temperatura je visa" + " - " + klima2.temperaturaJeVeca(29.5));
        System.out.println();

        SmartAirConditioning klima3 = new SmartAirConditioning();
        klima3.marka = "Vox";
        klima3.temperatura = 23;
        klima3.mod = "Hladjenje";
        klima3.stampaj();
        System.out.println("Spoljasnja temperatura je visa" + " - " + klima3.temperaturaJeVeca(32));
    }
}
