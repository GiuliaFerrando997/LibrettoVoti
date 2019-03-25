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
	
	/**
	 * Ricerca il voto relativo al corso specificato
	 * @param nomeEsame nome del corso da cercare
	 * @return il voto se disponibile
	 */
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v : this.voti) {
			if(v.getCorso().equals(nomeEsame))
				return v;
		} 
		return null;
	}
	
	/**
	 * Dato un {@link Voto} determina se esiste già un voto con
	 * uguale corso e punteggio
	 * @param v
	 * @return vero se voto e esame uguali, altrimenti falso
	 */
	public boolean esisteGiaVoto(Voto v) {
		Voto trovato = this.cercaEsame(v.getCorso());
		if(trovato==null)
			return false;
		if(trovato.getPunti()==v.getPunti())
			return true;
		else
			return false;
	}

}
