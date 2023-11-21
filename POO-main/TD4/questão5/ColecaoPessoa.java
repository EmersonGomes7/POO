package questao5;

public class ColecaoPessoa implements Colecao{
	private Pessoa[] dados= new Pessoa[100];
	private int posicaoCorrente;
	
	public Pessoa getPessoa(int indice) {
		return dados[indice];
	}
	public void setPessoa(int indice, Pessoa pessoa) {
		dados[indice] = pessoa;
	}
	@Override
	public boolean inserir(Pessoa p) {
		  posicaoCorrente=0;
	      while(dados[posicaoCorrente] != null) { 
	    	  if(posicaoCorrente>=99) {
	    		  return false;
	    	  }
	    	 posicaoCorrente++;
	      }
	       dados[posicaoCorrente]=p;          
	   return true;
	}	
	@Override
	public boolean remover(int indice) {
		if (indice<0 || indice>99)
            return false;
		dados[indice]=null;
		return true;
	}
	@Override
	public boolean atualizar(int indice, Pessoa p) {
		if(p==null || indice <0 || indice >=dados.length)
			return false;
		else {
		dados[indice]=p;
		return true;
		}
	}
	@Override
	public boolean pesquisar(Pessoa p) {	
		for(int i=0; i<dados.length; i++)
			if (dados[i] != null && p.getNome().equals(dados[i].getNome())) {
			    return true;
			}       
        return false;
	}
	@Override
	public boolean colecaoEstaVazia() {
	    for (int i = 0; i < dados.length; i++) {
	        if (dados[i] != null) {
	            return false; 
	        }
	    }
	    return true; 
	}
	@Override
	public void imprimirDadosColecao() {
		for(int i=0; i<dados.length; i++){ 	
			   if(dados[i]==null){
				   break;
			   }else
				   System.out.println(dados[i]);
	      } 	
	}
	@Override
	public Pessoa retornarObjeto(int indice) {
		return dados[indice];
	}
	@Override
	public boolean remover() {
		for(int i=0;i<dados.length;i++) {
			dados[i]=null;
		}
		return true;
	}
}
