package Autovermietung;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JTable;

import java.util.ArrayList;
//copy
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
//copy ende
import javax.swing.table.DefaultTableModel;


public class EinFahrzeugAusgabePanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	private JTable table;

//Create the panel.
	
	public EinFahrzeugAusgabePanel(Hauptprogramm haupt) 
		{
			hauptprogramm = haupt;
			
			//data der Tabelle
					Vector data = new Vector ();
						Vector rowA = new Vector();
							rowA.add(  "1" );
							rowA.add(  "2" );
							rowA.add(  "3" );
							rowA.add(  "4" );
						Vector rowB = new Vector();
							rowB.add(  "5" );
							rowB.add(  "6" );
							rowB.add(  "7" );
							rowB.add(  "8" );
					/*	Vector rowC = new Vector();
							rowC.add(  "9" );
							rowC.add( "10" );
							rowC.add( "11" );
							rowC.add( "12" ); */
					
							data.add( rowA );
							data.add( rowB );
						//	data.add( rowC );
							
// Die Titel für das Table

					Vector title = new Vector();
						title.add( "Kennzeichen" );
						title.add( "Hersteller" );
						title.add( "Modell" );
						title.add( "Typ" );
						

// Das JTable initialisieren
						table = new JTable( data, title );
						table.setSurrendersFocusOnKeystroke(true);
						add (new JScrollPane(table));
						
						
						JFrame f = new JFrame();
					    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );				

		}
	
	void setData (Fahrzeug fahrzeug)
	{
		DefaultTableModel model = new DefaultTableModel(
				new Object [] {"Kennzeichen", "Hersteller","Modell","Typ","Klasse"}, 0);
		
		if (fahrzeug == null)
			{ 
			Vector row = new Vector ();
			row.add("Auto nicht gefunden!");
			model.addRow(row);
			} 
		
		else {  
			Vector row = new Vector ();
			row.add(fahrzeug.getKennzeichen());
			row.add(fahrzeug.getHersteller());
			row.add(fahrzeug.getModell());
			row.add(fahrzeug.getTyp());
			row.add(fahrzeug.getKlasse());
			model.addRow(row);
		}
		
		table.setModel(model);
	}
}
					
				



