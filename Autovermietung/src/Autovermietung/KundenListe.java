package Autovermietung;

import java.util.ArrayList;

public class KundenListe {

    /** Attributes */
    /**
     * 
     */
    private ArrayList<Kunde> Kunden;
    /**
     * Operation KundenListe
     *
     * @return 
     */
    public KundenListe() {}
    /**
     * Operation sucheKunde
     *
     * @param Kundennummer - 
     * @return Kunde
     */
    public Kunde sucheKunde(int Kundennummer) { return Kunden.get(0); }
    /**
     * Operation hinzufuegen
     *
     * @param Kundennummer - 
     * @param Vorname - 
     * @param Nachname - 
     * @param Adresse - 
     * @param PLZ - 
     * @param Ort - 
     * @return 
     */
    public void hinzufuegen(int Kundennummer, String Vorname, String Nachname, String Adresse, String PLZ, String Ort ){}
    /**
     * Operation hinzufuegen
     *
     * @param neu - 
     * @return 
     */
    public void hinzufuegen(Kunde neu) {}
    /**
     * Operation loeschen
     *
     * @param Kundennummer - 
     * @return 
     */
    public boolean loeschen(int Kundennummer) { return false; }

}
