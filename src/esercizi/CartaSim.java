package esercizi;

public class CartaSim {
	private Long imei;
	private String prefissoNazione;// per esempio +39
	private Long numeroTelefono;
	private int credito;
	private Chiamata[] chiamateRecenti;
	private int index;
	private final int NUMERO_CHIAMATE_RECENTI = 5;

	public CartaSim(String prefisso, Long numero) {
		this.numeroTelefono = numero;
		this.prefissoNazione = prefisso;
		this.credito = 0;
		this.imei = (long) (Math.random() * 10000000000L);
		this.index = 0;
		this.chiamateRecenti = new Chiamata[NUMERO_CHIAMATE_RECENTI];
	}

	public int getCredito() {
		return credito;
	}

	public Long getNumeroTelefono() {
		return numeroTelefono;
	}

	public void aggiungiCredito(int accredito) {
		this.credito += accredito;
	}

	public void sottraiCredito(int addebito) {
		this.credito -= addebito;
	}

	public void setNumeroTelefono(Long num) {
		this.numeroTelefono = num;
	}

	public Chiamata[] getUltimeChiamate() {
		return chiamateRecenti;
	}

	public void aggiungiUltimaChiamata(Chiamata chiamata) {
		if (index < NUMERO_CHIAMATE_RECENTI) {
			this.chiamateRecenti[index] = chiamata;
			index++;
		} else {
			for (int i = 0; i < index - 1; i++) {
				this.chiamateRecenti[i] = this.chiamateRecenti[i + 1];
			}
			this.chiamateRecenti[index - 1] = chiamata;
		}

	}

	public String toString() {
		String testo = "Numero Telefono: " + prefissoNazione + " " + numeroTelefono + "\n" + "Imei:" + imei
				+ "\nCredito: " + credito + "\nUltime chiamate:\n";

		for (int i = 0; i < index; i++) {
			testo += i + ": " + this.chiamateRecenti[i].toString();
		}
		return testo;
	}

}
