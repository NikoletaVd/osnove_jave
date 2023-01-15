package d13_01_2023;

import java.util.ArrayList;

public class Student {
    private String brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public Student (String brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }
    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }
    public double prosek() {
        double suma = 0;
        double prosecnaOcena = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if(this.ispiti.get(i).polozenIspit())
            suma = suma + this.ispiti.get(i).getOcena();
            prosecnaOcena = suma/ispiti.size();
        } return prosecnaOcena;
    }
    public void print() {
        System.out.println("Br. indeksa: " + this.brojIndeksa + " - Ime i prezime studenta: " + this.imeIPrezime +
                " - Tip studija: " + this.tipStudija);
        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).print();
        }
        System.out.println("Prosecna ocena: " + this.prosek());
    }

}
