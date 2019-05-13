package Exercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class buscaNumeroVetor {
	static Random random = new Random();
	static boolean achou = false;
	static int[] vetorNumeros;
	public static void main(String[] args) {

		vetorNumeros = criaVetor(10);
		imprimeVetor(vetorNumeros);
		System.out.println("Após ordenação");
		ordenaCrescente(vetorNumeros);
		imprimeVetor(vetorNumeros);

//		recebeNumero(vetorNumeros);

	}

	private static void recebeNumero(int[] vetorNumeros) {
		int numBuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja Buscar:"));
		
		 if (!buscaNumero(vetorNumeros, numBuscado)) {
		 System.out.println("Número buscado não se encontra no vetor! Tente de novo");
		 }
	}

	private static Boolean buscaNumero(int[] vetorNumeros, int numBuscado) {
		for (int i = 0; i < vetorNumeros.length && !achou; i++) {
			if (vetorNumeros[i] == numBuscado) {
				achou = true;
				System.out.println("Número buscado : " + numBuscado + " Posição: " + i);
			}
		}
		return achou;
	}

	private static int[] criaVetor(int tamanhoVetor) {
		int vetorNumeros[] = new int[tamanhoVetor];
		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = random.nextInt(100);
			System.out.println("Posição: " + i + " - Valor: " + vetorNumeros[i]);
		}
		return vetorNumeros;
	}

	static void ordenaCrescente(int vet[]) {
		int j;
	    int key;
	    int i;
	    
	    for (j = 1; j < vet.length; j++)
	    {
	      key = vet[j];
	      for (i = j - 1; (i >= 0) && (vet[i] > key); i--)
	      {
	    	  vet[i + 1] = vet[i];
	       }
	      vet[i + 1] = key;
	    }
	}
	
	static void imprimeVetor(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(String.valueOf(vet[i]));

		}
	}

}
