package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração de varíaveis
		int numero, horas;
		double salario, valorHora;
		
		//Entrada de dados
		System.out.println("Digite o número do funcionario: ");
		numero = sc.nextInt();
		
		System.out.println("Digite as Horas Trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.println("Digite o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		//Processamento de dados
		salario = valorHora * horas;
		
		//Saída de dados 
		System.out.println("Numero = " + numero);
		System.out.printf("Seu Salario é = $ %.2f\n", salario);
		
		sc.close();
	}

}
