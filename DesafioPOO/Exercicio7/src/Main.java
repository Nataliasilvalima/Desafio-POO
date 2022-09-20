import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Gerente gerente = new Gerente();
		Supervisor supervisor = new Supervisor();
		Vendedor vendedor = new Vendedor();
		
		System.out.println("\nSeja bem vindo!!\nPara cadastrar funcionarios, favor selecione o menu a seguir:");
		System.out.println("1- Gerente.\n2- Supervisor.\n3- Vendedor.\n4- Sair.");
		int opcao = scan.nextInt();
		while(opcao < 4) {
			switch(opcao){
				case 1:
					System.out.println("Informe os dados do funcionario:");
					System.out.println("Nome:");
					String nomeGerente = scan.next();
					System.out.println("Idade:");
					int idadeGerente = scan.nextInt();
					System.out.println("Salario:");
					double salarioGerente = scan.nextDouble();
					gerente.cadastrar(nomeGerente, idadeGerente, salarioGerente);
					double totalSalario = gerente.bonificacao(salarioGerente);
					gerente.imprimir(nomeGerente, idadeGerente, totalSalario);
					break;
				case 2:
					System.out.println("Informe os dados do funcionario:");
					System.out.println("Nome:");
					String nomeSupervisor = scan.next();
					System.out.println("Idade:");
					int idadeSupervisor = scan.nextInt();
					System.out.println("Salario:");
					double salarioSupervisor = scan.nextDouble();
					supervisor.cadastrar(nomeSupervisor, idadeSupervisor, salarioSupervisor);
					double total = supervisor.bonificacao(salarioSupervisor);
					supervisor.imprimir(nomeSupervisor, idadeSupervisor, total);
					break;
				case 3:
					System.out.println("Informe os dados do funcionario:");
					System.out.println("Nome:");
					String nomeVendedor = scan.next();
					System.out.println("Idade:");
					Integer idadeVendedor = scan.nextInt();
					System.out.println("Salario:");
					Double salarioVendedor = scan.nextDouble();
					vendedor.cadastrar(nomeVendedor, idadeVendedor, salarioVendedor);
					double totalVendedor = vendedor.bonificacao(salarioVendedor);
					vendedor.imprimir(nomeVendedor, idadeVendedor, totalVendedor);
					break;
				default:
					System.out.println("Entrada invalida, favor verificar e digitar novamente:");
					break;
			  }
			System.out.println("\nSeja bem vindo!!\nPara cadastrar funcionarios, favor selecione o menu a seguir:");
			System.out.println("1- Gerente.\n2- Supervisor.\n3- Vendedor.\n4- sair.");
			opcao = scan.nextInt();
		}
	scan.close();		
	}
}
