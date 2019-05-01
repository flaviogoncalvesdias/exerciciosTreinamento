package Exercicios;

public class ExercicioFibonacci {

	public static void main(String[] args) {
		int atual = 0;
		int prox = 0;
		int ant = 1;

		while (prox <= 200) {
			prox = atual + ant;
			System.out.println(prox + ",");
			ant = atual;
			atual = prox;
		}

	}

}
