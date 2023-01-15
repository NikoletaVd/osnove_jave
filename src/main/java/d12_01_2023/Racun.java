package d12_01_2023;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;
    private double trenutnoStanje;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }
    public Racun (String brojRacuna, String imeIPrezime, double trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje = trenutnoStanje;

    }
    public void promeniStanje (double vrednost) {
        this.trenutnoStanje = this.trenutnoStanje - vrednost;
        if (this.trenutnoStanje < 0) {
            this.trenutnoStanje = 0;
        }
    }
    public void print() {
        System.out.println("Ime i prezime: " + this.imeIPrezime + " - Broj racuna: " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.trenutnoStanje);
    }
}
