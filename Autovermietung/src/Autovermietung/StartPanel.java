package Autovermietung;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel {
	private Hauptprogramm hauptprogramm;

	/**
	 * Create the panel.
	 */
	public StartPanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
		JLabel lblKunde = new JLabel("Autovermietung");
		lblKunde.setBounds(132, 103, 177, 29);
		lblKunde.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblKunde);
		
		JLabel lblTreffenSieEine = new JLabel("Treffen Sie eine Auswahl im oberen Men\u00FC");
		lblTreffenSieEine.setBounds(113, 137, 216, 14);
		add(lblTreffenSieEine);

	}
}
