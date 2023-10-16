package ImpressãoDeCuponsFiscais;

public class LojaInvalidaExcecao extends Exception{
	public LojaInvalidaExcecao(String mensagem) {
        System.err.println("Erro: " + mensagem);
    } 
}
