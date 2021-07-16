package exercicios;

import java.util.Scanner;

public class Temporizador {
		
		public static void main(String[] args) throws InterruptedException {
			//Temporizador
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Temporizador");
			System.out.println("Configure o seu temporizador: ");
			System.out.println("Digite os minutos");
			int k=scanner.nextInt();
			System.out.println("Digite os Segundos");
			int m=scanner.nextInt();
			
			for(int i=k;i >= 0; i--) {
				for(int j=m;j >= 0; j--) {
					
					System.out.println(i+" : "+j);
					Thread.sleep(500);
				}
			}
			
		}

}

