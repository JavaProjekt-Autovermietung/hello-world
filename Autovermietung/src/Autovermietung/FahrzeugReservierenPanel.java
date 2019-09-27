package Autovermietung;

import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import com.github.lgooddatepicker.components.DateTimePicker;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		lblReservieren.setBounds(130, 22, 200, 29);
		lblReservieren.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblReservieren);
		
//Textfelder ausgew�hltes Fahrzeug / ausgew�hlte zeile der Tabelle
		lblKennzeichen = new JLabel("Kennzeichen");
		lblKennzeichen.setHorizontalAlignment(SwingConstants.CENTER);
		lblKennzeichen.setBounds(88, 62, 279, 14);
		add(lblKennzeichen);

		lblTyp = new JLabel("Typ");
		lblTyp.setHorizontalAlignment(SwingConstants.CENTER);
		lblTyp.setBounds(88, 78, 279, 14);
		add(lblTyp);
		
		lblHersteller = new JLabel("Hersteller");
		lblHersteller.setHorizontalAlignment(SwingConstants.CENTER);
		lblHersteller.setBounds(88, 99, 279, 14);
		add(lblHersteller);

//DateTimePicker Positionen
		DateTimePicker vonDateTimePicker = new DateTimePicker();
		vonDateTimePicker.setBounds(88, 124, 279, 23);
		add(vonDateTimePicker);
		vonDateTimePicker.setDateTimeStrict(LocalDateTime.now());
		
		DateTimePicker bisDateTimePicker = new DateTimePicker();
		bisDateTimePicker.setBounds(88, 158, 279, 23);
		add(bisDateTimePicker);		
		bisDateTimePicker.setDateTimeStrict(LocalDateTime.now().plusDays(1));
		
//Button jetzt reservieren
		JButton btnJetztReservieren = new JButton("jetzt reservieren");
		btnJetztReservieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//befehl zum reservieren HIER
				
				//zum testen
				JOptionPane.showMessageDialog(btnJetztReservieren, "Erfolgreich hinzugef�gt!");
			}
		});
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
