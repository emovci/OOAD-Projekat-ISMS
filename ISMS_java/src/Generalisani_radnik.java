public class Generalisani_radnik extends Osoba {

	private boolean status;
	private int id;
	private double plata_dnevnica;

	public boolean get_status() {
		return this.status;
	}

	public void set_status(boolean status) {
		this.status=status;
	}
	
	public void set_plata_dnevnica(double plata) {
		this.plata_dnevnica=plata;
	}

	public double get_plata_dnevnica() {
		return this.plata_dnevnica;
	}

	public int get_id() {
		return this.id;
	}

}