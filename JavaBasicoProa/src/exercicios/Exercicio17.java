package exercicios;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[]args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("digite um numero: ");
		int n1 = scn.nextInt();
		
		int total= n1 + 1;
		System.out.println("O sucessor do numero digitado é igual a:"+total);
		
		scn.close();
		
	}

}
