package p13_01_2023;

import d29_12_2022.Proizvod;

public class Film {
    private String naziv;
    private int godina;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }
}
