package d19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucija;
    private boolean kaucijaSePlaca;
    private double osnovnaCena;

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isKaucijaSePlaca() {
        return kaucijaSePlaca;
    }

    public void setKaucijaSePlaca(boolean kaucijaSePlaca) {
        this.kaucijaSePlaca = kaucijaSePlaca;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    public StaklenaAmbalaza (String nazivArtikla, String barkod, double netoTezina, double brutoTezina,
                             int kaucija, boolean kaucijaSePlaca, double osnovnaCena) {
        super(nazivArtikla, barkod, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.kaucijaSePlaca = kaucijaSePlaca;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if (this.kaucijaSePlaca) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void print() {
        System.out.println("Staklena ambalaza: ");
        System.out.println("Naziv artikla: " + this.nazivArtikla);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Tezina pakovanja: " + this.tezinaPakovanja());
        System.out.println("Cena: " + this.cena());
        if (this.kaucijaSePlaca) {
            System.out.println("Kaucija se placa.");
        } else {
            System.out.println("Kaucija se ne placa.");
        }
        System.out.println();
    }
}
