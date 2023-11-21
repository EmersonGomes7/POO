package questao5;

import java.util.GregorianCalendar;

public abstract class Pessoa {
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public abstract boolean validaDocumento(String x);
	public abstract int calculaIdade(GregorianCalendar data);	
	public String toString() {
		return("Nome: " + getNome());
	}
}
