package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Baraja implements Crupier{

	private String[] palos; // por ej: cuatro palos en la baraja española
	private int numeroCartasPalo; // numero de cartas por cada palo, 10 en baraja española
	private List<Carta> cartasDeLaBaraja;

	public List<?> getCartasDeLaBaraja() {
		return cartasDeLaBaraja;
	}
	
	public Baraja(String[] palos, int numeroCartasPalo) {
		this.numeroCartasPalo = numeroCartasPalo;
		this.palos = palos;
		this.cartasDeLaBaraja = new ArrayList<>();
		for (int i = 0; i < palos.length; i++) {
			for (int j = 1; j <= numeroCartasPalo; j++) {
				cartasDeLaBaraja.add(new Carta(palos[i], j));
			}
		}
	}


}
