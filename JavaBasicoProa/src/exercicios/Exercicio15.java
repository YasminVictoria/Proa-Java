package exercicios;

import java.util.Scanner;

public class Exercicio15 {
public static void mais(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Por favor, digite um n�mero: ");
		
		int numero=scn.nextInt();
		
		System.out.println("O antecessor do n�mero "+numero+" � o" + (numero-1));
	}

}
