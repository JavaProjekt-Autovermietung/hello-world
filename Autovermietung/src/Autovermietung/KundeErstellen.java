package Autovermietung;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KundeErstellen extends JPanel {
	private JTextField txtKundennummer;
	private JTextField txtName;
	private JTextField txtVorname;
	private JTextField txtStrasse;
	private JTextField txtPlz;
	private JTextField txtOrt;
	private Hauptprogramm hauptprogramm;
	/**
	 * Create the panel.
	 */
	public KundeErstellen(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
		JLabel lblRechnung = new JLabel("Kunde");
		lblRechnung.setBounds(183, 45, 104, 29);
		lblRechnung.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblRechnung);
		
		txtKundennummer = new JTextField();
		txtKundennummer.setText("Kundennummer");
		txtKundennummer.setBounds(113, 86, 220, 20);
		add(txtKundennummer);
		txtKundennummer.setColumns(10);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setColumns(10);
		txtName.setBounds(113, 117, 220, 20);
		add(txtName);
		
		txtVorname = new JTextField();
		txtVorname.setText("Vorname");
		txtVorname.setColumns(10);
		txtVorname.setBounds(113, 148, 220, 20);
		add(txtVorname);
		
		txtStrasse = new JTextField();
		txtStrasse.setText("Strasse & Hausnummer");
		txtStrasse.setColumns(10);
		txtStrasse.setBounds(113, 179, 220, 20);
		add(txtStrasse);
		
		JButton btnKundeAnlegen = new JButton("Kunde anlegen");
		btnKundeAnlegen.setBounds(113, 247, 220, 23);
		add(btnKundeAnlegen);
		
		txtPlz = new JTextField();
		txtPlz.setText("PLZ");
		txtPlz.setColumns(10);
		txtPlz.setBounds(113, 210, 104, 20);
		add(txtPlz);
		
		txtOrt = new JTextField();
		txtOrt.setText("Ort");
		txtOrt.setColumns(10);
		txtOrt.setBounds(229, 210, 104, 20);
		add(txtOrt);
	}

}
