package Autovermietung;

import java.util.ArrayList;

public class Fahrzeug {

	enum FahrzeugTyp { Kombi, Limosine, Cabrio };
	enum FahrzeugHersteller { BMW, Skoda, VW, Mercedes };
	enum FahrzeugKlasse { Kleinwagen, Mittelklasse, Oberklasse };
	
    /** Attributes */
    /**
     * 
     */
    private FahrzeugTyp Typ;
    /**
     * 
     */
    private FahrzeugHersteller Hersteller;
    /**
     * 
     */
    private String Modell;
    /**
     * 
     */
    private String Kennzeichen;
    /**
     * 
     */
    private ArrayList<KalenderEintrag> Kalender;
    /**
     * 
     */
    private FahrzeugKlasse Klasse;
    /**
     * Operation Fahrzeug
     *
     * @param Kennzeichen - 
     * @param Typ - 
     * @param Hersteller - 
     * @param Modell - 
     * @return 
     */
    public Fahrzeug(String Kennzeichen, FahrzeugTyp Typ, FahrzeugHersteller Hersteller, String Modell ) {}
    /**
     * Operation getKennzeichen
     *
     * @return String
     */
    public String getKennzeichen() { return Kennzeichen; }
    /**
     * Operation setKennzeichen
     *
     * @param neu - 
     * @return 
     */
    public void setKennzeichen(String neu){}
    /**
     * Operation getTyp
     *
     * @return FahrzeugTyp
     */
    public FahrzeugTyp getTyp() { return Typ; }
    /**
     * Operation setTyp
     *
     * @param neu - 
     * @return 
     */
    public void setTyp(FahrzeugTyp neu) {}
    /**
     * Operation getHersteller
     *
     * @return FahrzeugHersteller
     */
    public FahrzeugHersteller getHersteller() { return Hersteller; }
    /**
     * Operation setHersteller
     *
     * @param neu - 
     * @return 
     */
    public void setHersteller( FahrzeugHersteller neu) {}
    /**
     * Operation getModell
     *
     * @return String
     */
    public String getModell(){ return Modell; }
    /**
     * Operation setModell
     *
     * @param neu - 
     * @return 
     */
    public void setModell(String neu){}
    /**
     * Operation ausleihen
     *
     * @param von - 
     * @param bis - 
     * @param kundenNr - 
     * @return 
     */
    public boolean ausleihen(DateTime von, DateTime bis, int kundenNr) { return false; }
    /**
     * Operation zurueckgeben
     *
     * @return 
     */
    public boolean zurueckgeben() { return false; }
    /**
     * Operation reservieren
     *
     * @param von - 
     * @param bis - 
     * @param kundenNr - 
     * @return 
     */
    public boolean reservieren(DateTime von, DateTime bis, int kundenNr ) { return false; }
    /**
     * Operation buchen
     *
     * @param von - 
     * @param bis - 
     * @param kundenNr - 
     * @return 
     */
    public boolean buchen (DateTime von, DateTime bis, int kundenNr) { return false; }
    /**
     * Operation warten
     *
     * @param bis - 
     * @return 
     */
    public void warten(DateTime bis) {}
    /**
     * Operation getKlasse
     *
     * @return FahrzeugKlasse
     */
    public FahrzeugKlasse getKlasse() { return Klasse; }
    /**
     * Operation setKlasse
     *
     * @param neu - 
     * @return 
     */
    public void setKlasse(FahrzeugKlasse neu) {}
    /**
     * Operation verfuegbar
     *
     * @param von - 
     * @param bis - 
     * @return boolean
     */
    public boolean verfuegbar(DateTime von, DateTime bis) { return false; }

}
