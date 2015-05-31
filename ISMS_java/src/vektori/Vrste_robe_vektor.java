package vektori;

import java.util.Vector;
import klase.Vrsta_robe;
public class Vrste_robe_vektor
{
	private Vector <Vrsta_robe> roba;

	
	public Vector <Vrsta_robe> get_roba ()
	{
			return roba;
	}
	public void dodaj_robu (Vrsta_robe roba1)
	{
			roba.addElement(roba1);
			
	}
	public void ukloni_robu (int redni_broj)
	{
			roba.remove(redni_broj);
	}
}

