package p12_01_2023;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik korisnik;

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(ViberKorisnik korisnik) {
        this.korisnik = korisnik;
    }
    public ViberReakcija (String emoji, ViberKorisnik korisnik) {
        this.emoji = emoji;
        this.korisnik = korisnik;
    }
}
