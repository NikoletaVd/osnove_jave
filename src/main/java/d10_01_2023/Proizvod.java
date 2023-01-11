package d10_01_2023;

public class Proizvod {
    private String nazivProizvoda;
    private Kupac kupioJe;
    private double cenaIzrade;

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public Kupac getKupioJe() {
        return kupioJe;
    }

    public void setKupioJe(Kupac kupioJe) {
        this.kupioJe = kupioJe;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(String nazivProizvoda, Kupac kupioJe, double cenaIzrade) {
        this.nazivProizvoda = nazivProizvoda;
        this.kupioJe = kupioJe;
        this.cenaIzrade = cenaIzrade;
    }
    public double cenaProizvoda() {
        return this.cenaIzrade * 1.9 * (100 - this.kupioJe.getKartica().getPopust()) / 100;
    }
    public void print() {
        System.out.println("Naziv proizvoda: " + this.nazivProizvoda + " - " + "Cena: " + this.cenaProizvoda());
        System.out.println("Ime i prezime kupca: " + this.kupioJe.getImeIPrezime() + " - " +
                "Broj kartice: " + this.kupioJe.getKartica().getBrojKartice());
    }
}
