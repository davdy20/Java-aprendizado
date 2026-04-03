package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex19 {

	 //Mostrar se valores perguntados esta dentro de um intervalo
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Declaração de varíaveis
		
		int n;
		int in = 0;
		int out = 0;
		
		//Entrada de dados
		
		System.out.print("Digite a Quantidade de Repetição: ");
		n = sc.nextInt();
		
		//Estrutura de repetição Controlada
		//Processamento de dados
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite o número: ");
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		//Saída de dados
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
