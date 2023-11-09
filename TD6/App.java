package empresa;

import java.util.GregorianCalendar;
import java.util.Scanner;
import empresa.*;

public class App {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
	
		System.out.println("escolha uma opção:\n[1]-inserir um funcionario\n[2]-imprimir alguns dados de todos os funcionarios+"
				+ "\n[3]-imprimir todos dados de todos os funcionarios\n[4]-imprimir funcionario com maior salário\n"
				+ "[5]-busca por salário\n[6]-busca por nome ou cpf");
		int opcao=ler.nextInt();
		switch(opcao){
	case 1: System.out.println("qual tipo do funcionario deseja inserir? 1-atendente ou 2-gerente");
			int escolha=ler.nextInt();
			Funcionario atendente=new Atendente();
			Funcionario gerente=new Gerente();
			if(escolha!=1 && escolha!=2) {
				System.out.println("opção invalida");
			}
			if(escolha==1) {
				Funcionario novo=(Atendente)new Atendente("emerson",21,'M',"000","diretor",2000.00,new GregorianCalendar(2000,4,15));
				Funcionario[]vetor=BlocosInstrucoes.insereFuncionario(novo);
			}else{
				Funcionario novo2=(Gerente)new Gerente("eu",2,'j',"220","patrao",2332,new GregorianCalendar(23,23,23));
				Funcionario[] vetor= BlocosInstrucoes.insereFuncionario(novo2);
			}	
			break;
	case 2: 
		break;
		default: break;
		}
		BlocosInstrucoes.imprimeAlgunsDadosFuncionarios();
	
	}	
}
