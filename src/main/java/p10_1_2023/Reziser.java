package p10_1_2023;

public class Reziser {
    private String imeIPrezime;
    private int starost;
    private Film reziraoJe;


    public void setReziraoJe(Film reziraoJe) {
        this.reziraoJe = reziraoJe;
    }

    public Reziser () {
    }
    public Reziser (String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }
//    public Reziser (String imeIPrezime, int starost, Film reziraoJe) {
//        this.imeIPrezime = imeIPrezime;
//        this.starost = starost;
//        this.reziraoJe = reziraoJe;
//    }

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }
    public void stampaj() {
        System.out.println("Ime i prezime rezisera: " + this.imeIPrezime + ", " + "starost: " + this.starost + " god.");
        if (this.reziraoJe != null) {
            System.out.println("Rezirao je: " + this.reziraoJe.getNazivFilma());
            System.out.println("Godine: " + this.reziraoJe.getGodina());
        } else {
            System.out.println("Nije rezirao nijedan film.");
        }
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

}
