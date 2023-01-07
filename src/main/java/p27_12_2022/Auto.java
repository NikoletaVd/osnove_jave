package p27_12_2022;

public class Auto {
    public String vozac;
    public String markaAutomobila;
    public int brojvrata;
    public int potrosnja;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int registrovanDo;
    public int kubikaza;
    public boolean otvorenGepek;
    public String brojRegistracije;
    public boolean ukljucenaKlima;
    public int maksBrzina;
    public int kapacitetRezervoara;
    public int trenutnaKolicinaGoriva;


    public void printInfo() {
        System.out.println(this.vozac + '\n' + this.markaAutomobila + " - " + this.brojvrata + " vrata" + '\n'
                + "Sa potrosnjom od " + potrosnja + "l na 100km" + '\n' + trenutnaBrzina + " km/h");
    }

    public boolean prekoracenje(int ogranicenje) {
        if (ogranicenje < this.trenutnaBrzina) {
            return true;
        } else {
            return false;
        }
    }

    public int kazna(int ogranicenje) {
        int prekoracenje = this.trenutnaBrzina - ogranicenje;
        int kazna = prekoracenje * 1000;
        if (prekoracenje > 0) {
            return kazna;
        } else {
            return 0;
        }
    }

    public boolean oldtimer(int godinaProizvodnje) {
        if (godinaProizvodnje < 1950) {
            return true;
        } else {
            return false;
        }
    }

    public boolean registracija(int trenutniMesec) {
        if (trenutniMesec > registrovanDo) {
            return true;
        } else {
            return false;
        }
    }

    public int cenaRegistracije(int kubikaza) {
        int cena = kubikaza * 100;
        if (kubikaza > 2000) {
            cena = cena + 130 / 100;
            return cena;
        } else {
            return 0;
        }
    }

    public void otvoriGepek() {
        this.otvorenGepek = true;
    }

    public void dodajGas() {
        System.out.println(this.trenutnaBrzina + 10);
        if (this.trenutnaBrzina > 240) {
            this.trenutnaBrzina = 240;
        }
    }
    public void dodajGasZa (int dodajZa) {
        this.trenutnaBrzina = this.trenutnaBrzina + dodajZa;
    }

    public void koci() {
            System.out.println(this.trenutnaBrzina - 10);
            if (this.trenutnaBrzina < 0) {
                this.trenutnaBrzina = 0;
            }
        }
        public double trenutnaPotrosnja () {
            double trenutnaPotrosnja;
            if (this.ukljucenaKlima == true) {
                trenutnaPotrosnja = this.trenutnaBrzina / 100.0 * this.potrosnja * 1.2;
                return trenutnaPotrosnja;
            } else {
                trenutnaPotrosnja = this.trenutnaBrzina / 100.0 * this.potrosnja * 1.0;
                return trenutnaPotrosnja;
            }
        }
        public void stampajTablu () {
            for (int i = 0; i < ((this.trenutnaBrzina * 100)/this.maksBrzina); i++) {
                System.out.print("|");
            }
            for (int i = ((this.trenutnaBrzina * 100)/this.maksBrzina); i < this.maksBrzina - this.trenutnaBrzina; i++) {
                System.out.print(".");
            }
            System.out.println(this.trenutnaBrzina + "/" + this.maksBrzina);

        }
        public int natociGorivo (int litraza) {
        int vrednost = litraza * 210;
        if (this.trenutnaKolicinaGoriva < this.kapacitetRezervoara) {
        return vrednost;
        } else {
            return 0;
        }
    }
    }



