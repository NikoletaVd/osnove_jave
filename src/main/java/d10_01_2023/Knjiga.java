package d10_01_2023;

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godIzdanja;
    private Autor napisaoJe;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodIzdanja() {
        return godIzdanja;
    }

    public void setGodIzdanja(int godIzdanja) {
        this.godIzdanja = godIzdanja;
    }

    public Autor getNapisaoJe() {
        return napisaoJe;
    }

    public void setNapisaoJe(Autor napisaoJe) {
        this.napisaoJe = napisaoJe;
    }
    public Knjiga (String isbn, String naziv, int godIzdanja, Autor napisaoJe) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godIzdanja = godIzdanja;
        this.napisaoJe = napisaoJe;
    }
    public void print () {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Naziv knjige: " + this.naziv + " - " + "Godina izdanja: " + this.godIzdanja);
        System.out.println("Autor: " + this.napisaoJe.getIme() + " " + this.napisaoJe.getPrezime());
    }
}
