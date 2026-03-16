package aula1;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaração de variaveis
		int horaInicial, horaFinal, duracao;
		
		//Entrada de dados
		System.out.printf("Digite a hora inicial do jogo: \n");
		horaInicial = sc.nextInt();
		System.out.printf("Digite a hora final do jogo: ");
		horaFinal = sc.nextInt();
		
		//Estrutura de Decisão
		//saída de dados 
		//processamento de dados
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaFinal - horaInicial;
		}
		
		System.out.println("O jogo durou " + duracao + " Hora(s)");
		
		sc.close();
	}
}