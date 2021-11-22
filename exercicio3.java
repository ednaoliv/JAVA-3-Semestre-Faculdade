package Atividades;

public class exercicio3 {

	public static void main(String[] args) {
		
		//Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e 
		//vice-e-versa. Escreva ao final o vetor obtido (vetor origem e vetor destino).
		
		int vetor1[] = {5,15,2,4,6,10,13,8,19,11,21,32,53,74,3,7};
		int vetor2[] = new int[8];
		
		
		System.out.print("Vetor Origem: ");
		
		//vetor origem
		 for (int i = 0;i < 16;i++)
		 {
			  System.out.print(vetor1[i]);
			  System.out.print(" ");
		 }
		 
		 //inverter valores
		 for (int i = 0; i < 8; i++)
		 {
		  vetor2[i] = vetor1[i + 8];
		  vetor1[i + 8] = vetor1[i];
		  vetor1[i] = vetor2[i];
		 }
		 System.out.print("\n");
		 System.out.print("Vetor Final: ");
		 
		 for (int i = 0; i < 16; ++i)
		 {
			  System.out.print(vetor1[i]);
			  System.out.print(" ");
		 }
	}

}
