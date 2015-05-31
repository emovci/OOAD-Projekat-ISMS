package vektori;

import java.util.Vector;
import klase.Naredba_za_vozaca;
public class Naredba_za_vozaca_vektor 
{
	private Vector <Naredba_za_vozaca> naredbe;
	
	public Vector <Naredba_za_vozaca> get_naredbe ()
	{
			return naredbe;
	}
	public void dodaj_naredbu (Naredba_za_vozaca naredba)
	{
			naredbe.addElement(naredba);
			
	}
	public void ukloni_naredbu (int redni_broj)
	{
			naredbe.removeElement(redni_broj);
	}
}

