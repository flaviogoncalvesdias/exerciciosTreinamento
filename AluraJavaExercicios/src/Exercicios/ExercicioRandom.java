package Exercicios;
import java.util.Random;// importando a classe Random para que possa ultilizar os metodos dela.


public class ExercicioRandom {

	public static void main(String[] args) {
		Random aleatorio = new Random (); //Instanciando um objeto do tipo random.

		int num = aleatorio.nextInt(1000); //Aplicando o tamanho dentro do metodo nextInt que � 1000.
		System.out.println("O n�mero sorteado �: " + num);
	}

}
