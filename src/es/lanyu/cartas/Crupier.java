package es.lanyu.cartas;

import java.util.List;

public interface Crupier {
	
	void barajar();

	List<?> getCartasDeLaBaraja();

	
	 boolean contieneCarta(Carta carta) ;
}
