package Autovermietung;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FahrzeugErstellenPanel extends JPanel {
	private JTextField txtTyp;
	private JTextField txtHersteller;
	private JTextField txtModel;
	private JTextField txtKlasse;
	private Hauptprogramm hauptprogramm;

	/**
	 * Create the panel.
	 */
	public FahrzeugErstellenPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);

		JLabel lblFahrzeug = new JLabel("Fahrzeug");
		lblFahrzeug.setBounds(169, 45, 104, 29);
		lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblFahrzeug);
		
		txtTyp = new JTextField();
		txtTyp.setText("Typ");
		txtTyp.setBounds(113, 86, 220, 20);
		add(txtTyp);
		txtTyp.setColumns(10);
		
		txtHersteller = new JTextField();
		txtHersteller.setText("Hersteller");
		txtHersteller.setColumns(10);
		txtHersteller.setBounds(113, 117, 220, 20);
		add(txtHersteller);
		
		txtModel = new JTextField();
		txtModel.setText("Modell");
		txtModel.setColumns(10);
		txtModel.setBounds(113, 148, 220, 20);
		add(txtModel);
		
		txtKlasse = new JTextField();
		txtKlasse.setText("Klasse");
		txtKlasse.setColumns(10);
		txtKlasse.setBounds(113, 179, 220, 20);
		add(txtKlasse);
		
		JButton btnFahrzeugErstellen = new JButton("Fahrzeug hinzuf\u00FCgen");
		btnFahrzeugErstellen.setBounds(113, 247, 220, 23);
		add(btnFahrzeugErstellen);
	}

}
