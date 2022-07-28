package com.exemplo.estatico;

public class UsandoEstaticoPorFora {

	public static void main(String args[]) {
		DeclarandoAtributoEstatico x = new DeclarandoAtributoEstatico();
		DeclarandoAtributoEstatico y = new DeclarandoAtributoEstatico();
		DeclarandoAtributoEstatico z = new DeclarandoAtributoEstatico();

		x.ano = 2022;
		System.out.println("valor do atributo declarado na classe é: " + x.ano);

		y.ano = 1992;
		System.out.println("valor do atributo declarado na classe é: " + y.ano);

		z.ano = 1893;
		System.out.println("valor do atributo declarado na classe é: " + z.ano);

	}
}
