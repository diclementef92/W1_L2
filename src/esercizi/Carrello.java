package esercizi;

import java.util.Arrays;

public class Carrello {
	private Cliente cliente;
	private Articolo[] articoli;
	private Double prezzoTotale;

	public Carrello(Cliente cliente) {
		this.cliente = cliente;
		this.prezzoTotale = 0D;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Double getPrezzoTotale() {
		return prezzoTotale;
	}

//	public void setPrezzoTotale(Double prezzoTotale) {
//		this.prezzoTotale = prezzoTotale;
//	}

	public Articolo[] getArticoli() {
		return articoli;
	}

//	public void setArticoli(Articolo[] articoli) {
//		Articolo[] nuoviArticoli = new Articolo[articoli.length];
//		System.arraycopy(this.articoli, 0, nuoviArticoli, 0, this.articoli.length);
//		this.articoli = nuoviArticoli;
//	}

	public void aggiungiArticolo(Articolo articolo) {
		int newLength = this.articoli.length + 1;
		Articolo[] articoliAggiornati = Arrays.copyOf(this.articoli, newLength);
		this.articoli = articoliAggiornati;
//		Articolo[] nuoviArticoli = new Articolo[this.articoli.length + 1];
//		System.arraycopy(this.articoli, 0, nuoviArticoli, 0, this.articoli.length);
		// Aggiungo articolo in ultima posizione
//		nuoviArticoli[this.articoli.length] = articolo; 
	}

}
