import java.util.Vector;


public class Mjesto {
	
	private String naziv;
	private Vector<Double> lista_udaljenosti;
	private int redni_broj;
	private int ukupni_broj; 
	
	public Mjesto(String naziv,Vector<Double> lista_ud,int redni_br, int ukupni_br){
		this.naziv=naziv;
		this.lista_udaljenosti=lista_ud;
		this.redni_broj=redni_br;
		this.ukupni_broj=ukupni_br;
		//dodati izuzetke
	}
	
	public void set_naziv(String naziv){
		this.naziv=naziv; 
	}
	
	public void set_lista_udaljenosti(Vector<Double> lista_udaljenosti){
		this.lista_udaljenosti=lista_udaljenosti;
	}
	
	public void set_redni_broj(int redni_br){
		this.redni_broj=redni_br;
	}
	
	public String get_naziv(){
		return this.naziv;
	}
	
	public Vector<Double> get_lista_udaljenosti(){
		return this.lista_udaljenosti;
	}
	
	public int get_redni_broj(){
		return this.redni_broj;
		
	}
	
	public int get_ukupni_broj(){
		return this.ukupni_broj;
	}
	
}
