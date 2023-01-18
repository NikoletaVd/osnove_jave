package d16_01_2023;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean jeKapiten;

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }


    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }
    public Igrac() {

    }
    public Igrac (String imeIPrezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean jeKapiten) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
    }
    @Override
    public void print() {
        System.out.println("Igrac: ");
        super.print();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozocija: " + this.pozicija);
        if(this.jeKapiten) {
            System.out.println("Kapiten reprezentacije");
        } else {
            System.out.println("Nije kapiten");
        }
    }

}
