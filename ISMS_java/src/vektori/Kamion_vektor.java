package vektori;
import java.util.Vector;
import klase.Kamion;

public class Kamion_vektor 
{
	private Vector <Kamion> kamioni;
	private int zadnji_id;
	
	public Vector <Kamion> get_kamioni ()
	{
			return kamioni;
	}
	public void dodaj_kamion (Kamion kamion)
	{
			kamioni.addElement(kamion);
			
	}
	public void ukloni_kamion (int redni_broj)
	{
			kamioni.removeElement(redni_broj);
	}
	public int get_zadnji_id()
	{
			return zadnji_id;
	}
}
