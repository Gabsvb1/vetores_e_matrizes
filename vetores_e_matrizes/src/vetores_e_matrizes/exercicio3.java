package vetores_e_matrizes;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
	     int somaDiagonalPrincipal = 0; 
	     int somaDiagonalSecundaria = 0;
	     Scanner scanner = new Scanner(System.in);

	     for (int i = 0; i < 3; i++) {
		 for (int j = 0; j < 3; j++) {
	     System.out.println("Digite o elemento da linha " + (i+1) + " coluna " + (j+1) + ": ");
		 matriz[i][j] = scanner.nextInt();
	    }
	    }
			       
		 for (int i = 0; i < 3; i++) {
	     for (int j = 0; j < 3; j++) {
		 if (i == j) {
		 somaDiagonalPrincipal += matriz[i][j];
	    System.out.println("Elemento da Diagonal Principal: " + matriz[i][j]);
			                }
		if ((i + j) == (3 - 1)) {
	    somaDiagonalSecundaria += matriz[i][j];
	   System.out.println("Elemento da Diagonal Secundária: " + matriz[i][j]);
			                }
			            }
			        }
         System.out.println("Soma dos elementos da Diagonal Principal: " + somaDiagonalPrincipal);
	 System.out.println("Soma dos elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
			    }
			
     

}
