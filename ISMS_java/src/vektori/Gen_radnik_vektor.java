package vektori;
import java.util.Vector;

import klase.Datum;
import klase.Generalisani_radnik;
import klase.Kamion;
import klase.Naredba_za_vozaca;
import klase.Naredba_za_radnika;
import klase.Vozac;
import klase.Radnik;
public class Gen_radnik_vektor 
{

		private Vector <Generalisani_radnik> radnici=new Vector <Generalisani_radnik> ();
		private int zadnji_id;

		
		public Vector <Generalisani_radnik> get_radnike ()
		{
				return radnici;
		}
		public void dodaj_radnika (Generalisani_radnik radnik)
		{
				radnik.set_id(zadnji_id);
				zadnji_id++;
				radnici.addElement(radnik);
				
		}
		public void dodaj_vozaca (String ime, String prezime, Datum datum_rodjenja, boolean status, double plata_dnevnica, Vector <Naredba_za_vozaca> trenutna_naredba, Kamion kamion)
		{
				radnici.addElement(new Vozac(ime, prezime, datum_rodjenja, status, zadnji_id, plata_dnevnica, trenutna_naredba, kamion));
				zadnji_id++;
		}
		
		public void dodaj_radnika (String ime, String prezime, Datum datum_rodjenja, boolean status, double plata_dnevnica, Vector <Naredba_za_radnika> trenutna_naredba)
		{
				radnici.addElement(new Radnik(ime, prezime, datum_rodjenja, status, zadnji_id, plata_dnevnica, trenutna_naredba));
				zadnji_id++;
		}
		
		public void ukloni_radnika (int redni_broj)
		{
				radnici.removeElement(redni_broj);
		}
		public int get_zadnji_id()
		{
				return zadnji_id;
		}
}
