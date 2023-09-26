package teste;
import empresa.Funcionario;
import empresa.OperacaoFuncionario;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
    public static void main(String[]args){
         String nome;
         String cpf;
         char sexo;
         double salarioBruto;
         GregorianCalendar dataNascimento;
         GregorianCalendar dataAdmissao;
    	Scanner ler=new Scanner(System.in);
    	
    	System.out.println("****************** REGISTRO DE FUNCIONARIOS ******************");
    	System.out.println("Quantos funcionario deseja registrar?  ");
    	int n=ler.nextInt();
    	ler.nextLine();
    	Funcionario[] funcionario=new Funcionario[n];
    	
    	int escolha;
    	for(int i=1;i<=n;i++) {
    		System.out.format("Escolha uma forma de preencher dados do %dº funcionario:\n\n\t[1]-preencher apenas data de admissao\n\t[2]-preencher nome,cpf e data de admissao\n\t[3]-preencher todos os campos\n",i);
    		escolha=ler.nextInt();
    		ler.nextLine();
    		switch(escolha){
    			case 1: 
    				funcionario[i-1]=new Funcionario();
    			continue;
    			case 2: System.out.format("*************** PREENCHIMENTO DADOS FUNCIONARIO [%d] ***************\n",i);
    				System.out.print("Digite o nome: ");
					nome=ler.nextLine();
					cpf=Funcionario.validarCpf();
					dataAdmissao=Funcionario.validarDataAdmissao();
					funcionario[i-1]=new Funcionario(cpf,nome,dataAdmissao);
    			continue;
    			case 3: System.out.format("*************** PREENCHIMENTO DADOS FUNCIONARIO [%d] ***************\n",i);
    				System.out.print("Digite o nome: ");
    				nome=ler.nextLine();
    				cpf=Funcionario.validarCpf();
    				System.out.format("Digite o sexo'M'- Masculino ou 'F'- Feminino: ");
    				String linha=ler.nextLine();
    				sexo=linha.charAt(0);
    				System.out.print("Digite o salario bruto (com vírgula): ");
    				salarioBruto=ler.nextDouble();
    				ler.nextLine();
    				dataNascimento=Funcionario.validarDataNascimento();
    				dataAdmissao=Funcionario.validarDataAdmissao();
    				funcionario[i-1]=new Funcionario(cpf,nome,sexo,salarioBruto,dataNascimento,dataAdmissao);
    			continue;
    		}		
    	}int opcao=0;
    	while(opcao !=7) {
    	System.out.println("****************** MENU DE FUNCIONALIDADES ******************\nEscolha uma opção:\n");
    	System.out.println("\t[1] - para saber quantos funcionários são de sexo masculino e feminino."+"\n\t[2] - para saber quem é o mais velho e o mais novo "
    			+ "\n\t[3] - para saber o funcionario com Maior e Menor salario Liquido"+"\n\t[4] - para saber se cada funcionario está com dados mínimos (CPF,nome e sexo) valídos ou inválidos"
    			+ "\n\t[5] - para mostrar o resumo de cada funcionario" + "\n\t[6] - para verificacar se há funcionarios iguais"+"\n\t[7] - sair (finalizar execução)");
    	 opcao=ler.nextInt();
    	switch(opcao) {
    	case 1: OperacaoFuncionario.sexoFuncionarios(funcionario);
    	continue;
    	case 2: OperacaoFuncionario.imprime_MaisNovo_MaisVelho(funcionario);
    	continue;
    	case 3: OperacaoFuncionario.maior_menor_SalarioLiquido(funcionario);
    	continue;
    	case 4: OperacaoFuncionario.funcionariosValidos(funcionario);
    	continue;
    	case 5: for(int i=0;i<n;i++) {
		System.out.format("*************** DADOS DO FUNCIONARIO [%d] ***************\n%s",i+1,funcionario[i].toString());
    	}
    	continue;
    	case 6: Funcionario.equals(funcionario);
    	continue;
    	case 7: System.exit(0);
    		}
    	}  
    	System.exit(0);   	
    }
}
