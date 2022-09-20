package br.com.gft.model;
import java.util.List;

public class Loja<games> {
	private String nome;
	private String cnpj;
	public List livros;
	public List games;
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> games) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.games = games;
		this.livros = livros;
	}
	
	public Loja() {
		
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List getLivros() {
		return livros;
	}
	
	public void setGames(List games) {
		this.games = games;
	}
	
	public void setLivros(List livros) {
		this.livros = livros;
	}
	
	public List getGames() {
		return livros;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}

	public <Livros> void listaLivros(List<?> livros) {
		if(livros.isEmpty() == true) {
		System.out.println("A loja nao tem livros em  seu estoque.");
		}else {
			System.out.println("\nA loja possui esses livros para venda:");
			System.out.println(livros);
		}
	}
	
	public void listaVideoGames(List<?> games) {
		if(games.isEmpty() == true) {
		System.out.println("A loja nao tem video-games no seu estoque.");
		}else {
			System.out.println("\nA loja possui esses Video - games para venda:");
			System.out.println(games);
		}
	}
    
	public double calculaPatrimonio(List<Livro> livros, List<VideoGame> games) {
        double total = 0;
        for (Livro livros1 : livros) {
			total = total + ( livros1.getPreco() * livros1.getQtd());
		}
        for (VideoGame games1 : games) {
			total = total + ( games1.getPreco() * games1.getQtd());
		}
          		
        return total;
        		
        }	
	}	