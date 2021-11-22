package Atividades;

import javax.swing.JOptionPane;

public class exercicio4 {

	public static void main(String[] args) {
		
		//Leia um vetor de 40 posições. Contar e mostrar na tela quantos valores  
		// pares ele possui. Mostrar também o vetor origem.
		
		int valor=41;
		int vetor[] = new int[valor];
		
		//pedir valores		
		for (int i = 1; i <valor; i++) {
			vetor[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));	
			
		}
		//mostrar números digitados 
		for (int i = 1; i < valor; i++) {
			System.out.println(" n° digitado: "+ vetor[i]);
		}
		
		//mostrar valores pares
		for(int i = 1; i <valor; i++) {
			if(vetor[i]%2==0) {
				System.out.println("Valores pares: "+vetor[i]);
			}
	}
	
}
}


