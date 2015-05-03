import java.util.Vector;


public class Mjesto {
	
	private String naziv;
	//stavio sam static pošto bi usuprotnom dodavanjem novih gradova morali da mjenjamo svakog pripadnika
	//klase što nije pametno. Ovako æe svi dijeli isti vektor i kad promjenimo na jednom, promjenit æemo na svakom.
	//moramo samo osmislit kako æe biti organizovan ovaj vektor. Možda kao vektor ureðenih trojki?? Napravio sam prototip u proba klasi
	private static Vector <Vector <Double>> lista_udaljenosti= new Vector <Vector <Double>> ();
	private int redni_broj;
	private static int ukupni_broj; 
	
	public Mjesto(String naziv,int redni_br, Vector <Vector <Double>> update)
	{
			this.naziv=naziv;
			//kasnije ovothis.lista_udaljenosti=lista_ud;
			this.redni_broj=redni_br;
			ukupni_broj++;
			//dodati izuzetke
	}
	
	public void set_naziv(String naziv)
	{
			this.naziv=naziv; 
	}
	
	public void set_lista_udaljenosti(Vector <Vector <Double>>  lista_udaljenosti)
	{
			this.lista_udaljenosti=lista_udaljenosti;
	}
	
	public void set_redni_broj(int redni_br)
	{
			this.redni_broj=redni_br;
	}
	
	public String get_naziv()
	{
			return this.naziv;
	}
	
	public Vector <Vector <Double>>  get_lista_udaljenosti()
	{
			return lista_udaljenosti;
	}
	
	public int get_redni_broj()
	{
			return this.redni_broj;
		
	}
	
	public int get_ukupni_broj()
	{
			return ukupni_broj;
	}
	
}
