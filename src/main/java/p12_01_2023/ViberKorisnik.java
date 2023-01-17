package p12_01_2023;

public class ViberKorisnik {
    private String imeIPrezime;
    private String brojTelefona;
    private boolean jeAktivan;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean isJeAktivan() {
        return jeAktivan;
    }

    public void setJeAktivan(boolean jeAktivan) {
        this.jeAktivan = jeAktivan;
    }

    public ViberKorisnik(String imeIPrezime, String brojTelefona, boolean jeAktivan) {
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.jeAktivan = jeAktivan;
    }

    public void aktivan() {
        if (this.jeAktivan) {
            System.out.println("Active now");
        } else {
            System.out.println("Not Active");
        }
    }


}
