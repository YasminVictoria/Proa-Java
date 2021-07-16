 /* Ler  as  notas  da  1a.  e  2a.  
  * avaliações  de  um  aluno.  Calcular  
  * a  média aritmética  simples  e  
  * escrever uma mensagem que diga se o 
  * aluno foi ou não aprovado (considerar 
  * que nota igual ou maior que 6 o aluno é 
  * aprovado). Escrever também a média 
  * calculada. 
  */
package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a nota da primeira avaliação:");
		float primeira=sc.nextFloat();
		
		System.out.println("Digite a nota da segunda avaliação:");
		float segunda=sc.nextFloat();
		float media=(primeira + segunda)/2;
		
		if (media>=6) {
			System.out.println("APROVADO. Sua média foi de:"+media);
		} else {
			System.out.println("REPROVADO. Sua média foi de:"+media);
			sc.close();
		}
	}

}
