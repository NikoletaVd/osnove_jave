package d16_01_2023;

import java.util.ArrayList;

public class IgracZaVezbanje extends Osoba {
    private int broj;
    private String pozicija;
    private boolean jeKapiten;
    private ArrayList<Karton> kartoni;

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

    public IgracZaVezbanje (String imeIPrezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean jeKapiten) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
        this.kartoni = new ArrayList<>();
    }
    public void dodajKarton (Karton karton) {
        this.kartoni.add(karton);
    }
    public int brojZutih (String tip) {
        int zuti = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if(this.kartoni.get(i).getTip().equals(tip)) {
                zuti++;
            }
        } return zuti;
    }
    public int brojCrvenih (String tip) {
        int crveni = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if(this.kartoni.get(i).getTip().equals(tip)) {
                crveni++;
            }
        } return crveni;
    }
    public void print() {
        System.out.println("Igrac: ");
        super.print();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        if(this.jeKapiten) {
        System.out.println("Kapiten reprezentacije");
        } else {
            System.out.println("Nije kapiten");
        }
        System.out.println("Broj zutih kartona: " + this.brojZutih("Zuti"));
        System.out.println("Broj crvenih kartona: " + this.brojCrvenih("Crveni"));
    }

}
