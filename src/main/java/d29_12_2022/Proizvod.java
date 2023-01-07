package d29_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj () {
        System.out.println("Naziv proizvoda: " + this.naziv + ", "
                + "cena: " + this.cena + " din, " + "tezina: " + this.tezina + " g");
    }
    public void povecajCenu (double povecanje) {
        this.cena = this.cena + povecanje;
    }
    public double vratiCenuSaPopustom (double popust) {
        double cenaSaPopustom = this.cena - popust;
        return cenaSaPopustom;
    }
    public int racunajPostarinu () {
        if (this.tezina <= 100) {
            return 200;
        } else if (this.tezina > 100 && this.tezina <= 500) {
            return 400;
        } else {
            return 1000;
        }

    }

}
