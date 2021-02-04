package es.lanyu.cartas;

import java.util.Collections;
import java.util.List;

public interface Crupier {

	default void barajar() {
		Collections.shuffle((List<?>) getCartasDeLaBaraja());
	}
	
	List<?> getCartasDeLaBaraja() ;
	

	default void robar(Carta carta) {
		if (carta == null) {
			
		}

	}
	
}
