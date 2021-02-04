package es.lanyu.cartas;

public class Mano {

	private Carta[] mano; //cartas concretas del jugador en el momento
	private int cartasMano; //numero de cartas por jugador en la partida
	
	public void setCartasMano(int cartasMano) {
		this.cartasMano = cartasMano;
	}
	
	public Mano() {
		mano = new Carta[cartasMano];
	}
}
