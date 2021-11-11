package automobili;

public class Optional extends Automobile{
	private int codice;
	private String descrizione;
	private int prezzo;
	
	
	public Optional(int codice, String descrizione, int prezzo) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public int getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public int getPrezzo() {
		return prezzo;
	}
	
	public String toString() {
		return "codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + prezzo + "\n";
	}
}
