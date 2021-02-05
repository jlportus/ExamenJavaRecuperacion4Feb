package es.lanyu.cartas;
import java.util.*;

public class Mano implements Crupier{

	private List<Carta> mano; //cartas concretas del jugador en el momento
	private int cartasMano; //numero de cartas por jugador en la partida
	
	public void setCartasMano(int cartasMano) {
		this.cartasMano = cartasMano;
	}
	public int getCartasMano() {
		return cartasMano;
	}
	
	public Mano() {
		this.mano = new ArrayList<>();
	}
	
	@Override
	public List<?> getCartasDeLaBaraja() {
		return mano;
	}
}
