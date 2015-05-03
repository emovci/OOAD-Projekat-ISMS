import java.util.Vector;


public class Klijent {
	
	private String naziv_firme; 
	private Vector<Roba> roba_na_raspolaganju;
	
	public Klijent(String naziv, Vector<Roba> roba){
		this.naziv_firme=naziv;
		this.roba_na_raspolaganju=roba;
	}
	
	public void set_roba(Vector<Roba> roba){
		this.roba_na_raspolaganju=roba;
	}
	
	public String get_naziv_firme(){
		return this.naziv_firme;
	}
	
	public Vector<Roba> get_roba_na_raspolaganju(){
		return this.roba_na_raspolaganju;
	}
	
	public void dodaj_robu(Roba roba){
		this.roba_na_raspolaganju.addElement(roba);
	}
	
	public void ukloni_robu(int redni_br){
		this.roba_na_raspolaganju.remove(redni_br);
	}
	
	public void ukloni_robu(String naziv){
		for(int i=0;i<this.roba_na_raspolaganju.size();i++){
			if(this.get_roba_na_raspolaganju().elementAt(i).get_vrsta_robe().get_ime()==naziv) this.roba_na_raspolaganju.remove(i);
		}
	}
}
