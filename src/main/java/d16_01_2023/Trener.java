package d16_01_2023;

public class Trener extends Osoba {
    private int godIskustva;
    private String tip;

    public int getGodIskustva() {
        return godIskustva;
    }

    public void setGodIskustva(int godIskustva) {
        this.godIskustva = godIskustva;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    public Trener (String imeIPrezime, String jmbg, int godRodjenja, int godIskustva, String tip) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tip = tip;
    }
    @Override
    public void print() {
        System.out.println("Trener: ");
        super.print();
        System.out.println("Godine iskustva: " + this.godIskustva);
        System.out.println("Tip trenera: " + this.tip);
    }

}
