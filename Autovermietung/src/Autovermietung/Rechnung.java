package Autovermietung;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Rechnung {
	
	private ArrayList <String> RechnungsListe;	//= new ArrayList<String>();
	private int rechnungsnummer;
	private enum zahlungsart {Ueberweisung, Rechnung, Kreditkarte,Bankeinzug};
	private double preis;
	private int ausleihdauer;
	private boolean status;
	
	//getMethode für kmVorher und Nachher nötig
	double kmVorher;		
	double kmNachher;
	
	
	public double KmGefahren ()
	{
		double kmGefahren;
		kmGefahren = (kmNachher - kmVorher);
		return kmGefahren;
	}
	
	public int RechnungSuchen (String suchstr)
	{
		int erg = -1;
		for (int i = 0; i < RechnungsListe.size(); i++)
		{
			if (RechnungsListe.get(i).equals(suchstr))
			{
				erg = i;
			}
		}
		return erg; 
	}

	public void RechnungLoeschen ()
	{
		String suchstr = JOptionPane.showInputDialog("Welche Rechnung möchten Sie loeschen?");
		int erg = RechnungSuchen(suchstr);
		if (erg > -1)
			RechnungsListe.remove(erg); 
	}
	
}


