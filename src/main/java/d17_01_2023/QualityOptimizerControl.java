package d17_01_2023;

public class QualityOptimizerControl extends Control{

    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitet = this.brzinaInterneta * 10.1;
        if (kvalitet < 144) {
            videoPlayer.setKvalitetVidea(144);
        } else if (kvalitet > 144 && kvalitet < 240) {
            videoPlayer.setKvalitetVidea(240);
        } else if (kvalitet > 240 && kvalitet < 360) {
            videoPlayer.setKvalitetVidea(360);
        } else if (kvalitet > 360 && kvalitet < 480) {
            videoPlayer.setKvalitetVidea(480);
        } else if (kvalitet > 480 && kvalitet < 720) {
            videoPlayer.setKvalitetVidea(720);
        } else if (kvalitet > 720 && kvalitet < 1080) {
            videoPlayer.setKvalitetVidea(1080);
        }
    }
}
