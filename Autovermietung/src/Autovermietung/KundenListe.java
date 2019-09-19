package Autovermietung;

import java.util.ArrayList;

public class KundenListe {

    private ArrayList<Kunde> Kunden;

    private int findeKunde(int nr)
    {
    	int gefunden = -1;
        for (int i = 0; i < Kunden.size() && gefunden < 0; i++){
    		if (Kunden.get(i).getKundennummer() == nr)
    			gefunden = i;
        }
    	return gefunden;
    }

    public KundenListe() {
    	Kunden = new ArrayList<Kunde>();
    }

    public Kunde sucheKunde(int Kundennummer) {  
    	   	return Kunden.get(0);
    }

    public void hinzufuegen(int Kundennummer, String Nachname, String Vorname, String Adresse, String PLZ, String Ort ){
    	Kunde K = new Kunde(Kundennummer, Nachname, Vorname, Adresse, PLZ, Ort);
    	Kunden.add(K);
    }
    
    public void hinzufuegen(Kunde neu) {
    	Kunden.add(neu);
    }
    
    public boolean loeschen(int Kundennummer) {  
    	int gefunden = findeKunde(Kundennummer);
    	if (gefunden >= 0)
    		Kunden.remove(gefunden);
    	return (gefunden >= 0);
    }

}
