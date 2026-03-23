package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex18 {

	 //Perguntar número e mostrar valores ìmpares até o número
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Declaração de varíavel
		
		int x;
		
		//Entrada de dados
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		//Estrutura de repetição Controlada
		//Processamento de dados
		//Saída de dados
		
		for (int i=1; i<=x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
