package es.lanyu.cartas;

import java.util.List;

import com.github.cards.Card;
import com.github.cards.Deck;

public class BarajaExterna extends Deck implements Crupier {

	@Override
	public List<?> getCartasDeLaBaraja() {
		return super.getCards();
	}

	@Override
	public void barajar() {
		super.shuffle();
	}

	@Override
	public boolean contieneCarta(Carta carta) {
		return false;
	}

}
