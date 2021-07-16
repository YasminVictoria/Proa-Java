/*Escreva um algorito para ler o salário mensal 
 * atual de reajuste. Calcular e escrever o valor 
 * do novo salário.
 */
package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salário: ");
		float salario=scanner.nextFloat();
		System.out.println("Digite o valor do seu reajuste: ");
		float reajuste=scanner.nextFloat();
		
		float salariofinal=(salario+(salario*(reajuste/100)));
		System.out.println("O novo salário com reajuste corresponde a:"+salariofinal);
		scanner.close();

	}

}
