package p27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Krairti klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]
//
//        Dopuna:
//        Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u
//        formatu koji je naveden iznad i u mainu pozovite metode nad objektima
//        koje ste kreirali.

        SlackMessage poruka1 = new SlackMessage();
        poruka1.imeIPrezime = "Nikoleta Vdovenko";
        poruka1.datumIVreme = "27.12.2022 19.45";
        poruka1.tekst = "Cao!";
        poruka1.stampajPoruku();

        SlackMessage poruka2 = new SlackMessage();
        poruka2.imeIPrezime = "Nikola Nikolic";
        poruka2.datumIVreme = "27.12.2022 19.50";
        poruka2.tekst = "Zdravo!";
        poruka2.stampajPoruku();

    }
}
