package empresa;

import java.time.LocalDate;

public class Atendente extends Funcionario{
	public Atendente(String nome, int idade, char sexo, String cpf, String cargo, double salario,
			LocalDate dataNascimento) {
		super(nome,idade,sexo,cpf,cargo,salario,dataNascimento);
	}
	public Atendente() {
		super();
	}
}