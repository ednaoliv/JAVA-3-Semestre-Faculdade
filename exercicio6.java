package Atividades;

import javax.swing.JOptionPane;

public class exercicio6 {

	public static void main(String[] args) {
		
		//Leia uma matriz 3 x 3, conte e apresente quantos valores maiores que 10 ela possui
		
		int[][] matriz = new int[3][3];
		int contador = 0;

		//Pedir números
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite um n°:")) +1;
			}
		}

		 //contador maior que 
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (matriz[i][j] > 10)
				{
					contador++;
				}
			}
		}
		System.out.printf("Quantidade de n°s maiores que 10: " + contador);

}}
