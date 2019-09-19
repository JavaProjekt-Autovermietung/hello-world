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

public class RechnungSuche extends JPanel {
	private JFrame frame;

	/**
	 * Create the panel.
	 */
	public RechnungSuche(JFrame frame) {
		this.frame = frame;
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
