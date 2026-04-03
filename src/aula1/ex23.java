package aula1;

import java.util.Scanner;

//Descubra o fatorial de qualquer valor
public class ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaração de variavel
		int n, fat = 1;
		
		//Entrada de dados
		System.out.print("Digite um número para descobri o fatorial: ");
		n = sc.nextInt();
		
		//Estrutura de repetição
		//Processamento de dados
		//Saída de dados
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		System.out.println("O fatorial é: " + fat);
		sc.close();
	}

}
