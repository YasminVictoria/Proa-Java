/*Escreva  um  algoritmo  para  ler  uma  temperatura  
 * em  graus  Fahrenheit,  calcular  e  escrever  o  valor 
 * correspondente em graus Celsius (baseado na fórmula abaixo):*/
package exercicios;

import java.util.Scanner; 

public class Exercicio06 {
	
	public static void main(String[] args) {
		Scanner ya= new Scanner(System.in);
		float f;
		System.out.println("Digite a temperatura em fahrenheit:");
		f = ya.nextFloat();
		
		float c =(5 *(f - 32) / 9);
		
		System.out.println("A temperatura EmbeddedFrame graus celsius"+c);
		ya.close();

	}

}
