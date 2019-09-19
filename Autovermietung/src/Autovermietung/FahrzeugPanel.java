package Autovermietung;

import javax.swing.JPanel;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;

import javax.swing.JLabel;

public class FahrzeugPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public FahrzeugPanel() {
		
		JLabel lblFahrzeugpanel = new JLabel("FahrzeugPanel");
		add(lblFahrzeugpanel);
		
		DatePicker datePicker = new DatePicker();
		datePicker.setSize(160, 24);
		add(datePicker);
		datePicker.setDateToToday();
		datePicker.setLocation(217, 115);
		
		DateTimePicker dateTimePicker = new DateTimePicker();
		dateTimePicker.setBounds(217, 174, 240, 25);
		add(dateTimePicker);
		dateTimePicker.datePicker.setDateToToday();
		dateTimePicker.timePicker.setTimeToNow();

		

	}

}
