package Autovermietung;

import javax.swing.JPanel;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;

import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FahrzeugPanel extends JPanel {
	private Hauptprogramm hauptprogramm;


//Create the panel//
	public FahrzeugPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
//Titel
		JLabel lblFahrzeug = new JLabel("Fahrzeug");
		lblFahrzeug.setBounds(180, 11, 98, 29);
		lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblFahrzeug);
	
//Button Fahrzeug hinzufuegen
		JButton btnFahrzeugHinzufuegen = new JButton("Fahrzeug hinzufuegen");
		btnFahrzeugHinzufuegen.setBounds(88, 51, 279, 23);
		btnFahrzeugHinzufuegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  ((CardLayout)hauptprogramm.getFrame().getContentPane().getLayout()).show(hauptprogramm.getFrame().getContentPane(), hauptprogramm.FahrzeugHinzufuegenPanel);
			}
			});
		add(btnFahrzeugHinzufuegen);
		
//DateTimePicker Positionen
		DateTimePicker vonDateTimePicker = new DateTimePicker();
		vonDateTimePicker.setBounds(88, 111, 279, 23);
		add(vonDateTimePicker);
		vonDateTimePicker.setDateTimeStrict(LocalDateTime.now());
		
		DateTimePicker bisDateTimePicker = new DateTimePicker();
		bisDateTimePicker.setBounds(88, 145, 279, 23);
		add(bisDateTimePicker);		
		bisDateTimePicker.setDateTimeStrict(LocalDateTime.now().plusDays(1));
		
//Button Nach Fahrzeug suchen
		JButton btnNachFahrzeugSuchen = new JButton("Nach Fahrzeug suchen");
		btnNachFahrzeugSuchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)hauptprogramm.getFrame().getContentPane().getLayout()).show(hauptprogramm.getFrame().getContentPane(), Hauptprogramm.FahrzeugSuchenPanel);
				
			}
		});
		btnNachFahrzeugSuchen.setBounds(88, 236, 279, 23);
		add(btnNachFahrzeugSuchen);
		
//Button Verfuegbarkeit pruefen
		JButton btnVerfuegbarkeitPruefen = new JButton("Verfuegbarkeit pruefen");
		btnVerfuegbarkeitPruefen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			

				//Date Time von - bis
				LocalDateTime von = vonDateTimePicker.getDateTimeStrict();
				//JOptionPane.showMessageDialog(null, von.toString());
				
				LocalDateTime bis = bisDateTimePicker.getDateTimeStrict();
				//JOptionPane.showMessageDialog(null, bis.toString());
				
//Init fahrzeugListe
				ArrayList<Fahrzeug> fahrzeugListe = hauptprogramm.getFahrzeugListe().verfuegbar(von, bis);
				//fahrzeugListe.verfuegbar(von,bis);
				
				hauptprogramm.getFahrzeugAusgabePanel().setData(fahrzeugListe);
				
				((CardLayout)hauptprogramm.getFrame().getContentPane().getLayout()).show(hauptprogramm.getFrame().getContentPane(), Hauptprogramm.FahrzeugeAusgabePanel);
				
//Hier AusgabePanel Verfügbarkeit
			}
		});
		btnVerfuegbarkeitPruefen.setBounds(88, 179, 279, 23);
		add(btnVerfuegbarkeitPruefen);
		
		

	}
}
