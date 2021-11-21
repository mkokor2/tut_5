package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {

    //PRIVATNI ATRIBUTI KLASE
    private Odsjek odsjek;
    private int redniBroj;
    private ArrayList<Predmet> obavezniPredmeti;
    private ArrayList<Predmet> izborniPredmeti;

    //KONSTRUKTOR
    public Semestar(Odsjek odjsek, int redniBroj, ArrayList<Predmet> obavezni, ArrayList<Predmet> izborni){}

    //GETTERI I SETTERI
    public ArrayList<Predmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public ArrayList<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

}

