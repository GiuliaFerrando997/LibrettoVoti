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
		Voto voto = new Voto(0, nomeEsame, null);
		int pos = this.voti.indexOf(voto); //indexOf chiama equals 
		if(pos==-1)
		return null;
		else 
			return this.voti.get(pos);
	}
	
	/**
	 * Dato un {@link Voto} determina se esiste già un voto con
	 * uguale corso e punteggio
	 * @param v
	 * @return vero se voto e esame uguali, altrimenti falso
	 */
	public boolean esisteGiaVoto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos==-1)
			return false;
		else 
			return (this.voti.get(pos).getPunti()==v.getPunti());
	}

}
