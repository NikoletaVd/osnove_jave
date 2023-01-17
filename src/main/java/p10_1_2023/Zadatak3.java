package p10_1_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        Kreirati klasu Film koja ima:
//        naziv filma
//        iz koje godine je film
//        konstruktore, gettere i settere
//        metodu print koja stampa podatke u formatu
//        naziv filma, godina
//
//
//        Kreirati klasu Reziser koja ima:
//        ime i prezime rezisera
//        starost
//        konstruktore, gettere i settere koji su potrebni
//        metodu print koja stampa podatke u formatu
//        ime prezime, starost.god
//
//        U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda

//
        Reziser reziser = new Reziser("David Yates", 59);
//        reziser.setReziraoJe(film);


        Film film = new Film("Harry Potter and the Half-blood Prince", 2009);
        film.setReziraoGa(reziser);
        film.stampaj();



//        Reziser reziser1 = new Reziser("David Yates", 59, film);
//        reziser1.stampaj();





    }
}
