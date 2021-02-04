package com.tute;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.Carta;

public class Juego {

	public static void main(String[] args) {

		Carta carta = new Carta("Bastos", 1);
		System.out.println(carta);
		
		// ejercicio 4
		System.out.println("\nBaraja Española:");
		String[] palosBarajaEspañola = new String[] {
				"Oros", 
				"Copas", 
				"Espadas", 
				"Bastos"};
		Baraja barajaEspañolaBaraja = new Baraja(palosBarajaEspañola, 10);
		barajaEspañolaBaraja.getCartasDeLaBaraja().forEach(System.out::println);
		
		//ejercicio 5
		System.out.println("\nEjercicio 5");
		System.out.println("Cartas mezcladas");
		
		barajaEspañolaBaraja.barajar();
		
		barajaEspañolaBaraja.getCartasDeLaBaraja().forEach(System.out::println);
	}

}
