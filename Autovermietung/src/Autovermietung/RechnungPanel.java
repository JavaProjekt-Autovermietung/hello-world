package Autovermietung;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class RechnungPanel extends JPanel {
	private JTextField txtRechnungsnummer;
	private Hauptprogramm hauptprogramm;

	/**
	 * Create the panel.
	 */
	//Konstruktor mit extra parameter frame
	public RechnungPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
		JLabel lblRechnung = new JLabel("Rechnung");
		lblRechnung.setForeground(Color.BLACK);
		lblRechnung.setBounds(169, 45, 104, 29);
		lblRechnung.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblRechnung);
		
		//Button und Belegung (Zeile 36)
		JButton btnRechnungErstellen = new JButton("Neue Rechnung erstellen");
		btnRechnungErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)hauptprogramm.getFrame().getContentPane().getLayout()).show(hauptprogramm.getFrame().getContentPane(), "RechnungErstellen");
			}
		});
		btnRechnungErstellen.setBounds(113, 102, 220, 23);
		add(btnRechnungErstellen);
		
		JButton btnAlleRechnungenAnzeigen = new JButton("Alle Rechnungen anzeigen");
		btnAlleRechnungenAnzeigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hauptprogramm.getRechnungAusgabePanel().setData(hauptprogramm.getRechnungsListe().getRechnungen());
				((CardLayout)hauptprogramm.getFrame().getContentPane().getLayout()).show(hauptprogramm.getFrame().getContentPane(), Hauptprogramm.RechnungenAusgabe);
			}
		});
		btnAlleRechnungenAnzeigen.setBounds(113, 136, 220, 23);
		add(btnAlleRechnungenAnzeigen);
		
		txtRechnungsnummer = new JTextField();
		txtRechnungsnummer.setText("Rechnungsnummer");
		txtRechnungsnummer.setBounds(113, 189, 220, 20);
		add(txtRechnungsnummer);
		txtRechnungsnummer.setColumns(10);
		
		JButton btnNachRechnungSuchen = new JButton("Nach Rechnung suchen");
		btnNachRechnungSuchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)hauptprogramm.getFrame().getContentPane().getLayout()).show(hauptprogramm.getFrame().getContentPane(), Hauptprogramm.RechnungSuche);
			}
		});
		btnNachRechnungSuchen.setBounds(113, 220, 220, 23);
		add(btnNachRechnungSuchen);

	}
}
