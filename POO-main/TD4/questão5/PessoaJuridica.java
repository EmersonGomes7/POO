package questao5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private GregorianCalendar dataCriacao;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public GregorianCalendar getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(GregorianCalendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}	
	public boolean validaDocumento(String cnpj) {
        if(cnpj.length()==18)
        	return true;
        else 
        	return false;
    }
	@Override
    public int calculaIdade(GregorianCalendar data) {
	        GregorianCalendar dataAtual = new GregorianCalendar();
	        int anoAtual = dataAtual.get(GregorianCalendar.YEAR);
	        int anoNascimento = dataCriacao.get(GregorianCalendar.YEAR);
	        return anoAtual - anoNascimento;
	    }
	PessoaJuridica(){
	}
	PessoaJuridica(String nome, String cnpj, GregorianCalendar dataCriacao){
		setNome(nome); setCnpj(cnpj); setDataCriacao(dataCriacao);
	}	
	public String toString() {
		 SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		    return "CNPJ: " + getCnpj() + "\nData Criacao: " + formatador.format(getDataCriacao().getTime());
	}
	public boolean equals(PessoaJuridica pessoaJuridica) {
		if(pessoaJuridica.getCnpj().equals(this.getCnpj())) {
			return true;
		}
		return false;
	}
}
