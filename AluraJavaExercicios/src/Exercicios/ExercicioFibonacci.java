package Exercicios;

import javax.swing.JOptionPane;

public class ExercicioFibonacci {

	public static void main(String[] args) {
		int atual = 0;
		int prox = 0;
		int ant = 1;

		int elemento = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de elementos da sequencia de Fibonacci: "));

		Integer vetorTermos[] = new Integer[elemento];
		vetorTermos[0] = 0;
		vetorTermos[1] = 1;

		for (int i = 2; i < vetorTermos.length; i++) {	
			
			vetorTermos[i]=vetorTermos[i-1]+vetorTermos[i-2];
		}
		
		for (int i = 0; i < vetorTermos.length; i++) {
			System.out.println(vetorTermos[i].toString());
			
		}

	}

}
