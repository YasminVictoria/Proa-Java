 /* Ler  as  notas  da  1a.  e  2a.  
  * avalia��es  de  um  aluno.  Calcular  
  * a  m�dia aritm�tica  simples  e  
  * escrever uma mensagem que diga se o 
  * aluno foi ou n�o aprovado (considerar 
  * que nota igual ou maior que 6 o aluno � 
  * aprovado). Escrever tamb�m a m�dia 
  * calculada. 
  */
package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a nota da primeira avalia��o:");
		float primeira=sc.nextFloat();
		
		System.out.println("Digite a nota da segunda avalia��o:");
		float segunda=sc.nextFloat();
		float media=(primeira + segunda)/2;
		
		if (media>=6) {
			System.out.println("APROVADO. Sua m�dia foi de:"+media);
		} else {
			System.out.println("REPROVADO. Sua m�dia foi de:"+media);
			sc.close();
		}
	}

}
