package d29_12_2022;

public class FacebookPost {
    private String imeIPrezime1;
    private String imeIPrezime2;
    private String tekstObjave;
    private int brojLajkova;
    private int brojDeljenja;

    public String getImeIPrezime1() {
        return this.imeIPrezime1;
    }
    public void setImeIPrezime1 (String imeIPrezime1) {
        this.imeIPrezime1 = imeIPrezime1;
    }
    public String getImeIPrezime2() {
        return this.imeIPrezime2;
    }
    public void setImeIPrezime2 (String imeIPrezime2) {
        this.imeIPrezime2 = imeIPrezime2;
    }
    public String getTekstObjave() {
        return this.tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }
    public int getBrojLajkova() {
        return this.brojLajkova;
    }
    public int getBrojDeljenja() {
        return this.brojDeljenja;
    }
    public void like () {
        this.brojLajkova = this.brojLajkova + 1;
    }
    public void dislike () {
        this.brojLajkova = this.brojLajkova - 1;
        if (this.brojLajkova < 0) {
            this.brojLajkova = 0;
        }
    }
    public void share () {
        this.brojDeljenja = this.brojDeljenja + 1;
    }
    public void print () {
        System.out.println(this.imeIPrezime1 + " >>> " + this.imeIPrezime2 + '\n' + this.tekstObjave + '\n'
                + "Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);
    }



}
