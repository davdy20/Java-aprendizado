package aula1;
import java.util.Scanner;

// Tabuada

public class ex20 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// declaração de variaveis
	
	int v, i;
	
	// Entrada de dados
	System.out.println("Digite qualquer número: ");
	v = sc.nextInt();
	
	
	//Estrutura de repetição controlada
	//Processamento de dados
	//Saída de dados
	for(i=1; i<=10; i++) {
		int t = (v * i);
		System.out.printf("%d x %d = %d\n",v,i, t);
		
	}
		
	}

}
