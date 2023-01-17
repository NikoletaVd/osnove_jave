package p12_01_2023;

public class ViberPoruka {
    private String tekst;
    private String vreme;
    private ViberKorisnik posiljalac;
    private ViberKorisnik primalac;
    private ViberReakcija reakcija;

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public ViberKorisnik getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(ViberKorisnik posiljalac) {
        this.posiljalac = posiljalac;
    }

    public ViberKorisnik getPrimalac() {
        return primalac;
    }

    public void setPrimalac(ViberKorisnik primalac) {
        this.primalac = primalac;
    }

    public ViberReakcija getReakcija() {
        return reakcija;
    }

    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
    }
    public ViberPoruka (String tekst, String vreme, ViberKorisnik posiljalac, ViberKorisnik primalac, ViberReakcija reakcija) {
        this.tekst = tekst;
        this.vreme = vreme;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.reakcija = reakcija;
    }
    public void prikazi() {
        System.out.println("From: " + this.posiljalac.getImeIPrezime() + " * Is active now - " + this.posiljalac.isJeAktivan()
                + " at " + this.vreme);
        System.out.println("To: " + this.primalac.getImeIPrezime());
        if (this.reakcija != null) {
            System.out.println(this.tekst + " : " + this.reakcija.getEmoji() + " from: " + this.reakcija.getKorisnik().getImeIPrezime());
        }

    }
}
