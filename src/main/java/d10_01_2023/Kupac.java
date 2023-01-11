package d10_01_2023;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKarta kartica;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getKartica() {
        return kartica;
    }
    public Kupac (String imeIPrezime, ClanskaKarta kartica) {
        this.imeIPrezime = imeIPrezime;
        this.kartica = kartica;
    }
    public void print() {
        System.out.println("Ime i prezime kupca: " + this.imeIPrezime + " - " + "broj kartice: " + this.kartica.getBrojKartice());
    }
}
