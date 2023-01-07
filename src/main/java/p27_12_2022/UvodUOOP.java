package p27_12_2022;

public class UvodUOOP {
    public static void main(String[] args) {
        User nikoleta = new User();
        nikoleta.firstName = "Nikoleta";
        nikoleta.lastName = "Vdovenko";
        nikoleta.yearOfBirth = 1995;
//        nikoleta.stampaj();
//        nikoleta.stampajStarost(2022);
        int starost = nikoleta.vratiStarost(2022);
//        User.stampajUsera(nikoleta.firstName, nikoleta.lastName, nikoleta.age);

        User nikola = new User ();
        nikola.firstName = "Nikola";
        nikola.lastName = "Nikolic";
        nikola.yearOfBirth = 2001;
//        nikola.stampaj();
//        nikola.stampajStarost(2022);

    }

    }
