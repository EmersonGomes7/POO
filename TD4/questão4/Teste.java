package registroFuncionarios;
import java.util.GregorianCalendar;
import registroFuncionarios.*;

public class Teste {
	public static void main(String[]args) {
	Colaborador []colaboradores= new Colaborador[3];
	colaboradores[0] = new Colaborador("111.111.111-11", "emerson", 'M', 5000.0, new GregorianCalendar());
    colaboradores[1] = new Colaborador("222.222.222-22", "maria", 'F', 1000.0, new GregorianCalendar());
    colaboradores[2] = new Colaborador("333.333.333-33", "joao", 'M', 2500.0, new GregorianCalendar());
    
    System.out.println("hello world");
    OperacaoColaborador.mostraColaboradorMaisTempo(colaboradores);
    OperacaoColaborador.verificaExistenciaPorCPF(colaboradores, "333.333.333-33");
    OperacaoColaborador.validarColaboradores(colaboradores);
    System.out.println("end of program");
	}
}
