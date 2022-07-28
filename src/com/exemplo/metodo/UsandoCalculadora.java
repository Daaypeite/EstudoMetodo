package com.exemplo.metodo;

public class UsandoCalculadora {

	public static void main(String[] args) {
		// criar uma variavel para chamar o objeto da instancia e acessar o metodo de somar()
			int somando; //variavel simples, definida
			int subtraindo;
			int multiplicando;
			int divisao;
			//instanciando a classe calculadora()
			Calculadora calc = new Calculadora();
			
			//fazer uso do objeto calc e acessar o metodo somar()
			somando = calc.somar(12, 60);
			subtraindo = calc.subtrair(12, 60);
			multiplicando = calc.multiplicar(12, 60);
			divisao = calc.dividir(12, 60);
			
					
			//exibir a soma
			System.out.println("Somando - total: " + somando);
			System.out.println("Subtraindo - total: " + subtraindo);
			System.out.println("multiplicando - total: " + multiplicando);
			System.out.println("divisao - total: " + divisao);
			}

}
