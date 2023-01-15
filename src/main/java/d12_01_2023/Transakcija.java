package d12_01_2023;

public class Transakcija {
    private String id;
    private Racun posiljalac;
    private Racun primalac;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
    public Transakcija() {

    }
    public Transakcija (String id, Racun posiljalac, Racun primalac) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }
    private double provizija(double visinaTransakcije) {
        if (visinaTransakcije < 4500) {
            return 45;
        }  else if (visinaTransakcije > 4500) {
            return visinaTransakcije * 1 / 100;
        } else {
            return 0;
        }
    }
    public void izvrsiTransakciju (double vrednost) {
       if(this.posiljalac.getTrenutnoStanje() >= vrednost) {
           this.posiljalac.promeniStanje(vrednost + provizija(vrednost));
           this.primalac.promeniStanje(vrednost);
       } else {
           System.out.println("Na racunu nema dovoljno sredstava.");
       }
    }

    public void print() {
        System.out.println("Id: " + this.id);
        System.out.println("Racun sa: " + this.posiljalac.getImeIPrezime() + " - " + this.posiljalac.getBrojRacuna() +
                " - Stanje na racunu: " + this.posiljalac.getTrenutnoStanje());
        System.out.println("Racun na: " + this.primalac.getImeIPrezime() + " - " + this.primalac.getBrojRacuna() +
                " - Stanje na racunu: " + this.primalac.getTrenutnoStanje());

    }

}
