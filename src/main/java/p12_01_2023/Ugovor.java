package p12_01_2023;

public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;
    public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa) {
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenat() {
        if (this.kupac.getKupovaoJe()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }
    public double zarada() {
        return 1000 + this.cena * this.procenat();
    }
    public void print() {
        System.out.println("Dana " + this.datum + " god. sklopljen je ugovor izmedju " + this.prodavac.getImeIPrezime()
        + " i " + this.kupac.getImeIPrezime() + " o kupovini nekretnine na adresi " + this.adresa + " po ceni od " + this.cena +
                " EUR, pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zarada() + "EUR");
    }

}
