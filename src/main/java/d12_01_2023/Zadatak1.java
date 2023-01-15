package d12_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//                konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//                Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//
//        U glavnoj klasi:
//        kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//                (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();

        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Fonetika", "Violeta Dzonic", 10));
        ispiti.add(new ZeleniKarton("Nikoleta vdovenko", "192/13", "Stara ruska knjizevnost", "Dragan Koprivica", 9));
        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Morfologija imenskih reci", "Jelena Lepojevic", 10));
        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Staroslovenski jezik", "Dragana Jovanovic", 5));
        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Bugarski jezik", "Valentina Bondzolova", 10));
        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Ruski realizam", "Velimir Ilic", 8));
        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Sintaksa", "Maja veljkovic", 10));
        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Fonologija", "Dejan Markovic", 9));
        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Savremena knjizevnost", "Nenad Blagojevic", 8));
        ispiti.add(new ZeleniKarton("Nikoleta Vdovenko", "192/13", "Semantika", "Maja Veljkovic", 10));

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).print();
        }

    }
}
