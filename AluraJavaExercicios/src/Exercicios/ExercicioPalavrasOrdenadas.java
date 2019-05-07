package Exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioPalavrasOrdenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(JOptionPane.showInputDialog(null,"Escreva uma palavra: "));
        String entrada = leitor.next();
        String saida = "";
        
        for(int i = entrada.length() - 1; i >= 0; i-- ) {
        	saida = saida + entrada.charAt(i);
        }
		System.out.println(saida);
	}

}
