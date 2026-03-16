package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração de varíavel
		double numero;
		
		//Entrada de dados
		System.out.println("Digite um numero: ");
		numero = sc.nextDouble();
		
		//Estrtura de decisão
		//Processamento de dados
		//Saída de dados
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora do intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo [25,50]");
		}
		else if (numero <= 75.0){
			System.out.println("Intervalo [50,75]");
		}		
		else {
			System.out.println("Intervalo [75,100]");
		}		
		
		sc.close();
		
}
}
