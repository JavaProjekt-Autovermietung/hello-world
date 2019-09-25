package Autovermietung;

import javax.swing.JPanel;
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
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FahrzeugSuchenPanel extends JPanel {
	private Hauptprogramm hauptprogramm;

	/**
	 * Create the panel.
	 */
	public FahrzeugSuchenPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
		JLabel lblFahrzeug = new JLabel("Fahrzeug");
		lblFahrzeug.setBounds(169, 30, 98, 29);
		lblFahrzeug.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblFahrzeug);
		
		JLabel label = new JLabel("Kombi / VW / Golf / B-LNK4 / Mittelklasse");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(0, 65, 450, 20);
		add(label);
		
		JButton btnAnsehen = new JButton("Ansehen");
		btnAnsehen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnsehen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAnsehen.setBounds(72, 89, 100, 21);
		add(btnAnsehen);
		
		JButton btnLschen = new JButton("L\u00F6schen");
		btnLschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLschen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLschen.setBounds(179, 89, 100, 21);
		add(btnLschen);
		
		JButton btnZurckgeben = new JButton("Zur\u00FCckgeben");
		btnZurckgeben.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnZurckgeben.setBounds(286, 89, 100, 21);
		add(btnZurckgeben);
		
		JButton btnNewButton = new JButton("Buchen   /   Reservieren   /   Wartung");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(72, 120, 317, 21);
		add(btnNewButton);
		
		JLabel label_1 = new JLabel("Kombi / VW / Golf / B-LNK4 / Mittelklasse");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_1.setBounds(0, 155, 450, 20);
		add(label_1);
		
		JButton button = new JButton("Ansehen");
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBounds(72, 180, 100, 21);
		add(button);
		
		JButton button_1 = new JButton("L\u00F6schen");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_1.setBounds(179, 180, 100, 21);
		add(button_1);
		
		JButton button_2 = new JButton("Zur\u00FCckgeben");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_2.setBounds(286, 180, 100, 21);
		add(button_2);
		
		JButton button_3 = new JButton("Buchen   /   Reservieren   /   Wartung");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_3.setBounds(72, 211, 317, 21);
		add(button_3);
		
		Choice choice = new Choice();
		choice.setBounds(72, 248, 314, 18);
		add(choice);
		choice.add("Sortieren nach...");
		choice.add("Hersteller");
		choice.add("Kennzeichen");
		choice.add("Klasse");
		choice.add("Modell");
		choice.add("Typ");
		
		

	}
}
