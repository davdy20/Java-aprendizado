package aula1;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaração de variaveis
		int A, B;
		
		//Entrada de dados
		System.out.printf("Digite um número: \n");
		A = sc.nextInt();
		System.out.printf("Digite mais um: ");
		B = sc.nextInt();
		
		//Estrutura de Decisão
		//saída de dados 
		//processamento de dados
		if(A % B == 0 || B % A == 0) {
			System.out.printf("São Multiplos");
		}
		Else{
			System.out.printf(""Não são Multiplos);
		}
		
		sc.close();
	}
}