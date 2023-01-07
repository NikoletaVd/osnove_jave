package p29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Student koja ima:
//        ime
//                prezime
//        broj indeksa (int)
//                da li je na budzetu
//        gettere i settere za sve atributge

        Student student1 = new Student();
        student1.setIme("Petar");
        student1.setPrezime("Markovic");
        student1.setBrojIndeksa(192);
        student1.setJeNaBudzetu(true);

        System.out.println(student1.getIme() + " " + student1.getPrezime() + '\n'
                + "Broj indeksa: " + student1.getBrojIndeksa() + '\n' + "Student je na budzetu: " + student1.getJeNaBudzetu());



    }
}
