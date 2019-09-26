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

	//Konstanten für Panel Namen (statt Strings)
	static final String StartPanel = "StartPanel";
	static final String RechnungSuche = "RechnungSuche";
	static final String RechnungErstellen = "RechnungErstellen";
	static final String RechnungPanel = "RechnungPanel";
	static final String RechnungenAusgabe = "RechnungenAusgabe";
	static final String RechnungAusgabe = "RechnungAusgabe";
	static final String FahrzeugPanel = "FahrzeugPanel";
	static final String KundePanel = "KundePanel";
	static final String KundeErstellen = "KundeErstellen";
	static final String KundeSuche = "KundeSuche";
	static final String KundenAusgabePanel = "KundenAusgabePanel";
	static final String FahrzeugeAusgabePanel = "FahrzeugeAusgabePanel";
	static final String FahrzeugHinzufuegenPanel = "FahrzeugHinzufuegenPanel";
	static final String FahrzeugSuchenPanel = "FahrzeugSuchenPanel";
	static final String FahrzeugBuchenPanel = "FahrzeugBuchenPanel";
	static final String FahrzeugReservierenPanel = "FahrzeugReservierenPanel";	
	static final String EinFahrzeugAusgabePanel = "EinFahrzeugAusgabePanel";

	private RechnungsListe rechnungsListe = new RechnungsListe();
	private FahrzeugListe fahrzeugListe = new FahrzeugListe();
	
	//Panel
	private JFrame frame;
	private RechnungenAusgabePanel rechnungenAusgabePanel;
	private RechnungAusgabePanel rechnungAusgabePanel;
	
	FahrzeugeAusgabePanel fahrzeugeAusgabePanel;
	FahrzeugReservierenPanel fahrzeugReservierenPanel;
	
	EinFahrzeugAusgabePanel einFahrzeugAusgabePanel;
	
	JFrame getFrame() 
	  { 
		return frame;
	  }
	RechnungsListe getRechnungsListe() 
	  { return rechnungsListe;
	  }
	
	FahrzeugListe getFahrzeugListe ()
	  { 
		return fahrzeugListe; 
	  }
	
	FahrzeugeAusgabePanel getFahrzeugAusgabePanel() 
	  { 
		return fahrzeugeAusgabePanel; 
	  }
	
	EinFahrzeugAusgabePanel getEinFahrzeugAusgabePanel() 
	  { 
		return einFahrzeugAusgabePanel; 
	  }
	
	FahrzeugReservierenPanel getFahrzeugReservierenPanel()
	{
		return fahrzeugReservierenPanel;
	}
	
	RechnungAusgabePanel getRechnungAusgabePanel()
	{
		return rechnungAusgabePanel;
	}
	
	void show(String PanelName)
	{
		((CardLayout)getFrame().getContentPane().getLayout()).show(getFrame().getContentPane(), PanelName);
	}

	//Launch the application.
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


//Create the application.

	public Hauptprogramm() {
		initialize();
	}

	//Initialize the contents of the frame.

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
	//Alle einzelnen Panels so aufrufen
		
		StartPanel startPanel = new StartPanel(this);
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
		
		rechnungAusgabePanel = new RechnungAusgabePanel(this);
		frame.getContentPane().add(rechnungAusgabePanel, RechnungAusgabe);
		
		rechnungenAusgabePanel = new RechnungenAusgabePanel(this);
		frame.getContentPane().add(rechnungenAusgabePanel, RechnungenAusgabe);
		
		FahrzeugPanel fahrzeugPanel = new FahrzeugPanel(this);
		frame.getContentPane().add(fahrzeugPanel, FahrzeugPanel);
		
		
		FahrzeugHinzufuegenPanel fahrzeugHinzufuegenPanel = new FahrzeugHinzufuegenPanel(this);
		frame.getContentPane().add(fahrzeugHinzufuegenPanel, FahrzeugHinzufuegenPanel);
		
		FahrzeugSuchenPanel fahrzeugSuchenPanel = new FahrzeugSuchenPanel(this);
		frame.getContentPane().add(fahrzeugSuchenPanel, FahrzeugSuchenPanel);

		EinFahrzeugAusgabePanel einFahrzeugAusgabePanel = new EinFahrzeugAusgabePanel(this);
		frame.getContentPane().add(einFahrzeugAusgabePanel, EinFahrzeugAusgabePanel);

		FahrzeugBuchenPanel fahrzeugBuchenPanel = new FahrzeugBuchenPanel(this);
		frame.getContentPane().add(fahrzeugBuchenPanel, FahrzeugBuchenPanel);
		
	//als Member
		fahrzeugeAusgabePanel = new FahrzeugeAusgabePanel(this);
		frame.getContentPane().add(fahrzeugeAusgabePanel, FahrzeugeAusgabePanel);
		
		einFahrzeugAusgabePanel = new EinFahrzeugAusgabePanel(this);
		frame.getContentPane().add(einFahrzeugAusgabePanel, EinFahrzeugAusgabePanel);
		
		fahrzeugReservierenPanel = new FahrzeugReservierenPanel(this);
		frame.getContentPane().add(fahrzeugReservierenPanel, FahrzeugReservierenPanel);

	
	//Menue Reiter
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmRechnung = new JMenuItem("Rechnung");
		mntmRechnung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(RechnungPanel);
			}
		});
		menuBar.add(mntmRechnung);
		
		JMenuItem mntmFahrzeug = new JMenuItem("Fahrzeug");
		mntmFahrzeug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(FahrzeugPanel);
			}
		});
		menuBar.add(mntmFahrzeug);
		
		JMenuItem mntmKunde = new JMenuItem("Kunde");
		mntmKunde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(KundePanel);
			}
		});
		menuBar.add(mntmKunde);
		
//Zum testen der Tabelle
		for (int i = 0; i < 1; i++)
		{
			fahrzeugListe.hinzufuegen("B ML-1234",Fahrzeug.FahrzeugTyp.Cabrio, Fahrzeug.FahrzeugHersteller.Skoda, "Octavia", Fahrzeug.FahrzeugKlasse.Kleinwagen);
			fahrzeugListe.hinzufuegen("D MT-123",Fahrzeug.FahrzeugTyp.Kombi, Fahrzeug.FahrzeugHersteller.VW, "Golf", Fahrzeug.FahrzeugKlasse.Mittelklasse);
		}
		
		fahrzeugListe.Datumsetzen();
		
	}
}
