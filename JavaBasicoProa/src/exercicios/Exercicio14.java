/*Ler dois valores (considere que não 
 * serão lidos valores iguais) e escrevê-los
 *  em ordem crescente*/
package exercicios;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		float primeiro=sc.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		float segundo=sc.nextFloat();
		
		if (primeiro>segundo) {
			System.out.println("Ordem crescente:"+segundo+","+primeiro);
		} else {
			System.out.println("Ordem crescente:"+primeiro+","+segundo);
			sc.close();
		}
	}

}
