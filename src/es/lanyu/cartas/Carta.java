package es.lanyu.cartas;

import java.util.Comparator;

public class Carta implements Carteable, Comparable<Carteable>, Comparator<Carteable> {

	private String palo;
	private int numeroCarta;

	public String getPalo() {
		return palo;
	}

	public int getNumeroCarta() {
		return numeroCarta;
	}

	public String getNumeroString() {
		String numeroCarta = "";
		if (this.numeroCarta == 1) {
			numeroCarta = "As";

		} else if (this.numeroCarta == 8) {
			numeroCarta = "Sota";
		} else if (this.numeroCarta == 9) {
			numeroCarta = "Caballo";

		} else if (this.numeroCarta == 10) {
			numeroCarta = "Rey";
		} else
			numeroCarta += this.numeroCarta;
		return numeroCarta;
	}

	public Carta(String palo, int numeroCarta) {
		this.palo = palo;
		this.numeroCarta = numeroCarta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroCarta;
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (numeroCarta != other.numeroCarta)
			return false;
		if (palo == null) {
			if (other.palo != null)
				return false;
		} else if (!palo.equals(other.palo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getNumeroString() + " de " + palo;
	}

	@Override
	public int compareTo(Carteable carta) {
		int diferencia = this.palo.compareTo(carta.getPalo());
		if (diferencia == 0) {
			diferencia = this.numeroCarta - carta.getNumeroCarta();
		}
		return diferencia;
	}

	@Override
	public int compare(Carteable arg0, Carteable arg1) {
		
		return 0;
	}

	

}
