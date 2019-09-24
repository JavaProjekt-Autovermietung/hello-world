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
    
    private FahrzeugTyp Typ;
    private FahrzeugHersteller Hersteller;
    private String Modell;
    private String Kennzeichen;
    private ArrayList<KalenderEintrag> Kalender = new ArrayList<KalenderEintrag>();
    private FahrzeugKlasse Klasse;
    
    
    /**
     * Operation Fahrzeug
     *
     * @param Kennzeichen - 
     * @param Typ - 
     * @param Hersteller - 
     * @param Modell - 
     * @ 						param Klasse fehlt!!
     * @return 
     */
    public Fahrzeug(String Kennzeichen, FahrzeugTyp Typ, FahrzeugHersteller Hersteller, String Modell, FahrzeugKlasse Klasse ){
    	this.Kennzeichen = Kennzeichen;
    	this.Typ = Typ;
    	this.Hersteller = Hersteller;
    	this.Modell = Modell;
    	this.Klasse = Klasse;
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
    
    public boolean verfuegbar(LocalDateTime von, LocalDateTime bis) 
    {
    	int zeitraum = DateTime.ZeitSpanneTage(von, bis);
    	LocalDateTime vonDatum = von;
    	int zaehler = 0;
    		
    		for (int iarray=0; iarray < Kalender.size(); iarray++) 
    		{
    			if (Kalender.get(iarray).von == vonDatum &&  Kalender.get(iarray).Status != KalenderEintrag.Autostatus.frei)
    			{
    				return false;
    			}
    			else {
	    				zaehler =+1;
	    				if (zaehler == zeitraum) 
						{ 
							return true;
						}	
    			}
    			vonDatum.plusDays(1);
    		}
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
    	
    	if (verfuegbar(von, bis))
    	{
    		KalenderEintrag k = new KalenderEintrag();
    		k.von = von;
    		k.bis = bis;
    		k.Kundennummer = kundenNr;
    		k.Kennzeichen = getKennzeichen();
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
    	
    	for (int i=0; i < Kalender.size(); i++ ) {
    		if (Kalender.get(i).Kennzeichen == getKennzeichen() &&
    				Kalender.get(i).Status == KalenderEintrag.Autostatus.ausgeliehen) 
    		{
    			Kalender.get(i).Status = KalenderEintrag.Autostatus.frei;
    			return true;
    		}
    	}
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
    	    	
    	if (verfuegbar(von, bis))
    	{
    		KalenderEintrag k = new KalenderEintrag();
    		k.von = von;
    		k.bis = bis;
    		k.Kundennummer = kundenNr;
    		k.Kennzeichen = getKennzeichen();
    		k.Status = KalenderEintrag.Autostatus.reserviert;
    		Kalender.add(k);
	    	return true;
	    }
    	else
    		return false;
    }
    /**
     * Operation buchen
     *
     * @param von - 
     * @param bis - 
     * @param kundenNr - 
     * @return 
     */
    public boolean buchen (LocalDateTime von, LocalDateTime bis, int kundenNr) {
    	
    	if (verfuegbar(von, bis))
    	{
    		KalenderEintrag k = new KalenderEintrag();
    		k.von = von;
    		k.bis = bis;
    		k.Kundennummer = kundenNr;
    		k.Kennzeichen = getKennzeichen();
    		k.Status = KalenderEintrag.Autostatus.gebucht;
    		Kalender.add(k);
	    	return true;
	    }
    	else
    		return false;
     }
    
    /**
     * Operation warten
     * @param von 		FEHLTE UND IST VON NÖTEN!
     * @param bis - 
     * @return 
     */
    public void warten(LocalDateTime von, LocalDateTime bis) {
    	
    	KalenderEintrag k = new KalenderEintrag();
		k.von = von;
		k.bis = bis;
		k.Kennzeichen = getKennzeichen();
		k.Status = KalenderEintrag.Autostatus.wartung;
		Kalender.add(k);
    }
    
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
    public void setKlasse(FahrzeugKlasse neu) {Klasse = neu;}
    
	
    public boolean reserviert(int Kundennummer) {
    	
    	int zaehler =0;
    	
    	for (int i=0; i < Kalender.size(); i++ ) 
    	{ 
    		if (Kalender.get(i).Kundennummer == Kundennummer &&
    				Kalender.get(i).Status == KalenderEintrag.Autostatus.reserviert)
    				zaehler =+1;
    	}
    	
    	if (zaehler > 0) 
    	{ 		
    		return true;
    	}
    	else
    	return false;	
    
    }
    
}
