package ImpressãoDeCuponsFiscais;


public class CupomFiscal {
	 String nomeloja;
	 String cnpj;
	 double totalPago;
	 String cpfConsumidor;
	 String cnpjConsumidor;
	 double dinheiroRecebido;
	 double troco;
	 Item listaItem;
	 
	public CupomFiscal(String nomeloja, String cnpj,String cpfConsumidor, String cnpjConsumidor,
			double dinheiroRecebido,Item listaItem) {
		try {
		if (nomeloja == null || nomeloja.isEmpty()) {
		    throw new LojaInvalidaExcecao("O nome da loja nulo ou vazio.");
			}
		}
		catch(LojaInvalidaExcecao mensagem) {
			System.err.println("Erro: " + mensagem.getMessage());
            return;   
        }
		
		this.nomeloja = nomeloja;
		this.cnpj = cnpj;
		this.cpfConsumidor = cpfConsumidor;
		this.cnpjConsumidor = cnpjConsumidor;
		  try {
	            if (dinheiroRecebido < 0) {
	                throw new ValorInvalidoExcecao("O valor recebido não pode ser negativo.");
	            }
	        } catch (ValorInvalidoExcecao e) {
	            System.err.println("Erro ao criar Cupom Fiscal: " + e.getMessage());
	            return; 
	        }
		this.dinheiroRecebido = dinheiroRecebido; 
		this.troco = dinheiroRecebido - totalPago;
		this.listaItem = listaItem;
		  try {
	            if (listaItem != null) {
	                this.totalPago = listaItem.calculoValorTotal();
	            } 
		  }catch (NullPointerException e) {
	            System.err.println("Erro");
	            } catch (Exception e) {
	            System.err.println("Erro " + e.getMessage());
	            }	
	}
}
	
