package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Student {

    //PRIVATNI ATRIBUTI KLASE
    private String imeIPrezime;
    private int brojIndeksa;

    //KONSTRUKTOR
    public Student(String naziv, int indeks) {}

    //GETTERI
    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    //METODA ZA UPISIVANJE STUDENTA U SEMESTAR I POMOCNE METODE ZA KOREKTNO OSTVARIVANJE TE FUNKCIONALNOSTI
    private ArrayList<Predmet> birajIzborne(ArrayList<Predmet> izborni) {
        return null;
    }

    private int dajEctsKredit(ArrayList<Predmet> predmeti) {
        return 0;
    }

    public void upisiStudenta(Semestar semestar) {}

    public void ispisiStudenta(Semestar semestar) {}

    //METODA ZA ISPISAVANJE STUDENTA SA PREDMETA
    public void ispisiStudenta(Predmet predmet) {}

    //METODA ZA OMOGUĆAVANJE ISPISA PODATAKA STUDENTA
    @Override
    public String toString() {
        return null;
    }

}
