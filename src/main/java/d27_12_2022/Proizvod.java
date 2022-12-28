package d27_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj () {
        System.out.println(this.naziv + ", " + this.cena + " EUR, " + this.tezina + "g");
    }
    public double konvertuj (String kg) {
         double konvertuj = tezina / 1000;
             return konvertuj;
         }

         }

