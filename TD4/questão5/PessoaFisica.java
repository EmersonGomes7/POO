package questao5;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
public class PessoaFisica extends Pessoa{
	private String cpf;
	private GregorianCalendar dataNascimento;	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String toString() {
	    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	    return "CPF: " + getCpf() + "\nData de Nascimento: " + formatador.format(getDataNascimento().getTime());
	}
	@Override
	public boolean validaDocumento(String cpf) {
		if(cpf.length()==14) {
			return true;
		}else
			return false;
	}
	@Override
    public int calculaIdade(GregorianCalendar data) {
	        GregorianCalendar dataAtual = new GregorianCalendar();
	        int anoAtual = dataAtual.get(GregorianCalendar.YEAR);
	        int anoNascimento = dataNascimento.get(GregorianCalendar.YEAR);
	        return anoAtual - anoNascimento;
	    }
	 PessoaFisica() {
	 }
	 PessoaFisica(String nome, String cpf, GregorianCalendar dataNascimento) {
		 setNome(nome); setCpf(cpf); setDataNascimento(dataNascimento);
	 }
	public boolean equals(PessoaFisica pessoaFisica) {
		if(pessoaFisica.getCpf().equals(this.getCpf())) {
			return true;
		}
		return false;
	}
}
