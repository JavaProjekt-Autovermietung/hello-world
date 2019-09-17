package Autovermietung;

import java.util.ArrayList;

public class RechnungsListe {
    /** Attributes */
    /**
     * 
     */
    private ArrayList<Rechnung> Rechnungen;
    /**
     * Operation RechnungLoeschen
     *
     * @param Rechnungsnummer - 
     * @return 
     */
    public boolean RechnungLoeschen(int Rechnungsnummer) { return false; }
    /**
     * Operation RechnungAendern
     *
     * @param Rechnungsnummer - 
     * @return 
     */
    public void RechnungAendern(int Rechnungsnummer) {}
    /**
     * Operation RechnungSuchen
     *
     * @param Rechnungsnummer - 
     * @return Rechnung
     */
    public Rechnung RechnungSuchen(int Rechnungsnummer) { return Rechnungen.get(0); }
    /**
     * Operation RechnungErstellen
     *
     * @param Preis - 
     * @param Ausleihdauer - 
     * @param Zahlungsart - 
     * @return <String>
     */
    public boolean RechnungErstellen(double Preis, DateTime Ausleihdauer, Rechnung.Zahlungsart Zahlungsart) { return false; }
    /**
     * Operation alleRechnungen
     *
     * @return ArrayList<Rechnung>
     */
    public ArrayList<Rechnung> alleRechnungen() { return Rechnungen; }
    /**
     * Operation getRechnung
     *
     * @param Rechnungsnummer - 
     * @return Rechnung
     */
    public Rechnung getRechnung(int Rechnungsnummer) { return Rechnungen.get(0); }

}
