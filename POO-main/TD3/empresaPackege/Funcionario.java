package empresa;
import java.util.Calendar;
import java.lang.String;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
public class Funcionario {
    private String CPF; 
    private String Nome;
    private char Sexo;
    private double SalarioBruto;
    private GregorianCalendar DataNascimento;
    private GregorianCalendar DataAdmissao;
    
	
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cpf) {
        this.CPF = cpf;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        this.Sexo = sexo;
    }
    public double getSalarioBruto() {
        return SalarioBruto;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.SalarioBruto = salarioBruto;
    }
    public GregorianCalendar getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(GregorianCalendar dataNascimento) {
        this.DataNascimento = dataNascimento;
    }
    public GregorianCalendar getDataAdmissao() {
        return DataAdmissao;
    }
    public void setDataAdmissao(GregorianCalendar dataAdmissao) {
        this.DataAdmissao = dataAdmissao;
    }	
	public Funcionario() {
	    setCPF("");
	    setNome("");
	    setSexo(' ');
	    setSalarioBruto(0.0);
	    setDataNascimento(new GregorianCalendar(0000, 00, 00));
	    setDataAdmissao(new GregorianCalendar());
	}

	public Funcionario(String cpf, String nome, GregorianCalendar dataadmissao) {
	    setCPF(cpf);
	    setNome(nome);
	    setDataAdmissao(dataadmissao);
	    setSexo(' ');
	    setSalarioBruto(0.0);
	    setDataNascimento(new GregorianCalendar(0000, 00, 00));
	}

	public Funcionario(String cpf, String nome, char sexo, double salarioBruto, GregorianCalendar dataNascimento, GregorianCalendar dataAdmissao) {
	    setCPF(cpf);
	    setNome(nome);
	    setSexo(sexo);
	    setSalarioBruto(salarioBruto);
	    setDataNascimento(dataNascimento);
	    setDataAdmissao(dataAdmissao);
	}
    public static String validarCpf(){
    	Scanner scanner1=new Scanner(System.in);
    	String cpf;
    	System.out.format("digite o CPF do funcionario: ");
		cpf=scanner1.nextLine();
        	while(true) {
        		if(cpf.length()==14) {
        			break;
        		}else {
        		System.out.println("CPF inválido\ndigite CPF novamente (14 caracteres incluindo '.' e '-': ");
        		cpf=scanner1.nextLine();
        		} 		
        }return cpf;
    }
    public static GregorianCalendar validarDataNascimento(){
    	int dia;int mes;int ano;
    	Scanner scanner2=new Scanner(System.in);
    	GregorianCalendar dataNas = new GregorianCalendar();
    	while(true) {
    	System.out.print("digite a data de nascimeto\ndia: ");
    	dia=scanner2.nextInt();
    	if(dia<=31 && dia>=1) {
    		break;
    	}else {
    		System.out.print("dia invalido!\ndigite novamente: ");
    	}
    	}
    	while(true) {
        	System.out.print("mes: ");
        	mes=scanner2.nextInt();
        	if(mes<=12 && mes>=1) {
        		break;
        	}else {
        		System.out.print("mes invalido!\ndigite novamente: ");
        	}
       	}
    	while(true) {
        	System.out.print("ano: ");
        	ano=scanner2.nextInt();
        	if(ano>=1920) {
        		break;
        	}else {
        		System.out.print("ano invalido!\ndigite novamente: ");
        	}
    	}dataNas.set(ano, mes - 1, dia);
        return dataNas;
    }
    public static GregorianCalendar validarDataAdmissao(){
    	int dia;int mes;int ano;
    	Scanner scanner3=new Scanner(System.in);
    	GregorianCalendar dataAdm = new GregorianCalendar();
    	while(true) {
    	System.out.print("digite a data de Admissao na empresa\ndia: ");
    	dia=scanner3.nextInt();
    	if(dia<=31 && dia>=1) {
    		break;
    	}else {
    		System.out.print("dia invalido!\ndigite novamente: ");
    	}
    	}
    	while(true) {
        	System.out.print("mes: ");
        	mes=scanner3.nextInt();
        	if(mes<=12 && mes>=1) {
        		break;
        	}else {
        		System.out.print("mes invalido!\ndigite novamente: ");
        	}
       	}
    	while(true) {
        	System.out.print("ano: ");
        	ano=scanner3.nextInt();
        	if(ano>=1995) {
        		break;
        	}else {
        		System.out.print("empresa inexistente nesse ano!\ndigite novamente: ");
        	}
    	}dataAdm.set(ano,mes-1,dia);
    	return dataAdm;
    }
    public int calcularIdade(){
    	GregorianCalendar hoje = new GregorianCalendar();
        int anoAtual = hoje.get(GregorianCalendar.YEAR);
        int anoNascimento = this.getDataNascimento().get(GregorianCalendar.YEAR);
        int idade=anoAtual-anoNascimento;
        return idade;
    }
    public double calcularSalarioLiquido(){
    	double salarioLiquido;
		 if (SalarioBruto<=3000) {
			 salarioLiquido = SalarioBruto*0.83; 
		 } else {
			 salarioLiquido = SalarioBruto*0.73;
		 }
		 return salarioLiquido;
    }
    public String toString(){
    	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return(" \tCPF: " + CPF + "\n \tNome: " + Nome + "\n \tSexo: " + Sexo + "\n \tSalário Bruto: " + SalarioBruto
                + "\n \tData de Nascimento: " + formato.format(DataNascimento.getTime()) + "\n\tData de Admissão: "
                + formato.format(DataAdmissao.getTime()))+"\n";
    }
    public static void equals(Funcionario [] funcionario){
    		 for(int i=0;i<funcionario.length;i++) {
    			  for(int j=i+1;j<funcionario.length;j++) {
    				 if(funcionario[j].Nome.equals(funcionario[i].Nome)&&funcionario[j].CPF.equals(funcionario[i].CPF)&&funcionario[j].Sexo==funcionario[i].Sexo) {
    					 System.out.format("O funcionário %d é igual ao funcionário %d ",i,j);
    				 }
    			 }
    		 }
    	 }   
	}
    

