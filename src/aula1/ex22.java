package aula1;

import java.util.Scanner;

//Dvisão de dois valores inteiros
public class ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaração de varíavel
		int n;
		
		//Entrada de dados
		System.out.print("Digite um número para repetição: ");
		n = sc.nextInt();
		
		//Estrutura de repetição
		//Estrutura de decisão
		//Processamento de dados
		//Saída de dados
		for (int i=0; i<n; i++) {
			System.out.println("Digite dois números: ");
				int x = sc.nextInt();
				int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão Impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("A divisão é %.1f\n", div);
			}
			
		}
		
		
		sc.close();
	}
}
