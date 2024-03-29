package Autovermietung;

import java.util.ArrayList;

import Autovermietung.KalenderEintrag.Autostatus;
import java.math.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.LocalDate;

public class Fahrzeug {

	enum FahrzeugTyp { Kombi, Limousine, Cabrio };
	enum FahrzeugHersteller { BMW, Skoda, VW, Mercedes };
	enum FahrzeugKlasse { Kleinwagen, Mittelklasse, Oberklasse };
	
    /** Attributes */
    
    private FahrzeugTyp Typ;
    private FahrzeugHersteller Hersteller;
    private String Modell;
    private String Kennzeichen;
    private ArrayList<KalenderEintrag> Kalender = new ArrayList<KalenderEintrag>();
    private FahrzeugKlasse Klasse;
    
    public Fahrzeug(String Kennzeichen, FahrzeugTyp Typ, FahrzeugHersteller Hersteller, String Modell, FahrzeugKlasse Klasse ){
    	this.Kennzeichen = Kennzeichen;
    	this.Typ = Typ;
    	this.Hersteller = Hersteller;
    	this.Modell = Modell;
    	this.Klasse = Klasse;
    	Kalender = new ArrayList<KalenderEintrag>();
    }
    
    public String getKennzeichen() { return Kennzeichen; }
    
    public void setKennzeichen(String neu){Kennzeichen = neu;}
    
    public FahrzeugTyp getTyp() { return Typ; }
    
    public void setTyp(FahrzeugTyp neu) {Typ = neu;}
    
    public FahrzeugHersteller getHersteller() { return Hersteller; }
    
    public void setHersteller( FahrzeugHersteller neu) {Hersteller = neu;}
    
    public String getModell(){ return Modell; }
    
    public void setModell(String neu){Modell =  neu;}
    
    public boolean verfuegbar(LocalDateTime von, LocalDateTime bis) 
    {
    	int zeitraum = DateTime.ZeitSpanneTage(von, bis);
    	double stunden = DateTime.ZeitSpanneStunden(von, bis);
    	
    	LocalDate vonAnfrage = von.toLocalDate(), bisAnfrage = bis.toLocalDate();
    	
    	int zaehler = 0;
    		
    	if (zeitraum > 1) { 	
    		for (int iarray=0; iarray < Kalender.size(); iarray++) 
    		{
    			if (!( bisAnfrage.isBefore(Kalender.get(iarray).von.toLocalDate()) ||
    					vonAnfrage.isAfter(Kalender.get(iarray).bis.toLocalDate()) ) )
    				zaehler =+ 1;	  						
    		}
    		
    	} // end if zeitraum
    	
    	else if (zeitraum == 1 && stunden > 0) {
    		
    		for (int earray=0; earray < Kalender.size(); earray++) 
    		{
    			
	    			if (! ( bis.isBefore(Kalender.get(earray).von) ||
	    					von.isAfter(Kalender.get(earray).bis) ) )
	    					zaehler =+1;
    		}
    		
    	} // end else 
    	
    	if (zaehler > 0)
			return false;
		else
			return true;	
    		
   } // Ende verfuegbar
    
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
     * @param von 		FEHLTE UND IST VON N�TEN!
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
    
   // Kalender ausf�llen, um Testdaten zu haben.
    
    public void setKalenderA() {
    	KalenderEintrag k = new KalenderEintrag();
		k.von = LocalDateTime.of(2019, Month.OCTOBER, 1, 8, 00,00);
		k.bis = LocalDateTime.of(2019, Month.OCTOBER, 1, 18, 30,00);
		k.Kennzeichen = getKennzeichen();
		k.Status = KalenderEintrag.Autostatus.reserviert;
		Kalender.add(k);
    }
    
    public void setKalenderB() {
    	KalenderEintrag k = new KalenderEintrag();
		k.von = LocalDateTime.of(2019, Month.OCTOBER, 5, 10, 00,00);
		k.bis = LocalDateTime.of(2019, Month.OCTOBER, 10, 20, 45,00);
		k.Kennzeichen = getKennzeichen();
		k.Status = KalenderEintrag.Autostatus.gebucht;
		Kalender.add(k);
    }
    
    
    public void setKalenderC() {
    	KalenderEintrag k = new KalenderEintrag();
		k.von = LocalDateTime.of(2019, Month.SEPTEMBER, 27, 10, 00,00);
		k.bis = LocalDateTime.of(2019, Month.SEPTEMBER, 28, 18, 00,00);
		k.Kennzeichen = getKennzeichen();
		k.Status = KalenderEintrag.Autostatus.ausgeliehen;
		Kalender.add(k);
    } 
	

}
