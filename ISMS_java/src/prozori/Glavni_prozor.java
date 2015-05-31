package prozori;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Vector;

import vektori.Gen_radnik_vektor;
import vektori.Kamion_vektor;
import vektori.Klijent_vektor;
import vektori.Naredba_za_radnika_vektor;
import vektori.Naredba_za_vozaca_vektor;
import vektori.Ugovor_vektor;
import vektori.Vrste_robe_vektor;
import klase.Datum;
import klase.Kamion;
import klase.Naredba_za_vozaca;
import klase.Skladiste;
import prozori.Skladiste_prozor;
import klase.Vozac;


public class Glavni_prozor 

{

	public static Gen_radnik_vektor radnici=new Gen_radnik_vektor();
	public static Kamion_vektor kamioni=new Kamion_vektor();
	public static Klijent_vektor klijenti=new Klijent_vektor();
	public static Naredba_za_radnika_vektor radnicke_naredbe= new Naredba_za_radnika_vektor();
	public static Naredba_za_vozaca_vektor vozacke_naredbe= new Naredba_za_vozaca_vektor();
	public static Ugovor_vektor ugovori=new Ugovor_vektor();
	public static Vrste_robe_vektor vrste_robe=new Vrste_robe_vektor();
	public static Skladiste skladiste=new Skladiste();
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
						Glavni_prozor window = new Glavni_prozor();
						window.frame.setVisible(true);
					} 
				catch (Exception e) 
					{
						e.printStackTrace();
					}
				
			}
		});

		
		Vector<Naredba_za_vozaca> test=new Vector<Naredba_za_vozaca>();
		test.addElement(new Naredba_za_vozaca());
		
		Vozac vozac1=null;
		try{vozac1 = new Vozac ("Suad","Krilaševiæ",new Datum (12,02,2015,0,0), true, new Integer (1),new Double(300.3),test,new Kamion("kam",1,1,1,1,1,true));}
		catch( InterruptedException izuzetak) {};
		
		Vozac vozac2=null;
		try{vozac2 = new Vozac ("Senad","Krilaševiæ",new Datum (12,02,2015,0,0), true, new Integer (1),new Double(300.3),test,new Kamion("kam",1,1,1,1,1,true));}
		catch( InterruptedException izuzetak) {};
		
		radnici.dodaj_radnika(vozac1);
		radnici.dodaj_radnika(vozac2);
		
	}

	/**
	 * Create the application.
	 */
	public Glavni_prozor() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDemoVerzijaIzaberire = new JLabel("Demo verzija. Izaberire \u017Eeljenu perspektivu");
		lblDemoVerzijaIzaberire.setBounds(155, 38, 336, 29);
		frame.getContentPane().add(lblDemoVerzijaIzaberire);
		
		JButton btnNewButton = new JButton("Supervizor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				Supervizor np= new Supervizor();
				np.novi_prozor();
			}
		});
		btnNewButton.setBounds(29, 101, 203, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnVoza = new JButton("Voza\u010D");
		btnVoza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 			
			{
				Vozac_prozor np= new Vozac_prozor();
				np.novi_prozor();
			}
		});
		btnVoza.setBounds(29, 214, 203, 59);
		frame.getContentPane().add(btnVoza);
		
		JButton btnef = new JButton("\u0160ef");
		btnef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
					Skladiste_prozor np= new Skladiste_prozor();
					np.novi_prozor();
			}
		});
		btnef.setBounds(276, 101, 203, 59);
		frame.getContentPane().add(btnef);
		
		JButton btnRadnik = new JButton("Radnik");
		btnRadnik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Radnik np= new Radnik();
				np.novi_prozor();
			}
		});
		btnRadnik.setBounds(276, 214, 203, 59);
		frame.getContentPane().add(btnRadnik);
	}
}
