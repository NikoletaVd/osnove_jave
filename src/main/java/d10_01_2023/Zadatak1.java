package d10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Autor koja ima
//                -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//                -naziv
//                -godina izdanja
//                -autor
//                -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//                (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.

        Autor autor1 = new Autor("Fjodor", "Dostojevski");
        Autor autor2 = new Autor("Ivan", "Goncarov");
        Autor autor3 = new Autor("Mesa", "Selimovic");


        Knjiga knjiga1 = new Knjiga("978-3-642-04991", "Braca Karamazovi", 2006, autor1);
        knjiga1.print();
        System.out.println();

        Knjiga knjiga2 = new Knjiga("935-4-897-65443", "Oblomov", 2012, autor2);
        knjiga2.print();
        System.out.println();

        Knjiga knjiga3 = new Knjiga("854-2-675-01123","Tvrdjava", 2015, autor3);
        knjiga3.print();

    }
}
