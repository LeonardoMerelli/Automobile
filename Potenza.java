package motori;

public class Potenza extends Motore {

	private double potenza;
	
	public Potenza(int cilindrata, String carburante) {
		super();
		this.calcolaPotenza(cilindrata, carburante);
	}
	
	public void calcolaPotenza(int cilindrata, String carburante) {
		if (carburante.equalsIgnoreCase("diesel")) { 
			this.potenza = cilindrata / 1.36; 
		}
		else if(carburante.equalsIgnoreCase("benzina")) {
			this.potenza = cilindrata / 1.26; 
		}else
			this.potenza = 0;
	}
	
	public double getPotenza() {
		return this.potenza;
	}
}