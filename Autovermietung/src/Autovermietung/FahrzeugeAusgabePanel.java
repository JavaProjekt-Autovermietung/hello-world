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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FahrzeugeAusgabePanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	private JTable table;

//Create the panel.
	
	public FahrzeugeAusgabePanel(Hauptprogramm haupt) 
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
				Vector rowC = new Vector();
					rowC.add(  "9" );
					rowC.add( "10" );
					rowC.add( "11" );
					rowC.add( "12" );
			
					data.add( rowA );
					data.add( rowB );
					data.add( rowC );
							
// Die Titel f�r das Table

				Vector title = new Vector();
					title.add( "Kennzeichen" );
					title.add( "Hersteller" );
					title.add( "Modell" );
					title.add( "Typ" );
					setLayout(null);
					

// Das JTable initialisieren
				table = new JTable( data, title );
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(10, 5, 431, 200);
				add (scrollPane);
				table.setBounds (5, 5, 400, 0);

						
//Button Reservieren
				JButton btnReservieren = new JButton("Reservieren");
				btnReservieren.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						String sKennzeichen = (String)model.getValueAt(table.getSelectedRow(), 0);
						
						Fahrzeug f = hauptprogramm.getFahrzeugListe().sucheFahrzeug(sKennzeichen);
						if (f != null)
						{
							hauptprogramm.getFahrzeugReservierenPanel().setData(f);
							
							hauptprogramm.show(hauptprogramm.FahrzeugReservierenPanel);
						}
					}
				});
				btnReservieren.setBounds(10, 244, 194, 23);
				add(btnReservieren);
				
//Button Buchen
				JButton btnBuchen = new JButton("Buchen");
				btnBuchen.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						hauptprogramm.show(hauptprogramm.FahrzeugBuchenPanel);
					}
				});
				btnBuchen.setBounds(245, 244, 194, 23);
				add(btnBuchen);
				
				JFrame f = new JFrame();
			    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );				
		}
	
	void setData (ArrayList <Fahrzeug> fahrzeuge)
	{
		DefaultTableModel model = new DefaultTableModel(

				new Object [] {"Kennzeichen", "Hersteller","Modell","Typ","Klasse"}, 0);

		for (int i = 0; i < fahrzeuge.size(); i++)
		{
			Vector row = new Vector ();
			row.add(fahrzeuge.get(i).getKennzeichen());
			row.add(fahrzeuge.get(i).getHersteller());
			row.add(fahrzeuge.get(i).getModell());
			row.add(fahrzeuge.get(i).getTyp());
			row.add(fahrzeuge.get(i).getKlasse());
			model.addRow(row);
		}
		
		table.setModel(model);
	}
}
					
				



