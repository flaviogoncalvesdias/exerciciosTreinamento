package Exercicios;

public class TesteIR {

	public static void main(String[] args) {

		double salario = 3000.0;
		boolean taxaIR = true;

		if (salario < 2800.0) {
			System.out.println("O seu IR será de 7.5%");
			System.out.println("Você pode deduzir até R$ 142.00");
			System.out.println("Valor do boolean " + taxaIR);
			
		}else if (salario < 3751.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
			System.out.println("Valor do boolean " + taxaIR);
		} 
		else if (salario < 4662) {
			System.out.println("A sua aliquota é de 22.5%");
			System.out.println("Você pode deduzir até R$ 636");
			System.out.println("Valor do boolean " + taxaIR);
		}else {
			System.out.println("Oloko mano, você ganha muita grana!");
		}
		
	}
}