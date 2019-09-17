package Autovermietung;

import java.util.ArrayList;

public class FahrzeugListe {

    /** Attributes */
    /**
     * 
     */
    private ArrayList<Fahrzeug> Fahrzeuge;
    /**
     * Operation FahrzeugListe
     *
     * @return 
     */
    public FahrzeugListe() {}
    /**
     * Operation sucheFahrzeug
     *
     * @param Kennzeichen - 
     * @return Fahrzeug
     */
    public Fahrzeug sucheFahrzeug(String Kennzeichen) { return Fahrzeuge.get(0); }
    /**
     * Operation verfuegbar
     * Ist das gut, dass man direkt Zugriff auf die Fahrzeuge bekommt?
     *
     * @param von - 
     * @param bis - 
     * @return ArrayList<Fahrzeug>
     */
    public ArrayList<Fahrzeug> verfuegbar(DateTime von, DateTime bis) { return new ArrayList<Fahrzeug>(); }
    /**
     * Operation hinzufuegen
     *
     * @param Kennzeichen - 
     * @param Typ - 
     * @param Hersteller - 
     * @param Modell - 
     * @return 
     */
    public void hinzufuegen(String Kennzeichen, Fahrzeug.FahrzeugTyp Typ, Fahrzeug.FahrzeugHersteller Hersteller, String Modell ){}
    /**
     * Operation hinzufuegen
     *
     * @param neu - 
     * @return 
     */
    public void hinzufuegen ( Fahrzeug neu ){}
    /**
     * Operation loeschen
     *
     * @param Kennzeichen - 
     * @return 
     */
    public boolean loeschen(String Kennzeichen ) { return false; }
    /**
     * Operation reserviert
     *
     * @param Kundennummer - 
     * @return ArrayList<Fahrzeug>
     */
    public ArrayList<Fahrzeug>reserviert(int Kundennummer) {  return new ArrayList<Fahrzeug>(); }

}
