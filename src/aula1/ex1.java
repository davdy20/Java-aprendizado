package aula1;

import java.util.Locale;
import java.util.Scanner;

// um programa para ler dois valores inteiros,
//e depois mostrar na tela a soma desses números com uma mensagem explicativa.
public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Declaração de variaveis
		int n1, n2, soma;
		
		//Entrada de dados
		System.out.println("Digite o Primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		//Processamento de dados
		soma = n1 + n2;
		
		//Saída de dados
		System.out.printf("A soma entre %d e %d é: %d",n1, n2, soma);
		
		sc.close();
	}
}
