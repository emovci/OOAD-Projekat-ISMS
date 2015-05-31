package klase;
import java.util.*;
import java.util.Vector;
public class Radnik extends Generalisani_radnik 
{

	private Vector <Naredba_za_radnika> trenutna_naredba =new Vector <Naredba_za_radnika> ();

	public Vector <Naredba_za_radnika> get_trenutna_naredba() 
	{
			return this.trenutna_naredba;
	}

	public void set_trenutna_naredba(Vector <Naredba_za_radnika> nove_naredbe) 
	{
			this.trenutna_naredba=nove_naredbe;
	}

	public void dodaj_naredbu (Naredba_za_radnika naredba)
	{
			this.trenutna_naredba.addElement(naredba);
	}
	public void ukloni_naredbu (int redni_broj)
	{
			this.trenutna_naredba.remove(redni_broj);
	}
	public int vrsta_radnika()
	{
		return 1;
	}
}