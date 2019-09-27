package Autovermietung;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class KundenAusgabePanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	private JTable table;

//Create the panel.
	
	public KundenAusgabePanel(Hauptprogramm haupt) 
		{
			hauptprogramm = haupt;
		
		// data der Tabelle
				Vector data = new Vector ();
					Vector rowA = new Vector();
						rowA.add(  "A1" );
						rowA.add(  "A2" );
						rowA.add(  "A3" );
						rowA.add(  "A4" );
						rowA.add(  "A5" );
						rowA.add(  "A6" );
					Vector rowB = new Vector();
						rowB.add(  "B1" );
						rowB.add(  "B2" );
						rowB.add(  "B3" );
						rowB.add(  "B4" );
						rowB.add(  "B5" );
						rowB.add(  "B6" );
					Vector rowC = new Vector();
						rowC.add(  "C1" );
						rowC.add(  "C2" );
						rowC.add(  "C3" );
						rowC.add(  "C4" );
						rowC.add(  "C5" );
						rowC.add(  "C6" );
				
						data.add( rowA );
						data.add( rowB );
						data.add( rowC );
						
		// Die Spaltentitel für das JTable
	
				Vector title = new Vector();
					title.add( "Kundennummer" );
					title.add( "Nachname" );
					title.add( "Vorname" );
					title.add( "Adresse" );
					title.add( "PLZ" );
					title.add( "Ort" );
					
					
	
	// Das JTable initialisieren
					table = new JTable( data, title );
					table.setSurrendersFocusOnKeystroke(true);
					add (new JScrollPane(table));

		}
	
	void setData (ArrayList <Kunde> kunden)
	{
		DefaultTableModel model = new DefaultTableModel(
				new Object [] {"Kundennummer", "Nachname","Vorname","Adresse", "PLZ", "Ort"}, 0);
		
		for (int i = 0; i < kunden.size(); i++)
		{
			Vector row = new Vector ();
			row.add(kunden.get(i).getKundennummer());
			row.add(kunden.get(i).getNachname());
			row.add(kunden.get(i).getVorname());
			row.add(kunden.get(i).getAdresse());
			row.add(kunden.get(i).getPLZ());
			row.add(kunden.get(i).getOrt());
			model.addRow(row);
		}
		
		table.setModel(model);
	}
}
					
				



