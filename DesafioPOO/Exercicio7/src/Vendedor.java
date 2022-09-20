
public class Vendedor extends Funcionario {

	public Vendedor() {
		
	}
	
	public Vendedor(String nome, double salario, int idade) {
		super(nome, salario, idade);
	}
	
	
	@Override
	public double bonificacao(double salario) {
		double total = salario + 3000.00;
		
		return total;
	}

	@Override
	public String cadastrar(String nome, int idade, double salario ) {
		
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
		
		return null;
	}

	@Override
	public void imprimir(String nome, int idade, double salario) {
		
		System.out.printf("Dados do funcionario: \nNome: %s \nIdade: %d \nSalario: %.2f",nome, idade, salario);
		
	}

}
