package d26_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan
//        kao parametre metode.Metoda nista ne vraca.

        korisnik("2601995979900", "Nikoleta", "Vdovenko", 1995, true);
        System.out.println();

    }
    public static void korisnik (String jmbg, String ime, String prezime, int godRodjenja, boolean jeAktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godRodjenja);
        System.out.println("Korisnik je aktivan" + " - " + jeAktivan);

    }

}
