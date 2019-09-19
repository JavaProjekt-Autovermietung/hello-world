package Autovermietung;

public class Kunde {

	
    private int Kundennummer = 0;
    private String Nachname = "";
    private String Vorname = "";
    private String Adresse = "";
    private String PLZ = "";
    private String Ort = "";
 
    
    // Konstruktor mit 3 Variablen
    public Kunde(int Kundennummer, String Nachname, String Vorname) {
    	this.Kundennummer = Kundennummer;
    	this.Nachname = Nachname;
    	this.Vorname = Vorname;
    }

    // Konstruktor mit 6 Variablen inkl. Konstruktor-Weiterleitung (EN: constructor chaining):
    public Kunde(int Kundennummer, String Nachname, String Vorname, String Adresse, String PLZ, String Ort) {
    	this(Kundennummer, Nachname, Vorname);
    	this.Adresse = Adresse;
    	this.PLZ = PLZ;
    	this.Ort = Ort;
    }
    
    public void setAdresse(String Adresse, String PLZ, String Ort) {
    	this.Adresse = Adresse;
    	this.PLZ = PLZ;
    	this.Ort = Ort;
    }
    
    public void setAdresse(String neu) {
    	this.Adresse = neu;
    }
    
    public void setPLZ(String neu) {
    	this.PLZ = neu;
    }
    
    public void setOrt(String neu) {
    	this.Ort = neu;
    }
    
    public String getAdresse(){ 
    	return Adresse; 
    }
    
    public String getPLZ(){ 
    	return PLZ; 
    }
    
    public String getOrt(){ 
    	return Ort; 
    }
    
    public int getKundennummer(){ 
    	return Kundennummer; 
    }
    
    public String getVorname(){ 
    	return Vorname; 
    }
    
    public String getNachname(){ 
    	return Nachname; 
    }
	
}
