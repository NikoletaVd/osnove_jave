package p13_01_2023;

public class Sastojak {
    private String naziv;
    private int cena;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public Sastojak() {

    }
    public Sastojak (String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
    public void print() {
        System.out.println("Naziv sastojka: " + this.naziv + " - Cena: " + this.cena + " din.");
    }
}
