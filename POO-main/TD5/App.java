package ImpressãoDeCuponsFiscais;

public class App {

	public static void main(String[] args) {
		Item item1=new Item(88,"arroz",5.50,2);
		Item item2=new Item(21,"feijao",7,2);
		Item item3=new Item(11,"trigo",3.29,3);
		
		Impressora impressao=new Impressora();
		
		
		CupomFiscal cupom1=new CupomFiscal("Mercadinho ABC","01.111.111/0001-19","000.111.222-33","99.888.777/0001-44",20.0,item1);
		CupomFiscal cupom2=new CupomFiscal("Mercadinho ABC","01.111.111/0001-19","000.111.222-33","99.888.777/0001-44",20.0,item2);
		CupomFiscal cupom3=new CupomFiscal("Mercadinho ABC","01.111.111/0001-19","000.111.222-33","99.888.777/0001-44",20.0,item3);
		
		CupomFiscal []cupons= {cupom1,cupom2,cupom3};
		
		impressao.imprimirNota(cupom1);
		impressao.imprimirNota(cupons);
			
	}
}
