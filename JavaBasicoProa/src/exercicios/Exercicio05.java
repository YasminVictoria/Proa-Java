/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.*/
package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vocé é o dono de uma revendedora de carros e irá deecidir o salário de um funcionário.");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Diga o salário fixo de seu funcionário");
		float fixo= sc.nextFloat();
		
		System.out.println("Digite quanto ele ganha por vendas:");
		float vendas= sc.nextFloat();
		
		System.out.println("Quantos carros ele conseguiu vender?");
		float carro= sc.nextFloat();
		
		System.out.println("Qual foi o valor total das vendas dele?");
		float totalvendas= sc.nextFloat();
		
		/*float pc;*/
		
		float salariofinal = (fixo + (vendas * carro) + (totalvendas * 5/100));
		
		System.out.println("O salário final do seu funcionário é de: R$"+salariofinal);
		sc.close();

	}

}
