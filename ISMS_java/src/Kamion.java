import java.util.Vector;


public class Kamion {
	
	private String ime;
	private double nosivost; 
	private double volumen; 
	private double prosjecna_brzina_dv;
	private double prosjecna_brzina_lv;
	private double potrosnja_po_km;
	private boolean da_li_se_koristi;
	
	public Kamion(String ime, double nosivost, double volumen, double prosjecna1, double prosjecna2, double potrosnja, boolean koristi)
	{
				this.ime=ime; 
				this.nosivost=nosivost;
				this.volumen=volumen;
				this.prosjecna_brzina_dv=prosjecna1;
				this.prosjecna_brzina_lv=prosjecna2;
				this.potrosnja_po_km=potrosnja;
				this.da_li_se_koristi=koristi;
	}
	
	public Kamion(String ime, double nosivost, double volumen, double prosjecna1, double prosjecna2, double potrosnja)
	{
				this.ime=ime; 
				this.nosivost=nosivost;
				this.volumen=volumen;
				this.prosjecna_brzina_dv=prosjecna1;
				this.prosjecna_brzina_lv=prosjecna2;
				this.potrosnja_po_km=potrosnja;
				this.da_li_se_koristi=false;
	}
	
	public void set_koristenje(boolean koristenje)
	{
				this.da_li_se_koristi=koristenje;
	}
	
	public String get_ime()
	{
				return this.ime;
	}
	
	public double get_nosivost()
	{
				return this.nosivost;
	}
	
	public double get_volumen()
	{
				return this.volumen;
	}
	
	public Vector<Double> get_prosjecna_brzina()
	{
		
				Vector<Double> vek=new Vector<Double>();
				vek.addElement(this.prosjecna_brzina_dv);
				vek.addElement(this.prosjecna_brzina_lv);
				return vek;
		
	}
	
	public double get_potrosnja()
	{
				return this.potrosnja_po_km;
	}
	
	public boolean get_koristenje(){
				return this.da_li_se_koristi;
	}
	
	
}
	

