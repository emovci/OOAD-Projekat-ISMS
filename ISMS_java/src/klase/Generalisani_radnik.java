package klase;

import java.util.Vector;
public abstract class Generalisani_radnik extends Osoba {

	private boolean status;
	private int id;
	private double plata_dnevnica;

	public boolean get_status() 
	{
			return this.status;
	}

	public void set_status(boolean status) 
	{
			this.status=status;
	}
	
	public void set_plata_dnevnica(double plata)
	{
			this.plata_dnevnica=plata;
	}

	public double get_plata_dnevnica()
	{
			return this.plata_dnevnica;
	}

	public int get_id()
	{
			return this.id;
	}
	public void set_id(int id)
	{
			this.id=id;
	}
	public String prikaz_radnika ()
	{
			return this.get_ime()+" "+this.get_prezime()+" ("+this.id+")";
	}
	public abstract int get_vrsta_radnika();
	public abstract Vector<Naredba_za_radnika> get_trenutna_naredba_r ();
	public abstract Vector<Naredba_za_vozaca> get_trenutna_naredba ();

}