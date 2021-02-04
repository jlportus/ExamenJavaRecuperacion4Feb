package es.lanyu.cartas;

import java.util.List;

public class Mano implements Crupier{

	private Carta[] mano; //cartas concretas del jugador en el momento
	private int cartasMano; //numero de cartas por jugador en la partida
	
	public void setCartasMano(int cartasMano) {
		this.cartasMano = cartasMano;
	}
	public int getCartasMano() {
		return cartasMano;
	}
	
	public Mano(int n) {
		setCartasMano(n);
		mano = new Carta[getCartasMano()];
	}
	@Override
	public List<?> getCartasDeLaBaraja() {
		
		return null;
	}
}
