/* Ler  um  valor  e  escrever  a  mensagem  
 * �  MAIOR  QUE  10!  se  o  valor  lido  for  
 * maior  que  10,  caso contr�rio escrever 
 * N�O � MAIOR QUE 10! */
package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner ya=new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor=ya.nextInt();
		if(valor>10) {
			System.out.println("� maior que 10!");
		}
		else {
			System.out.println("N�o � maior que 10 !");
		}
	} 
}
