/*As  ma��s  custam  R$  1,30  cada  se  
 * forem  compradas  menos  de  uma  d�zia, 
 * e  R$  1,00  se  forem compradas  pelo 
 *  menos  12.  Escreva  um  programa  que  
 *  leia  o  n�mero  de  ma��s  compradas,  
 *  calcule  e escreva o custo total da 
 *  compra*/
package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Quantas ma�as foram compradas?");
		int quant=sc.nextInt();
		float duzia=quant; /*ou pode ser 1.00f | f=float*/
		double menosdoze=1.3 * quant;
		
		if(quant>=12) {
			System.out.println("O custo total da compra foi de:"+duzia);
		} else {
			System.out.println("O custo total da compra foi de:"+menosdoze);
			sc.close();
		}
		}

}
