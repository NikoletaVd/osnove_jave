package d12_01_2023;

public class ZeleniKarton {
    private String imeIPrezimeStudenta;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena;

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public ZeleniKarton() {

    }
    public ZeleniKarton(String imeIPrezimeStudenta, String brojIndeksa, String nazivPredmeta, String imeIPrezimeProfesora, int ocena) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }
    public void polozenIspit() {
        if(this.ocena > 5) {
            System.out.println("Ispit je polozen.");
        } else {
            System.out.println("Ispit nije polozen.");
        }
    }
    public void print() {
        System.out.println("Naziv predmeta: " + this.nazivPredmeta + " - Ocena: " + this.ocena);
        System.out.println("Ime i prezime studenta: " + this.imeIPrezimeStudenta + " - Broj indeksa: " + this.brojIndeksa);
        System.out.println("Ime i prezime profesora: " + this.imeIPrezimeProfesora);
        System.out.println();
    }

}
