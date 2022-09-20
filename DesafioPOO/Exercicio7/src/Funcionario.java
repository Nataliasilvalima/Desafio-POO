
public abstract class Funcionario {
	private String nome;
	private double salario;
	private int idade;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, double salario, int idade) {
		this.nome = nome;
		this.salario = salario;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome :" + this.getNome() + "Idade: " + this.getIdade() + "Salario: " + this.getSalario();
	}
	
	public abstract double bonificacao(double salario);
	
	public abstract String cadastrar(String nome, int idade, double salario );
	
	public abstract void imprimir (String nome, int idade, double salario);
}
