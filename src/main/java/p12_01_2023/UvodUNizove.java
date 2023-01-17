package p12_01_2023;

import java.util.ArrayList;

public class UvodUNizove {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        User u1 = new User("Nikoleta", "Vdovenko");
        User u2 = new User("Petar", "Petrovic");

        users.add(u1);
        users.add(u2);

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getIme() + " " + users.get(i).getPrezime());

        }

    }
}
