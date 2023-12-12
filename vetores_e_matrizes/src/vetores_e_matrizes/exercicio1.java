package vetores_e_matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 int dados;
		 
		
		int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		Arrays.sort(numeros);
				
		  System.out.println("escolha um número inteiro?");
		  dados=leia.nextInt();
		  
		  int posicao = Arrays.binarySearch(numeros, dados);
		  
		  if (posicao >= 0 )
				System.out.println("\nO elemento foi Encontrado e está na Posição: " + posicao);
			else
				System.out.println("\nElemento não encontrado!");

		}
	}




