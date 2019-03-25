package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * 
	 * Aggiungo nuovo voto al libretto 
	 * @param v il {@link voto} voto da aggiungere
	 */
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public List<Voto> cercaVoti(int voto) {
		List<Voto> result = new ArrayList<>();
		for(Voto v : this.voti) {
			if(v.getPunti()==voto)
				result.add(v);
		}
		return result;
	}

}
