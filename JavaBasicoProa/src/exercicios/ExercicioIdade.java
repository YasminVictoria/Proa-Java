package exercicios;

import java.util.Scanner;

public class ExercicioIdade {
	public static void main(String[]args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Informe quantos anos voc� possui:");
		int anos = scn.nextInt();
		
		System.out.println("Quantos meses ap�s seu �ltimo anivers�rio?");
		int meses = scn.nextInt();
		
		System.out.println("quantos dias ap�s seu �ltimo m�svers�rio?");
		int dias = scn.nextInt();
		
		int anoDia = anos * 365;
		int mesesDia = meses * 30;
		
		int resultado = anoDia + mesesDia + dias;
		System.out.println("Sua idade em dias, �:" + resultado);
		
		scn.close();
		}

}
