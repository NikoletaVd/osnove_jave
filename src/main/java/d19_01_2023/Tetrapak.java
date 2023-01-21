package d19_01_2023;

public class Tetrapak extends Ambalaza {
    private boolean recikliraSe;
    private double osnovnaCena;

    public boolean isRecikliraSe() {
        return recikliraSe;
    }

    public void setRecikliraSe(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    public Tetrapak (String nazivArtikla, String barkod, double netoTezina, double brutoTezina, boolean recikliraSe,
                     double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
       if (this.recikliraSe) {
           return (this.tezinaPakovanja() * 1.5 + this.osnovnaCena);
       } else {
           return this.osnovnaCena;
       }
    }

    @Override
    public void print() {
        System.out.println("Tetrapak: ");
        System.out.println("Naziv artikla: " + this.nazivArtikla);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Tezina pakovanja: " + this.tezinaPakovanja());
        System.out.println("Cena: " + this.cena());
        if (this.recikliraSe) {
            System.out.println("Ambalaza se reciklira.");
        } else {
            System.out.println("Ambalaza se ne reciklira.");
        }
        System.out.println();
    }
}
