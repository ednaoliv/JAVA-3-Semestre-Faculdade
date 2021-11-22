package Atividades;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		//Leia um vetor de 10 posições. Crie um segundo vetor e coloque os valores do 
		//primeiro vetor na ordem inversa. Depois crie um terceiro vetor que receberá a 
		//soma dos elementos do vetor 1 e vetor 2 de cada índice correspondente. 
		
		int valor = 10;		
		int[] vetor1 = new int [valor];
		int tamVetor1 = vetor1.length;
		int[] vetor2 = new int[tamVetor1];
		int tamVetor2 = tamVetor1 - 1;
		int[] vetor3 = new int [10];
		
		//Digitar 10 valores
		for (int i = 0; i < valor; i++) {
			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n°: "));
			System.out.println("N°s digitados: "+vetor1[i]);
		}
		// Inverter valores digitados
		for(int j = 0; j < vetor1.length; j++) {
			vetor2[j] = vetor1[tamVetor2 - j];
			System.out.print("\nN° invertido: "+vetor2[j]);
		}
		//Somar vetor1(digitado) + vetor 2(invertidos)		
		for(int k = 0; k < valor; k++) {
			vetor3[k] = (vetor1[k] + vetor2[k]); 
			System.out.print("\nSoma de vetor1 e vetor2: "+ vetor3[k]);
		}

	}

}
