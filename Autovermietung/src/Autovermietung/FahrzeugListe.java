package Autovermietung;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class FahrzeugListe {

/** Attributes */
    private ArrayList<Fahrzeug> fahrzeugListe;
    /**
     * Operation FahrzeugListe
     *
     * @return 
     */
//übergangsweise Methode
    ArrayList<Fahrzeug> getFahrzeugListe() { return fahrzeugListe; }
    
//Konstruktor
    public FahrzeugListe() 
    	{
    	fahrzeugListe = new ArrayList<Fahrzeug>();
    	}
    	
    /**
     * Operation sucheFahrzeug
     *
     * @param Kennzeichen - 
     * @return Fahrzeug
     */
    public Fahrzeug sucheFahrzeug(String Kennzeichen) 
    	{ 
    	
    	for (int i = 0; i < fahrzeugListe.size(); i++){
    	    if (fahrzeugListe.get(i).getKennzeichen().compareTo(Kennzeichen) == 0)
    	    	return fahrzeugListe.get(i);
    	    else 
    	    {
    	    	System.out.println("Fahrzeug nicht gefunden! Kennzeichen: ");
    	    	return null;
    	    }
    	}
    	return null;
    }
    
    /**
     * Operation verfuegbar
     * Ist das gut, dass man direkt Zugriff auf die fahrzeugListe bekommt?
     *
     * @param von - 
     * @param bis - 
     * @return ArrayList<Fahrzeug>
     */
    
    public ArrayList<Fahrzeug> verfuegbar(LocalDateTime von, LocalDateTime bis) 
    	{ 
    		ArrayList<Fahrzeug> verfuegbareFahrzeuge = new ArrayList<Fahrzeug>();
    		
    		for (int i=0; i <fahrzeugListe.size(); i++) 
    		{
    			if (fahrzeugListe.get(i).verfuegbar(von, bis))
    				verfuegbareFahrzeuge.add(fahrzeugListe.get(i));
    		else
    			if (i == fahrzeugListe.size() && verfuegbareFahrzeuge.size()==0)
    				{ System.out.println("Kein Fahrzeug gefunden!");
    				  return null;
    				}
    		}
    		return verfuegbareFahrzeuge;
    	}
	
    /**
     * Operation hinzufuegen
     *
     * @param Kennzeichen - 
     * @param Typ - 
     * @param Hersteller - 
     * @param Modell -
     */
    public void hinzufuegen(String Kennzeichen, Fahrzeug.FahrzeugTyp Typ, Fahrzeug.FahrzeugHersteller Hersteller, String Modell,
    		Fahrzeug.FahrzeugKlasse Klasse)
    {
    	Fahrzeug neuFahrzeug = new Fahrzeug (Kennzeichen, Typ, Hersteller, Modell, Klasse);
    	fahrzeugListe.add(neuFahrzeug);
    }
    /**
     * Operation hinzufuegen
     *
     * @param neu - 
     * @return 
     */
    // 					public void hinzufuegen ( Fahrzeug neu ){}   Wofür???? Siehe oben!
    
    /**
     * Operation loeschen
     *
     * @param Kennzeichen - 
     * @return 
     */
    public boolean loeschen(String Kennzeichen ) 
    	{
    	
    		for (int i=0; i <fahrzeugListe.size(); i++) 
    		{
				if (fahrzeugListe.get(i).getKennzeichen().compareTo(Kennzeichen) == 0 )
				{	
					System.out.println("Fahrzeug gefunden.");
					System.out.println(fahrzeugListe.get(i));
					
					fahrzeugListe.remove(i);
					return true;
				}
				}
	    	
    	
    	System.out.println("Fahrzeug nicht gefunden.");
    	return false;
    	
    	}
    
    /**
     * Operation kundenReservierung
     *
     * @param Kundennummer - 
     * @return ArrayList<Fahrzeug>
     */
    
     public ArrayList<Fahrzeug> reserviert(int Kundennummer) 
     {
    	ArrayList<Fahrzeug> reserviertListe = new ArrayList<Fahrzeug>(); 
    	 
    	for (int i=0; i <fahrzeugListe.size(); i++) 
		{
    		if (fahrzeugListe.get(i).reserviert(Kundennummer) == true)
    		{
    			reserviertListe.add(fahrzeugListe.get(i));
    		}
    	 }
    	
    	if (reserviertListe.size() != 0)
    		return reserviertListe;
    	else
    		return null;
     }
}
     
