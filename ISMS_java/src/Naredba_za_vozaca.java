import java.util.Vector;
public class Naredba_za_vozaca 
{
	private Vector <Ruta> rute= new Vector <Ruta> ();
	private Datum vrijeme_polaska;
	private Datum vrijeme_dolaska;
	private boolean naredba_prihvacena;
	private boolean naredba_izvrsena;
	
	//mislim da æemo ovdje morati konstruktor pravit. Ustvari trebat æemo pravit konstruktor u svakoj klasi sa datumom
	public void set_naredba_prihvacena(boolean prihvacenost) 
	{
			this.naredba_prihvacena=prihvacenost;
	}

	public boolean get_naredba_prihvacena() 
	{
			return(this.naredba_prihvacena);
	}

	public Vector <Ruta> get_rute() 
	{
			return (this.rute);
	}


	public void set_rute(Vector <Ruta> rute) 
	{
			this.rute=rute;
	}

	
	public void dodaj_rutu(Ruta ruta) 
	{
			rute.addElement(ruta);
	}

	
	public void ukloni_rutu(int red_broj_rute) 
	{
			if(red_broj_rute <0 || red_broj_rute>this.rute.size())
					throw new UnsupportedOperationException();
			this.rute.remove(red_broj_rute-1);
	}

	public boolean provjeri_optimalnost()
	{
			//treba razradit
			throw new UnsupportedOperationException();
	}

	public void razlozi_neoptimalnosti() 
	{
			//treba razradit
			throw new UnsupportedOperationException();
	}


	public void set_neke_rute_zavrsene(Vector <Integer> broj_ruta)
	{
			for(int i=0; i<broj_ruta.size(); i++)
					this.rute.get(broj_ruta.get(i)).set_ruta_zavrsena(true);
			//throw new UnsupportedOperationException();
	}

	public void set_naredba_zavrsena(boolean završenost) 
	{
			this.naredba_izvrsena=završenost;
	}

	public boolean get_naredba_zavrsena() 
	{
			return (this.naredba_izvrsena);
	}

	public Datum get_vrijeme_polaska() 
	{
			return this.vrijeme_polaska;
	}

	public Datum get_vrijeme_dolaska() 
	{
			return this.vrijeme_dolaska;
	}

	public double cijena_naredbe()
	{
			double cijena=0;
			for(int i=0; i< this.rute.size(); i++)
			{
				cijena=cijena +this.rute.get(i).get_cijena_rute();
			}
			return cijena;
			//throw new UnsupportedOperationException();
	}
}
