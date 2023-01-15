package d13_01_2023;

public class Ispit {
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena;

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
    public Ispit (String nazivPredmeta, String imeIPrezimeProfesora, int ocena) {
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }
    public boolean polozenIspit() {
        if (this.ocena > 5) {
            return true;
        } else {
            return false;
        }
    }
    public void print() {
        System.out.println("Naziv predmeta: " + this.nazivPredmeta + " - Ime i prezime profesora: " + this.imeIPrezimeProfesora +
                " - Ocena: " + this.ocena);
    }
}
