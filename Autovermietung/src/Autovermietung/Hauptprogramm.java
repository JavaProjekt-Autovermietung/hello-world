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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.CardLayout; 
import java.awt.FlowLayout;
import com.github.lgooddatepicker.components.DateTimePicker;
import java.awt.Button;
import javax.swing.JButton;

public class Hauptprogramm {
	
	//Konstante für Panel Namen
	static final String StartPanel = "StartPanel";
	static final String RechnungSuche = "RechnungSuche";
	static final String RechnungErstellen = "RechnungErstellen";
	static final String RechnungPanel = "RechnungPanel";
	static final String FahrzeugPanel = "FahrzeugPanel";
	static final String KundePanel = "KundePanel";
	static final String KundeErstellen = "KundeErstellen";
	static final String KundeSuche = "KundeSuche";
<<<<<<< HEAD
<<<<<<< HEAD
	static final String RechnungenAusgabe = "RechnungenAusgabe";
=======
	static final String FahrzeugeAusgabePanel = "FahrzeugeAusgabePanel";
>>>>>>> branch 'master' of https://github.com/JavaProjekt-Autovermietung/hello-world.git
=======
	static final String FahrzeugeAusgabePanel = "FahrzeugeAusgabePanel";
>>>>>>> branch 'master' of https://github.com/JavaProjekt-Autovermietung/hello-world.git
	
	private RechnungsListe rechnungsListe = new RechnungsListe();
	private FahrzeugListe fahrzeugListe = new FahrzeugListe();
	

	private JFrame frame;
<<<<<<< HEAD
<<<<<<< HEAD
	private RechnungenAusgabePanel rechnungenAusgabePanel;
=======
	FahrzeugeAusgabePanel fahrzeugeAusgabePanel;
>>>>>>> branch 'master' of https://github.com/JavaProjekt-Autovermietung/hello-world.git
=======
	FahrzeugeAusgabePanel fahrzeugeAusgabePanel;
>>>>>>> branch 'master' of https://github.com/JavaProjekt-Autovermietung/hello-world.git
	
	JFrame getFrame() { return frame; }
	RechnungsListe getRechnungsListe() { return rechnungsListe; }
<<<<<<< HEAD
<<<<<<< HEAD
	RechnungenAusgabePanel getRechnungAusgabePanel() { return rechnungenAusgabePanel; }
=======
	
	FahrzeugListe getFahrzeugListe () { return fahrzeugListe; }
	
	FahrzeugeAusgabePanel getFahrzeugAusgabePanel() { return fahrzeugeAusgabePanel; }
>>>>>>> branch 'master' of https://github.com/JavaProjekt-Autovermietung/hello-world.git
=======
	
	FahrzeugListe getFahrzeugListe () { return fahrzeugListe; }
	
	FahrzeugeAusgabePanel getFahrzeugAusgabePanel() { return fahrzeugeAusgabePanel; }
>>>>>>> branch 'master' of https://github.com/JavaProjekt-Autovermietung/hello-world.git

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptprogramm window = new Hauptprogramm();
					window.frame.setVisible(true);
					} 
				catch (Exception e) {
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
		frame.setResizable(false);
		frame.setBounds(100, 100, 458, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		//Alle einzelnen Panels so aufrufen
		
		StartPanel startPanel = new StartPanel(this);
		//frame.getContentPane().add(startPanel, RechnungPanel);
		frame.getContentPane().add(startPanel, StartPanel);
		
		RechnungPanel rechnungPanel = new RechnungPanel(this);
		frame.getContentPane().add(rechnungPanel, RechnungPanel);
		
		RechnungErstellenPanel rechnungErstellen = new RechnungErstellenPanel(this);
		frame.getContentPane().add(rechnungErstellen, RechnungErstellen);
		
		RechnungSuchePanel rechnungSuche = new RechnungSuchePanel(this);
		frame.getContentPane().add(rechnungSuche, RechnungSuche);
		
		KundePanel kundePanel = new KundePanel(this);
		frame.getContentPane().add(kundePanel, KundePanel);
		
		KundeErstellenPanel kundeErstellen = new KundeErstellenPanel(this);
		frame.getContentPane().add(kundeErstellen, KundeErstellen);
		
		KundeSuchePanel kundeSuche = new KundeSuchePanel(this);
		frame.getContentPane().add(kundeSuche, KundeSuche);
		
<<<<<<< HEAD
<<<<<<< HEAD
		rechnungenAusgabePanel = new RechnungenAusgabePanel(this);
		frame.getContentPane().add(rechnungenAusgabePanel, RechnungenAusgabe);
		
=======
		FahrzeugPanel fahrzeugPanel = new FahrzeugPanel(this);
		frame.getContentPane().add(fahrzeugPanel, FahrzeugPanel);
		
		//Member
		fahrzeugeAusgabePanel = new FahrzeugeAusgabePanel(this);
		frame.getContentPane().add(fahrzeugeAusgabePanel, FahrzeugeAusgabePanel);
		
		
		
		
		//Menue Reiter
>>>>>>> branch 'master' of https://github.com/JavaProjekt-Autovermietung/hello-world.git
=======
		FahrzeugPanel fahrzeugPanel = new FahrzeugPanel(this);
		frame.getContentPane().add(fahrzeugPanel, FahrzeugPanel);
		
		//Member
		fahrzeugeAusgabePanel = new FahrzeugeAusgabePanel(this);
		frame.getContentPane().add(fahrzeugeAusgabePanel, FahrzeugeAusgabePanel);
		
		
		
		
		//Menue Reiter
>>>>>>> branch 'master' of https://github.com/JavaProjekt-Autovermietung/hello-world.git
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmRechnung = new JMenuItem("Rechnung");
		mntmRechnung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)getFrame().getContentPane().getLayout()).show(getFrame().getContentPane(), RechnungPanel);
			}
		});
		menuBar.add(mntmRechnung);
		
		JMenuItem mntmFahrzeug = new JMenuItem("Fahrzeug");
		mntmFahrzeug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)getFrame().getContentPane().getLayout()).show(getFrame().getContentPane(), FahrzeugPanel);
			}
		});
		menuBar.add(mntmFahrzeug);
		
		JMenuItem mntmKunde = new JMenuItem("Kunde");
		mntmKunde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)getFrame().getContentPane().getLayout()).show(getFrame().getContentPane(), KundePanel);
			}
		});
		menuBar.add(mntmKunde);
		
		//((CardLayout)getFrame().getContentPane().getLayout()).show(getFrame().getContentPane(), FahrzeugeAusgabePanel);
		
/*		ArrayList<Fahrzeug> temp = new ArrayList <Fahrzeug>();
		for (int i = 0; i < 100; i++)
		{
			Fahrzeug f = new Fahrzeug ("B ML-1234",Fahrzeug.FahrzeugTyp.Cabrio, Fahrzeug.FahrzeugHersteller.Skoda, "Octavia", Fahrzeug.FahrzeugKlasse.Kleinwagen);
			Fahrzeug f2 = new Fahrzeug ("D MT-123",Fahrzeug.FahrzeugTyp.Kombi, Fahrzeug.FahrzeugHersteller.VW, "Golf", Fahrzeug.FahrzeugKlasse.Mittelklasse);		
					temp.add(f);
					temp.add(f2);
		}
		fahrzeugeAusgabePanel.setData (temp);*/
	}
}
