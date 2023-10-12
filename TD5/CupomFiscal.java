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
	 
	public CupomFiscal(String nomeloja, String cnpj, double totalPago, String cpfConsumidor, String cnpjConsumidor,
			double dinheiroRecebido, double troco, Item listaItem) {
		this.nomeloja = nomeloja;
		this.cnpj = cnpj;
		this.totalPago = totalPago;
		this.cpfConsumidor = cpfConsumidor;
		this.cnpjConsumidor = cnpjConsumidor;
		this.dinheiroRecebido = dinheiroRecebido;
		this.troco = troco;
		this.listaItem = listaItem;
	}
	
	
   
}
