/*Ler um valor e escrever se é 
 * positivo ou negativo (considere o 
 * valor zero como positivo). */
package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner ya=new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor=ya.nextInt();
		if(valor>=0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		}

}
