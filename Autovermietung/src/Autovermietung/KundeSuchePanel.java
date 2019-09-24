package Autovermietung;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import java.awt.Choice;
import java.awt.List;

public class KundeSuchePanel extends JPanel {
	private Hauptprogramm hauptprogramm;

	/**
	 * Create the panel.
	 */
	public KundeSuchePanel(Hauptprogramm haupt) {
		hauptprogramm = haupt;
		setLayout(null);
		
		JLabel lblKunde = new JLabel("Kunde");
		lblKunde.setBounds(183, 45, 104, 29);
		lblKunde.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblKunde);
		
		JLabel lblNewLabel = new JLabel("KdNr. 2178934728 Max Mustermann, Irgendwo 23, 12345 Berlin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 103, 450, 14);
		add(lblNewLabel);
		
		JButton button = new JButton("L\u00F6schen");
		button.setBounds(98, 128, 78, 23);
		add(button);
		
		JButton btnndern = new JButton("\u00C4ndern");
		btnndern.setBounds(187, 128, 71, 23);
		add(btnndern);
		
		JButton btnFahrzeug = new JButton("KFZ");
		btnFahrzeug.setBounds(261, 128, 71, 23);
		add(btnFahrzeug);
		
		Choice choice = new Choice();
		choice.setBounds(146, 233, 141, 20);
		add(choice);
		choice.add("Sortieren nach...");
		choice.add("Name");
		choice.add("Kundennummer");
		choice.add("Adresse");
		choice.add("Ort");
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
