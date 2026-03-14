package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração de variavel
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		//Entrada de dados
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		//Processamento de dados
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		//Saída de dados
		System.out.printf("O Valor do triangulo é: %.3f\n ", triangulo);
		System.out.printf("O Valor do circulo é: %.3f\n ", circulo);
		System.out.printf("O Valor do trapézio é: %.3f\n ", trapezio);
		System.out.printf("O Valor do quadrado é: %.3f\n ", quadrado);
		System.out.printf("O Valor do retangulo é: %.3f\n ", retangulo);
		
		sc.close();
	}

}
