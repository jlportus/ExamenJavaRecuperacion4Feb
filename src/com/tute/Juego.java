package com.tute;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.BarajaExterna;
import es.lanyu.cartas.Carta;
import es.lanyu.cartas.FamiliasBarajas;

public class Juego {

	public static void main(String[] args) {

		Carta carta = new Carta("Bastos", 1);
		System.out.println(carta);

		// ejercicio 4
		System.out.println("\nBaraja Española:");

		Baraja barajaEspañola = FamiliasBarajas.BARAJA_ESPAÑOLA;
		imprimirCartas(barajaEspañola);

		// ejercicio 5
		System.out.println("\nEjercicio 5");
		System.out.println("Cartas mezcladas");

//		barajaEspañolaBaraja.barajar();

		imprimirCartas(barajaEspañola);
		System.out.println("\nEjercicio 5.b");
		Carta cartaARobar = new Carta(FamiliasBarajas.PALOS_BARAJA_ESPAÑOLA[3], 10);
		System.out.println("Saco la carta " + cartaARobar);
		barajaEspañola.robar(cartaARobar);
		imprimirCartas(barajaEspañola);

		System.out.println("\nRobo la primera");
		barajaEspañola.robar(null); // robo la primera
		imprimirCartas(barajaEspañola);

		System.out.println("\nBaraja vacia");
		barajaEspañola.getCartasDeLaBaraja().clear();
		barajaEspañola.robar(null); // robo la primera sabiendo que no hay cartas
		imprimirCartas(barajaEspañola);

		System.out.println("\n¿contiene la carta " + cartaARobar + "?");
		barajaEspañola = new Baraja(FamiliasBarajas.PALOS_BARAJA_ESPAÑOLA, 10);
		System.out.println(barajaEspañola.contieneCarta(cartaARobar));

		// ejercicio 6
		System.out.println("\nEjercicio 6");
		barajaEspañola.barajar();
		System.out.println("\nImprimo cartas barajadas");
		imprimirCartas(barajaEspañola);

		barajaEspañola.getCartasDeLaBaraja().sort(null);
		System.out.println("\nImprimo cartas ordenadas");
		imprimirCartas(barajaEspañola);

		//ejercicio 7
		System.out.println("\nEjercicio 7");
		Baraja barajaAmericanaBaraja = new BarajaExterna();
	}

	public static void imprimirCartas(Baraja baraja) {
		baraja.getCartasDeLaBaraja().forEach(System.out::println);
	}

}
