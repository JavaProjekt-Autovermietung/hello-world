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


public class FahrzeugAusgabePanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	//private JTable table;
	//test


//Create the panel.
	
	public FahrzeugAusgabePanel(Hauptprogramm haupt) 
		{
			hauptprogramm = haupt;
			setLayout(null);
			
//Titel
			JLabel lblFahrzeug = new JLabel("Ausgabe");
			lblFahrzeug.setBounds(180, 11, 98, 29);
			lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
			//add(lblFahrzeug);
			
			//table = new JTable();
			//table.setBounds(60, 222, 307, -129);
			//add(table);
			
			//{
			// Die Anzahl Columns (Breite) der Tabelle
			//int size = model.getColumnCount();

					// Die Daten für das Table
				
				/*
					ArrayList data = new ArrayList <Fahrzeug>();
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
						data.add( rowC );*/
							
					// Die Titel für das Table
				/*
					Vector title = new Vector();
						title.add( "A" );
						title.add( "B" );
						title.add( "C" );
						title.add( "D" );
						*/
		}
}
					
				



