package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração de varíaveis
		int codigo, quantidade;
		double total = 0;
		
		//Entrada de dados
		System.out.printf("Codigo    Especificação      preço\n"
				        + "[1]       [Cachorro Quente]  [R$4.00]\n"
				        + "[2]       [X-Salada]         [R$4.50]\n"
				        + "[3]       [X-Bacon]          [R$5.00]\n"
				        + "[4]       [Torrada Simples]  [R$2.00]\n"
				        + "[5]       [Refrigerante]     [R$1.50]\n");
		
		System.out.println("Digite o codigo do produto: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		quantidade = sc.nextInt();
		
		//Estrtura de decisão
		//Processamento de dados
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else if ( codigo == 5) {
			total = quantidade * 1.5;
		}
		else {
			System.out.println("Codigo Inválido");
		}
		
		//Saída de dados
		System.out.printf("Total: R$ %.2f\n", total);
		
		
		sc.close();
	}

}
