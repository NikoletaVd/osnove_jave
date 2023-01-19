package d17_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {


        TimeControl timeControl = new TimeControl(false, true);
        AudioControl audioControl = new AudioControl(false, true);
        QualityOptimizerControl qualityControl = new QualityOptimizerControl(50);
        VideoPlayer videoPlayer = new VideoPlayer(180, 120, 75, 144);
        videoPlayer.print();
        System.out.println();

        timeControl.izvrsiAkciju(videoPlayer);
        audioControl.izvrsiAkciju(videoPlayer);
        qualityControl.izvrsiAkciju(videoPlayer);
        videoPlayer.print();

    }
}
