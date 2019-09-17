package Autovermietung;

public class Kunde {

    /** Attributes */
    /**
     * 
     */
    private String Vorname;
    /**
     * 
     */
    private String Nachname;
    /**
     * 
     */
    private String Adresse;
    /**
     * 
     */
    private String PLZ;
    /**
     * 
     */
    private String Ort;
    /**
     * 
     */
    private int Kundennummer;
    /**
     * Operation Kunde
     *
     * @param Name - 
     * @param Vorname - 
     * @param Kundennummer - 
     * @return 
     */
    public Kunde(String Name, String Vorname, int Kundennummer) {}
    /**
     * Operation setAdresse
     *
     * @param Adresse - 
     * @param PLZ - 
     * @param Ort - 
     * @return 
     */
    public void setAdresse(String Adresse, String PLZ, String Ort ) {}
    /**
     * Operation setAdresse
     *
     * @param neu - 
     * @return 
     */
    public void setAdresse(String neu) {}
    /**
     * Operation setPLZ
     *
     * @param neu - 
     * @return 
     */
    public void setPLZ(String neu) {}
    /**
     * Operation setOrt
     *
     * @param neu - 
     * @return 
     */
    public void setOrt(String neu) {}
    /**
     * Operation getAdresse
     *
     * @return String
     */
    public String getAdresse(){ return Adresse; }
    /**
     * Operation getPLZ
     *
     * @return String
     */
    public String getPLZ(){ return PLZ; }
    /**
     * Operation getOrt
     *
     * @return String
     */
    public String getOrt(){ return Ort; }
    /**
     * Operation getKundennummer
     *
     * @return int
     */
    public int getKundennummer(){ return Kundennummer; }
    /**
     * Operation getVorname
     *
     * @return String
     */
    public String getVorname(){ return Vorname; }
    /**
     * Operation getNachname
     *
     * @return String
     */
    public String getNachname(){ return Nachname; }
	
}
