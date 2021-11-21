package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet {

    //PRIVATNI ATRIBUTI KLASE
    private String naziv;
    private int ectsBodovi;
    private ArrayList<Student> uspisaniStudenti;

    //KONSTRUKTOR
    public Predmet(String naziv, int bodovi) {}

    //GETTERI
    public String getNaziv() {
        return naziv;
    }

    public int getEctsBodovi() {
        return ectsBodovi;
    }

    //METODA ZA KREIRANJE I VRAĆANJE SPISKA STUDENATA NA PREDMETU
    public ArrayList<String> dajSpisakUpisanih() {
        return null;
    }

    //METODA ZA UPISIVANJE STUDENTA NA PREDMET
    public void upisiStudenta(Student student) {}

    //METODA ZA ISPISIVANJE STUDENTA SA PREDMETA
    public void ispisiStudenta(Student student) {}

}
