package motori;

public class Motore {
	
	private int cilindrata;
	private int cilindri;
	private double potenza;
	private int rpm;
	private String carburante;
	
	public Motore() {
	}
	
	public Motore(int numeroCilindrata, int numCilindri, String carburante) {
		setCilindrata(numeroCilindrata);
		setCilindri(numCilindri);
		setCarburante(carburante);
		calcolaRPM();
		setPotenza(numeroCilindrata);
	}
	
	public void setCilindrata(int numeroCilindrata) {
		Cilindrata cilindrata = new Cilindrata(numeroCilindrata);
		this.cilindrata = cilindrata.getCilindrata();
	}
	
	public void calcolaRPM() {
		if (this.carburante.equalsIgnoreCase("diesel")) { 
			this.rpm = 6000; 
		}
		else if(this.carburante.equalsIgnoreCase("benzina")) {
			this.rpm = 8000; 
		}else
			this.rpm = 0;
	}
	
	public String toString() {
		return "[cilindrata=" + cilindrata + ", cilindri=" + cilindri + ", potenza=" + Math.round(potenza*100.00)/100.00 + ", rpm=" + rpm
				+ ", carburante=" + carburante + "]";
	}

	public void setCilindri(int numCilindri) {
		Cilindri cilindri = new Cilindri(numCilindri);
		this.cilindri = cilindri.getCilindri();
	}

	public void setPotenza(double potenza) {
		Potenza p = new Potenza(this.cilindrata, this.carburante);
		this.potenza = p.getPotenza();
	}
	
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public String getCarburante() {
		return carburante;
	}

	public int getCilindrata() {
		return this.cilindrata;
	}
}