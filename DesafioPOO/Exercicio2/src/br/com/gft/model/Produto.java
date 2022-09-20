package br.com.gft.model;

public abstract class  Produto {
	protected String nome;
	protected  Double preco;
	protected  Integer qtd;
	
	public Produto() {
		
	}
			
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	@Override
	public String toString() {
		return "Produto:" + this.getNome() + "Preco: " + this.getPreco() + "Quantidade: " + this.getQtd();
	}
	
		
		
	
}
