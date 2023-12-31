package empresa;

import java.time.LocalDate;
import interfaceGrafica.*;

public class Funcionario {
	private String nome;
	private int idade;
	private char sexo;
	private String cpf;
	private String cargo;
	private double salario;
	private LocalDate dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Funcionario(String nome, int idade, char sexo, String cpf, String cargo, double salario,
			LocalDate dataNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
	}
	public Funcionario() {}
	
	
}