package d27_12_2022;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mod;

    public void stampaj () {
        System.out.println("Marka klime: " + this.marka + '\n' + "Izabrana temperatura: " + this.temperatura
                + '\n' + "Izabrani rezim: " + this.mod);
    }
    public boolean temperaturaJeVeca (double spoljasnjaTemperatura) {
       if(this.temperatura < spoljasnjaTemperatura) {
           return true;
       } else {
           return false;
       }
    }
}
