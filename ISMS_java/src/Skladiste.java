import java.util.Vector;


public class Skladiste {

	private double maksimalni_volumen_robe;
	private double trenutni_volumen_robe;
	private Vector<Roba> trenutna_roba_u_skladistu;
	private Vector<Vector<Roba>> lista_prijasnjih_stanja_robe;
	private boolean problem_kod_vozaca;
	private boolean problem_kod_radnika;
	
	public void set_max_volumen(double max)
	{
		this.maksimalni_volumen_robe=max;
	}
	
	public double get_max_volumen()
	{
		return this.maksimalni_volumen_robe;
	}
	
	public double get_trenutni_volumen()
	{
		return this.trenutni_volumen_robe;
	}
	
	public void set_trenutni_volumen(double volumen)
	{
		this.trenutni_volumen_robe=volumen;
	}
	
	public Vector<Roba> get_trenutna_roba_u_skladistu()
	{
		return this.trenutna_roba_u_skladistu;
	}
	
	public void set_trenutna_roba_u_skladistu(Vector<Roba> roba)
	{
		this.trenutna_roba_u_skladistu=roba;
	}
	// public void set_naredba_za_vozaca (Naredba_za_vozaca naredba, Vozac vozac){}
	// public Naredba_za_vozaca get_naredba_za_vozaca(Vozac vozac){}
	// public void set_naredba_za_radnika (Naredba_za_radnika naredba, Radnik radnik) {}
	// public Naredba_za_radnika get_naredba_za_radnika(Radnik radnik) {}
	// public void provjeri_stanje_naredbi_za_vozace() {}
	// public void provjeri_stanje_naredbi_za_radnike() {}
	
}
