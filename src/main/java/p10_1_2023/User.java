package p10_1_2023;

public class User {
    private String ime;
    private String prezime;
    private String email;
    public User (String email) {
        this.email = email;
    }
    public String getIme() {
        return this.ime;
    }
    public String getPrezime() {
        return this.prezime;
    }
    public String getEmail() {
        return this.email;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

}
