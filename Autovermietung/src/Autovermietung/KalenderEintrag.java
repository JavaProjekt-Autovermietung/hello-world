package Autovermietung;

public class KalenderEintrag {
	
	enum Autostatus {frei, ausgeliehen, reserviert, wartung }; 
	
	DateTime von;
	DateTime bis;
	
	int Kundennummer;
	Autostatus Status;
}
