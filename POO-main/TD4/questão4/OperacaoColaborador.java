package registroFuncionarios;
import java.util.GregorianCalendar;
import registroFuncionarios.Colaborador;

public class OperacaoColaborador {
	public static void validarColaboradores(Colaborador []colaboradores) {
		for(Colaborador objeto: colaboradores) {
			 if (objeto == null) {
		            System.out.println("Colaborador é invalido: objeto nulo");
		            continue;
		        }
			try {if(objeto.validaCPF() && objeto.validaDataAdmissao()) {
				System.out.format("colaborador válido:\n\tCPF: %s\nData de Admissao:%d/%d/%d\n",objeto.getCPF(),objeto.getDataAdmissao().get(GregorianCalendar.DAY_OF_MONTH),objeto.getDataAdmissao().get(GregorianCalendar.MONTH) + 1,objeto.getDataAdmissao().get(GregorianCalendar.YEAR));
			}else {
				System.out.format("colaborador inválido:\n\tCPF: %s\nData de Admissao:%d/%d/%d\n",objeto.getCPF(),objeto.getDataAdmissao().get(GregorianCalendar.DAY_OF_MONTH),objeto.getDataAdmissao().get(GregorianCalendar.MONTH) + 1,objeto.getDataAdmissao().get(GregorianCalendar.YEAR));
				}
			}catch (NullPointerException e) {
	            System.out.println("Erro na validacao do colaborador: " + e.getMessage());
	        }		
		}
	}
	public static void verificaExistenciaPorCPF(Colaborador []colaboradores, String cpf) {
		boolean achou=false;
		if(cpf.length()!=14) {
			System.out.println("CPF inválido!");
		}else {
			for(Colaborador elemento: colaboradores) {
				if(elemento != null && elemento.getCPF().equals(cpf)) {
					System.out.println("existe um colaborador com esse Cpf!");
					achou=true;
					break;
				}
			}if(achou==false) {
				System.out.println("não há colaborador com esse cpf!");
			}
		}
	}
	public static void mostraColaboradorMaisTempo(Colaborador []colaboradores) {
		Colaborador colaboradorMaisTempo=colaboradores[0];
		for(int i=0;i<3;i++) {
			if(colaboradores[i].getDataAdmissao().get(GregorianCalendar.YEAR) > colaboradorMaisTempo.getDataAdmissao().get(GregorianCalendar.YEAR))
				colaboradorMaisTempo=colaboradores[i];
		}
		System.out.println("******* Mostrando Colaborador que trabalha a mais tempo *******");
		System.out.format("\tNome: %s\n",colaboradorMaisTempo.getNome());
		System.out.format("\tData de Admissao: %d/",colaboradorMaisTempo.getDataAdmissao().get(GregorianCalendar.DAY_OF_MONTH));
		System.out.format("%d/",colaboradorMaisTempo.getDataAdmissao().get(GregorianCalendar.MONTH)+1);
		System.out.format("%d\n",colaboradorMaisTempo.getDataAdmissao().get(GregorianCalendar.YEAR));
	}
}
