package Atividades;

import javax.swing.JOptionPane;



public class exercicio2 {

	public static void main(String[] args) {
		
		//Declare um vetor de 10 posições e o preencha com os 10 primeiros 
		//números ímpares. Depois apresente estes valores na tela.
		
		int vetor[] = new int[10];
				
		for (int i = 0; i< 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os primeros números ímpares: "));
			System.out.println("Valores ímpares digitados: "+ vetor[i]);
		}
			

	}

}
