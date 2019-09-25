package Autovermietung;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FahrzeugSuchenPanel extends JPanel {
	private Hauptprogramm hauptprogramm;
	private JTextField txtKennzeichen;

	/**
	 * Create the panel.
	 */
	public FahrzeugSuchenPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
		JLabel lblFahrzeug = new JLabel("Fahrzeug suchen");
		lblFahrzeug.setBounds(129, 30, 196, 29);
		lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblFahrzeug);
		
		JLabel lblKennzeichenAngeben = new JLabel("Kennzeichen des Fahrzeugs angeben :");
		lblKennzeichenAngeben.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKennzeichenAngeben.setBounds(72, 104, 231, 20);
		add(lblKennzeichenAngeben);
		
		txtKennzeichen = new JTextField();
		txtKennzeichen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtKennzeichen.setText("Kennzeichen");
		txtKennzeichen.setBounds(72, 134, 220, 20);
		add(txtKennzeichen);
		txtKennzeichen.setColumns(10);
		
		JButton btnAnsehen = new JButton("Ansehen");
		btnAnsehen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Kennzeichen = txtKennzeichen.getText();
				Fahrzeug fahrzeug = hauptprogramm.getFahrzeugListe().sucheFahrzeug(Kennzeichen);
				
				((CardLayout)hauptprogramm.getFrame().getContentPane().getLayout()).show(hauptprogramm.getFrame().getContentPane(), Hauptprogramm.EinFahrzeugAusgabePanel);
			}
		});
		btnAnsehen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAnsehen.setBounds(72, 177, 100, 21);
		add(btnAnsehen);
		
		
		
		

	}
}
