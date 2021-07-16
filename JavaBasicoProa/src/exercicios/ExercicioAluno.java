package exercicios;

import java.util.Scanner;

public class ExercicioAluno {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int Cont = 1; 
		while(Cont <=3) {
		System.out.println("Digite seu nome ");
		String nome=scn.next();
		System.out.println("Digite o sexo: ");
		String sexo=scn.next();
		System.out.println("Informe a primeira nota:");
		double nota1 = scn.nextDouble();
		System.out.println("Informe a segunda nota:");
		double nota2 = scn.nextDouble();
		System.out.println("Informe a terceira nota:");
		double nota3 = scn.nextDouble();
		System.out.println("Informe a quarta nota:");
		double nota4 = scn.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println(")O(A) aluno(a)"+nome+", de sexo "+sexo+", obteve a média:"+media+"/n");
		
		Cont++;
		}
		scn.close();
	}

}
