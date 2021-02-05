package es.lanyu.cartas;

import java.util.Collections;

public interface Repartidor extends Crupier {

	default Carta robar(Carta carta) {
		Carta cartaRobada = null;
		if (!getCartasDeLaBaraja().isEmpty()) {
			if (contieneCarta(carta)) {
				cartaRobada = carta; // devuelve la carta buscada
			} else {
				cartaRobada = (Carta) getCartasDeLaBaraja().get(0); // devuelve la primera carta
			}
			getCartasDeLaBaraja().remove(cartaRobada); // saca la carta del mazo
		}
		return cartaRobada;
	}

	default boolean contieneCarta(Carta carta) {
		return getCartasDeLaBaraja().contains(carta);

	}

	default void barajar() {
		Collections.shuffle(getCartasDeLaBaraja());
	}

}
