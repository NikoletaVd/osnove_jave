package d19_01_2023;

public class SuperKartica {
    private String brojKartice;
    private String vlasnik;
    private int popust;

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public SuperKartica() {

    }
    public SuperKartica (String brojKartice, String vlasnik, int popust) {
        this.brojKartice = brojKartice;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }
    public void print() {
        System.out.println("Broj kartice: " + this.brojKartice + " - Ime i prezime vlasnika: " + this.vlasnik);
    }
}
