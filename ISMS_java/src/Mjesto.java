import java.util.Vector;


public class Mjesto {
	
	private String naziv;
	//stavio sam static pošto bi usuprotnom dodavanjem novih gradova morali da mjenjamo svakog pripadnika
	//klase što nije pametno. Ovako æe svi dijeli isti vektor i kad promjenimo na jednom, promjenit æemo na svakom.
	//moramo samo osmislit kako æe biti organizovan ovaj vektor. 
	//vektor æe bit ureðen kao ureðena trojka, prva dva broja æe biti brojevi mjesta (uvijek manj borj prvi), a treæi je udaljenost
	private static Vector <Vector <Double>> lista_udaljenosti= new Vector <Vector <Double>> ();
	private int redni_broj;
	private static int ukupni_broj=0; 
	
	public Mjesto(String naziv, Vector <Vector <Double>> update)
	{
			this.naziv=naziv;
			for(int i=0; i<update.size(); i++)
			{
					Vector <Double> temp=new Vector <Double> (update.get(i));
					double prvi = temp.get(0);
					int j=0;
					while (lista_udaljenosti.get(j).get(0)>prvi)
							j++;
					int k=0;
					while(lista_udaljenosti.get(j).get(k)>prvi)
							k++;
					lista_udaljenosti.insertElementAt(temp, i);
			}
			this.redni_broj=ukupni_broj;
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
