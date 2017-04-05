package aula04ex.exemploMoodle;

public class Produto {
	private String descricao;
	private double preco;
	private double desconto;
	private int quantidade;
	
	/**
	 * Construtor para inicializar um objeto do tipo Produto.
	 */
	public Produto(String descricao, double preco, int quantidade) {
		this.descricao = descricao;
		this.preco = preco;
		if (quantidade>0)
			this.quantidade = quantidade;
		else
			this.quantidade = 0;
		this.desconto = 0;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public double getDesconto() {
		return this.desconto;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setDesconto(double desconto) {
		if (desconto<=100) {
			this.desconto = desconto;
		}
	}
	
	public double getPrecoTotal() {
		return this.getQuantidade()*this.getPreco();
		//return this.quantidade*this.preco;
	}
	
	public double getPrecoDesconto() {
		return this.getPrecoTotal() - this.getPrecoTotal()*(this.getDesconto()/100);
	}
	
	
	
}