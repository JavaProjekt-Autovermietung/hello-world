package Autovermietung;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class KalenderEintrag {
	
	enum Autostatus {frei, ausgeliehen, reserviert, gebucht, wartung}; //gebucht JLo-18.9.2019
	
	LocalDateTime von;
	LocalDateTime bis;
	
	String Kennzeichen;
	int Kundennummer;
	Autostatus Status;
}
