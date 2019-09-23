package Autovermietung;

import javax.swing.JPanel;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;

import java.awt.Font;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FahrzeugPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public FahrzeugPanel() {
		setLayout(null);
		
		JLabel lblFahrzeug = new JLabel("Fahrzeug");
		lblFahrzeug.setBounds(169, 45, 104, 29);
		lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblFahrzeug);
		
		DatePicker datePicker = new DatePicker();
		datePicker.getComponentToggleCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		datePicker.setBounds(68, 100, 139, 20);
		add(datePicker);
		datePicker.setDateToToday();
		
		DateTimePicker dateTimePicker = new DateTimePicker();
		dateTimePicker.setBounds(68, 192, 217, 23);
		add(dateTimePicker);
		dateTimePicker.datePicker.setDateToToday();
		dateTimePicker.timePicker.setTimeToNow();

		

	}

}
