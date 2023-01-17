package p10_1_2023;

public class YoutubePlayer {
    private Video video;
    private int kvalitetVidea;
    private String rezim;
    private int jacinaZvuka;
    private int trenutnoVremeVidea;

    public Video getVideo() {
        return video;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public String getRezim() {
        return rezim;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public YoutubePlayer() {
        this.jacinaZvuka = 75;
        this.kvalitetVidea = 144;
        this.rezim = "mini player";
    }
    public void ucitajVideo(Video video) {
        this.trenutnoVremeVidea = 0;
    }
    public void pojacaj() {
        this.jacinaZvuka = this.jacinaZvuka + 10;
        if(this.jacinaZvuka > 100) {
            this.jacinaZvuka = 100;
        }
    }
    public void smanji() {
        this.jacinaZvuka = this.jacinaZvuka - 10;
        if(this.jacinaZvuka < 0) {
            this.jacinaZvuka = 0;
        }
    }
    public int postaviKvalitet (int brzinaInterneta) {
        if(brzinaInterneta<2) {
            return 144;
        } else if (brzinaInterneta>=2 && brzinaInterneta<4) {
            return 240;
        } else if (brzinaInterneta>=4 && brzinaInterneta<6) {
            return 360;
        } else if (brzinaInterneta>=6 && brzinaInterneta<8) {
            return 720;
        } else if (brzinaInterneta>=8) {
            return 1080;
        } else {
            return 0;
        }
    }
    public void aktivirajMiniPlayerMod() {
        this.rezim = "Mini PLayer";
    }
    public void aktivrajBioskopskiRezim() {
        this.rezim = "Bioskopski rezim";
    }
    public void aktivirajPrekoCelogEkranamod() {
        this.rezim = "Preko celog ekrana";
    }
    public void premotajUnapred() {
        if(this.trenutnoVremeVidea < this.video.getDuzinaSekunde()) {
            this.trenutnoVremeVidea=this.trenutnoVremeVidea + 10;
        } else if (this.trenutnoVremeVidea > this.video.getDuzinaSekunde()) {
            this.trenutnoVremeVidea=this.video.getDuzinaSekunde();
        }
    }
    public void premotajUnazad() {
        this.trenutnoVremeVidea=this.trenutnoVremeVidea - 10;
        if (this.trenutnoVremeVidea < 0) {
            this.trenutnoVremeVidea = 0;
        }
    }
    public void iscrtajZvuk() {
        int brCrtica = this.jacinaZvuka / 10;
        System.out.print("< ");
        for (int i = 0; i < brCrtica; i++) {
            System.out.print("| ");
            if (this.jacinaZvuka == 0) {
                System.out.println("</");
            }
        }
    }
    public void iscrtajRezim() {
        if(this.rezim.equals("Mini player")) {
            System.out.println("[ ]");
        } else if (this.rezim.equals("Bioskopski rezim")) {
            System.out.println("[ ..]");
        } else if (this.rezim.equals("Preko celog ekrana")) {
            System.out.println("[||||]");
        }
    }
    public void iscrtajTrenutnoVreme() {
        System.out.println(this.trenutnoVremeVidea/60 + "." + this.trenutnoVremeVidea%60 + "/"
        + this.video.getDuzinaSekunde()/60 + "." + this.video.getDuzinaSekunde()%60);
    }
    public void iscrtajTimeline() {
        int brojZvezdica = (this.trenutnoVremeVidea * 100) / this.video.getDuzinaSekunde();
        int tackice = 100 - brojZvezdica;
        for (int i = 0; i < brojZvezdica; i++) {
            System.out.print("*");
        }
        for (int i = brojZvezdica; i < tackice; i++) {
            System.out.println(".");
        }
    }
    public void iscitaj() {
        this.iscrtajTrenutnoVreme();
        this.iscrtajZvuk();
        this.iscrtajTimeline();
        System.out.println("Kvalitet: " + this.getKvalitetVidea());
        System.out.println("Rezim: " + this.getRezim());
        System.out.println(this.video.getNazivVidea());
        System.out.println("Likes: " + this.video.getBrojLajkova() + " | Dislikes: " + this.video.getBrojDislajkova());
        System.out.println(this.video.getBrojPregleda() + " pregleda");

    }

}
