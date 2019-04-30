package Exercicios;

public class TestaEscopoDeVariavel {
	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		 System.out.println("Valor de acompanhado é = " + acompanhado);

		if (idade >= 18 || acompanhado) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
