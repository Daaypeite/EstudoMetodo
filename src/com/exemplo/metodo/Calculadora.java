package com.exemplo.metodo;

public class Calculadora {
	//criando um metodo para a execucao de uma operacao
	public int somar(int valor1, int valor2) {
		//indicar uma variavel para que receba a soma dos valores dos parametros
		int resultado;
		
		//estabelecendo a operacao
		resultado = valor1 + valor2;
		
		//implementando a expressao de retorno
		return resultado;
			}
	//vamos criar as outras 3 operacoes aritimeticas - subtracao, multiplicacao e divisao
		public int subtrair(int valor1, int valor2) {
				int resultado;
				resultado = valor1 - valor2;
				return resultado;
		}
		public int multiplicar(int valor1, int valor2) {
			int resultado;
			resultado = valor1 * valor2;
			return resultado;
		}
		public int dividir(int valor1, int valor2) {
			int resultado;
			resultado = valor1 / valor2;
			return resultado;
		}
}
