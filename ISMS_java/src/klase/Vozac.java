package klase;
import java.util.*;

public class Vozac extends Generalisani_radnik {

	private Vector <Naredba_za_vozaca> trenutna_naredba=new Vector <Naredba_za_vozaca> ();
	private Kamion kamion;

	public Vozac (String ime, String prezime, Datum datum_rodjenja, boolean status, int id, double plata_dnevnica, Vector <Naredba_za_vozaca> trenutna_naredba, Kamion kamion )
	{
			this.set_Ime(ime);
			this.set_prezime(prezime);
			this.set_datum_rodjenja(datum_rodjenja);
			this.set_status(status);
			this.set_id(id);
			this.set_plata_dnevnica(plata_dnevnica);
			this.trenutna_naredba=trenutna_naredba;
			this.kamion=kamion;		
		
	}
	public Vector <Naredba_za_vozaca> get_trenutna_naredba() 
	{
			return this.trenutna_naredba;
	}

	public void set_trenutna_naredba(Vector <Naredba_za_vozaca> naredba) 
	{
			this.trenutna_naredba=naredba;
	}

	public Kamion get_kamion() 
	{
			return this.kamion;
	}

	public void set_kamion(Kamion kamion) 
	{
			this.kamion=kamion;
	}
	public void dodaj_naredbu (Naredba_za_vozaca naredba)
	{
			this.trenutna_naredba.addElement(naredba);
	}
	public void ukloni_naredbu (int redni_broj)
	{
			this.trenutna_naredba.remove(redni_broj);
	}
	public int vrsta_radnika()
	{
		return 0;
	}
}