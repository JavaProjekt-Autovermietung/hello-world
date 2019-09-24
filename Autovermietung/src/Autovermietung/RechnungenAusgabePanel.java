package Autovermietung;

import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class RechnungenAusgabePanel extends JPanel {
	
	private Hauptprogramm hauptprogramm;
	private JTable table;


	public RechnungenAusgabePanel(Hauptprogramm haupt) {
		
		hauptprogramm = haupt;
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

			/*
				// Die Daten für das Table
				Vector data = new Vector();
					Vector rowA = new Vector();
						rowA.add(  "jksdf" );
						rowA.add(  "asdfsadfsad" );
						rowA.add(  "sadfsadf" );
						rowA.add(  "asdfsadfsadf" );
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
					title.add( "sajkdfklsaf" );
					title.add( "asdfsafsadf" );
					*/
					
		
					table = new JTable();
					
					add(new JScrollPane(table));
	}
		
					//-----------------------------------------
		void setData( ArrayList<Rechnung> Rechnungen ) {
			
	
					DefaultTableModel model = new DefaultTableModel(
							new Object[] { "Rechnungsnummer", "Preis", "Ausleihdauer", "Kundennummer" }, 0);
					
					for (int i = 0; i < Rechnungen.size(); i++)
					{
						Vector row = new Vector();
						row.add(Rechnungen.get(i).getRechnungsNummer());
						row.add(Rechnungen.get(i).getPreis());
						row.add(Rechnungen.get(i).getAusleihdauer());
						row.add(Rechnungen.get(i).getKundennummer());
						model.addRow(row);
					}
					table.setModel(model);
		}
}
