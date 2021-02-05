package es.lanyu.cartas;

import java.util.List;

import com.github.cards.Hand;

public class ManoExterna extends Hand {

	public ManoExterna() {
		super();
	}
	
	public List<?> getCartasDeLaBaraja() {
		
		return super.getCards();
	}

	
}
