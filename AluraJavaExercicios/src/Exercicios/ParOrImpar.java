package Exercicios;

import javax.swing.JOptionPane;

public class ParOrImpar {
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite um numero: "));
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O seu numero " + numero + " � par! ");

		} else {
			JOptionPane.showMessageDialog(null, " O seu numero " + numero + " � �mpar! ");

		}

	}

}
