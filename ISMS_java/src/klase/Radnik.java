package klase;
import java.util.*;
public class Radnik extends Generalisani_radnik 
{

	private Vector <Naredba_za_radnika> trenutna_naredba =new Vector <Naredba_za_radnika> ();
	
	public Radnik (String ime, String prezime, Datum datum_rodjenja, boolean status, int id, double plata_dnevnica, Vector <Naredba_za_vozaca> trenutna_naredba, Kamion kamion )
	{
			this.set_Ime(ime);
			this.set_prezime(prezime);
			this.set_datum_rodjenja(datum_rodjenja);
			this.set_status(status);
			this.set_id(id);
			this.set_plata_dnevnica(plata_dnevnica);
			
		
	}
	
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
	public int get_vrsta_radnika()
	{
		return 1;
	}
}