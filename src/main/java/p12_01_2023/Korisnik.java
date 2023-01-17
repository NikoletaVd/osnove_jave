package p12_01_2023;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicence;

    public Korisnik() {
        this.tipLicence = "Basic";
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipLicence() {
        return tipLicence;
    }
    public void pretplatiSe (int uplata) {
        if(uplata==100) {
            this.tipLicence = "Pro";
        } else if (uplata==150) {
            this.tipLicence = "Premium";
        }
    }
    public void ponistiPretplatu() {
        this.tipLicence = "Basic";
    }
    public int maksimalnaDuzina() {
        if(this.tipLicence.equals("Basic")) {
            return 40;
        } else if (this.tipLicence.equals("Pro")) {
            return 240;
        } else { //premium
            return 1440;
        }
    }
    public void print() {
        System.out.println("Ime i prezime korisnika: " + this.imeIPrezime);
    }
}
