package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Declação de varíavel
		int senha;
		
		//Entrada de dados
		System.out.println("Digite a senha: ");
		senha = sc.nextInt();
		
		//Estrutura de Repetição
		//Processamento de dados
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			System.out.print("Tente novamente: ");
			senha = sc.nextInt();
		}
		
		//Saída de dados
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
