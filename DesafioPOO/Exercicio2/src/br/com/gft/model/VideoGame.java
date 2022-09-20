package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
	private String marca;
	private String modelo;
	private Boolean isUsado;
	
	public VideoGame() {
		
	}
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		this.isUsado  = isUsado;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Video - Game:" + this.getModelo() + " Preco:" + this.getPreco() + " Quantidade:" + this.getQtd() + " em estoque.\n";
		
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public boolean getIsUsado() {
		return isUsado;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setUsado(Boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public void calculaImposto( ) {
		double total;
		if(getIsUsado() == true) {
			total = (getPreco() * 25)/ 100;
			System.out.printf("Imposto %s usado, R$%.1f\n",this.getNome(), total);
		}else {
			total = (getPreco() * 45)/ 100;
			System.out.printf("Imposto %s, R$%.1f\n\n",this.getNome(), total);
		}
	}
}