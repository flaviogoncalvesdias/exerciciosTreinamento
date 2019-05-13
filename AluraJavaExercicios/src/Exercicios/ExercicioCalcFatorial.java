package Exercicios;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ExercicioCalcFatorial {

	public static void main(String[] args) {
		int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número; "));

//		 BigDecimal fatorial = new BigDecimal(JOptionPane.showInputDialog("Digite um número; "));

		System.out.println(fatorial(fatorial));
		
//		System.out.println(fatorialRecursivo(fatorial));
	}

	private static int fatorial(int fat) { // calculando o fatorial
		for (int i = fat - 1; i != 1; i--) {
			fat *= i;
		}
		return fat;

	}

	public static int fatorialRecursivo(int fat) {
		int resposta;
		if (fat == 0)
			return 1;

		resposta = fat * fatorial(fat - 1);

		return resposta;
	}

	private static BigDecimal fatorial(BigDecimal fat) {
		for (int i = fat.subtract(new BigDecimal(1)).intValue(); i != 1; i--) {
			fat = fat.multiply(new BigDecimal(i));
		}
		return fat;

	}

}