package Autovermietung;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Rechnung {
	
	enum Zahlungsart { Bar, Rechnung, Kreditkarte, Paypal };
	
	   /** Attributes */
    /**
     * 
     */
    private int RechnungsNummer;
    /**
     * 
     */
    private Zahlungsart Zahlungsart;
    /**
     * 
     */
    private double Preis;
    /**
     * 
     */
    private KalenderEintrag Ausleihdauer;
    /**
     * Operation getRechnungsNummer
     *
     * @return int
     */
    public int getRechnungsNummer() { return RechnungsNummer; }
    /**
     * Operation getPreis
     *
     * @return double
     */
    public double getPreis() { return Preis; }
    /**
     * Operation getAusleihdauer
     *
     * @return DateTime
     */
    public KalenderEintrag getAusleihdauer() { return Ausleihdauer; }	
}


