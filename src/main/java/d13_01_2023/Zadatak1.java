package d13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Fonetika", "Violeta Dzonic", 10);
        Ispit ispit2 = new Ispit("Fonologija", "Dejan Markovic", 9);
        Ispit ispit3 = new Ispit("Ruski realizam", "Velimir Ilic", 8);
        Ispit ispit4 = new Ispit("Staroslovenski jezik", "Dragana Jovanovic", 6);


        Student student = new Student("192/13", "Nikoleta Vdovenko", "Master");
        student.dodajIspit(ispit1);
        student.dodajIspit(ispit2);
        student.dodajIspit(ispit3);
        student.dodajIspit(ispit4);

        student.print();



    }
}
