package d10_01_2023;

public class ClanskaKarta {
    private int popust;
    private String brojKartice;

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
    public ClanskaKarta (int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

}
