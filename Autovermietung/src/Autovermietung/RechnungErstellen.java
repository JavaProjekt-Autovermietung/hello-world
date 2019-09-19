package Autovermietung;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

public class RechnungErstellen extends JPanel {
	private JTextField txtRechnungsnummer;
	private JTextField txtKundennummer;
	private JTextField txtPreis;
	private JTextField txtAusleihdauer;
	private JFrame frame;

	/**
	 * Create the panel.
	 */
	public RechnungErstellen(JFrame frame) {
		this.frame = frame;
		setLayout(null);

		JLabel lblRechnung = new JLabel("Rechnung");
		lblRechnung.setBounds(169, 45, 104, 29);
		lblRechnung.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblRechnung);
		
		txtRechnungsnummer = new JTextField();
		txtRechnungsnummer.setText("Rechnungsnummer");
		txtRechnungsnummer.setBounds(113, 86, 220, 20);
		add(txtRechnungsnummer);
		txtRechnungsnummer.setColumns(10);
		
		txtKundennummer = new JTextField();
		txtKundennummer.setText("Kundennummer");
		txtKundennummer.setColumns(10);
		txtKundennummer.setBounds(113, 117, 220, 20);
		add(txtKundennummer);
		
		txtPreis = new JTextField();
		txtPreis.setText("Preis");
		txtPreis.setColumns(10);
		txtPreis.setBounds(113, 148, 220, 20);
		add(txtPreis);
		
		txtAusleihdauer = new JTextField();
		txtAusleihdauer.setText("Ausleihdauer");
		txtAusleihdauer.setColumns(10);
		txtAusleihdauer.setBounds(113, 179, 220, 20);
		add(txtAusleihdauer);
		
		JMenu mnSortierenNach = new JMenu("Zahlungsart");
		mnSortierenNach.setBackground(Color.GRAY);
		mnSortierenNach.setBounds(112, 210, 133, 26);
		add(mnSortierenNach);
		
		JMenuItem mntmKundennummer = new JMenuItem("Kreditkarte");
		mnSortierenNach.add(mntmKundennummer);
		
		JMenuItem mntmRechnungsnummer = new JMenuItem("Bar");
		mnSortierenNach.add(mntmRechnungsnummer);
		
		JMenuItem mntmPreis = new JMenuItem("Rechnung");
		mnSortierenNach.add(mntmPreis);
		
		JMenuItem mntmAusleihdauer = new JMenuItem("Paypal");
		mnSortierenNach.add(mntmAusleihdauer);
		
		JButton btnNachRechnungSuchen = new JButton("Rechnung erstellen");
		btnNachRechnungSuchen.setBounds(113, 247, 220, 23);
		add(btnNachRechnungSuchen);
	}

}
