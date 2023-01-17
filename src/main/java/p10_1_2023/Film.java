package p10_1_2023;

public class Film {
    private String nazivFilma;
    private int godina;
    private Reziser reziraoGa;

    public Reziser getReziraoGa() {
        return this.reziraoGa;
    }

    public void setReziraoGa(Reziser reziraoGa) {
        this.reziraoGa = reziraoGa;
    }

    public Film() {
    }
    public Film (String nazivFilma, int godina) {
        this.nazivFilma = nazivFilma;
        this.godina = godina;
    }

    public String getNazivFilma() {
        return this.nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public int getGodina() {
        return this.godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
    public void stampaj () {
        System.out.println("Naziv filma: " + this.nazivFilma + ", " + this.godina + " god.");
        if (this.reziraoGa != null) {
            System.out.println("Film je rezirao: " + this.reziraoGa.getImeIPrezime());
        }
    }
}
