package vektori;

import java.util.Vector;
import klase.Klijent;

public class Klijent_vektor 
	{
		private Vector <Klijent> klijenti = new Vector <Klijent>();
		
		public Vector <Klijent> get_klijenti ()
		{
				return klijenti;
		}
		public void dodaj_klijenta (Klijent klijent)
		{
				klijenti.addElement(klijent);
				
		}
		public void ukloni_klijenta (int redni_broj)
		{
				klijenti.remove(redni_broj);
		}
	}

