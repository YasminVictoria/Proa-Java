/*O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro,
calcular e escrever o custo final ao consumidor.*/
package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de fabrica do seu carro:R$ ");
		double valor=sc.nextDouble();
		
		double distribuidor = 28;
		double imposto = 45;
		
		//Calculos aplicados
		double calculo = valor*distribuidor/100;
		double calculo2 = valor*imposto/100;
		
		//Calculo final do consumidor
		double consumidor = valor+calculo+calculo2;
		
		System.out.println("O valor do seu carro sea de:"+consumidor);
	}

}

