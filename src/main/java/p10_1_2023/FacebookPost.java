package p10_1_2023;

public class FacebookPost {
    private String opis;
    private Korisnik kreiraoJePost;
    public void setKreiraoJePost(Korisnik kreiraoJePost) {
        this.kreiraoJePost = kreiraoJePost;
    }

    public FacebookPost (String opis, Korisnik kreiraoJePost) {
        this.opis = opis;
        this.kreiraoJePost = kreiraoJePost;
    }
    public void stampaj () {
        System.out.println("Ime i prezime korisnika: " + this.kreiraoJePost.getIme() + " " + this.kreiraoJePost.getPrezime());
        System.out.println("Opis posta: " + this.opis);
    }

}
