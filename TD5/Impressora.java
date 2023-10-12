package ImpressãoDeCuponsFiscais;

public class Impressora {
	public void imprimirNota(CupomFiscal c) {
		System.out.format("            %s    \nCNPJ:%s\n------------------------------------\nCNPJ/CPF consumidor:%s\n------------------------------------\n"
				+ "            CUPOM FISCAL          \nITEM        CÓDIGO       DESCRIÇÃO\n        QTDxUNITÁRIO      VALOR(R$)\n____________________________________\n"
				+ "001        %d %s         %.2f\nTOTAL R$                   %.2f\n"
				+ "VALOR RECEBIDO R$          %.2f\nTROCO R$                   %.2f\n------------------------------------\n",c.nomeloja,c.cnpj,c.cpfConsumidor,c.listaItem.getCodigo(),c.listaItem.getNome(),c.listaItem.calculoValorTotal(),c.totalPago,c.dinheiroRecebido,c.troco);	
	}
	public void imprimirNota(CupomFiscal []c) {
		System.out.format("\t%s\t\nCNPJ:%s\n------------------------------------\nCNPJ/CPF consumidor:%s\n------------------------------------\n"
				+ "\t\tCUPOM FISCAL\t\nITEM\tCÓDIGO\tDESCRIÇÃO\n\t\tQTDxUNITÁRIO\tVALOR(R$)\n____________________________________\n");
	}
}
