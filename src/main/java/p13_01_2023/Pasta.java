package p13_01_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }

    public void dodajSastojak(Sastojak sastojak) {
        this.sastojci.add(sastojak);
    }

    public int cenaPaste() {
        int suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
          suma = suma + sastojci.get(i).getCena();
        } return suma;
    }

    public void print() {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < sastojci.size(); i++) {
            this.sastojci.get(i).print();
        }
        System.out.println("Cena paste je: " + this.cenaPaste() + " din.");
    }
    public void brisanjeSastojka(String naziv) {
        for (int i = 0; i < sastojci.size(); i++) {
            if(sastojci.get(i).getNaziv().equals(naziv)) {
                this.sastojci.remove(i);
            }

        }

    }


}
