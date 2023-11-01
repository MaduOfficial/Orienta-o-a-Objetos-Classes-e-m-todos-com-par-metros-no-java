# Orienta-o-a-Objetos-Classes-e-m-todos-com-par-metros-no-java
Anotações de Orientação a Objetos: Classes e métodos com parâmetros

                                                        Orientação a Objetos: Classes e métodos com parâmetros

Método com parâmetro

double calculaCombustivel (double km) {
    return km/consumoCombustivel;

Como é que funciona os métosdos com parâmetros? Nós vamos colocar quaos são os parâmetros que a gente quer declarar dentrp dos parenteses e aí ós podemos
declarar a quantidade de parâmetros que a gente precisar, uma coisa bem legal na declaração dos métodos entre de classes do java é que demtro dos métodos
nós temos acesso a informações naquela classe nós podemos chamar outros métodos e nós podemos utilizar os atributos como o exemplo a cima nós utilizamos
a capacidade de combustivel e o consumo de combustível são dois atributos da costa carro que a gente vem trabalhando é agora, quando é que eu vou passar 
um parâmetro para o método? quamdo você precisar de uma informação que não está disponível na classe aqui por exemplo para calcular o combustível a quanto
de combustível é preciso para andar 10 KM com aquele carro, então a quantidade de Km que você quer calcular essa informação a gente não tem na classe não
é um atributo da classe o comsumo de combustível do carro a gente tem essa informação na classe então a gente não precisa de passar por um parâmetro, na
quilometragem que desejamos calcular? sim é uma informação que a gente não tem então por isso a gente pássa como um parâmetro.

Ex:

package com.madu.poo.classes.e.metodos.com.parametros;

public class Carro {
		
	String marca;
	String modelo;
    int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
			
	void exibirAutonomia() {
	System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
			
    double obterautonomia() {
				
		System.out.println("Método obterAltonomia foi chamado.");
				
		return capCombustivel * consumoCombustivel;
	}
		
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}


Ex:

package com.madu.poo.classes.e.metodos.com.parametros;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterautonomia();
		System.out.println("Altonomia di carro é: " + autonomia);
		System.out.println("Altonomia di carro é: " + van.obterautonomia());
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
	}

}


Console:
Fiat
Ducato
A autonomia do carro ?: 20.0 km
M?todo obterAltonomia foi chamado.
Altonomia di carro ?: 20.0
M?todo obterAltonomia foi chamado.
Altonomia di carro ?: 20.0
qtdCombustivel10 = 50.0
qtdCombustivel15 = 75.0
