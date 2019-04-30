package Exercicios;

import javax.swing.JOptionPane;

public class CalcFatorial {

	public static void main(String[] args) {
		int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número; "));//Pegando o numero para calcular
		System.out.println(fatorial(fatorial));//Declarando a função fatorial com o parametro que recebe o valor digitado peolo usuario.
	}

	private static int fatorial(int n) { //calculando o fatorial

		if (n == 0) {
			return 1;
		} else {
			System.out.println("Valor de n= "+n +" | Valor do fatorial(n - 1)="+fatorial(n - 1));
			return n * fatorial(n - 1);

		}
	}

}
