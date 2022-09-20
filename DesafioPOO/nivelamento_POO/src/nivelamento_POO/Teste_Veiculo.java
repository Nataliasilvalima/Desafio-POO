package nivelamento_POO;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Teste_Veiculo {
	public static void main(String [] argv) throws Exception {
		Scanner scan = new Scanner(System.in);
		Veiculo automovel = new Veiculo();
		System.out.println("Informe os dados do seu veiculo:");
		System.out.println("Modelo:");
		automovel.setModelo(scan.nextLine());
		System.out.println("Marca:");
		automovel.setMarca(scan.nextLine());
		System.out.println("Placa:");
		automovel.setPlaca(scan.nextLine());
		System.out.println("Cor:");
		automovel.setCor(scan.nextLine());
		System.out.println("KM:");
		automovel.setKm(scan.nextFloat());
		System.out.println("Quantos litros de Combustivel:");
		automovel.setLitrosCombustivel(scan.nextInt());
		System.out.println("Velocidade");
		automovel.setVelocidade(scan.nextInt());
		System.out.println("Preco:");
		automovel.setPreco(scan.nextDouble());
		System.out.println("Estado: (True = Ligado ou Desligado)");
		automovel.setIsLigado(scan.nextBoolean());
		
		System.out.println("Dados informados:\nModelo: "+ automovel.getModelo() +"\nMarca:" + automovel.getMarca() + "\nPlaca:" + automovel.getPlaca()+
				"\nCor:" + automovel.getCor() + "\nKM: " + automovel.getKm() + "\nListros de Combustivel: " + automovel.getLitrosCombustivel() + "Litros"
				+ "\nEstado: " + automovel.getIsLigado());
		System.out.printf("Preco: %.2f \nVelocidade: %d KM/h \nKM: %.1f\n ",automovel.getPreco(), automovel.getVelocidade(), automovel.getKm());
		
		System.out.println("Informe a opcao desejada:");
		System.out.println("1- Acelerar automovel.\n2- Abastecer.\n3- Frear.\n4- Ligar automovel.\n5- Pintar automovel."
				+ "\n6- Desligar Automovel.\n7- Sair.");
	try {
			int opcao = scan.nextInt();	
			while(opcao != 7) {
				switch(opcao) {
					case 1:
						automovel.acelerar(automovel.getVelocidade());
						break;
					case 2:
						System.out.println("Informe a quantidade de combustivel que deseja adicionar:");
						int quantidade = scan.nextInt();
						int total = automovel.abastecer(quantidade);
						automovel.setLitrosCombustivel(total);
						System.out.println("Seu tanque agora esta com "+ automovel.getLitrosCombustivel() + "Litros");
						break;
					case 3:
						automovel.frear(automovel.getVelocidade());
						break;
					case 4:
						automovel.ligar(automovel.getIsLigado());
						break;
					case 5:
						System.out.println("\nInforme a cor desejada:");
						String corNova = scan.next();
						automovel.pintar(corNova);
						break;
					case 6:
						automovel.desligar(automovel.getIsLigado(), automovel.getVelocidade());
						break;
					default:
							System.out.println("Entrada invalida, favor verificar e digitar novamente:");
							break;
						}
	
				System.out.println("Informe a opcao desejada:");
				System.out.println("1- Acelerar automovel.\n2- Abastecer.\n3- Frear.\n4- Ligar automovel.\n5- Pintar automovel."
						+ "\n6- Desligar Automovel.\n7- Sair.");
			opcao = scan.nextInt();
					
					
				}
		
			}catch (NoSuchElementException exception) {
				System.out.println("O programa encontrou um exception.");
			}finally {
				System.out.println("");
			}
	scan.close();
		}
		
	}

   
