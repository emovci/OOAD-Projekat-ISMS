package vektori;
import java.util.Vector;
import klase.Generalisani_radnik;

public class Gen_radnik_vektor 
{
		private Vector <Generalisani_radnik> radnici=new Vector<Generalisani_radnik> ();
		private int zadnji_id;
		
		public Vector <Generalisani_radnik> get_radnike ()
		{
				return radnici;
		}
		public void dodaj_radnika (Generalisani_radnik radnik)
		{
				radnici.addElement(radnik);
				
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
