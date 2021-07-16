/* Escreva um algoritmo para ler o número total de eleitores de um município, 
 * o número de votos brancos, nulos e válidos. 
 * Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.*/
package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("insira o total de eleitores: ");
		double eleitores=scanner.nextDouble();
		
		System.out.println("Escreva a quantidade de votos brancos: ");
		double brancos=scanner.nextDouble();
		
		System.out.println("Escreva a quantidade de votos nulos: ");
		double nulos=scanner.nextDouble();
		
		System.out.println("Escreva a quantidade de votos validos: ");
		double validos=scanner.nextDouble();
		
		double B = brancos/eleitores * 100;
		double N = nulos/eleitores * 100;
		double V = validos/eleitores * 100;
		
		
		System.out.println("A porcentagem dos é de:"+B+"% Brancos, "+N+"% Nulos, "+V+"% Validos.");
		scanner.close();
	}

}
