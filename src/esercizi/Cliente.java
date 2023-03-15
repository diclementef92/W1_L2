package esercizi;

import java.util.Date;

public class Cliente {
	private Long codice;
	private String nome;
	private String cognome;
	private String email;
	private Date dataIscrizione;

	public Cliente(String nome, String cognome, String email) {
		this.codice = (long) (Math.random() * 10000000L);
		this.setEmail(email);
		this.setNome(nome);
		this.setCognome(cognome);
		this.setDataIscrizione(new Date());
	}

	public Long getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public Date getDataIscrizione() {
		return dataIscrizione;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDataIscrizione(Date dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}

	public String toString() {
		return "Codice Cliente: " + codice + "\nNome: " + nome + "\nCognome: " + cognome + "\nEmail: " + email
				+ "\nIscritto dal " + dataIscrizione;
	}

}
