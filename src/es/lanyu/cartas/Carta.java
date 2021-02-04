package es.lanyu.cartas;

public class Carta {

	private String palo;
	private int numeroCarta;

	public Carta(String palo, int numeroCarta) {
		this.palo = palo;
		this.numeroCarta = numeroCarta;
	}

	public String getNumeroCarta() {
		String numeroCarta = "";
		if (this.numeroCarta == 1) {
			numeroCarta = "As";

		} else if (this.numeroCarta == 8) {
			numeroCarta = "Sota";
		} else if (this.numeroCarta == 9) {
			numeroCarta = "Caballo";

		} else if (this.numeroCarta == 10) {
			numeroCarta = "Rey";
		} else numeroCarta += this.numeroCarta;
		return numeroCarta;
	}

	
	@Override
	public String toString() {
		return "Carta: " + getNumeroCarta() + " de " + palo;
	}
}
