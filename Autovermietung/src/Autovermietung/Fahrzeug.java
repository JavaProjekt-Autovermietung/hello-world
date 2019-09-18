package Autovermietung;

import java.util.ArrayList;

import Autovermietung.KalenderEintrag.Autostatus;

import java.time.LocalDateTime;
import java.time.LocalDate;

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
    public Fahrzeug(String Kennzeichen, FahrzeugTyp Typ, FahrzeugHersteller Hersteller, String Modell ){
    	
    	Kalender = new ArrayList<KalenderEintrag>();
    }
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
    public void setKennzeichen(String neu){Kennzeichen = neu;}
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
    public void setTyp(FahrzeugTyp neu) {Typ = neu;}
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
    public void setHersteller( FahrzeugHersteller neu) {Hersteller = neu;}
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
    public void setModell(String neu){Modell =  neu;}
    
    private boolean verfuegbar(LocalDateTime von, LocalDateTime bis, int kundenNr)
    {
    	return false;
    }
    
    /**
     * Operation ausleihen
     *
     * @param von - 
     * @param bis - 
     * @param kundenNr - 
     * @return 
     */
    public boolean ausleihen(LocalDateTime von, LocalDateTime bis, int kundenNr) { 
    	
    	if (verfuegbar(von, bis, kundenNr))
    	{
    		KalenderEintrag k = new KalenderEintrag();
    		k.von = von;
    		k.bis = bis;
    		k.Kundennummer = kundenNr;
    		k.Status = KalenderEintrag.Autostatus.ausgeliehen;
    		Kalender.add(k);
	    	return true;
	    }
    	else
    		return false;
    }
    	
    /**
     * Operation zurueckgeben
     *
     * @return 
     */
    public boolean zurueckgeben() { 
//    	if (KalenderEintrag.Status == Autostatus.ausgeliehen) {
//    	KalenderEintrag.Status =Autostatus.zurueckgebracht;
//   	return true;
//    	}
//    	else return false;
    	return false;
    }
    /**
     * Operation reservieren
     *
     * @param von - 
     * @param bis - 
     * @param kundenNr - 
     * @return 
     */
    public boolean reservieren(LocalDateTime von, LocalDateTime bis, int kundenNr ) {
    	
/*    	for (int j = 0; j < DateTime.ZeitSpanneTage(von, bis); j++)
    	{  KalenderEintrag.kvon = von.plusDays(j);
    	   KalenderEintrag.Status = Autostatus.reserviert;
    	   KalenderEintrag.Kundennummer = kundenNr;
    	} */
    	return true ;}
    /**
     * Operation buchen
     *
     * @param von - 
     * @param bis - 
     * @param kundenNr - 
     * @return 
     */
    public boolean buchen (LocalDateTime von, LocalDateTime bis, int kundenNr) { return false; }
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
