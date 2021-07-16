package exercicios;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[]args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("digte so valor da base de seu retangulo:");
		int base = scn.nextInt();
		
		System.out.println("digite a altura de seu retangulo:");
		int altura = scn.nextInt();
		
		int total = altura * base;
		System.out.println("o valor d area do retangulo é igual:"+total +"cn2");
		scn.close();
		}

}
