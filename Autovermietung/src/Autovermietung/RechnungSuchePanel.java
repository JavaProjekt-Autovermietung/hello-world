package Autovermietung;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Choice;

public class RechnungSuchePanel extends JPanel {
	private Hauptprogramm hauptprogramm;

	/**
	 * Create the panel.
	 */
	public RechnungSuchePanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);

		JLabel lblRechnung = new JLabel("Rechnung");
		lblRechnung.setBounds(169, 45, 104, 29);
		lblRechnung.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblRechnung);
		
		JLabel lblNewLabel = new JLabel("KdNr. 23123123 | RNr: 12345 | \u00DCberweisung | 45,99\u20AC | 6 Tage");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 103, 450, 14);
		add(lblNewLabel);
		
		JButton btnRechnungLoeschen = new JButton("L\u00F6schen");
		btnRechnungLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRechnungLoeschen.setBounds(113, 125, 104, 23);
		add(btnRechnungLoeschen);
		
		JButton btnRechnungAendern = new JButton("\u00C4ndern");
		btnRechnungAendern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRechnungAendern.setBounds(229, 125, 104, 23);
		add(btnRechnungAendern);
		
		Choice choice = new Choice();
		choice.setBounds(146, 227, 154, 20);
		add(choice);
		choice.add("Sortieren nach...");
		choice.add("Kundennummer");
		choice.add("Rechnungsnummer");
		choice.add("Preis");
		choice.add("Ausleihdauer");
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
