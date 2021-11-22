package Atividades;import javax.swing.JOptionPane;

public class exercicio5 {

	public static void main(String[] args) {
		
		//Leia dois vetores de 5 posições, crie um terceiro vetor para receber a 
		// soma dos elementos que possuírem valores pares. Caso contrário atribua zero
		
		int valor =5;
		int vetor1[] = new int[valor];
		int vetor2[] = new int[valor];
		int vetor3[] = new int[valor];
		
		for (int i = 0; i < valor; i++) {
			vetor1[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite um n°: "));
			System.out.println("N° Vetor1 digitado: "+vetor1[i]);
		}
		
		System.out.println(" ");
		for(int j = 0; j < valor; j++) {
			vetor2[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite mais 5 n°s: "));
			System.out.println("N° Vetor2 digitado: " + vetor2[j]);
			
		}
		
		//Mostrar some de vetor 1 e vetor 2 (caso tenha um valor par) se não atribuir valor 0 
		for(int k = 0; k < valor; k++) {
			if(vetor1[k]%2==0  ) {
				vetor1[k] =vetor1[k];
			}
			else if(vetor2[k]%2==0) {
				vetor2[k] =vetor2[k];
			}	
			else {
				vetor1[k]=0;
				vetor2[k]=0;
			}
			vetor3[k]= vetor1[k] +vetor2[k];
			System.out.print("\nSoma de vetor1 e vetor2: "+ vetor3[k]);
		}
	}

}
