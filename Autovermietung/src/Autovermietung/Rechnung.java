package Autovermietung;

public class Rechnung {
	
	enum Zahlungsart { Bar, Rechnung, Kreditkarte, Paypal };
    private int RechnungsNummer;
    private Zahlungsart Zahlungsart;
    private double Preis;
    private KalenderEintrag Ausleihdauer;
    private int Kundennummer;
    
    Rechnung(int RechnungsNummer, double Preis, KalenderEintrag Ausleihdauer, Zahlungsart Zahlungsart, int Kundennummer) {
    	this.RechnungsNummer = RechnungsNummer;
    	this.Preis = Preis;
    	this.Ausleihdauer = Ausleihdauer;
    	this.Zahlungsart = Zahlungsart;
    	this.Kundennummer = Kundennummer;
    }
    
    int getRechnungsNummer() { return RechnungsNummer; }

    double getPreis() { return Preis; }

    KalenderEintrag getAusleihdauer() { return Ausleihdauer; }
    
    int getKundennummer() {return Kundennummer;}
}


