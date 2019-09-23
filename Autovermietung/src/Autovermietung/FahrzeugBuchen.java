package Autovermietung;

import javax.swing.JPanel;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;

import java.awt.Font;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class FahrzeugBuchen extends JPanel {

	/**
	 * Create the panel.
	 */
	public FahrzeugBuchen() {
		setLayout(null);
		
		JLabel lblFahrzeug = new JLabel("Fahrzeug");
		lblFahrzeug.setBounds(169, 40, 104, 29);
		lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblFahrzeug);
		
		DateTimePicker dateTimePicker = new DateTimePicker();
		dateTimePicker.setBounds(72, 173, 217, 23);
		add(dateTimePicker);
		dateTimePicker.datePicker.setDateToToday();
		dateTimePicker.timePicker.setTimeToNow();
		
		JLabel lblNewLabel = new JLabel("Kombi / VW / Golf / B-LNK4 / Mittelklasse");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(72, 79, 244, 20);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Anfangsdatum:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(72, 110, 104, 13);
		add(lblNewLabel_1);
		
		JLabel lblZurckAm = new JLabel("Enddatum:");
		lblZurckAm.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblZurckAm.setBounds(71, 158, 104, 13);
		add(lblZurckAm);
		
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
		
		DateTimePicker dateTimePicker_1 = new DateTimePicker();
		dateTimePicker_1.setBounds(71, 125, 217, 23);
		add(dateTimePicker_1);

		

	}
}
