package automobili;
import java.util.ArrayList;
import java.util.Scanner;

import motori.*;

public class Automobile {
	
	private Scanner in = new Scanner(System.in);
	boolean continua;
	private Motore motore;
	private String marca;
	private String modello;
	private ArrayList <Optional> optionalList = new ArrayList<>();
	private Targa targa = new Targa();
	private int i = 0;
	public Automobile() {
	}
	
	public Automobile(String marca, String modello) {
		this.marca = getMarca(marca);
		this.modello = getModello(modello);
		setMotore(marca, modello);
		do {
			i++;
			System.out.println("Inserisci il codice, la descrizione (anche solo il nome) e il prezzo del " + i + "° optional");
			Optional optional = new Optional(in.nextInt(), in.next(), in.nextInt());
			optionalList.add(new Optional(optional.getCodice(), optional.getDescrizione(), optional.getPrezzo()));
			System.out.println("Vuoi aggiungere un altro optional? [s/n]");
			if (in.next().equals("s"))
				continua = true;
			else 
				continua = false;
		}while(continua);
	}
	
	public void setMotore(String marca, String modello) {
		System.out.println("Inserire cilindrata, cilindri, carburante della " + marca + " modello " + modello);
		motore = new Motore(in.nextInt(), in.nextInt(), in.next());
		
	}

	private String getModello(String modello) {
		Modello m = new Modello(modello);
		return m.getModello();
	}

	private String getMarca(String marca) {
		Marca m = new Marca(marca);
		return m.getMarca();
	}

	public String toString() {
		return "Automobile [marca= " + marca + ", modello=" + modello + "]\n"
				+ "Motore " + motore + "\n" 
				+ "Optional" + optionalList + "\n"
				+ "Targa " + targa + "\n";
	}	
}
