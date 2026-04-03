package aula1;

import java.util.Scanner;

//Mostrar a divisão de um número

public class ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declaração de variavel
		int n;
		
		//Entrada de dados
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		//Procesamento de dados
		//Estrutura de repetição
		//Saída de dados
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println("Os divisores de " + n + " é " + i);
			}
		}
		
		sc.close();
	}
}
