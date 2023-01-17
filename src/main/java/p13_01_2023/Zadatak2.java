package p13_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        FacebookPost fb = new FacebookPost("Nikoleta Vdovenko", "Hey");

        fb.reaguj(new Reakcija("Like", "Petar Petrovic"));
        fb.reaguj(new Reakcija("Smile", "Marko Markovic"));
        fb.reaguj(new Reakcija("Like", "Jelena Jovanovic"));
        fb.reaguj(new Reakcija("Heart", "Stevan Stevanovic"));
        fb.reaguj(new Reakcija("Heart", "Jovana Jovanovic"));
        fb.reaguj(new Reakcija("Heart", "Petar Petrovic"));

        fb.print();




    }
}
