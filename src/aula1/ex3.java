package aula1;

import java.util.Locale;
import java.util.Scanner;

//um programa para ler quatro valores inteiros A, B, C e D.
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Declaração de variaveis
		int valorA, valorB;
		int valorC, valorD, dif;
		
		//Entrada de dados
		System.out.println("Digite o Primeiro valor: ");
		valorA = sc.nextInt();
		System.out.println("Digite o Segundo valor: ");
		valorB = sc.nextInt();
		System.out.println("Digite o Terceiro valor: ");
		valorC = sc.nextInt();
		System.out.println("Digite o Quarto valor: ");
		valorD = sc.nextInt();
		
		//Processamento de dados
		dif = (valorA * valorB - valorC * valorD);
		
		System.out.printf("A diferença entre os valores A e B para os valores C e D é: %d\n", dif);
		sc.close();
	}

}
