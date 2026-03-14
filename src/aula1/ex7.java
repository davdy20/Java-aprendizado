package aula1;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		if (n >= 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}
}
