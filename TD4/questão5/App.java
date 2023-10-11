package questao5;

import java.util.GregorianCalendar;
public class App {
	public static void main(String[] args) {
        GregorianCalendar data1 = new GregorianCalendar(2000, 01, 30);
        GregorianCalendar data2 = new GregorianCalendar(2010, 12, 20);
        GregorianCalendar data3= new GregorianCalendar(1997,02,10);
        
        ColecaoPessoa colecao = new ColecaoPessoa();
              
        System.out.println("coleção vazia: "+ colecao.colecaoEstaVazia());
        
        Pessoa pessoa1=new PessoaFisica("antonio", "123.456.744-90", data1);  
        Pessoa pessoa2=new PessoaJuridica("emerson", "98765432100", data2);
        Pessoa pessoa3=new PessoaFisica("gomes","77766655599",data3);
        
        
        System.out.println("inseriu pessoa1: "+ colecao.inserir(pessoa2));
        System.out.println("inseriu pessoa2: "+ colecao.inserir(pessoa1));
        
        System.out.println("***** IMPRESSAO DADOS COLEÇÃO *****");
        colecao.imprimirDadosColecao();  
        
        System.out.println("atualizou pessoa: "+ colecao.atualizar(1, pessoa3));
        System.out.println("***** IMPRESSAO DADOS COLEÇÃO *****");
        colecao.imprimirDadosColecao();
        
        System.out.println("achou pessoa: "+ colecao.pesquisar(pessoa2));
        System.out.println("removeu pessoa: "+colecao.remover(1));
        Pessoa pessoa4=colecao.retornarObjeto(0);
        System.out.print(pessoa4);
        
        
        System.out.println("***** IMPRESSAO DADOS COLEÇÃO *****");
        colecao.imprimirDadosColecao();
        
        
    }
}