package Exercicios;

public class ExercicioParImpar {

	public static void main(String[] args) {
		int num;
		
		for(num = 0; num <=10; num++) { 
			if(num % 2 == 0) {
				System.out.println( num + " Este número é par!");
			}else {
				System.out.println( num + " Este número é impar!");
			}
		}

	}

}
