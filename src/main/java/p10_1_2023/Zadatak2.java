package p10_1_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu Radnik koja ima:
//        jmbg radnika
//        ime i prezime
//        broj dece (1,2,3,... ili 0 ako nema dece)
//        stepen strucne spreme (od 1 do 8)
//        godine radnog staza
//        konstuktor koji postavlja samo jmbg
//        konstuktor koji postavlja sve atribute
//        getere i setere
//        metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//        metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//        metodu koja racuna platu radnika, plata se racuna po formuli:
//        25000 + (koeficijent slozenosti + minuli rad) * 10000
//        metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//
//        Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//        - do 10 godina 0.05
//                - od 10-20 godina 0.075
//                - preko 20 godina 0.1

        Radnik radnik1 = new Radnik("1312967979788", "Marko Markovic", 4, 7, 25);
        System.out.println("Ime i prezime: " + radnik1.getImeIPrezime());
        System.out.println("JMBG: " + radnik1.getJmbg());
        System.out.println("Broj dece: " + radnik1.getBrojDece());
        System.out.println("Stepen strucne spreme: " + radnik1.getSss());
        System.out.println("Godine radnog staza: " + radnik1.getGodRadnogstaza());
        System.out.println("Minuli rad: " + radnik1.minuliRad());
        System.out.println("Koeficijent slozenosti: " + radnik1.koeficijentSlozenosti());
        System.out.println("Plata: " + radnik1.plata());
        System.out.println("Radnik je kreditno sposoban: " + radnik1.kreditnoSposoban());

    }
}
