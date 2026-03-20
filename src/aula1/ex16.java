package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex16 {

	// Leitura de coordenadas do plano cartesiano

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Declaração de varíaveis
		int x, y;

		//Entrada de dados
		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();

		System.out.println("Digite o valor de Y: ");
		y = sc.nextInt();

		//Estrutura de repetição
		//Processamento de dados
		//Saída de dados
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			System.out.println("Digite o valor de X: ");
			x = sc.nextInt();
			System.out.println("Digite o valor de Y: ");
			y = sc.nextInt();
		}
		sc.close();
	}

}
