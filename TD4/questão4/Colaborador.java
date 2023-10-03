package registroFuncionarios;
import java.lang.String;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Colaborador {
	private String CPF;
	private String nome;
	private char sexo;
	private double salarioBruto;
	private GregorianCalendar dataAdmissao;
	
	
	
	public Colaborador(String cpf, String nome, char sexo, double salarioBruto, GregorianCalendar dataAdmissao) {
		setNome(nome);
		setCPF(cpf);
		setSexo(sexo);
		setSalarioBruto(salarioBruto);
		setDataAdmissao(dataAdmissao);
		
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public GregorianCalendar getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(GregorianCalendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public boolean validaCPF() {
		if(this.CPF.length()==14)
			return true;
		else
			return false;
	}
	public boolean validaDataAdmissao(){
		if(this.dataAdmissao.get(Calendar.YEAR)<1990)
			return false;
		else
			return true;	
	}
	public boolean trabalhaMaisTempo(Colaborador colaborador) {
		int diasTrabalhadosParametro=(colaborador.dataAdmissao.get(Calendar.YEAR)*365)+(colaborador.dataAdmissao.get(Calendar.MONTH)*30)+(colaborador.dataAdmissao.get(Calendar.DAY_OF_MONTH));
		int diasTrabalhadosCorrente=(this.dataAdmissao.get(Calendar.YEAR)*365)+(this.dataAdmissao.get(Calendar.MONTH)*30)+(this.dataAdmissao.get(Calendar.DAY_OF_MONTH));
		if(diasTrabalhadosParametro > diasTrabalhadosCorrente)
			return false;
		else
			return true;
	}
	
}
