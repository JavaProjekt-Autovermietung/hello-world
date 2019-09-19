package Autovermietung;

import com.github.lgooddatepicker.components.DatePicker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuKeyListener;

import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.CardLayout; 
import java.awt.FlowLayout;
import com.github.lgooddatepicker.components.DateTimePicker;

public class Hauptprogramm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptprogramm window = new Hauptprogramm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hauptprogramm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		FahrzeugPanel fahrzeugPanel = new FahrzeugPanel();
		frame.getContentPane().add(fahrzeugPanel, "FahrzeugPanel");

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnTest = new JMenu("Test");
		mnTest.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent e) {
			}
			public void menuKeyReleased(MenuKeyEvent e) {
			}
			public void menuKeyTyped(MenuKeyEvent e) {
			}
		});
		menuBar.add(mnTest);
		
		JMenuItem mntmBla = new JMenuItem("bla");
		mntmBla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnTest.add(mntmBla);
		
		JMenuItem mntmBla_1 = new JMenuItem("bla2");
		mntmBla_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnTest.add(mntmBla_1);
		
		JMenuItem mntmAsfs = new JMenuItem("Fahrzeug");
		mntmAsfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)frame.getContentPane().getLayout()).show(frame.getContentPane(), "FahrzeugPanel");
			}
		});
		
		JMenu mnNochEins = new JMenu("noch eins");
		menuBar.add(mnNochEins);
		
		JMenuItem mntmEinUnterpunkt = new JMenuItem("ein Unterpunkt");
		mntmEinUnterpunkt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNochEins.add(mntmEinUnterpunkt);
		menuBar.add(mntmAsfs);		
	}
}
