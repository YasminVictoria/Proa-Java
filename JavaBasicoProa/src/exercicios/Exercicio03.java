package exercicios;

import java.util.Scanner;

public class Exercicio03 {
		public static void main(String[]angs) {
			Scanner scn = new Scanner (System.in);
			
			System.out.println("digite a altura:");
			float altura= scn.nextInt();
			
			System.out.println("digite a base:");
			float base= scn.nextInt();
			
			float resultado= (base*altura)/2;
			
			System.out.println("a área é:"+resultado);
			scn.close();
		}

}
