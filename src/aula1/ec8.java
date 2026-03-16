package aula1;

import java.util.Scanner;

public class ec8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaração de variavel
		int n;
		
		//Entrada de dados
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		//Estrutra de decisão e saída de dados
		if (n % 2 == 0){
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		sc.close();
	}
}