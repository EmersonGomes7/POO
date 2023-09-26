package empresa;
import empresa.Funcionario;
public class OperacaoFuncionario{
	public static void funcionariosValidos(Funcionario[] funcionario) {
		boolean campoValido=true;
		for(int i=0;i<funcionario.length;i++) {
		        if (funcionario[i].getSexo() != 'M' && funcionario[i].getSexo() == 'F') {
		            campoValido =false;
		        } if (funcionario[i].getNome().isEmpty()) {
		        	campoValido =false;
		        } if (funcionario[i].getCPF().length() != 14) {
		        	campoValido =false;
		        }  if (campoValido==true) {
		            System.out.format("Funcionário [%d] válido!\n" ,i+1);
		        } else {
		            System.out.format("Funcionário [%d] inválido!\n",i+1);
		        }
		}
	}
	public static void sexoFuncionarios(Funcionario[] funcionario) {
		int homens = 0;
	    int mulheres= 0;
	    	for(int i=0;i<funcionario.length;i++) {
	        if (funcionario[i].getSexo()== 'M') {
	        	homens++;
	        } else if (funcionario[i].getSexo() == 'F') {
	        	mulheres++;
	        }
	    }

	    	System.out.format("Contém %d funcionários do sexo masculino!\n",homens);
	    	System.out.format("Contém %d funcionários do sexo feminino!\n",mulheres);
	}
	public static void maior_menor_SalarioLiquido(Funcionario[] funcionario) {
			Funcionario MaiorSalario = funcionario[0];
		    Funcionario MenorSalario = funcionario[0];
		    
		    for (int i = 1; i < funcionario.length; i++) {
		        if (funcionario[i].calcularSalarioLiquido() > MaiorSalario.calcularSalarioLiquido()) {
		            MaiorSalario = funcionario[i];
		        }

		        if (funcionario[i].calcularSalarioLiquido() < MenorSalario.calcularSalarioLiquido()) {
		            MenorSalario = funcionario[i];
		        
		    }
		} System.out.format("*************** MOSTRANDO FUNCIONARIO COM MAIOR SALÁRIO(LIQUIDO) ***************\n%s",MaiorSalario.toString());
	    System.out.format("\n*************** MOSTRANDO FUNCIONARIO COM MENOR SALÁRIO(LIQUIDO) ***************\n%s",MenorSalario.toString());
	}
	public static void imprime_MaisNovo_MaisVelho(Funcionario[] funcionario) {
		Funcionario MaisNovo=funcionario[0];
		Funcionario MaisVelho=funcionario[0];
		for(int i=0;i<funcionario.length;i++) {
			if(funcionario[i].calcularIdade()>MaisVelho.calcularIdade()) {
				MaisVelho=funcionario[i];
			}if(funcionario[i].calcularIdade()<MaisNovo.calcularIdade()) {
				MaisNovo=funcionario[i];
			}
		}System.out.format("O funcionario mais novo possui %d anos!\nE o mais velho possui %d anos\n",MaisNovo.calcularIdade(),MaisVelho.calcularIdade());
	}
}