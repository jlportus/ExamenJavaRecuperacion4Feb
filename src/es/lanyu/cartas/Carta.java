package es.lanyu.cartas;

public class Carta {

	String palo;
	int numeroCarta;

	public Carta(String palo, int numeroCarta) {
		this.palo = palo;
		this.numeroCarta = numeroCarta;
	}

	public Carta() {
		this("Comodin", 0);
	}

	@Override
	public String toString() {
		return "Carta: " + numeroCarta + " de " + palo;
	}
}
