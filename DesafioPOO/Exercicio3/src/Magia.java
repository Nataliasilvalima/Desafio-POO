public class Magia {
	private String nome;
	
public Magia(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}	

@Override
public String toString() {
	return  this.getNome();
 }
}