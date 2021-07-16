/* Ler dois valores (considere que não 
 * serão lidos valores iguais) e 
 * escrever o maior deles.*/
package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		float primeiro=sc.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		float segundo=sc.nextFloat();
		
		if (primeiro>segundo) {
			System.out.println("O maior é: "+primeiro);
		} else {
			System.out.println("O maior é: "+segundo);
			sc.close();
		}
	}

}

