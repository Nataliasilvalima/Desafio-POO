package br.com.gft.model;

import java.util.Iterator;

import br.com.gft.interfaces.Imposto;

public class Livro extends  Produto implements Imposto{
	String autor;
	String tema;
	Integer qtdPag;
	
public Livro() {
		
	}
public Livro(String nome, double preco, Integer qtd, String autor, String tema, Integer qtdPag) {
	this.nome = nome;
	this.preco = preco;
	this.qtd = qtd;
	this.autor = autor;
	this.tema = tema;
	this.qtdPag = qtdPag;
}

public String getAutor() {
	return autor;
	}
	
public Integer getQtdPag() {
	return qtdPag;
}

public String getTema() {
	return tema;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public void setQtdPag(Integer qtdPag) {
	this.qtdPag = qtdPag;
}

public void setTema(String tema) {
	this.tema = tema;
}
	
@Override
public String toString() {
	return "Titulo:"+ this.getNome() + " Preco:" + this.getPreco()  + " Quantidade:" + 
			this.getQtd() + " em estoque.\n";
	
	}

@Override
public void calculaImposto() {
	double total;
	if(getTema().equalsIgnoreCase("educativo")) {
		System.out.printf("Livro educativo nao tem imposto: %s\n", this.getNome());
	}else {
		total = (getPreco() * 10) / 100;
		System.out.printf("%.1f de impostos sobre o livro %s\n",total, this.getNome());
	}
	
  }
}



