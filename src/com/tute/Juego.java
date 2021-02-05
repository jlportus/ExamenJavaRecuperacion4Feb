package com.tute;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.Carta;

public class Juego {

	public static void main(String[] args) {

		Carta carta = new Carta("Bastos", 1);
		System.out.println(carta);

		// ejercicio 4
		System.out.println("\nBaraja Española:");
		String[] palosBarajaEspañola = new String[] { "Oros", "Copas", "Espadas", "Bastos" };
		Baraja barajaEspañolaBaraja = new Baraja(palosBarajaEspañola, 10);
		imprimirCartas(barajaEspañolaBaraja);

		// ejercicio 5
		System.out.println("\nEjercicio 5");
		System.out.println("Cartas mezcladas");

//		barajaEspañolaBaraja.barajar();

		imprimirCartas(barajaEspañolaBaraja);
		System.out.println("\nEjercicio 5.b");
		Carta cartaARobar = new Carta(palosBarajaEspañola[3], 10);
		System.out.println("Saco la carta " + cartaARobar);
		barajaEspañolaBaraja.robar(cartaARobar);
		imprimirCartas(barajaEspañolaBaraja);

		System.out.println("\nRobo la primera");
		barajaEspañolaBaraja.robar(null); // robo la primera
		imprimirCartas(barajaEspañolaBaraja);

		System.out.println("\nBaraja vacia");
		barajaEspañolaBaraja.getCartasDeLaBaraja().clear();
		barajaEspañolaBaraja.robar(null); // robo la primera sabiendo que no hay cartas
		imprimirCartas(barajaEspañolaBaraja);

		System.out.println("\n¿contiene la carta " + cartaARobar +"?");
		barajaEspañolaBaraja = new Baraja(palosBarajaEspañola, 10);
		System.out.println(barajaEspañolaBaraja.contieneCarta(cartaARobar));
	
		
		
	}

	public static void imprimirCartas(Baraja baraja) {
		baraja.getCartasDeLaBaraja().forEach(System.out::println);
	}

}
