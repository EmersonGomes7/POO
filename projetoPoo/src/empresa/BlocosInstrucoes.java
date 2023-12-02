package empresa;

import javax.swing.JOptionPane;

import interfaceGrafica.ImpressaoDadosEssenciais;
import interfaceGrafica.ImpressaoGeral;
import interfaceGrafica.SegundaTela;

public class BlocosInstrucoes {
	private static Funcionario[] vetorFuncionarios=new Funcionario[100];

	public static void insereFuncionario(Funcionario funcionario){			
		int i=0;
		while(vetorFuncionarios[i]!=null) {
			if(i>=99) {
				System.out.println("limite de funcionarios atingido");
				break;
			}
			i++;	
		}
		if(i>=0 && i<99)
			vetorFuncionarios[i]=funcionario;
		System.out.println("funcionario inserido com sucesso!");

	}
	//Imprime os dados de todos os funcionários com o salário entre um intervalo de dois valores digitados pelo usuário.
	public static void buscaPorSalario(int min, int max) {
		int cont=0;
		int i=0;
		while(vetorFuncionarios[i]!=null && i<100) {
			if(vetorFuncionarios[i].getSalario()>=min && vetorFuncionarios[i].getSalario()<=max ) {
				ImpressaoGeral.adicionarTodosDadosFuncionario(vetorFuncionarios[i]);
				cont++;
			}
			i++;	
		}
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nenhum Funcionario Encontrado!");
		new SegundaTela();
		}
	}
	//Imprime os dados do funcionário com esse nome ou cpf(se tiver mais de um funcionário, imprime para todos).
		public static void buscaPorNomeOuCpf(String dado) {
			int cont=0;
			int i=0;
			while(vetorFuncionarios[i]!=null && i<100) {
				if(vetorFuncionarios[i].getNome().equals(dado) || vetorFuncionarios[i].getCpf().equals(dado)){
					ImpressaoGeral.adicionarTodosDadosFuncionario(vetorFuncionarios[i]);
					cont++;
				}
				
				i++;	
			}
			if(cont==0) {
				JOptionPane.showMessageDialog(null, "Nenhum Funcionario Encontrado!");
			new SegundaTela();
			}
	}
	//imprime nome, cargo e salário.
	public static void imprimeAlgunsDadosFuncionarios() {
		int i=0;
		while(vetorFuncionarios[i]!=null && i<100) {
			 ImpressaoDadosEssenciais.adicionarAlgunsDadosFuncionario(vetorFuncionarios[i]);
			i++;
		}	
	}
	//imprime todos os dados
	public static void imprimeTodosDadosFuncionarios() {
		int i=0;
		while(vetorFuncionarios[i]!=null && i<100) {
			 ImpressaoGeral.adicionarTodosDadosFuncionario(vetorFuncionarios[i]);;;
			i++;
		}
	}
	//imprime o funcionário com salário mais alto
	public static void imprimeFuncionarioMaiorSalario() {
		int i=0;
		Funcionario maiorSalario=vetorFuncionarios[0];
		while(vetorFuncionarios[i]!=null && i<100) {
			if( vetorFuncionarios[i].getSalario() > maiorSalario.getSalario()) {
				maiorSalario=vetorFuncionarios[i];
			}		 
			i++;
		}
		ImpressaoGeral.adicionarTodosDadosFuncionario(maiorSalario);
	}	
}
