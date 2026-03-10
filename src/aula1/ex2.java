package aula1;

import java.util.Locale;
import java.util.Scanner;
//um programa para ler o valor do raio de um círculo,
//e depois mostrar o valor da área deste círculo com quatro casas decimais
public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Declaração de varíaveis
		double raio, area, pi = 3.14159;
		
		//Entrada de dados
		System.out.println("Digite o Raio do circulo: ");
		raio = sc.nextDouble();
		
		//Processamento de dados
		area = pi * raio * raio;
		
		//Saída de dados
		System.out.printf("O valor de Area do círculo é %.4f\n", area);
		
		sc.close();
	}

}
