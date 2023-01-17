package p13_01_2023;

public class Reakcija {
    private String tip;
    private String reagovao;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getReagovao() {
        return reagovao;
    }

    public void setReagovao(String reagovao) {
        this.reagovao = reagovao;
    }
    public Reakcija() {

    }
    public Reakcija(String tip, String reagovao) {
        this.tip = tip;
        this.reagovao = reagovao;
    }
}
