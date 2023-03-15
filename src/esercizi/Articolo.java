package esercizi;

public class Articolo {
	private Long codice;
	private String descrizione;
	private Double prezzo;
	private Integer numPezziDisponibili;
	private static Double iva;

	public Articolo(String descr, Double prezzo, Integer numPezzi) {
		this.codice = (long) (Math.random() * 10000000L);
		this.setDescrizione(descr);
		this.setPrezzo(prezzo);
		this.setNumPezziDisponibili(numPezzi);
	}

	public Long getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public Integer getNumPezziDisponibili() {
		return numPezziDisponibili;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public void setNumPezziDisponibili(Integer numPezziDisponibili) {
		this.numPezziDisponibili = numPezziDisponibili;
	}

	public String toString() {
		return "Codice Articolo: " + codice + "\nDescrizione: " + descrizione + "\nPrezzo: " + prezzo
				+ "\nUnità disponibili: " + numPezziDisponibili;
	}

	public static Double getIva() {
		return iva;
	}

	public static void setIva(Double iva) {
		Articolo.iva = iva;
	}

}
