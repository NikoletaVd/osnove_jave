package p10_1_2023;

public class Zadatak6 {
    public static void main(String[] args) {

        Video v1 = new Video("Tom Odell - Another love");
        v1.lajkuj();
        v1.lajkuj();
        v1.lajkuj();
        v1.lajkuj();
        v1.dislajkuj();
        v1.pogledaj();
        v1.pogledaj();
        v1.pogledaj();
        v1.pogledaj();
        v1.pogledaj();
        v1.pogledaj();

        YoutubePlayer yt = new YoutubePlayer();
        yt.ucitajVideo(v1);
        yt.pojacaj();
        yt.postaviKvalitet(8);
        yt.aktivirajMiniPlayerMod();
        yt.premotajUnapred();
        yt.premotajUnapred();
        yt.premotajUnapred();
        yt.iscitaj();
    }
}
