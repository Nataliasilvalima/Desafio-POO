public abstract class Personagem {
	private String nome;
	private  int vida ;
	private int mana;
	private float xp ;
	private int inteligencia;
	private int forca;
	private int level ;
	private static int maxVidas = 5;
	static int qntJogadores = 0;
	
	public Personagem() {

	}
	
	public Personagem(String nome, int vida,  int mana, float xp, int inteligencia, int forca, int level) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
		qntJogadores++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public float getXp() {
		return xp;
	}
	public void setXp(float xp) {
		this.xp = xp;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public  void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
	
		return super.toString();
	}
	
	abstract  void iviUp();
	
	abstract void attack();
	
	 void addVidas() {
		if(this.vida < maxVidas ) {
			this.vida++;
		}
	}
	
	void info() {
		System.out.printf("Nome: %s\n", this.nome);
		System.out.printf("Mana: %d\n", this.mana);
		System.out.printf("Xp: %.1f\n", this.xp);
		System.out.printf("Inteligencia: %d\n", this.inteligencia);
		System.out.printf("Forca: %d\n", this.forca);
		System.out.printf("Vidas: %d\n", this.vida);
		System.out.printf("Level: %d\n", this.level);
		System.out.printf("Personagens: %d\n" ,qntJogadores);
		System.out.println("----------------------------");
		System.out.println("****************************");
	}
}