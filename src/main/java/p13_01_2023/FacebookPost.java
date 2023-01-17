package p13_01_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String autor;
    private String tekst;
    private ArrayList<Reakcija> reakcije;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }

    public FacebookPost() {
        this.reakcije = new ArrayList<>();
    }

    public FacebookPost(String autor, String tekst) {
        this.autor = autor;
        this.tekst = tekst;
        this.reakcije = new ArrayList<>();
    }

    public void reaguj(Reakcija reakcija) {
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getReagovao().equals(reakcija.getReagovao())) {
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(reakcija);
    }
    public int brojReakcija (String tip) {
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTip().equals(tip)) {
                counter++;
            }
        } return counter;
    }

    public void print() {
        System.out.println("Ime i prezime: " + this.autor);
        System.out.println("Tekst objave: " + this.tekst);
        System.out.println("Like " + this.brojReakcija("Like") + " | Heart " + this.brojReakcija("Heart") +
                " | Smile " + this.brojReakcija("Smile"));

    }
}

