package d17_01_2023;

public class TimeControl extends Control {

    private boolean premotajUnapred;

    private boolean premotajUnazad;

    public TimeControl(boolean premotajUnapred, boolean premotajUnazad) {
        this.premotajUnapred = premotajUnapred;
        this.premotajUnazad = premotajUnazad;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.premotajUnapred) {
            if (videoPlayer.getTrenutnoVreme() + 15 > videoPlayer.getDuzinaVidea()) {
                System.out.println("Ne mozete da premotate unapred.");
            } else {
                videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() + 15);
            }
        } else {
            if (this.premotajUnazad) {
                if (videoPlayer.getTrenutnoVreme() - 15 < 0) {
                    System.out.println("Ne mozete da vratite unazad.");
                } else {
                    videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() - 15);
                }
            }
        }
    }
}
