package p13_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//        [IME I PREZIME]
//        [BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//        [EMAIL]
        String imeIPrezime = "Nikoleta Vdovenko";
        String brojTelefona = "0641111111";
        String ulicaIBroj = "Milana Blagojevica 55";
        String grad = "Nis";
        String email = "nikoleta.nojic@gmail.com";
        System.out.println(imeIPrezime);
        System.out.println(brojTelefona + ", " + ulicaIBroj + ", " + grad);
        System.out.println(email);


    }
}
