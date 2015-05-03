import java.util.Vector;

public class Ruta {

		private Mjesto startno_mjesto;
		private Mjesto ciljno_mjesto;
		private Vector<Roba> lista_robe; //mislim da ce biti lakse raditi sa vektorom
		private Datum vrijeme_polaska;
		private Datum vrijeme_dolaska; 
		private boolean kupovina_ili_prodaja;
		private boolean ruta_završena;
		private String komentar;
		private double cijena_rute;
		
		public Mjesto get_startno_mjesto() 
		{
				throw new UnsupportedOperationException();
		}
	
		public Mjesto get_ciljno_mjesto() 
		{
				throw new UnsupportedOperationException();
		}
	
		public Roba[] get_lista_robe()
		{
				throw new UnsupportedOperationException();
		}
	
		public void set_lista_robe(Roba[] roba) 
		{
				throw new UnsupportedOperationException();
		}

		public void dodaj_robu(Roba roba)
		{
				throw new UnsupportedOperationException();
		}

		public void ukloni_robu(int red_br) 
		{
				throw new UnsupportedOperationException();
		}
	
		public Datum get_vrijeme_polaska() 
		{
				throw new UnsupportedOperationException();
		}
	
		public Datum get_vrijeme_dolaska() 
		{
				throw new UnsupportedOperationException();
		}
	
		public void set_vrijeme_dolaska(Datum datum) 
		{
				throw new UnsupportedOperationException();
		}
	
		public boolean get_kupovina_ili_prodaja() 
		{
				throw new UnsupportedOperationException();
		}
	
		public boolean get_ruta_završena() 
		{
				throw new UnsupportedOperationException();
		}
	
		public boolean set_ruta_završena(boolean završenost) 
		{
				throw new UnsupportedOperationException();
		}
	
		public String get_komentar() 
		{
				throw new UnsupportedOperationException();
		}
	
		public void set_komentar(String komentar) 
		{
				throw new UnsupportedOperationException();
		}
	
		public double get_cijena_rute() 
		{
				throw new UnsupportedOperationException();
		}
	

		public void set_cijena_rute(double cijena_rute) 
		{
				throw new UnsupportedOperationException();
		}

}