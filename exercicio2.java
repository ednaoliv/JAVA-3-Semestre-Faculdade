package Atividades;

import javax.swing.JOptionPane;



public class exercicio2 {

	public static void main(String[] args) {
		
		//Declare um vetor de 10 posi��es e o preencha com os 10 primeiros 
		//n�meros �mpares. Depois apresente estes valores na tela.
		
		int vetor[] = new int[10];
				
		for (int i = 0; i< 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os primeros n�meros �mpares: "));
			System.out.println("Valores �mpares digitados: "+ vetor[i]);
		}
			

	}

}
