package d19_01_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze;

    public Korpa () {
        this.ambalaze = new ArrayList<>();
    }
    public void dodajAmbalazu (Ambalaza ambalaza) {
        this.ambalaze.add(ambalaza);
    }
    public void izbaciAmbalazu (String barkod) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if(this.ambalaze.get(i).getBarkod().equals(barkod)) {
                this.ambalaze.remove(i);
            }
        }
    }
    private double cenaSvihAmbalaza (int popust) {
        double cena = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cena = this.ambalaze.get(i).cena() - popust;
        } return cena;
    }
    public double ukupnaCenaKorpe (SuperKartica kartica) {
        double suma = 0;
        double cenaKorpe = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            suma += this.ambalaze.get(i).cena();
            cenaKorpe = suma - kartica.getPopust();
        } return cenaKorpe;
    }

    public void print() {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            this.ambalaze.get(i).print();
        }
    }
}
