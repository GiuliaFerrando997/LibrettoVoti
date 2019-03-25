package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libr = new Libretto();
		
		libr.add(new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(21, "Fisica I", LocalDate.of(2017, 1, 25)));
		libr.add(new Voto(25, "Chimica", LocalDate.of(2018, 6, 10)));
		libr.add(new Voto(18, "Geometria", LocalDate.of(2017, 9, 3)));
		libr.add(new Voto(30, "Statistica", LocalDate.of(2017, 1, 11)));
		libr.add(new Voto(22, "Analisi I", LocalDate.of(2018, 9, 15)));
		libr.add(new Voto(19, "Ricerca Operativa", LocalDate.of(2018, 6, 15)));
		libr.add(new Voto(27, "Economia", LocalDate.of(2018, 7, 15)));
		libr.add(new Voto(20, "Logistica", LocalDate.of(2019, 2, 15)));
		libr.add(new Voto(30, "Programmazione ad Oggetti", LocalDate.of(2019, 1, 18)));
	
		List<Voto> venticinque = libr.cercaVoti(25);
		System.out.println(venticinque);
		
		Voto a1 = libr.cercaEsame("Analisi I");
		Voto a3 = libr.cercaEsame("Analisi III");
		System.out.println(a1);
		System.out.println(a3);
	}

}
