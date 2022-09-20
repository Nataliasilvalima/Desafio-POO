import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	Random random = new Random();
	public Guerreiro() {
		
	}
	public Guerreiro(String nome,int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level); 
	}
	
	List<Habilidades> habilidades = new ArrayList<>(){{
		add(new Habilidades("Forca"));
		add(new Habilidades("Arco e flecha"));
		add(new Habilidades("Espadas"));
		add(new Habilidades("Lancas"));
		add(new Habilidades("Combate"));
		
	}};
	
	void listaHabilidades() {
		System.out.println(habilidades);
	}
	
	@Override
	 void attack() {
		int ataque = (this.getForca() * this.getLevel()) + random.nextInt(301);
		System.out.println("Guerreiro seu ataque foi de " + ataque + " pontos.\n");
		System.out.println("------------------------------------------------------");
		System.out.println("****************************************************\n");
	}
	
	 void aprenderHabilidade (String string){
		System.out.println("Sua nova habilidade e :" + string);
}

	@Override
	void iviUp() {
		if(getLevel() > 1) {
			this.setVida(this.getVida() + 2) ;
			this.setForca(this.getForca() + 300);
			System.out.println("Vida:" +this.getVida() +"\nForca:"+ this.getForca());
		  }
	}
}