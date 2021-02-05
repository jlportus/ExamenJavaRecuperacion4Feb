package es.lanyu.cartas;

import java.util.List;

import com.github.cards.Card;

public class CartaExterna extends Card implements Carteable{

	@Override
	public String getPalo() {
		
		return toString();
	}

	@Override
	public int getNumeroCarta() {
		
		return super.getRank();
	}
	
	public CartaExterna(int suit, int rank) {
		super(suit, rank);
		
	}

	

}
