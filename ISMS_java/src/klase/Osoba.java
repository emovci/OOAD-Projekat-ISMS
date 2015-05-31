package klase;
public class Osoba {

	private String ime;
	private String prezime;
	private Datum datum_rodjenja;
	private String broj_telefona;

	public String get_ime() 
	{
			return this.ime;
	}

	public void set_Ime(String ime) 
	{
			this.ime=ime;
	}

	public String get_prezime() 
	{
			return prezime;
	}

	public void set_prezime(String prezime) 
	{
			this.prezime=prezime;
	}

	public Datum get_datum_rodjenja() 
	{
			return this.datum_rodjenja;
	}


	public void set_datum_rodjenja(Datum datum_rodjenja) 
	{
			this.datum_rodjenja=datum_rodjenja;
	}

	public String get_broj_telefona() 
	{
			return broj_telefona;
	}


	public void set_broj_telefona(String broj) 
	{
			this.broj_telefona=broj;
	}

}