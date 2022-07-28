package com.exemplo.estaticofinal;

public class StringUtils {
	//criando o metodo estatico
	public static String inverterString(String texto) {
		//criar os dois conjuntos de caracteres
		char[] letras = texto.toCharArray();
		char[] letrasInversas = new char[letras.length];
		
		//construir o loop para iterar sobre o conjunto de valores e execultar a operacao
		for(int i = 0; i < letras.length; i++) {
			//executar a operacao de inversao
			letrasInversas[letras.length -i -1] = letras[i];
		}
	return new String(letrasInversas);
	
	}

}
