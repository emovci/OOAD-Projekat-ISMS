package prozori;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;


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
import klase.Naredba_za_radnika;
import klase.Skladiste;
import prozori.Skladiste_prozor;
import klase.Vozac;
import klase.Roba;

import javax.swing.JOptionPane;

import klase.Radnik;
import klase.Ugovor;
import klase.Klijent;
import klase.Vrsta_robe;

import javax.swing.JComboBox;

import com.jgoodies.forms.factories.DefaultComponentFactory;


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
		Vector<Naredba_za_radnika> test1=new Vector<Naredba_za_radnika>();
		//test1.addElement(new Naredba_za_radnika(new Vector<Roba>(),new Datum (12,12,2015,1,1),true,true));
		
		Vozac vozac1=null;
		try{vozac1 = new Vozac ("Suad","Krila�evi�",new Datum (12,02,2015,0,0), true, new Integer (1),new Double(300.3),test,new Kamion("kam",1,1,1,1,1,true));}
		catch( InterruptedException izuzetak) {};
		
		Vozac vozac2=null;
		try{vozac2 = new Vozac ("Senad","Krila�evi�",new Datum (12,02,2015,0,0), true, new Integer (1),new Double(300.3),test,new Kamion("kam",1,1,1,1,1,true));}
		catch( InterruptedException izuzetak) {};
		
		radnici.dodaj_radnika(vozac1);
		radnici.dodaj_radnika(vozac2);
		
		try{radnici.dodaj_vozaca("Emir","Hasanovi�",new Datum (22,9,2015,0,0), true, new Double(300.3),test,new Kamion("kam",1,1,1,1,1,true));}
		catch( InterruptedException izuzetak) {};
		
		try{radnici.dodaj_radnika("Niko","Niki�",new Datum (25,9,2015,0,0), true, new Double(300.3),test1);}
		catch( InterruptedException izuzetak) {};
		
		//JOptionPane.showMessageDialog(null, ""+radnici.get_radnike().elementAt(3).get_ime());
		
		Ugovor ugovor1=null;
		Roba roba=null;
		try{roba=new Roba(new Vrsta_robe("Drvo",1000,10000),1000,10);}
		catch( InterruptedException izuzetak) {};
		
		Vector<Roba> v=new Vector<Roba>();
		v.addElement(roba);
		
		Naredba_za_radnika naredba=null;
		try{naredba = new Naredba_za_radnika(v,new Datum (12,02,2015,0,0),false,false);}
		catch( InterruptedException izuzetak) {};
		
		Vector<Naredba_za_radnika> naredba_prvi_radnik= new Vector<Naredba_za_radnika>();
		naredba_prvi_radnik.addElement(naredba);
		naredba_prvi_radnik.addElement(naredba);
		//radnicke_naredbe.dodaj_naredbu(naredba);
		
		
		Radnik radnik1=null;
		try{radnik1 = new Radnik ("Semir","Berkovic",new Datum (12,02,2015,0,0), true, new Integer (3),new Double(300.3),naredba_prvi_radnik);}
		catch( InterruptedException izuzetak) {};
		
		Radnik radnik2=null;
		try{radnik2 = new Radnik ("Emir","Hasanovic",new Datum (12,02,2015,0,0), true, new Integer (4),new Double(300.3));}
		catch( InterruptedException izuzetak) {};
		
		radnici.dodaj_radnika(radnik1);
		radnici.dodaj_radnika(radnik2);
		
		
		Klijent klijent=new Klijent("FDS d.o.o.",v);
		try{ugovor1 = new Ugovor (new Datum (1,1,2015,0,0),new Datum (1,1,2018,0,0),klijent,true,true,v);}
		catch( InterruptedException izuzetak) {};
		ugovori.dodaj_ugovor(ugovor1);
		
		Klijent klijent2=new Klijent("Opsasa h.o.h.o.",v);
		klijenti.dodaj_klijenta(klijent);
		klijenti.dodaj_klijenta(klijent2);
		//if (radnici.get_radnike().get(3).get_trenutna_naredba()==naredba_prvi_radnik) JOptionPane.showMessageDialog(null, "uspjelo");
		//else JOptionPane.showMessageDialog(null, "nije uspjelo");
		
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
		frame.setBounds(100, 100, 516, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		Vector <String> niz1 = new Vector <String>();
		Vector <String> niz2 = new Vector <String>();
		
		for(int i=0; i<Glavni_prozor.radnici.get_radnike().size(); i++)
		{
			if(Glavni_prozor.radnici.get_radnike().get(i).get_vrsta_radnika()==0)
				niz1.addElement(Glavni_prozor.radnici.get_radnike().get(i).get_id()+"");
			else
				niz2.addElement(Glavni_prozor.radnici.get_radnike().get(i).get_id()+"");
		}
		
		JComboBox comboBox = new JComboBox(niz2);
		comboBox.setBounds(276, 273, 203, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(niz1);
		comboBox_1.setBounds(29, 273, 203, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblIdVozaa = DefaultComponentFactory.getInstance().createLabel("ID voza\u010Da");
		lblIdVozaa.setBounds(29, 248, 162, 14);
		frame.getContentPane().add(lblIdVozaa);
		
		JLabel lblIdRadnika = DefaultComponentFactory.getInstance().createLabel("ID radnika");
		lblIdRadnika.setBounds(276, 248, 92, 14);
		frame.getContentPane().add(lblIdRadnika);
		
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
		btnVoza.setBounds(29, 171, 203, 59);
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
				int id=Integer.parseInt((String) comboBox.getSelectedItem());
				prozori.Radnik_prozor.novi_prozor(id);
			}
		});
		btnRadnik.setBounds(276, 171, 203, 59);
		frame.getContentPane().add(btnRadnik);
		
		
		
	}
}
