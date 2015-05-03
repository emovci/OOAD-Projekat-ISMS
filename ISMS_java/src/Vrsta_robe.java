
public class Vrsta_robe {
	
	private String  ime;
	private double masa;
	private double volumen;
	
	public Vrsta_robe (String ime, double masa, double volumen) throws InterruptedException{
		if(masa<0)  throw new InterruptedException();
		this.ime=ime;
		this.masa=masa;
		this.volumen=volumen;
	}
	
	public void set_ime(String ime){
		this.ime=ime;
	}
	
	public void set_masa(double masa){
		this.masa=masa;
	}
	
	public void set_volumen(double volumen){
		this.volumen=volumen;
	}
	
	public String get_ime(){
		return this.ime;
	}
	
	public double get_masa(){
		return this.masa;
	}
	
	public double get_volumen(){
		return this.volumen;
	}
	 
}
