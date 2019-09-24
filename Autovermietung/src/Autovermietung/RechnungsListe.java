package Autovermietung;

import java.util.ArrayList;

public class RechnungsListe {

    private ArrayList<Rechnung> Rechnungen;
    
    RechnungsListe() {
    	Rechnungen = new ArrayList<Rechnung>();
    }
    
    public void RechnungLoeschen(int Rechnungsnummer) { 
    	
    	int x = RechnungSuchen(Rechnungsnummer);
		if (x >= 0) {
			Rechnungen.remove(Rechnungen.get(x));
		}
    }

    private int RechnungSuchen(int Rechnungsnummer) { 

    	int gefunden = -1;
    	for (int i = 0; (i < Rechnungen.size()) && (gefunden == -1); i++) {
			if (Rechnungen.get(i).getRechnungsNummer() == Rechnungsnummer) {
				gefunden = i;
			}
    	}
    	return gefunden;
    }

    public void RechnungErstellen(int Rechnungsnummer, double Preis, KalenderEintrag Ausleihdauer, Rechnung.Zahlungsart Zahlungsart) { 

    	Rechnung R = new Rechnung(Rechnungsnummer, Preis, Ausleihdauer, Zahlungsart);
		Rechnungen.add(R);
    	}

    public Rechnung getRechnung(int Rechnungsnummer) { 
		
    	int x = RechnungSuchen(Rechnungsnummer);
		if (x >= 0) {
			return Rechnungen.get(x);
		}
		return null;
    }
    
    ArrayList<Rechnung> getRechnungen() {
    	return Rechnungen;
    }
    
    public ArrayList<Rechnung> KundennummerRechnung(int Kundennummer) {
    	ArrayList<Rechnung> RechnungVonKunden = new ArrayList<Rechnung>();
    	for (int i = 0; (i < Rechnungen.size()); i++) {
			if (Rechnungen.get(i).getKundennummer() == Kundennummer) {
				RechnungVonKunden.add(Rechnungen.get(i));
			}
    	}
    	return RechnungVonKunden;
    }
}
