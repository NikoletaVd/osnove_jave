package p10_1_2023;

public class Proizvod {
    private String nazivProizvoda;
    private String kupac;
    private int cenaIzradeProizvoda;

    public String getNazivProizvoda() {
        return this.nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public String getKupac() {
        return this.kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzradeProizvoda() {
        return this.cenaIzradeProizvoda;
    }

    public void setCenaIzradeProizvoda(int cenaIzradeProizvoda) {
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;
    }

    public Proizvod(String nazivProizvoda, String kupac, int cenaIzradeProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
        this.kupac = kupac;
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;
    }
}
