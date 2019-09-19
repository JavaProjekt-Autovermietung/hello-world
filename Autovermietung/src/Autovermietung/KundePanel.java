package Autovermietung;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KundePanel extends JPanel {
	private JTextField txtKundennummer;
	/**
	 * Create the panel.
	 */
	public KundePanel() {
		setLayout(null);
		
		JLabel lblKunde = new JLabel("Kunde");
		lblKunde.setBounds(183, 45, 104, 29);
		lblKunde.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblKunde);
		
		JButton btnKundeAnlegen = new JButton("Neuen Kunden anlegen");
		btnKundeAnlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKundeAnlegen.setBounds(113, 102, 220, 23);
		add(btnKundeAnlegen);
		
		JButton btnAlleKundenAnzeigen = new JButton("Alle Kunden anzeigen");
		btnAlleKundenAnzeigen.setBounds(113, 136, 220, 23);
		add(btnAlleKundenAnzeigen);
		
		txtKundennummer = new JTextField();
		txtKundennummer.setText("Kundennummer");
		txtKundennummer.setBounds(113, 189, 220, 20);
		add(txtKundennummer);
		txtKundennummer.setColumns(10);
		
		JButton btnNachKundensuchen = new JButton("Nach Kunden suchen");
		btnNachKundensuchen.setBounds(113, 220, 220, 23);
		add(btnNachKundensuchen);
	}

}
