package Autovermietung;

import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import com.github.lgooddatepicker.components.DateTimePicker;
import javax.swing.JButton;

public class FahrzeugReservierenPanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	JLabel lblKennzeichen;
	JLabel lblTyp;
	JLabel lblHersteller;
	Fahrzeug fahrzeug;


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
		//JLabel lblAuswahl = new JLabel("... ihre Auswahl");
		lblKennzeichen = new JLabel("Kennzeichen");
		lblKennzeichen.setHorizontalAlignment(SwingConstants.CENTER);
		//lblAuswahl = hauptprogramm.fahrzeugeAusgabePanel.table.getSelectedRow();
		
		lblKennzeichen.setBounds(88, 80, 279, 14);
		add(lblKennzeichen);

		lblTyp = new JLabel("Typ");
		lblTyp.setHorizontalAlignment(SwingConstants.CENTER);
		lblTyp.setBounds(88, 100, 279, 14);
		add(lblTyp);
		
		lblHersteller = new JLabel("Hersteller");
		lblHersteller.setHorizontalAlignment(SwingConstants.CENTER);
		lblHersteller.setBounds(88, 120, 279, 14);
		add(lblHersteller);

//DateTimePicker Positionen
		DateTimePicker vonDateTimePicker = new DateTimePicker();
		vonDateTimePicker.setBounds(88, 159, 279, 23);
		add(vonDateTimePicker);
		vonDateTimePicker.setDateTimeStrict(LocalDateTime.now());
		
		DateTimePicker bisDateTimePicker = new DateTimePicker();
		bisDateTimePicker.setBounds(88, 193, 279, 23);
		add(bisDateTimePicker);		
		bisDateTimePicker.setDateTimeStrict(LocalDateTime.now().plusDays(1));
		
		JButton btnJetztReservieren = new JButton("jetzt reservieren");
		btnJetztReservieren.setBounds(130, 242, 200, 23);
		add(btnJetztReservieren);
		
		
	}
	
	void setData(Fahrzeug fahrzeug)
	{
		this.fahrzeug = fahrzeug;
		lblKennzeichen.setText(fahrzeug.getKennzeichen());
		lblTyp.setText(fahrzeug.getTyp().toString());
		lblHersteller.setText(fahrzeug.getHersteller().toString());
	}
}
