package Exercicios;

public class TesteIR {

	public static void main(String[] args) {

		double salario = 3000.0;
		boolean taxaIR = true;

		if (salario < 2800.0) {
			System.out.println("O seu IR ser� de 7.5%");
			System.out.println("Voc� pode deduzir at� R$ 142.00");
			System.out.println("Valor do boolean " + taxaIR);
			
		}else if (salario < 3751.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 350");
			System.out.println("Valor do boolean " + taxaIR);
		} 
		else if (salario < 4662) {
			System.out.println("A sua aliquota � de 22.5%");
			System.out.println("Voc� pode deduzir at� R$ 636");
			System.out.println("Valor do boolean " + taxaIR);
		}else {
			System.out.println("Oloko mano, voc� ganha muita grana!");
		}
		
	}
}