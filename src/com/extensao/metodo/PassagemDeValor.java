package com.extensao.metodo;

public class PassagemDeValor {

	public static void main(String[] args) {
		// criar uma variavelpara observar a alteracao de valores
		int valor = 1500;

		// tentativa de alterar o valor
		System.out.println("antes da chamada do metodo alterarValor - o valor é: " + valor);

		// a linha abaixo sera a chamada do metodo
		alterarValor(valor);
		System.out.println("depois da chamada do metodo alterarValor - o valor é: " + valor);

		System.out.println("-------------------------------------------\n");

		// a linha abaixo cria uma instancia da classe e pessoa
		Pessoa maria = new Pessoa();
		maria.nome = "maria";
		maria.idade = 26;
		maria.genero = 'F';

		// tentativa de alteracao de valores a referencia dos objetos
		System.out.println("Valores antes da chamada do metodo alterarRefObj: ");
		maria.exibirDados();
		System.out.println("-------------------------------------------\n");
		// chamada do metodo alterarRefObj
		alterarRefObj(maria);
		System.out.println("Valores depois da chamada do metodo alterarRefObj");
		maria.exibirDados();
		System.out.println("-------------------------------------------\n");
		// tentiva de alterar conteudo do objeto maria
		System.out.println("Conteudo/valores antes da chamada do metodo alterarContObj");
		maria.exibirDados();
		System.out.println("-------------------------------------------\n");
		// chamada do metodo alterarContObj
		alterarContObj(maria);
		System.out.println("Conteudo/valores depois da chamada do metodo alterarContObj");
		maria.exibirDados();
		System.out.println("Conteudo/Valores depois da chamada do Método acima");
		System.out.println("--------------------------------------------\n");
	}

	// construindo os metodos para serem referenciados
	static void alterarValor(int valor) {
		// Atribuindo um novo valor
		valor = 137;
	}

	static void alterarRefObj(Pessoa p) {
		Pessoa ana = new Pessoa();
		ana.nome = "ana";
		ana.idade = 23;
		ana.genero = 'F';
		p = ana;
		p.exibirDados();
	}

	static void alterarContObj(Pessoa p) {
		// alterando o conteudo do objetivo referenciado por p
		p.genero = 'M';
		p.nome = "joao";
		p.idade = 95;
	}

}
