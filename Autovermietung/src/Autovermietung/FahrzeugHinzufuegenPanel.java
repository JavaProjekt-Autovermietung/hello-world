package Autovermietung;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class FahrzeugHinzufuegenPanel extends JPanel{
	private JTextField txtKennzeichen;
	private JTextField txtModel;
	private Hauptprogramm hauptprogramm;
	

//Create the panel.
	public FahrzeugHinzufuegenPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);

//Titel
		JLabel lblFahrzeug = new JLabel("Fahrzeug");
		lblFahrzeug.setBounds(169, 45, 104, 29);
		lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblFahrzeug);
		
//Textfelder
		txtKennzeichen = new JTextField();
		txtKennzeichen.setText("Kennzeichen");
		txtKennzeichen.setBounds(113, 85, 220, 20);
		add(txtKennzeichen);
		txtKennzeichen.setColumns(10);
		
		txtModel = new JTextField();
		txtModel.setText("Modell");
		txtModel.setColumns(10);
		txtModel.setBounds(113, 178, 220, 20);
		add(txtModel);
		
//ComboBox 
//Fahrzeugklasse Auswahl: enum FahrzeugKlasse { Kleinwagen, Mittelklasse, Oberklasse };
		String [] fahrzeugKlassenAuswahl = {"Kleinwagen", "Mittelklasse","Oberklasse"};
		
		JComboBox cbfahrzeugKlasse = new JComboBox(fahrzeugKlassenAuswahl);
		cbfahrzeugKlasse.setMaximumRowCount(3);
		cbfahrzeugKlasse.setBounds(113, 209, 220, 22);
		add(cbfahrzeugKlasse);
		
//ComboBox 
//FahrzeugHersteller Auswahl: enum FahrzeugHersteller { BMW, Skoda, VW, Mercedes };
		String [] fahrzeugHerstellerAuswahl = {"BMW", "Skoda", "VW", "Mercedes"};
		
		JComboBox cbfahrzeugHersteller = new JComboBox (fahrzeugHerstellerAuswahl);
		cbfahrzeugHersteller.setMaximumRowCount(4);
		cbfahrzeugHersteller.setBounds(113, 149, 220, 22);
		add(cbfahrzeugHersteller);
		
//ComboBox 
//FahrzeugTyp Auswahl : enum FahrzeugTyp { Kombi, Limosine, Cabrio };
		String [] fahrzeugTypAuswahl = {"Kombi", "Limosine", "Cabrio"};
		
		JComboBox cbfahrzeugTyp = new JComboBox (fahrzeugTypAuswahl);
		cbfahrzeugHersteller.setMaximumRowCount(3);
		cbfahrzeugTyp.setBounds(113, 116, 220, 22);
		add(cbfahrzeugTyp);
	
//Button Fahrzeug hinzufuegen
		JButton btnFahrzeugHinzufuegen = new JButton("Fahrzeug hinzuf\u00FCgen");
		btnFahrzeugHinzufuegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

//ComboBox Auswahl der Enum Fälle
//String fahrzeugHersteller = cbfahrzeugHersteller.getSelectedItem().toString();
				Fahrzeug.FahrzeugHersteller h = Fahrzeug.FahrzeugHersteller.BMW;
				switch (cbfahrzeugHersteller.getSelectedItem().toString())
				{
					case "BMW": h = Fahrzeug.FahrzeugHersteller.BMW; break;
					case "Skoda": h = Fahrzeug.FahrzeugHersteller.Skoda; break;
					case "VW": h = Fahrzeug.FahrzeugHersteller.VW; break;
					case "Mercedes": h = Fahrzeug.FahrzeugHersteller.Mercedes; break;
				}
				
//String fahrzeugTyp = cbfahrzeugTyp.getSelectedItem().toString();
				Fahrzeug.FahrzeugTyp t = Fahrzeug.FahrzeugTyp.Cabrio;
				switch (cbfahrzeugTyp.getSelectedItem().toString())
				{
					case "Cabrio": t = Fahrzeug.FahrzeugTyp.Cabrio; break;
					case "Kombi": t = Fahrzeug.FahrzeugTyp.Kombi; break;
					case "Limousine": t = Fahrzeug.FahrzeugTyp.Limousine; break;
				}
				
//String fahrzeugKlasse = cbfahrzeugTyp.getSelectedItem().toString();
				Fahrzeug.FahrzeugKlasse k = Fahrzeug.FahrzeugKlasse.Kleinwagen;
				switch (cbfahrzeugKlasse.getSelectedItem().toString())
				{
					case "Kleinwagen": k = Fahrzeug.FahrzeugKlasse.Kleinwagen; break;
					case "Mittelklasse": k = Fahrzeug.FahrzeugKlasse.Mittelklasse; break;
					case "Oberklasse": k = Fahrzeug.FahrzeugKlasse.Oberklasse; break;
				}
				
				hauptprogramm.getFahrzeugListe().hinzufuegen(txtKennzeichen.getText(), t, h, txtModel.getText(), k);
				JOptionPane.showMessageDialog(btnFahrzeugHinzufuegen, "Erfolgreich hinzugefügt!");
			}
		});
		btnFahrzeugHinzufuegen.setBounds(113, 247, 220, 23);
		add(btnFahrzeugHinzufuegen);

	}
}
