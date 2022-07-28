package com.metodos.estaticos;

import com.exemplo.estatico.TestendoChamadaExterna;

public class ChamandoOsMetodos {

	// declarando um metodo dentro da classe
	static void novoEstatico() {
		System.out.println("este conteudo esta declarando no metodo dentro da classe principal");
	}

	public static void main(String[] args) {
		// chamando o metodo estatico
		DeclarandoAlgunsMetodos.metodoEstatico();

		// chamando o metodo quando nao estatico
		new DeclarandoAlgunsMetodos().metodoNaoEstatico();// praticando instancia
		
		novoEstatico(); //chamando o metodo declarado na mesma classe
	
	//chamando o metodo estatico de uma classe pertecente a outro pacote
		new TestendoChamadaExterna().metodoForaDoEsquema();
		
	}

}
