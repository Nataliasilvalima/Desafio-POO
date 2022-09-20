package exercicio4;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome:" + this.getNome() + "Idade: " + this.getIdade();
	}
	
	public int compareTo(Pessoa alguem) {
		return (this.idade - alguem.getIdade());
	}
}