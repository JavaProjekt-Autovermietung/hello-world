package Autovermietung;

import javax.swing.JPanel;
import javax.swing.JTable;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;

import java.awt.Font;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class FahrzeugBuchenPanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	private JTable table;


//Create the panel.
	public FahrzeugBuchenPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
//Label
		JLabel lblFahrzeug = new JLabel("Fahrzeug");
		lblFahrzeug.setBounds(169, 40, 104, 29);
		lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblFahrzeug);
		
		//JLabel lblAuswahl = new JLabel("Kombi / VW / Golf / B-LNK4 / Mittelklasse");
		JLabel lblAuswahl = new JLabel("bla");
		lblAuswahl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAuswahl.setBounds(72, 79, 287, 20);
		add(lblAuswahl);
		
		JLabel lblAnfangsdatum = new JLabel("Anfangsdatum:");
		lblAnfangsdatum.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAnfangsdatum.setBounds(72, 110, 104, 13);
		add(lblAnfangsdatum);
		
		JLabel lblEnddatum = new JLabel("Enddatum:");
		lblEnddatum.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEnddatum.setBounds(71, 158, 104, 13);
		add(lblEnddatum);
		
//Buttons
		JButton btnBuchen = new JButton("Buchen");
		btnBuchen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBuchen.setBounds(71, 235, 90, 21);
		add(btnBuchen);
		
		JButton btnReservieren = new JButton("Reservieren");
		btnReservieren.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnReservieren.setBounds(169, 235, 90, 21);
		add(btnReservieren);
		
		JButton btnWartung = new JButton("Wartung");
		btnWartung.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnWartung.setBounds(269, 235, 90, 21);
		add(btnWartung);
		
		DateTimePicker von_DateTimePicker = new DateTimePicker();
		von_DateTimePicker.setBounds(71, 125, 288, 23);
		add(von_DateTimePicker);
		
//DateTimePicker
		DateTimePicker bis_DateTimePicker = new DateTimePicker();
		bis_DateTimePicker.setBounds(72, 173, 287, 23);
		add(bis_DateTimePicker);
		bis_DateTimePicker.datePicker.setDateToToday();
		bis_DateTimePicker.timePicker.setTimeToNow();

		

	}
}
