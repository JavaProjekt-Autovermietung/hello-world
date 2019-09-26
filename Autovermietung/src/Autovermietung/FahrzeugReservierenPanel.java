package Autovermietung;

import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import com.github.lgooddatepicker.components.DateTimePicker;

public class FahrzeugReservierenPanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	private JTable table;


//Create the panel.

	public FahrzeugReservierenPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
//Titel
		JLabel lblReservieren = new JLabel("Reservieren");
		lblReservieren.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservieren.setBounds(130, 45, 200, 29);
		lblReservieren.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblReservieren);
		
//Textfeld ausgewählte Fahrzeuge
		JLabel lblAuswahl = new JLabel("... ihre Auswahl");
		//JLabel lblAuswahl = new JLabel(lblAuswahl = hauptprogramm.fahrzeugeAusgabePanel.table.getSelectedRow());
		//lblAuswahl = hauptprogramm.fahrzeugeAusgabePanel.table.getSelectedRow();
		
//		int column = 0;
//		int row = table.getSelectedRow();
//		String value = table.getModel().getValueAt(row, column).toString();
		
		lblAuswahl.setBounds(88, 105, 279, 14);
		add(lblAuswahl);

//DateTimePicker Positionen
		DateTimePicker vonDateTimePicker = new DateTimePicker();
		vonDateTimePicker.setBounds(88, 159, 279, 23);
		add(vonDateTimePicker);
		vonDateTimePicker.setDateTimeStrict(LocalDateTime.now());
		
		DateTimePicker bisDateTimePicker = new DateTimePicker();
		bisDateTimePicker.setBounds(88, 193, 279, 23);
		add(bisDateTimePicker);		
		bisDateTimePicker.setDateTimeStrict(LocalDateTime.now().plusDays(1));
		
		
	}
}
