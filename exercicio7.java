package Atividades;

import javax.swing.JOptionPane;

public class exercicio7 {
	
	/*Leia uma matriz 6 x 4. Leia também um valor X. O programa deverá fazer uma 
	busca desse valor na matriz e, ao final escrever a localização (linha e coluna) ou 
	uma mensagem de “não encontrado”*/
	
	public static void main(String[] args) {
		
		int matriz[][] = new int [6][4];
		int numero;	
		
		inserir(matriz);
		numero= Integer.parseInt(JOptionPane.showInputDialog("Informe um n° para saber a posição que está: "));
		mostrar(matriz, numero);
			
	}
	private static void inserir(int[][] matriz) {
		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 4; column++) {
				matriz[row][column]= Integer.parseInt(JOptionPane.showInputDialog("Digite o n°: "+(column+1)+" da linha "+(row+1)+" "));
				
			}
		}
	}
	private static void mostrar(int[][] matriz, int numero) {
		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 4; column++) {
				if (matriz[row][column]==numero) {
					System.out.println("O número: "+numero+" aparece na linha "+(row+1)+" na coluna: "+(column+1));
				}
				else {
		            System.out.println("Número não encontrado.");
		        }
			}
		}
	}

}
