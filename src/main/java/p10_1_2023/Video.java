package p10_1_2023;

public class Video {
    private String id;
    private String nazivVidea;
    private int duzinaSekunde;
    private int brojLajkova;
    private int brojDislajkova;
    private int brojPregleda;
    public void lajkuj() {
        this.brojLajkova = this.brojLajkova + 1;
    }
    public void dislajkuj() {
        this.brojDislajkova = this.brojDislajkova + 1;
    }
    public void pogledaj() {
        this.brojPregleda = this.brojPregleda + 1;
    }

    public String getId() {
        return id;
    }

    public String getNazivVidea() {
        return nazivVidea;
    }

    public int getDuzinaSekunde() {
        return duzinaSekunde;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDislajkova() {
        return brojDislajkova;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }
    public Video (String nazivVidea) {
        this.nazivVidea = nazivVidea;
    }
}
