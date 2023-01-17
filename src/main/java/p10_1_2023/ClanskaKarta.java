package p10_1_2023;

public class ClanskaKarta {
    private int popust;
    private String brojKartice;

    public int getPopust() {
        return this.popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public String getBrojKartice() {
        return this.brojKartice;
    }
    public ClanskaKarta(int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }
}
