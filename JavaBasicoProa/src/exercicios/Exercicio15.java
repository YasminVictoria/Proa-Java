package exercicios;

import java.util.Scanner;

public class Exercicio15 {
public static void mais(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Por favor, digite um número: ");
		
		int numero=scn.nextInt();
		
		System.out.println("O antecessor do número "+numero+" é o" + (numero-1));
	}

}
