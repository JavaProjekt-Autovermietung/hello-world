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

public class KundeSuche extends JPanel {

	/**
	 * Create the panel.
	 */
	public KundeSuche() {
		setLayout(null);
		
		JLabel lblKunde = new JLabel("Kunde");
		lblKunde.setBounds(183, 45, 104, 29);
		lblKunde.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add(lblKunde);
		
		JLabel lblNewLabel = new JLabel("KdNr. 2178934728 Max Mustermann, Irgendwo 23, 12345 Berlin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 103, 450, 14);
		add(lblNewLabel);
		
		JMenu mnSortierenNach = new JMenu("Sortieren nach");
		mnSortierenNach.setBounds(140, 218, 133, 26);
		add(mnSortierenNach);
		
		JMenuItem mntmKundennummer = new JMenuItem("Kundennummer");
		mnSortierenNach.add(mntmKundennummer);
		
		JMenuItem mntmRechnungsnummer = new JMenuItem("Rechnungsnummer");
		mnSortierenNach.add(mntmRechnungsnummer);
		
		JMenuItem mntmPreis = new JMenuItem("Preis");
		mnSortierenNach.add(mntmPreis);
		
		JMenuItem mntmAusleihdauer = new JMenuItem("Ausleihdauer");
		mnSortierenNach.add(mntmAusleihdauer);
		
		JButton button = new JButton("L\u00F6schen");
		button.setBounds(112, 128, 71, 23);
		add(button);
		
		JButton btnndern = new JButton("\u00C4ndern");
		btnndern.setBounds(187, 128, 71, 23);
		add(btnndern);
		
		JButton btnFahrzeug = new JButton("KFZ");
		btnFahrzeug.setBounds(261, 128, 71, 23);
		add(btnFahrzeug);
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
