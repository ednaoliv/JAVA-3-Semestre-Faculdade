package Atividades;

import javax.swing.JOptionPane;

public class exercicio8 {
	
	/*Leia duas matrizes 20 x 20 e escreva os valores da primeira que ocorrem em
	qualquer posição da segunda.*/
	
	

	public static void main(String[] args) {
		
		int matriz1[][]= new int[20][20];
		int matriz2[][]= new int[20][20];
		
		    lerMatriz(matriz1);
	        lerMatriz(matriz2);
	        duplicados( matriz1, matriz2);
		
}

	private static void lerMatriz(int[][] matriz) {
		for (int row = 0; row < 20; row++) {
			for (int column = 0; column < 20; column++) {
				matriz[row][column]=Integer.parseInt(JOptionPane.showInputDialog("Digite o n°" + (column+1) + " da linha " + (row+1) +":"));
			}
		}
		
	}
	private static void duplicados(int[][] matriz1, int[][] matriz2) {
		for (int row = 0; row < 20; row++) {
			for (int column = 0; column < 20; column++) {
				if (matriz1[row][column]==matriz2[row][column]) {
					System.out.println(matriz1[row][column]+" repete na posição: "+(row+1)+(column+1));
				}
				else {
					System.out.println("nenhum número se repete");
				}
			}
		}
		
		
	}

	
}
