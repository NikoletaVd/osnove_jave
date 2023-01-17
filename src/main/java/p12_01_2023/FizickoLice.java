package p12_01_2023;

public class FizickoLice {
    private String imeIPrezime;
    private String brojLK;
    private String jmbg;
    private boolean kupovaoJe;
    public FizickoLice(String imeIPrezime, String brojLK, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.brojLK = brojLK;
        this.jmbg = jmbg;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean getKupovaoJe() {
        return kupovaoJe;
    }

    public void setKupovaoJe(boolean kupovaoJe) {
        this.kupovaoJe = kupovaoJe;
    }
    public void print() {
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("Broj licne karte: " + this.brojLK);
    }
}
