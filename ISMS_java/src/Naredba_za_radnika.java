import java.util.Vector;

public class Naredba_za_radnika {

	private Vector<Roba> roba_za_premjestanje;
	private Datum vrijeme_za_premjestanje;
	private boolean naredba_prihvacena;
	private boolean naredba_izvrsena;

	public Naredba_za_radnika(Vector<Roba> roba, Datum vrijeme, boolean prihvacena, boolean izvrsena)
	{
			this.roba_za_premjestanje=roba;
			this.vrijeme_za_premjestanje=vrijeme;
			this.naredba_prihvacena=prihvacena;
			this.naredba_izvrsena=izvrsena;
	}
	
	public Naredba_za_radnika(Vector<Roba> roba, Datum vrijeme, boolean prihvacena)
	{
			this.roba_za_premjestanje=roba;
			this.vrijeme_za_premjestanje=vrijeme;
			this.naredba_prihvacena=prihvacena;
			this.naredba_izvrsena=false;
	}
	
	public Naredba_za_radnika(Vector<Roba> roba, Datum vrijeme)
	{
			this.roba_za_premjestanje=roba;
			this.vrijeme_za_premjestanje=vrijeme;
			this.naredba_prihvacena=false;
			this.naredba_izvrsena=false;
	}
	
	public void set_naredba_prihvacena(boolean prihvacenost) 
	{
			this.naredba_prihvacena=prihvacenost;
	}

	public void set_naredba_izvrsena(boolean zavrsenost) 
	{
			this.naredba_izvrsena=zavrsenost;
	}


	public void set_roba_za_premjestanje(Vector<Roba> roba)
	{
			this.roba_za_premjestanje=roba; 
	}
	
	public boolean get_naredba_prihvacena() 
	{
			return this.naredba_prihvacena;
	}
	
	public boolean get_naredba_izvrsena() 
	{
			return this.naredba_izvrsena;
	}

	public Datum get_vrijeme_za_premjestanje() 
	{
			return this.vrijeme_za_premjestanje;
	}

	public Vector<Roba> get_roba_za_premjestanje() 
	{
			return this.roba_za_premjestanje;
	}

	public void dodaj_robu(Roba roba)
	{
			this.roba_za_premjestanje.addElement(roba);
	}

	
	public void uklonu_robu(int red_br_robe)
	{
			this.roba_za_premjestanje.remove(red_br_robe);
	}

	public double cijena_naredbe() 
	{
			throw new UnsupportedOperationException();
	}

}