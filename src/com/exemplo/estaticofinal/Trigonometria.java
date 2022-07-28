package com.exemplo.estaticofinal;

public class Trigonometria {
	//declarando o metodo estatico com o modificador final
	public static final double PI = 3.1415;
	
	//criando metodo principal
	public static void main(String args[]) {
		double raio = 2.5;
		//uma variavel para receber a operacao
		double perimetro = 2 * raio * PI;
		
		//exibindo o resultado da operacao
		System.out.printf("Valor do perimetro é: %.2f " , perimetro);
		}
	}
