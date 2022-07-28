package com.exemplo.varags;

public class CriandoMetodosVars {
	// criando o primeiro metodo de argumento variavel
	public int calcular(int[] lista) {
		int soma = 0;

		// criando o loop para interar sobre o parametro
		for (int i = 0; i < lista.length; i++) {
			soma += lista[i];
		}
		return soma;
	}
	//criando o segundo metodo
	public int contar(int ... lista) {
		int soma = 0;
		//estabelecendo loop
		for(int item: lista){
			soma += item;
		}
	return soma;
	}
}
