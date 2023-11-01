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
