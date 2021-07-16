package exercicios;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[]angs) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("digite o raio:");
		double raio= scn.nextInt();
		
		double total= (raio*raio)*3.14;
		
		System.out.println("a área é:"+total);
		scn.close();
	}

}
