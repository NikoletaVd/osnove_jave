package d17_01_2023;

public class AudioControl extends Control {
    private boolean smanji;

    private boolean pojacaj;

    public boolean isSmanji() {
        return smanji;
    }

    public void setSmanji(boolean smanji) {
        this.smanji = smanji;
    }

    public boolean isPojacaj() {
        return pojacaj;
    }

    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public AudioControl() {

    }

    public AudioControl(boolean smanji, boolean pojacaj) {
        this.smanji = smanji;
        this.pojacaj = pojacaj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.smanji) {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
            if (videoPlayer.getJacinaZvuka() - 1 < 0) {
                System.out.println("Ne mozete da smanjite zvuk.");
            } else {
            }
        }
        if (this.pojacaj) {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
            if (videoPlayer.getJacinaZvuka() + 1 > 100) {
                System.out.println("Ne mozete da pojacate zvuk.");
            }
        }
    }
}

