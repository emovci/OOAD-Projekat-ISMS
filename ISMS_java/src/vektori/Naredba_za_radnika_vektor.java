package vektori;

import java.util.Vector;
import klase.Naredba_za_radnika;

public class Naredba_za_radnika_vektor 
{
	private Vector <Naredba_za_radnika> naredbe ;

	public Vector <Naredba_za_radnika> get_naredbe ()
	{
			return naredbe ;
	}
	public void dodaj_naredbu (Naredba_za_radnika naredba)
	{
			naredbe.addElement(naredba);
			
	}
	public void ukloni_naredbu (int redni_broj)
	{
			naredbe.remove(redni_broj);
	}
}

