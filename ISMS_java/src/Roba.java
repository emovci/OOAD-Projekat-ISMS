
public class Roba {
	
	private Vrsta_robe vrsta_robe;
	private double kolicina;
	private double cijena;
	
	public Roba(Vrsta_robe vrsta, double kolicina, double cijena){
		this.vrsta_robe=vrsta;
		this.kolicina=kolicina;
		this.cijena=cijena;
	}
	
	public void set_vrsta_robe(Vrsta_robe vrsta){
		this.vrsta_robe=vrsta;
	}
	
	public void set_kolicina (double kolicina){
		this.kolicina=kolicina;
	}
	
	public void set_cijena (double cijena){
		this.cijena=cijena;
	}
	
	public Vrsta_robe get_vrsta_robe(){
		return this.vrsta_robe;
	}
	
	public double get_kolicina(){
		return this.kolicina;
	}
	
	public double get_cijena(){
		return this.cijena;
	}
	
}
