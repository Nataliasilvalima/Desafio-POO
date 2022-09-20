import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Personagens criados com Sucesso!!\n");
		System.out.println("----------------------------");
		System.out.println("****************************\n");
		Personagem mago = new Mago("Mestre dos magos",0, 3000, 12, 10000, 750000, 1);
		Personagem guerreiro = new Guerreiro("Vegeta",0, 9000, 12, 20000, 950000, 1);
		
		Personagem mago1= new Mago("Gandalf", 0, 12000, 15, 80000, 1000000, 1);
		Personagem guerreiro1= new Guerreiro("Aragorn",0, 9000, 12, 20000, 950000, 1);
		
		Timer timer = new Timer();
		
		final long minutos = (600000 * 600);
		
		TimerTask tarefa = new TimerTask() {
			
			@Override
			public void run() {
				mago.addVidas();
				guerreiro.addVidas();
			}
		};
		
		timer.scheduleAtFixedRate(tarefa, 0, minutos);
		
		mago.info();
		guerreiro.info();
		mago1.info();
		guerreiro1.info();
		
		System.out.println("Lista de Magias:");
		((Mago) mago).listaMagia();
		System.out.println("------------------------------------------------------");
		System.out.println("****************************************************\n");
		
		System.out.println("Lista de Habilidades:");
		((Guerreiro) guerreiro).listaHabilidades();
		System.out.println("------------------------------------------------------");
		System.out.println("****************************************************\n");
		
		System.out.println("Mago 1: iniciou o ataque:");
		mago.attack();
		System.out.println("Guerreiro 1: iniciou o ataque:");
		guerreiro.attack();
		
		System.out.println("Mago 1 : subiu de nivel, sua pontuacao agora e:");
		mago.setLevel(2);
		mago.iviUp();
		System.out.println("------------------------------------------------------");
		System.out.println("****************************************************\n");
		
		System.out.println("Guerreiro 1:  subiu de nivel, sua pontuacao agora e:");
		guerreiro.setLevel(2);
		guerreiro.iviUp();
		System.out.println("------------------------------------------------------");
		System.out.println("****************************************************\n");
		
		System.out.println("Mago 2: iniciou o ataque:");
		mago1.attack();
		System.out.println("Guerreiro 2 : iniciou o ataque:");
		guerreiro1.attack();
		
		System.out.println("Mago 2: subiu de nivel, sua pontuacao agora e:");
		mago1.setLevel(2);
		mago1.iviUp();
		System.out.println("------------------------------------------------------");
		System.out.println("****************************************************\n");
		
		System.out.println("Guerreiro 2:  subiu de nivel, sua pontuacao agora e:");
		guerreiro1.setLevel(2);
		guerreiro1.iviUp();
		System.out.println("------------------------------------------------------");
		System.out.println("****************************************************\n");
		
		System.out.printf("Guerreiro 1:  sua nova habilidade e: ");
		((Guerreiro) guerreiro1).aprenderHabilidade(" Cacar");
		System.out.printf("Guerreiro 2:  sua nova habilidade e: ");
		((Guerreiro) guerreiro1).aprenderHabilidade(" Montar a cavalo\n");
		
		System.out.printf("Mago 1:  sua nova habilidade e: ");
		((Mago) mago).aprenderMagia(" Feiticos");
		System.out.printf("Mago 2:  sua nova habilidade e: ");
		((Mago) mago1).aprenderMagia(" Usar a varinha\n");
	}
}