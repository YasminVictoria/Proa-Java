/* Ler  o  ano  atual  e  o  ano  de  
 * nascimento  de  uma  pessoa.  
 * Escrever  uma mensagem  que  diga  se  
 * ela poderá ou não votar este ano (não é 
 * necessário considerar o mês em que a 
 * pessoa nasceu*/
package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o ano atual:");
		float atual=sc.nextFloat();
		
		System.out.println("Digite o ano que você nesceu:");
		float nasceu=sc.nextFloat();
		
		float idade = (atual - nasceu);
		
		if (idade>=16) {
			System.out.println("Você já pode votar este ano!");
		} else {
			System.out.println("Você ainda não pode votar este ano!");
			sc.close();
		}
	}

}
