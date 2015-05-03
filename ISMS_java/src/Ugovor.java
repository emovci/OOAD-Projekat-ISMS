import java.util.Vector;


public class Ugovor {
	
	private Datum datum_potpisivanja;
	private Datum datum_isteka;
	private Klijent klijent;
	private boolean valjanost;
	private boolean kupovina;
	private Vector<Roba> roba;
	
	public Ugovor(Datum potpisivanje, Datum istek, Klijent klijent,boolean valjanost, boolean kupovina, Vector<Roba> roba ){
		this.datum_potpisivanja=potpisivanje;
		this.datum_isteka=istek;
		this.klijent=klijent;
		this.valjanost=valjanost;
		this.kupovina=kupovina;
		this.roba=roba;
	}
	
	public void set_valjanost(boolean valjanost){
		this.valjanost=valjanost;
	}
	
	public boolean get_valjanost(){
		return this.valjanost;
	}
	
	public boolean get_kupovina(){
		return this.kupovina;
	}
	
	public Klijent get_klijent (){
		return this.klijent;
	}
	
	public Vector<Roba> get_roba(){
		return this.roba;
	}
}
