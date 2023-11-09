package empresa;

import java.util.GregorianCalendar;

public class Gerente extends Funcionario{
	public Gerente(String nome, int idade, char sexo, String cpf, String cargo, double salario,
			GregorianCalendar dataNascimento) {
		super(nome,idade,sexo,cpf,cargo,salario,dataNascimento);
	}
	public Gerente() {
		super();
	}
}
