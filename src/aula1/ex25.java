package aula1;

import java.util.Scanner;

//Descubra o quadrado e o cubo de números

public class ex25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Entrada de varíaveis
		int n, p, s, t;
		
		//Entrada de dados
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		//Estrutura de repetição
		//Processamento de dados
		//Saída de dados
		for (int i=1; i<=n; i++) {
			p = i;
			s = i * i;
			t = i * i * i;
			
			System.out.println("O Número, o seu quadrado e o seu cubo: " + p + " " + s + " " + t);
			
		}
		
		sc.close();
	}
}
