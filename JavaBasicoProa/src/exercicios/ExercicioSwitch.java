package exercicios;

import java.util.Scanner;

public class ExercicioSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o mês do seu aniversario(ex: 10)");
	    int mes=sc.nextInt();
		
		switch (mes) {
		
		case 1:
			System.out.println("Janeiro");
			System.out.println("Famoso palestrinha");
			break;
		case 2:
		    System.out.println("Fevereiro");
		    System.out.println("Até que são legais");
		    break;
		case 3:
			System.out.println("Março");
			System.out.println("Melhores amigos de quem nasce em junho");
			break; 
		case 4:
			System.out.println("Abril");
			System.out.println("Zé comédia"); 
			break;
		case 5:
		    System.out.println("Maio");
		    System.out.println("Esfomeado");
		    break;
		case 6:
			System.out.println("Junho");
			System.out.println("Acha que o mundo e gira em torno deles");
			break;
		case 7:
			System.out.println("Julho");
			System.out.println("Primos de quem nesceu em junho");
			break;
		case 8:
		    System.out.println("Agosto");
		    System.out.println("Um pouco chatinhos, mas alguns se salvam");
		    break;
		case 9:
			System.out.println("Setembro");
			System.out.println("Ninguem quer saber suas historias");
			break;
		case 10:
			System.out.println("Outubro");
			System.out.println("vivem intensamente");
			break;
		case 11:
		    System.out.println("Novembro");
		    System.out.println("Festeiros");
		    break;
		case 12:
			System.out.println("Dezembro");
			System.out.println("Irmãos de Jesus");
			break;
		
			default:
				System.out.println("Não possui dia correspondente.");	
		}

	}

}
