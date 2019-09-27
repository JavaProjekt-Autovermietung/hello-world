package Autovermietung;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;

public class RechnungErstellenPanel extends JPanel {
	private JTextField txtRechnungsnummer;
	private JTextField txtKundennummer;
	private JTextField txtPreis;
	private Hauptprogramm hauptprogramm;

	
//Create the panel.
	public RechnungErstellenPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);

//Titel
		JLabel lblRechnung = new JLabel("Rechnung");
		lblRechnung.setBounds(169, 45, 104, 29);
		lblRechnung.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblRechnung);
		
//textfelder
		txtRechnungsnummer = new JTextField();
		txtRechnungsnummer.setText("Rechnungsnummer");
		txtRechnungsnummer.setBounds(113, 86, 220, 20);
		add(txtRechnungsnummer);
		txtRechnungsnummer.setColumns(10);
		
		txtKundennummer = new JTextField();
		txtKundennummer.setText("Kundennummer");
		txtKundennummer.setColumns(10);
		txtKundennummer.setBounds(113, 106, 220, 20);
		add(txtKundennummer);
		
		txtPreis = new JTextField();
		txtPreis.setText("Preis");
		txtPreis.setColumns(10);
		txtPreis.setBounds(113, 126, 220, 20);
		add(txtPreis);

		DateTimePicker vonDateTimePicker = new DateTimePicker();
		vonDateTimePicker.setBounds(114, 151, 217, 23);
		add(vonDateTimePicker);
		
		DateTimePicker bisDateTimePicker = new DateTimePicker();
		bisDateTimePicker.setBounds(114, 180, 217, 23);
		add(bisDateTimePicker);

		Choice choice = new Choice();
		choice.setBounds(114, 218, 110, 20);
		add(choice);
		choice.add("Zahlungsart");
		choice.add("Kreditkarte");
		choice.add("Bar");
		choice.add("Rechnung");
		choice.add("Paypal");
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(223, 218, 110, 20);
		add(choice_1);
		choice_1.add("Kennzeichen");
		choice_1.add("B:38DF");
		
		JLabel lblVon = new JLabel("Von");
		lblVon.setBounds(91, 155, 25, 14);
		add(lblVon);
		
		JLabel lblBis = new JLabel("Bis");
		lblBis.setBounds(93, 184, 19, 14);
		add(lblBis);
		
		JButton btnNachRechnungSuchen = new JButton("Rechnung erstellen");
		btnNachRechnungSuchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KalenderEintrag k = new KalenderEintrag();
				k.von = vonDateTimePicker.getDateTimeStrict();
				k.bis = bisDateTimePicker.getDateTimeStrict();
				k.Kundennummer = Integer.parseInt(txtKundennummer.getText());
				k.Kennzeichen = choice_1.getSelectedItem();
				
				Rechnung.Zahlungsart z = Rechnung.Zahlungsart.Bar;
				switch (choice.getSelectedItem())
				{
				case "Zahlungsart" : z = Rechnung.Zahlungsart.Bar; break;
				case "Kreditkarte" : z = Rechnung.Zahlungsart.Kreditkarte; break;
				case "Bar" : z = Rechnung.Zahlungsart.Bar; break;
				case "Rechnung" : z = Rechnung.Zahlungsart.Rechnung; break;
				case "Paypal" : z = Rechnung.Zahlungsart.Paypal; break;
				}
				
				hauptprogramm.getRechnungsListe().RechnungErstellen(Integer.parseInt(txtRechnungsnummer.getText()), Double.parseDouble(txtPreis.getText()), k, z);
			}
		});
		btnNachRechnungSuchen.setBounds(113, 247, 220, 23);
		add(btnNachRechnungSuchen);
	}
}
