package es.lanyu.cartas;

public abstract class FamiliasBarajas {

	public static final String[] PALOS_BARAJA_ESPAÑOLA = new String[] { "Oros", "Copas", "Espadas", "Bastos" };
	public static final int CARTAS_PALO_BARAJA_ESPAÑOLA = 10;
	public static final Baraja BARAJA_ESPAÑOLA = new Baraja(PALOS_BARAJA_ESPAÑOLA, CARTAS_PALO_BARAJA_ESPAÑOLA);
}
