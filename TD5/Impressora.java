package ImpressãoDeCuponsFiscais;

public class Impressora {
	public void imprimirNota(CupomFiscal c) {

		System.out.format("\t %s\t\nCNPJ:%s\n------------------------------------\nCNPJ/CPF consumidor:%s\n------------------------------------\n"
				+ "\tCUPOM FISCAL\t\nITEM\t CÓDIGO \tDESCRIÇÃO\n\tQTDxUNITÁRIO\t VALOR(R$)\n____________________________________\n"
				+ "001\t%03d %s\t\n\t %dx%.2f \t%.2f\nTOTAL R$\t\t%.2f\n"
				+ "VALOR RECEBIDO R$          %.2f\nTROCO R$                   %.2f\n------------------------------------\n",c.nomeloja,c.cnpj,c.cpfConsumidor,c.listaItem.getCodigo(),c.listaItem.getNome(),c.listaItem.getQuantidade(),c.listaItem.getValorUnitario(),c.listaItem.calculoValorTotal(),c.totalPago,c.dinheiroRecebido,c.troco);	
	}
	
	public void imprimirNota(CupomFiscal []cupom) {
		double total=0.0;
		double valorRecebido=0.0;
		double troco=0.0;
		for(int i=0;i<cupom.length;i++) {
			total+=cupom[i].listaItem.calculoValorTotal();
			valorRecebido+=cupom[i].dinheiroRecebido;
		}
		troco=valorRecebido-total;
		System.out.format("\t%s\t\nCNPJ:%s\n------------------------------------\nCNPJ/CPF consumidor:%s\n------------------------------------\n"
				+ "\tCUPOM FISCAL\t\nITEM\tCÓDIGO\t\tDESCRIÇÃO\n\tQTDxUNITÁRIO\tVALOR(R$)\n____________________________________\n",cupom[0].nomeloja,cupom[0].cnpj,cupom[0].cpfConsumidor);
		for(int i=0;i<cupom.length;i++) {
			System.out.format("%03d \t %03d %s\n\t%dx%.2f \t\t %.2f\n",i+1,cupom[i].listaItem.getCodigo(),cupom[i].listaItem.getNome(),cupom[i].listaItem.getQuantidade(),cupom[i].listaItem.getValorUnitario(),cupom[i].listaItem.calculoValorTotal());
			}
		System.out.format("TOTAL R$                   %.2f\nVALOR RECEBIDO R$          %.2f\nTROCO R$                   %.2f\n------------------------------------\n",total,valorRecebido,troco);
		
	}
}
