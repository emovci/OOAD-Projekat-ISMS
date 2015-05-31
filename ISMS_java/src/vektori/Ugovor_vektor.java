package vektori;

import java.util.Vector;
import klase.Ugovor;
public class Ugovor_vektor 
{
	private Vector <Ugovor> ugovori ;
	
	public Vector <Ugovor> get_ugovori ()
	{
			return ugovori;
	}
	public void dodaj_ugovor (Ugovor ugovor)
	{
			ugovori.addElement(ugovor);
			
	}
	public void ukloni_ugovor (int redni_broj)
	{
			ugovori.removeElement(redni_broj);
	}
}

