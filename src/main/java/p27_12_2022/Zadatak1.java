package p27_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
////		U mainu kreirati minimum dva racuna sa pratecim podacima
// i ostampati podatke za svaki objekat.

//        Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
//        Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//                Primer izvrsenja:
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//        Primalac: Marko Markovic, 840-23932-334, stanje: 200
//        Unesite sumu za transakciju: 500
//        Stanje nakon stransakcije
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//        Primalac: Marko Markovic, 840-23932-334, stanje: 700

        Scanner s = new Scanner(System.in);

        Racun racun1 = new Racun();
        racun1.brojRacuna = "120-11121135556-97";
        racun1.imeIPrezime = "Nikoleta Vdovenko";
        racun1.stanjeNaRacunu = 23490;
        System.out.println("Posiljalac: " + racun1.brojRacuna + ", " + racun1.imeIPrezime + ", " + racun1.stanjeNaRacunu + " USD");

        Racun racun2 = new Racun();
        racun2.brojRacuna = "140-11156666567-98";
        racun2.imeIPrezime = "Petar Petrovic";
        racun2.stanjeNaRacunu = 1350;
        System.out.println("Primalac: " + racun2.brojRacuna + ", " + racun2.imeIPrezime + ", " + racun2.stanjeNaRacunu + " USD");

        System.out.print("Unesite sumu za transakciju: ");
        double transakcija = s.nextDouble();
        racun1.stanjeNaRacunu = racun1.stanjeNaRacunu - transakcija;
        racun2.stanjeNaRacunu = racun2.stanjeNaRacunu + transakcija;
        System.out.println("Posiljalac: " + racun1.brojRacuna + ", " + racun1.imeIPrezime + ", " + racun1.stanjeNaRacunu + " USD");
        System.out.println("Primalac: " + racun2.brojRacuna + ", " + racun2.imeIPrezime + ", " + racun2.stanjeNaRacunu + " USD");
    }
}
