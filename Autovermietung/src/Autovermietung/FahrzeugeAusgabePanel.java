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


public class FahrzeugeAusgabePanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	private JTable table;

//Create the panel.
	
	public FahrzeugeAusgabePanel(Hauptprogramm haupt) 
		{
			hauptprogramm = haupt;
			
			
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
						Vector rowC = new Vector();
							rowC.add(  "9" );
							rowC.add( "10" );
							rowC.add( "11" );
							rowC.add( "12" );
					
						data.add( rowA );
						data.add( rowB );
						data.add( rowC );
							
// Die Titel für das Table

					Vector title = new Vector();
						title.add( "Kennzeichen" );
						title.add( "Hersteller" );
						title.add( "Modell" );
						title.add( "Typ" );
						

// Das JTable initialisieren
						JTable table = new JTable( data, title );
						add (new JScrollPane(table));

		}
}
					
				



