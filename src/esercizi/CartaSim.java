package esercizi;

public class CartaSim {
	private Long imei;
	private String prefissoNazione;// per esempio 0039
	private Long numeroTelefono;
	private int credito;
	private Chiamata[] chiamateRecenti = new Chiamata[5];
	private int index;

	public CartaSim(String prefisso, Long numero) {
		this.numeroTelefono = numero;
		this.prefissoNazione = prefisso;
		this.credito = 0;
		this.imei = (long) (Math.random() * 10000000000L);
		this.index = 0;
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
		if (index < 5) {
			this.chiamateRecenti[index] = chiamata;
			index++;
		} else {
			for (int i = 0; i < index -1; i++) {
				this.chiamateRecenti[i]= this.chiamateRecenti[i+1];
			}
			this.chiamateRecenti[index -1]= chiamata;
		}

//		System.out.println("ultima chiamata:\n" + this.chiamateRecenti[this.chiamateRecenti.length - 1]);
	}

	public String toString() {
		String testo = "Numero Telefono: " + prefissoNazione + " " + numeroTelefono + "\n" + "Imei:" + imei
				+ "\nCredito: " + credito + "\nUltime chiamate:\n";

		for (int i = 0; i < index; i++) {
			testo += i + ": "+ this.chiamateRecenti[i].toString();
		}
		return testo;
	}

}
