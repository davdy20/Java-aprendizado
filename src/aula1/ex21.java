package aula1;

import java.util.Locale;
import java.util.Scanner;

//calcular média ponderada de 3 números

public class ex21 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Variavel
		int n;
		
		//Entrada de dados
		System.out.println("Digite um número para repetição: ");
		 n = sc.nextInt();
		 
		 //Estrutura de repetição
		 //Processamento de dados
		 //Saída de dados
		 for (int i=0; i<n; i++) {
			 System.out.println("Digite Três numeros:");
			 double a = sc.nextDouble();
			 double b = sc.nextDouble(); 
			 double c = sc.nextDouble();
			 
			 double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			 
			 System.out.printf("Média ponderada é: %.1f\n", media);
		 }
		 
		 sc.close();
	}
}
