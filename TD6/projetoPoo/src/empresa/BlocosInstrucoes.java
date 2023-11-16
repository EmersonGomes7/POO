package empresa;

import interfaceGrafica.ImprimirAlgunsDados;

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
	public void buscaPorSalario() {
		
	}
	//Imprime os dados do funcionário com esse nome ou cpf(se tiver mais de um funcionário, imprime para todos).
		public void buscaPorNomeOuCpf(String dado) {			
	}
	//imprime nome, cargo e salário.
	public static void imprimeAlgunsDadosFuncionarios() {
		int i=0;
		while(vetorFuncionarios[i]!=null && i<100) {
			 ImprimirAlgunsDados.adicionarFuncionarioNaTabela(vetorFuncionarios[i]);
			System.out.format("nome:%s\ncargo:%s\nsalário:%f\n",vetorFuncionarios[i].getNome(),vetorFuncionarios[i].getCargo(),vetorFuncionarios[i].getSalario());
			i++;
		}	
	}
	//imprime todos os dados
	public void imprimeTodosDadosFuncionarios() {
		
	}
	//imprime o funcionário com salário mais alto
	public void imprimeFuncionarioMaiorSalario() {
		
	}	
}
