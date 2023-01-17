package p10_1_2023;

public class Radnik {
    private String jmbg;
    private String imeIPrezime;
    private int brojDece;
    private int sss;
    private int godRadnogstaza;
    public Radnik (String jmbg) {
        this.jmbg = jmbg;
    }
    public Radnik (String jmbg, String imeIPrezime, int brojDece, int sss, int godRadnogstaza) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.sss = sss;
        this.godRadnogstaza = godRadnogstaza;
    }

    public String getJmbg() {
        return this.jmbg;
    }

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojDece() {
        return this.brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public int getSss() {
        return this.sss;
    }

    public void setSss(int sss) {
        this.sss = sss;
    }

    public int getGodRadnogstaza() {
        return this.godRadnogstaza;
    }

    public void setGodRadnogstaza(int godRadnogstaza) {
        this.godRadnogstaza = godRadnogstaza;
    }
    public double minuliRad() {
        if(this.godRadnogstaza < 10) {
            return 0.05;
        } else if (this.godRadnogstaza >= 10 && this.godRadnogstaza <= 20) {
            return 0.075;
        } else if (this.godRadnogstaza > 20) {
            return 0.1;
        } else {
            return 0;
        }
    }

    public int koeficijentSlozenosti() {
        return sss * brojDece;
    }
    public double plata() {
        return 25000 + (this.koeficijentSlozenosti() + this.minuliRad()) * 10000;
    }
    public boolean kreditnoSposoban() {
        if(this.plata() > 50000) {
            return true;
        } else {
            return false;
        }
    }
}
