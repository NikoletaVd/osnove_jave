package p27_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
//        Kreirati klasu Auto koja ima:
//        ime i prezime vozaca
//        marku automobila
//        broj vrata
//        potrosnju na 100km (npr: 10)
//        trenutnu brzinu kojom se auto krece
//        metodu za stampu koja stampa podatke u formatu:
//          [Vozac]
//	        [Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//                [Trenutna brzina auta] km/h je trenutna brzina.
//
//                Primer:
//        Milan Jovanovic
//        BMW - 5-ro vrata
//        Sa potrosnjom od 10 l na 100km
//        200 km/h je trenutna brzina

//        U okviru klase Auto, implementirati jos 2 metode:
//        metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//        Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false
//        ako je trenutna brzina veca od ogranicenja.
//                metoda koja vraca visinu novcane kazne za prekoracenje,
//                za svaku jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//        U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.
//        (Dopuna 2)
//        Dopuniti klasu Auto tako da ima:
//        atribut godinu proizvodnje
//        atribut mesec do kad je registrovan auto (int)
//                atribut kubikaza auta (npr: 1600 - 5000)
//        metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//        metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//                metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
//        metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
//
//        Dopuniti klasu Auto tako da ima:
//        atribut broj registracije
//        da li je ukljucena klima u autu
//        metodu dodajGas, koja povecava trenutnu brzinu za 10.
//        metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//                metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//        faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//        (trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
//        Dopuniti klasu Auto tako da ima:
//        atribut za maksimalnu brzinu na auto (npr: 240)
//        Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//        metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//        Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//                |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//                (objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//        Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.
//        Dopuniti klasu Auto tako da ima:
//        kapacitet rezervoara
//        trenutnu kolicinu goriva u rezervoaru (u litrima)
//        metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva.
//        Litar goriva je 210din.. Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara, takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.


                Auto auto1 = new Auto();
        auto1.vozac = "Nikoleta Vdovenko";
        auto1.markaAutomobila = "Audi";
        auto1.brojvrata = 5;
        auto1.potrosnja = 15;
        auto1.trenutnaBrzina = 140;
        auto1.godinaProizvodnje = 2018;
        auto1.registrovanDo = 11;
        auto1.kubikaza = 1500;
        auto1.brojRegistracije = "NI - 333 - 22";
        auto1.ukljucenaKlima = true;
        auto1.maksBrzina = 240;
        auto1.kapacitetRezervoara = 70;
        auto1.trenutnaKolicinaGoriva = 25;

        auto1.printInfo();

        boolean ogranicenje = auto1.prekoracenje(120);
        System.out.println("Vozac je prekoracio brzinu" + " - " + ogranicenje);

        int kazna = auto1.kazna(120);
        System.out.println("Kazna je: " + kazna + " dinara");

        boolean oldtimer = auto1.oldtimer(2018);
        System.out.println("Auto je oldtimer" + " - " + oldtimer);

        boolean registracija = auto1.registracija(8);
        System.out.println("Registracija je istekla" + " - " + registracija);

        int cenaRegistracije = auto1.cenaRegistracije(2100);
        System.out.println("Cena registracije je: " + cenaRegistracije);

        auto1.dodajGas();
        auto1.dodajGasZa(5);
        System.out.println(auto1.trenutnaBrzina);
        auto1.koci();

        double trenutnaPotrosnja = auto1.trenutnaPotrosnja();
        System.out.println("Trenutna potrosnja je: " + trenutnaPotrosnja);

        auto1.stampajTablu();
        System.out.println();

        int vrednost = auto1.natociGorivo(25);
        System.out.println("Cena je: " + vrednost);


    }
}
