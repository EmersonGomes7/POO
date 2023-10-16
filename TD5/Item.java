package ImpressãoDeCuponsFiscais;

public class Item {
	private int codigo;
	private String nome;
	private double valorUnitario;
	private int quantidade;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Item() {}
	public Item(int codigo,String nomeItem,double valor,int quantidade) {
		setCodigo(codigo);
		setNome(nomeItem);
		setValorUnitario(valor);
		setQuantidade(quantidade);
	}
	
	public double calculoValorTotal() {	
		 try {
	            int quantidade = getQuantidade();

	            if (quantidade <= 0 || getValorUnitario() <= 0) {
	                System.err.println("Erro: A quantidade e o valor unitário devem ser positivos.");
	                return -1;
	            }

	            return getValorUnitario() * quantidade;
	        } catch (NumberFormatException e) {
	            System.err.println("Erro, quantidade errada .");
	        } catch (Exception e) {
	            System.err.println("Erro: " + e.getMessage());
	        }
	        return -1;
	    }
	}

