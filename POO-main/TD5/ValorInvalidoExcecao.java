package ImpressãoDeCuponsFiscais;

public class ValorInvalidoExcecao extends Exception {
		public ValorInvalidoExcecao(String texto) {
        System.err.println("Erro: " + texto);
    }
}



