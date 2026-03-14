package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração de varíaveis
		int cod1, cod2, qte1, qte2;
		double preco1, preco2, total;
		
		//Entrada de dados
		System.out.println("Digite o código da primeira peça: ");
		cod1 = sc.nextInt();
		
		System.out.println("Digite a quantidade da primeira peça: ");
		qte1 = sc.nextInt();
		
		System.out.println("Digite o preço da primeira peça: ");
		preco1 = sc.nextDouble();
		
		System.out.println("Digite o código da segunda peça: ");
		cod2 = sc.nextInt();
		
		System.out.println("Digite a quantidade da segunda peça: ");
		qte2 = sc.nextInt();
		
		System.out.println("Digite o preço da segunda peça: ");
		preco2 = sc.nextDouble();
		
		//Processamento de dados
		total = (preco1 * qte1) + (preco2 * qte2);
		
		//Saída de dados
		System.out.printf("O preço a pagar é: R$%.2f\n", total);
		
		sc.close();
	}
}
