import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	
	Random random = new Random();
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome,vida, mana, xp, inteligencia, forca, level);
	}
	 
	List<Magia> magia = new ArrayList<>(){{
		add(new Magia("Evocacao"));
		add(new Magia("Adivinhacao"));
		add(new Magia("Conjuracao"));
		add(new Magia("Ilusao"));
		add(new Magia("Encantamento"));
		
}};

void listaMagia() {
	System.out.println(magia);
}

    @Override
	void iviUp() {
		if(getLevel() > 1) {
			this.setMana(this.getMana() + 100);
			this.setInteligencia(this.getInteligencia() + 300);
			System.out.println("Mana: " +this.getMana() +"\nInteligencia:"+ this.getInteligencia());
		  }
		}
	
   @Override
   void attack() {
		int ataque= ((getInteligencia() * getLevel()) + random.nextInt(301));
		System.out.println("Mago seu ataque foi de " + ataque + " pontos.\n");
		System.out.println("------------------------------------------------------");
		System.out.println("****************************************************\n");
	}
	
	void aprenderMagia (String magia){
		System.out.println("Sua nova magia e :" + magia);
		
	}
	
	@Override
	public String toString() {
		
		return "Magia:" +  this.getNome();
	 }
}
