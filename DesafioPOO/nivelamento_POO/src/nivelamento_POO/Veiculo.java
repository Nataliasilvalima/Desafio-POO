package nivelamento_POO;

import java.util.Scanner;

public class Veiculo {
	Scanner scan = new Scanner(System.in);

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean ligado, int litros,
			int velocidade, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = ligado;
		this.litrosCombustivel = litros;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean getIsLigado() {
		return isLigado;
	}

	public void setIsLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	@Override
	public String toString() {
		return 
		"Veiculo:\n Modelo:" + this.getModelo() + "\nMarca:" + this.getMarca()+ "\nPreco:"+ this.getPreco() + "\nPlaca: " + this.getPlaca() +
		"\nCor" + this.getCor() + "\nKM : " + this.getKm() + "\nVeiculo Ligado: " + this.getIsLigado() + 
		"\nCombustivel:"+ this.getLitrosCombustivel() + "\nVelocidade: " + this.getVelocidade(); 	}
	
	public void acelerar(int velocidade) {
		int total = velocidade + 20;
		System.out.println("Sua velocidade agora e: " + total +"KM/h");	
}
	
	public int abastecer(int combustivel) {
		int tanque = litrosCombustivel + combustivel;
		if(tanque >= 60) {
			System.out.printf(" Favor verificar a quantidade do combustivel a ser colocado %d ultrapassou a capacidade do tanque!", tanque);
			while(tanque >= 60) {
				System.out.println("Favor digite quanto de combustivel deseja colocar no tanque:");
				combustivel = scan.nextInt();
				tanque = litrosCombustivel + combustivel;
		}
		}else {
			System.out.println("Tanque abastecido!");
		}
		
		return tanque;
	}
	
	public void frear(int velocidade) {
		if (velocidade == 0) {
			System.out.println("Veiculo parado ja se encontra parado.");
		}else {
			int diminuir = velocidade - 20;
			System.out.printf("Sua velocidade foi reduzida para %d.", diminuir);
	}
	}
	
	public void pintar(String core) {
		this.setCor(core);	
		System.out.println("Cor do veiculo alterada, seu veiculo agora e " + this.getCor() + ".");
	}
	public void ligar(boolean estado ) {
		if(estado == false) {
			estado = true;
			System.out.println("Veiculo ligado com Sucesso!");
		}else {
			System.out.println("Veiculo ja se encontra ligado!");
	}
}	
	
	public void desligar(boolean estado, int velocidade ) {
		int aux = 0;
		do {
			if((estado == true) && (velocidade == 0 )) {
				System.out.println("Veiculo desligado com Sucesso!");
				aux = 1;
			}else if((estado == false) && (velocidade == 0 )) {
				System.out.println("Veiculo ja se encontra desligado!");
				aux = 1;
			}else { 
				System.out.println("Por favor diminua a velocidade para o carro ser desligado!\n" +
						"favor digite sua velocidade para verificacao!");
				velocidade = scan.nextInt();
				System.out.println("Favor digite sue estado para verificacao!");
				estado = scan.nextBoolean();
		  }
		}while(aux == 0);
		scan.close();
	}
 }
	


