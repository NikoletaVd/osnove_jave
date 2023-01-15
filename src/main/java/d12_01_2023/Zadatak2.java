package d12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Racun posiljalac = new Racun("122-5675432762728-89", "Nikoleta Vdovenko", 7865.90);
        Racun primalac = new Racun("189-76553748474737-97", "Petar Petrovic", 5432.76);

        Transakcija transakcija = new Transakcija("iu733563736", posiljalac, primalac);

        transakcija.izvrsiTransakciju(250.20);

        transakcija.print();

    }
}
