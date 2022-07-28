package com.exemplo.sobrecarga;

public class SobrecargaMetodo {
	//metodos sobrecarregados
	static void mostrar(int valor) {
		//exibir o valor dado ao parametro
		System.out.println("O valor oferecido é: " + valor);
	}
	static void mostrar(String nome ) {
		System.out.println("Valor oferecido é: " + nome);
	}
	static void mostrar() {
		System.out.println("Sem valores e sem parametros");
	}
}


