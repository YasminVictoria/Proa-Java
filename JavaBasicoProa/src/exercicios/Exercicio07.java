/*Fa�a  um  algoritmo  que  leia  tr�s  notas  de  um  aluno,  calcule  e  escreva  a  
 m�dia  final  deste  aluno. Considerar que a m�dia � ponderada e que o peso 
 das notas � 2, 3 e 5. F�rmula para o c�lculo da m�dia final �:*/
package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		Scanner ya= new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Digite a primeira nota:");
		n1=ya.nextInt();
		System.out.println("Digite a primeira nota:");
		n2=ya.nextInt();
		System.out.println("Digite a primeira nota:");
		n3=ya.nextInt();
		float media=(n1*2+n2*3+n3*5)/10;
		
		System.out.println("Sua nota final �:6"+media);
		ya.close();

	}

}
