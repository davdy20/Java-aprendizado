package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex17 {

	// Saldo de quantidade de produtos usado no posto de abastecimento
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Declaração de varíaveis
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		int tipo;
		
		//Entrada de dados
		System.out.println("Digite 1 para [ÁLCOOL]");
		System.out.println("Digite 2 para [GASOLINA]");
		System.out.println("Digite 3 para [DIESEL]");
		System.out.println("Digite 4 para [CONTABILIZAR]");
		tipo = sc.nextInt();
		//Estrutura de repetição
		//Processamento de dados
		//Saída de dados
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			} else {
				
			}
			tipo = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Temos " + alcool + " de Alcool");
		System.out.println("Temos " + gasolina + " de Gasolina");
		System.out.println("Temos " + diesel + " de Diesel");

		sc.close();
	}

}
